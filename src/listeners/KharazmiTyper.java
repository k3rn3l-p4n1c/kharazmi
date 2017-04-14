package listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.KharazmiListener;
import parser.KharazmiParser;

/**
 * Created by Bardia on 3/10/17.
 */
public class KharazmiTyper implements KharazmiListener {
    @Override
    public void enterProg(KharazmiParser.ProgContext ctx) {

    }

    @Override
    public void exitProg(KharazmiParser.ProgContext ctx) {

    }

    @Override
    public void enterBlock(KharazmiParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(KharazmiParser.BlockContext ctx) {

    }

    @Override
    public void enterStatement(KharazmiParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(KharazmiParser.StatementContext ctx) {

    }

    @Override
    public void enterSubjectiveFunctionCall(KharazmiParser.SubjectiveFunctionCallContext ctx) {

    }

    @Override
    public void exitSubjectiveFunctionCall(KharazmiParser.SubjectiveFunctionCallContext ctx) {

    }

    @Override
    public void enterFunctionCall(KharazmiParser.FunctionCallContext ctx) {

    }

    @Override
    public void exitFunctionCall(KharazmiParser.FunctionCallContext ctx) {

    }

    @Override
    public void enterMethodCall(KharazmiParser.MethodCallContext ctx) {

    }

    @Override
    public void exitMethodCall(KharazmiParser.MethodCallContext ctx) {

    }

    @Override
    public void enterGetAttr(KharazmiParser.GetAttrContext ctx) {

    }

    @Override
    public void exitGetAttr(KharazmiParser.GetAttrContext ctx) {

    }

    @Override
    public void enterArguments(KharazmiParser.ArgumentsContext ctx) {

    }

    @Override
    public void exitArguments(KharazmiParser.ArgumentsContext ctx) {

    }

    @Override
    public void enterAssignmentStatement(KharazmiParser.AssignmentStatementContext ctx) {
//        System.out.println(ctx.ID().getSymbol().getText());
    }

    @Override
    public void exitAssignmentStatement(KharazmiParser.AssignmentStatementContext ctx) {

    }

    @Override
    public void enterInstanceDefinition(KharazmiParser.InstanceDefinitionContext ctx) {

    }

    @Override
    public void exitInstanceDefinition(KharazmiParser.InstanceDefinitionContext ctx) {

    }

    @Override
    public void enterExpr(KharazmiParser.ExprContext ctx) {
        if (ctx.ID() != null) {
            // ctx.type = from symbol table
        } else if (ctx.STRING() != null) {
            ctx.type = "str";
        } else if (ctx.NUMBER() != null) {
            ctx.type = "int";
        }
//        System.out.println(ctx.type);
    }

    @Override
    public void exitExpr(KharazmiParser.ExprContext ctx) {

    }

    @Override
    public void enterOperand(KharazmiParser.OperandContext ctx) {

    }

    @Override
    public void exitOperand(KharazmiParser.OperandContext ctx) {

    }

    @Override
    public void enterClassDefinition(KharazmiParser.ClassDefinitionContext ctx) {

    }

    @Override
    public void exitClassDefinition(KharazmiParser.ClassDefinitionContext ctx) {

    }

    @Override
    public void enterClassStatement(KharazmiParser.ClassStatementContext ctx) {

    }

    @Override
    public void exitClassStatement(KharazmiParser.ClassStatementContext ctx) {

    }

    @Override
    public void enterAttributedDefinition(KharazmiParser.AttributedDefinitionContext ctx) {

    }

    @Override
    public void exitAttributedDefinition(KharazmiParser.AttributedDefinitionContext ctx) {

    }

    @Override
    public void enterMethodDefinition(KharazmiParser.MethodDefinitionContext ctx) {

    }

    @Override
    public void exitMethodDefinition(KharazmiParser.MethodDefinitionContext ctx) {

    }

    @Override
    public void enterFunctionDefinition(KharazmiParser.FunctionDefinitionContext ctx) {

    }

    @Override
    public void exitFunctionDefinition(KharazmiParser.FunctionDefinitionContext ctx) {

    }

    @Override
    public void enterParameters(KharazmiParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(KharazmiParser.ParametersContext ctx) {

    }

    @Override
    public void enterIfStatement(KharazmiParser.IfStatementContext ctx) {

    }

    @Override
    public void exitIfStatement(KharazmiParser.IfStatementContext ctx) {

    }

    @Override
    public void enterWhileStatement(KharazmiParser.WhileStatementContext ctx) {

    }

    @Override
    public void exitWhileStatement(KharazmiParser.WhileStatementContext ctx) {

    }

    @Override
    public void enterRepeatStatement(KharazmiParser.RepeatStatementContext ctx) {

    }

    @Override
    public void exitRepeatStatement(KharazmiParser.RepeatStatementContext ctx) {

    }

    @Override
    public void enterForeachStatement(KharazmiParser.ForeachStatementContext ctx) {

    }

    @Override
    public void exitForeachStatement(KharazmiParser.ForeachStatementContext ctx) {

    }

    @Override
    public void enterReturnStatement(KharazmiParser.ReturnStatementContext ctx) {

    }

    @Override
    public void exitReturnStatement(KharazmiParser.ReturnStatementContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
