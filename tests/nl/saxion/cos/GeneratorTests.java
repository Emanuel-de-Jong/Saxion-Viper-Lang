package nl.saxion.cos;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GeneratorTests extends TestBase {

    @Test
    public void VIfIfElseIfElseElse() throws Exception {
        testCodeGeneration(new String[]{
                "if (true) {",
                "  4;",
                "} elseif (true) {",
                "  3;",
                "} elseif(true) {",
                "  2;",
                "} else {",
                "  1;",
                "}"
        }, new String[]{
                "ldc 1",
                "ifeq then1",
                "ldc 4",
                "goto end0",
                "then1:",
                "ldc 1",
                "ifeq then2",
                "ldc 3",
                "goto end0",
                "then2:",
                "ldc 1",
                "ifeq then3",
                "ldc 2",
                "goto end0",
                "then3:",
                "ldc 1",
                "end0:"
        });
    }

    @Test
    public void VIfIfElseIfElse() throws Exception {
        testCodeGeneration(new String[]{
                "if (true) {",
                "  4;",
                "} elseif (true) {",
                "  3;",
                "} elseif(true) {",
                "  2;",
                "}"
        }, new String[]{
                "ldc 1",
                "ifeq then1",
                "ldc 4",
                "goto end0",
                "then1:",
                "ldc 1",
                "ifeq then2",
                "ldc 3",
                "goto end0",
                "then2:",
                "ldc 1",
                "ifeq then3",
                "ldc 2",
                "goto end0",
                "then3:",
                "end0:"
        });
    }

    @Test
    public void VIfElse() throws Exception {
        testCodeGeneration(new String[]{
                "if (true) {",
                "  4;",
                "} else {",
                "  1;",
                "}"
        }, new String[]{
                "ldc 1",
                "ifeq then1",
                "ldc 4",
                "goto end0",
                "then1:",
                "ldc 1",
                "end0:"
        });
    }

    @Test
    public void VIf() throws Exception {
        testCodeGeneration(new String[]{
                "if (true) {",
                "  4;",
                "}"
        }, new String[]{
                "ldc 1",
                "ifeq then1",
                "ldc 4",
                "goto end0",
                "then1:",
                "end0:"
        });
    }

    @Test
    public void VWhile() throws Exception {
        testCodeGeneration(new String[]{
                "while(6>5) { 10; }"
        }, new String[]{
                "while0:",
                "ldc 6",
                "ldc 5",
                "if_icmpgt then2",
                "ldc 0",
                "goto then3",
                "then2:",
                "ldc 1",
                "then3:",
                "ifeq end1",
                "ldc 10",
                "goto while0",
                "end1:"

        });
    }

    @Test
    @Disabled
    public void VReturn() throws Exception {
        testCodeGeneration(new String[]{
                "int myMethod() {",
                "   return 5;",
                "}"
        }, new String[]{
                "ldc 5",
                "ireturn",
        });
    }

    @Test
    public void ExAddOp() throws Exception {
        testCodeGeneration(new String[]{
                "2+4;",
                "2.2+4;",
                "2-4.4;",
                "2.2-4.4;"
        }, new String[]{
                "ldc 2",
                "ldc 4",
                "iadd",

                "ldc 2.2",
                "ldc 4",
                "i2f",
                "fadd",

                "ldc 2",
                "i2f",
                "ldc 4.4",
                "fsub",

                "ldc 2.2",
                "ldc 4.4",
                "fsub"
        });
    }

    @Test
    public void ExCmprLe() throws Exception {
        testCodeGeneration(new String[]{
                "8<12;",
                "12.2>=0.6;"
        }, new String[]{
                "ldc 8",
                "ldc 12",
                "if_icmplt then0",
                "ldc 0",
                "goto then1",
                "then0:",
                "ldc 1",
                "then1:",
                "ldc 12.2",
                "ldc 0.6",
                "fcmpg",
                "ldc 0",
                "if_icmpge then2",
                "ldc 0",
                "goto then3",
                "then2:",
                "ldc 1",
                "then3:"
        });
    }

    @Test
    public void ExCmprEq() throws Exception {
        testCodeGeneration(new String[]{
                "1==1;",
                "1.1!=1.2;"
        }, new String[]{
                "ldc 1",
                "ldc 1",
                "if_icmpeq then0",
                "ldc 0",
                "goto then1",
                "then0:",
                "ldc 1",
                "then1:",
                "ldc 1.1",
                "ldc 1.2",
                "fcmpg",
                "ldc 0",
                "if_icmpne then2",
                "ldc 0",
                "goto then3",
                "then2:",
                "ldc 1",
                "then3:"
        });
    }

    @Test
    @Disabled
    public void DecNull() throws Exception {
        testCodeGeneration(new String[]{
                "int a;",
                "public float b;",
                "public static bool c;"
        }, new String[]{
                ""
        });
    }

    @Test
    @Disabled
    public void DecAssign() throws Exception {
        testCodeGeneration(new String[]{
                "int i = 5;",
                "float f = 5.5;",
                "bool b = true;",
                "string s = \"String!\";"
        }, new String[]{
                "ldc 5",
                "istore 1",

                "ldc 5.5",
                "fstore 2",

                "ldc 1",
                "istore 3",

                "ldc \"String!\"",
                "astore 4"
        });
    }

    @Test
    public void vMethod() throws Exception {
        testCodeGeneration(new String[]{
                "public static int aMethod(int i, float f) { return 10; }"
        }, new String[]{
                ".method public static int aMethod(IF)V",
                "ldc 10",
                "ireturn",
                ".end method"
        });
    }

    @Test
    public void ExBitOp() throws Exception {
        testCodeGeneration(new String[]{
                "8 & 1;",
                "8 ^ 3;",
                "8 | 5;"
        }, new String[]{
                "ldc 8",
                "ldc 1",
                "iadd",

                "ldc 8",
                "ldc 3",
                "ixor",

                "ldc 8",
                "ldc 5",
                "ior"
        });
    }

    @Test
    public void ExBitShiftOp() throws Exception {
        testCodeGeneration(new String[]{
                "8 << 1;",
                "8 >> 1;"
        }, new String[]{
                "ldc 8",
                "ldc 1",
                "ishl",

                "ldc 8",
                "ldc 1",
                "ishr"
        });
    }

    @Test
    public void ExNegBoolOp() throws Exception {
        testCodeGeneration(new String[]{
                "!true;"
        }, new String[]{
                "ldc 1",
                "iconst_1",
                "ixor"
        });
    }

    @Test
    public void ExTernary() throws Exception {
        testCodeGeneration(new String[]{
                "1 >= 1 ? 5 : 9;"
        }, new String[]{
                "ldc 1",
                "ldc 1",
                "if_icmpge then2",
                "ldc 0",
                "goto then3",
                "then2:",
                "ldc 1",
                "then3:",
                "ifeq else0",
                "ldc 5",
                "goto end1",
                "else0:",
                "ldc 9",
                "end1:"
        });
    }

}
