// Generated from /Users/Bardia/IdeaProjects/compiler/grammer/Kharazmi.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KharazmiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KharazmiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(KharazmiParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KharazmiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KharazmiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#subjectiveFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjectiveFunctionCall(KharazmiParser.SubjectiveFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(KharazmiParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(KharazmiParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#getAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAttr(KharazmiParser.GetAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(KharazmiParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(KharazmiParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#instanceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceDefinition(KharazmiParser.InstanceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(KharazmiParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(KharazmiParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(KharazmiParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#compare_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_operation(KharazmiParser.Compare_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(KharazmiParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(KharazmiParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#attributedDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributedDefinition(KharazmiParser.AttributedDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(KharazmiParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(KharazmiParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(KharazmiParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(KharazmiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(KharazmiParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(KharazmiParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#ifHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfHead(KharazmiParser.IfHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(KharazmiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(KharazmiParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(KharazmiParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KharazmiParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(KharazmiParser.ReturnStatementContext ctx);
}