package nl.saxion.cos;

import nl.saxion.cos.exceptions.AssembleException;
import nl.saxion.cos.exceptions.CompilerException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Abstract class from which test can extend.
 * Supplies the tests with a runCode method.
 */
public abstract class TestBase {

    protected Compiler c = new Compiler();
    protected String[] codeTemplateStart = new String[]{
            ".bytecode 49.0",
            ".class public Test",
            ".super java/lang/Object",
            "",
            ".method public static main([Ljava/lang/String;)V",
            ".limit stack 99",
            ".limit locals 99",
            ""};
    protected String[] codeTemplateEnd = new String[]{
            "",
            "return",
            ".end method"};


    protected String[] addCodeTemplate(String[] code) {
        return Stream.concat(
                        Stream.concat(
                                Arrays.stream(codeTemplateStart),
                                Arrays.stream(code)),
                        Arrays.stream(codeTemplateEnd))
                .toArray(String[]::new);
    }

    protected ViperClass testCodeGeneration(String filename, String[] jasminCode) throws Exception {
        String[] viperCode = Files.readAllLines(Paths.get("testFiles/" + filename + ".vi")).toArray(String[]::new);
        return testCodeGeneration(viperCode, jasminCode);
    }

    protected ViperClass testCodeGeneration(String[] viperCode, String[] jasminCode) throws Exception {
        ViperClass jasminActualCode = c.compileArray(viperCode, "Test");
        assertNotNull(jasminActualCode);
        assertArrayEquals(addCodeTemplate(jasminCode), jasminActualCode.jasminCode.toArray());
        return jasminActualCode;
    }

    protected void testCodeChecker(String[] viperCode, String exceptionMessage) throws Exception {
        try {
            c.compileArray(viperCode, "Test");
            fail();
        } catch (CompilerException ex) {
            assertEquals(exceptionMessage, ex.getMessage());
        }
    }

    protected void testCodeOutput(ViperClass jasminCode, String[] output) throws AssembleException {
        assertArrayEquals(output, runCode(jasminCode).toArray());
    }

    /**
     * Helper method that takes some compiled Jasmin byte code, assembles it and
     * runs the class. It returns the output of the execution, which you can use
     * to check in an assert.
     */
    protected List<String> runCode(ViperClass code) throws AssembleException {
        // Turn the Jasmin code into a (hopefully) working class file
        if (code == null) {
            throw new AssembleException("No valid Jasmin code to assemble");
        }
        AssembledClass aClass = AssembledClass.assemble(code);

        // Run the class and return the output
        SandBox s = new SandBox();
        s.runClass(aClass);
        return s.getOutput();
    }

}
