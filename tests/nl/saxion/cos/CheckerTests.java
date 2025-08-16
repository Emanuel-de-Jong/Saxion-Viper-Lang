package nl.saxion.cos;

import nl.saxion.cos.enums.DataType;
import org.junit.jupiter.api.Test;

public class CheckerTests extends TestBase {

    @Test
    public void VMethodCall() throws Exception {
        // Undefined
        testCodeChecker(new String[]{
                        "myMethod();"
                },
                "Method 'myMethod' is undefined!"
        );
    }

    @Test
    public void VSwitch() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "switch(true) {",
                        "   case true: {}",
                        "}"
                },
                "Can't use 'switch' on types other than '" + DataType.INT + "' and '" + DataType.FLOAT + "'!"
        );
        // Wrong type
        testCodeChecker(new String[]{
                        "switch(5) {",
                        "   case 1.5: {}",
                        "}"
                },
                "'case' is of type '" + DataType.FLOAT + "' instead of type '" + DataType.INT + "'!"
        );
    }

    @Test
    public void VBreak() throws Exception {
        // Wrong place
        testCodeChecker(new String[]{
                        "{",
                        "  break;",
                        "}"
                },
                "Can't use 'break' outside of an if, switch and while!"
        );
    }

    @Test
    public void VContinue() throws Exception {
        // Wrong place
        testCodeChecker(new String[]{
                        "{",
                        "  continue;",
                        "}"
                },
                "Can't use 'continue' outside of a while loop!"
        );
    }

    @Test
    public void VReturn() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "int myMethod() {",
                        "   return true;",
                        "}"
                },
                "The value of 'return' is of type '" + DataType.BOOL + "' instead of the method type '" + DataType.INT +
                        "'!"
        );
    }

    @Test
    public void VAssignment() throws Exception {
        // Undefined
        testCodeChecker(new String[]{
                        "myVar = 5;"
                },
                "Variable 'myVar' is undefined!"
        );
        // Wrong type
        testCodeChecker(new String[]{
                        "bool myVar;",
                        "myVar = 5;"
                },
                "Assignment value for variable 'myVar' is of type '" + DataType.INT + "' instead of type '" +
                        DataType.BOOL + "'!"
        );
    }

    @Test
    public void DecNull() throws Exception {
        // Already exists
        testCodeChecker(new String[]{
                        "int myVar;",
                        "int myVar;"
                },
                "Variable 'myVar' already declared!"
        );
    }

    @Test
    public void DecAssign() throws Exception {
        // Already exists
        testCodeChecker(new String[]{
                        "int myVar;",
                        "int myVar;"
                },
                "Variable 'myVar' already declared!"
        );
    }

    @Test
    public void VMethod() throws Exception {
        // Wrong place
        testCodeChecker(new String[]{
                        "void myMethod1() {",
                        "   void myMethod2() {}",
                        "}"
                },
                "Methods can only be defined inside a class!"
        );
    }

    @Test
    public void ExMulOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "true * 5;"
                },
                "Can't use operator '*' on types other than '" + DataType.INT + "' and '" + DataType.FLOAT + "'!"
        );
    }

    @Test
    public void ExNegOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "-true;"
                },
                "Can't make types other than '" + DataType.INT + "' and '" + DataType.FLOAT + "' negative!"
        );
    }

    @Test
    public void ExNegBoolOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "!5;"
                },
                "Can't flip types other than '" + DataType.BOOL + "'!"
        );
    }

    @Test
    public void ExAddOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "true + true;"
                },
                "Can't use operator '+' on types other than '" + DataType.INT + "' and '" + DataType.FLOAT + "'!"
        );
    }

    @Test
    public void ExBitShiftOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "true << true;"
                },
                "Can't use operator '<<' on types other than '" + DataType.INT + "'!"
        );
    }

    @Test
    public void ExCmprLe() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "string str = \"\";",
                        "str <= 5;"
                },
                "Can't use operator '<=' on non primitive types!"
        );
        // Wrong type
        testCodeChecker(new String[]{
                        "true <= 5;"
                },
                "Can't use operator '<=' with a '" + DataType.BOOL + "' and non '" + DataType.BOOL + "'!"
        );
    }

    @Test
    public void ExCmprEq() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "string str = \"\";",
                        "str <= 5;"
                },
                "Can't use operator '<=' on non primitive types!"
        );
        // Wrong type
        testCodeChecker(new String[]{
                        "true <= 5;"
                },
                "Can't use operator '<=' with a '" + DataType.BOOL + "' and non '" + DataType.BOOL + "'!"
        );
    }

    @Test
    public void ExBitOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "true & true;"
                },
                "Can't use operator '&' on types other than '" + DataType.INT + "'!"
        );
    }

    @Test
    public void ExLogAndOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "5 && 5;"
                },
                "Can't use operator '&&' on types other than '" + DataType.BOOL + "'!"
        );
    }

    @Test
    public void ExLogOrOp() throws Exception {
        // Wrong type
        testCodeChecker(new String[]{
                        "5 || 5;"
                },
                "Can't use operator '||' on types other than '" + DataType.BOOL + "'!"
        );
    }

    @Test
    public void ExThisLiteral() throws Exception {
        // Wrong place
        testCodeChecker(new String[]{
                        "this;"
                },
                "Can't use 'this' outside of a method!"
        );
    }

    @Test
    public void ExIdentifier() throws Exception {
        // Undefined
        testCodeChecker(new String[]{
                        "myVar;"
                },
                "Variable 'myVar' is undefined!"
        );
    }

    @Test
    public void VUnaryOperation() throws Exception {
        // Undefined
        testCodeChecker(new String[]{
                        "myVar++;"
                },
                "Variable 'myVar' is undefined!"
        );
        // Wrong type
        testCodeChecker(new String[]{
                        "bool myVar = true;",
                        "myVar++;"
                },
                "Can't use operator '++' on types other than '" + DataType.INT + "'!"
        );
    }

}
