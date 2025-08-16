package nl.saxion.cos;

import nl.saxion.cos.enums.Access;
import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.symbols.FieldSymbol;
import nl.saxion.cos.symbols.MethodSymbol;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViperClass {

    /**
     * After successful compilation, this contains all Jasmin commands.
     */
    public final ArrayList<String> jasminCode;
    /**
     * Name of the compiled class
     */
    private final String className;
    private final Map<String, FieldSymbol> fields;
    private final Map<String, MethodSymbol> methods;
    private int labelCount = 0;


    /**
     * Create an instance with an empty list of Jasmin lines.
     */
    public ViperClass(String className) {
        this.className = className;
        this.jasminCode = new ArrayList<>();
        this.fields = new HashMap<>();
        this.methods = new HashMap<>();
    }

    /**
     * Create an instance that keeps track of the compiled Jasmin code. You can
     * pass this to AssembledClass::assemble() to actually build a class file
     * from this.
     *
     * @param className  The name of the class that was compiled.
     * @param jasminCode A list of Jasmin instructions.
     */
    public ViperClass(String className, List<String> jasminCode) {
        this.className = className;
        this.jasminCode = new ArrayList<>(jasminCode);
        this.fields = new HashMap<>();
        this.methods = new HashMap<>();
    }


    /**
     * Write the jasmin byte code (in text form) to a file. You can use this to
     * debug your code.
     *
     * @param jasminFileName Path to write the Jasmin code to.
     * @throws IOException if the file could not be written, e.g. because of
     *                     security rights.
     */
    public void writeJasminToFile(String jasminFileName) throws IOException {
        PrintWriter jasminOut = new PrintWriter(new FileWriter(jasminFileName));
        for (String line : jasminCode)
            jasminOut.println(line);
        jasminOut.close();
    }


    /**
     * Add an empty line to this byte code.
     */
    public ViperClass add() {
        return add("");
    }

    /**
     * Add a line of Jasmin code.
     *
     * @param line A single line of Jasmin code.
     * @return A reference to this object, so that you can chain calls to add like this:
     * <pre>
     *              jasminCode.add( "ldc 3" )
     *                        .add( "ldc 5" )
     *                        .add( "iadd" );
     *              </pre>
     */
    public ViperClass add(String line) {
        jasminCode.add(line);
        return this;
    }

    public ViperClass addPrev(String line) {
        jasminCode.add(jasminCode.size() - 1, line);
        return this;
    }

    public ViperClass append(String line) {
        int i = jasminCode.size() - 1;
        jasminCode.set(i, jasminCode.get(i).concat(line));
        return this;
    }

    public ViperClass addLabel(String label) {
        add(label + ":");
        return this;
    }

    public String createLabel(String name) {
        return name + labelCount++;
    }

    public ViperClass addField(Access access, String name, DataType dataType) {
        FieldSymbol field = new FieldSymbol(name, access, dataType);
        fields.put(name, field);
        return this;
    }

    public ViperClass addMethod(Access access, String name, List<DataType> parameters, DataType returnType,
                                List<String> code) {
        MethodSymbol method = new MethodSymbol(name, access, returnType, parameters, code);
        methods.put(name, method);
        return this;
    }

    public ViperClass addMethod(Access access, String name, List<DataType> parameters, DataType returnType,
                                List<String> code, boolean isStatic) {
        MethodSymbol method = new MethodSymbol(name, access, returnType, parameters, code, isStatic);
        methods.put(name, method);
        return this;
    }

    /**
     * Add a whole number of lines to this JasminBytecode.
     * Pro-tip: you can also use this to combine two JasminBytecode instances:
     * <pre>
     *     jasminCode1.addAll( jasminCode2.getLines() );
     * </pre>
     *
     * @param lines The lines to add.
     * @return A reference to this object, so you can chain calls.
     * @see #add(String)
     */
    public ViperClass addAll(List<String> lines) {
        jasminCode.addAll(lines);
        return this;
    }

    public String getClassName() {
        return className;
    }

    public List<String> getLines() {
        List<String> code = new ArrayList<>();
        code.addAll(writeClassBoilerPlate());
        for (Map.Entry<String, FieldSymbol> entry : fields.entrySet()) {
            code.add(entry.getValue().write());
        }
        for (Map.Entry<String, MethodSymbol> entry : methods.entrySet()) {
            code.addAll(entry.getValue().write());
        }
        return code;
    }

    private List<String> writeClassBoilerPlate() {
        List<String> code = new ArrayList<>();
        code.add(".bytecode 49.0");
        code.add(".class public Expression");
        code.add(".super java/lang/Object)");
        return code;
    }


}
