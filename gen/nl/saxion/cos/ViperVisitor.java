// Generated from E:/Coding/Saxion/2021-2022/Code-S3/Compilers/78/src/nl/saxion/cos\Viper.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ViperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ViperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ViperParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ViperParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVStatement(ViperParser.VStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVMethodCall(ViperParser.VMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVClass(ViperParser.VClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVSwitch(ViperParser.VSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVCase(ViperParser.VCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVIf(ViperParser.VIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVWhile(ViperParser.VWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVBreak(ViperParser.VBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vContinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVContinue(ViperParser.VContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVReturn(ViperParser.VReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVBlock(ViperParser.VBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAssignment(ViperParser.VAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecNull}
	 * labeled alternative in {@link ViperParser#vDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecNull(ViperParser.DecNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecAssign}
	 * labeled alternative in {@link ViperParser#vDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecAssign(ViperParser.DecAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVMethod(ViperParser.VMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vNewObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVNewObject(ViperParser.VNewObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExNewObject}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExNewObject(ViperParser.ExNewObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExLogOrOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExLogOrOp(ViperParser.ExLogOrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExCmprEq}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExCmprEq(ViperParser.ExCmprEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExFloatLiteral}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExFloatLiteral(ViperParser.ExFloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExUnaryOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExUnaryOp(ViperParser.ExUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExStringLiteral}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExStringLiteral(ViperParser.ExStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExNegOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExNegOp(ViperParser.ExNegOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExLogAndOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExLogAndOp(ViperParser.ExLogAndOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIdentifier}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIdentifier(ViperParser.ExIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMethodCall}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMethodCall(ViperParser.ExMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMulOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMulOp(ViperParser.ExMulOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExTernary}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExTernary(ViperParser.ExTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExThisLiteral}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExThisLiteral(ViperParser.ExThisLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAddOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAddOp(ViperParser.ExAddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExBoolLiteral}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExBoolLiteral(ViperParser.ExBoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExBitShiftOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExBitShiftOp(ViperParser.ExBitShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExNegBoolOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExNegBoolOp(ViperParser.ExNegBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIntLiteral}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIntLiteral(ViperParser.ExIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExBitOp}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExBitOp(ViperParser.ExBitOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExParentheses(ViperParser.ExParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExCmprLe}
	 * labeled alternative in {@link ViperParser#vExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExCmprLe(ViperParser.ExCmprLeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ViperParser#vUnaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVUnaryOperation(ViperParser.VUnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeString}
	 * labeled alternative in {@link ViperParser#vType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(ViperParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link ViperParser#vType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(ViperParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeFloat}
	 * labeled alternative in {@link ViperParser#vType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(ViperParser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link ViperParser#vType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(ViperParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeObject}
	 * labeled alternative in {@link ViperParser#vType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeObject(ViperParser.TypeObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessPublic}
	 * labeled alternative in {@link ViperParser#vAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessPublic(ViperParser.AccessPublicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessPrivate}
	 * labeled alternative in {@link ViperParser#vAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessPrivate(ViperParser.AccessPrivateContext ctx);
}