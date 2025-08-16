package nl.saxion.cos;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ProgramTests extends TestBase {

    @Test
    @Disabled
    public void Printing() throws Exception {
        ViperClass jasminCode = testCodeGeneration("Printing", new String[]{
                "ldc 1"
        });
        testCodeOutput(jasminCode, new String[]{
                "Hello world!"
        });
    }

    @Test
    @Disabled
    public void Class() throws Exception {
        ViperClass jasminCode = testCodeGeneration("Class", new String[]{
                "ldc 1"
        });
        testCodeOutput(jasminCode, new String[]{
                "Value: ",
                "secret: "
        });
    }

    @Test
    @Disabled
    public void Jumping() throws Exception {
        ViperClass jasminCode = testCodeGeneration("Jumping", new String[]{
                "ldc 1"
        });
        testCodeOutput(jasminCode, new String[]{
                "bitshift worked",

                "5"
        });
    }

    @Test
    @Disabled
    public void Looping() throws Exception {
        ViperClass jasminCode = testCodeGeneration("Looping", new String[]{
                "ldc 1"
        });
        testCodeOutput(jasminCode, new String[]{
                "1",
                "2",
                "3",
                "4",
                "6",
                "7",
                "8"
        });
    }

}
