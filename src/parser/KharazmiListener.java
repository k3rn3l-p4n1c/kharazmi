// Generated from /media/asemanmanzar/Mohsen/Programming/Java/KharazmiCompiler/grammer/Kharazmi.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KharazmiParser}.
 */
public interface KharazmiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(KharazmiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(KharazmiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KharazmiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KharazmiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KharazmiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KharazmiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#subjectiveFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterSubjectiveFunctionCall(KharazmiParser.SubjectiveFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#subjectiveFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitSubjectiveFunctionCall(KharazmiParser.SubjectiveFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(KharazmiParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(KharazmiParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(KharazmiParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(KharazmiParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#getAttr}.
	 * @param ctx the parse tree
	 */
	void enterGetAttr(KharazmiParser.GetAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#getAttr}.
	 * @param ctx the parse tree
	 */
	void exitGetAttr(KharazmiParser.GetAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(KharazmiParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(KharazmiParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(KharazmiParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(KharazmiParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#instanceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInstanceDefinition(KharazmiParser.InstanceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#instanceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInstanceDefinition(KharazmiParser.InstanceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KharazmiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KharazmiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(KharazmiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(KharazmiParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(KharazmiParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(KharazmiParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#or_term}.
	 * @param ctx the parse tree
	 */
	void enterOr_term(KharazmiParser.Or_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#or_term}.
	 * @param ctx the parse tree
	 */
	void exitOr_term(KharazmiParser.Or_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#and_factor}.
	 * @param ctx the parse tree
	 */
	void enterAnd_factor(KharazmiParser.And_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#and_factor}.
	 * @param ctx the parse tree
	 */
	void exitAnd_factor(KharazmiParser.And_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#compare_operation}.
	 * @param ctx the parse tree
	 */
	void enterCompare_operation(KharazmiParser.Compare_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#compare_operation}.
	 * @param ctx the parse tree
	 */
	void exitCompare_operation(KharazmiParser.Compare_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(KharazmiParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(KharazmiParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(KharazmiParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(KharazmiParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#attributedDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAttributedDefinition(KharazmiParser.AttributedDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#attributedDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAttributedDefinition(KharazmiParser.AttributedDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(KharazmiParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(KharazmiParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(KharazmiParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(KharazmiParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(KharazmiParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(KharazmiParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(KharazmiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(KharazmiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(KharazmiParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(KharazmiParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(KharazmiParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(KharazmiParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#ifHead}.
	 * @param ctx the parse tree
	 */
	void enterIfHead(KharazmiParser.IfHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#ifHead}.
	 * @param ctx the parse tree
	 */
	void exitIfHead(KharazmiParser.IfHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(KharazmiParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(KharazmiParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(KharazmiParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(KharazmiParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void enterRepeatBlock(KharazmiParser.RepeatBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void exitRepeatBlock(KharazmiParser.RepeatBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(KharazmiParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(KharazmiParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#foreach_to_expr}.
	 * @param ctx the parse tree
	 */
	void enterForeach_to_expr(KharazmiParser.Foreach_to_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#foreach_to_expr}.
	 * @param ctx the parse tree
	 */
	void exitForeach_to_expr(KharazmiParser.Foreach_to_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KharazmiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(KharazmiParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KharazmiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(KharazmiParser.ReturnStatementContext ctx);
}