package listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.KharazmiListener;
import parser.KharazmiParser;

import java.util.HashMap;
import java.util.HashSet;


/**
 * Created by Bardia on 3/10/17.
 */
public class KharazmiCodeGenerator implements KharazmiListener {

    class SymbolContext{
        public String type;
        public String name;
        public boolean isTemp;
        public int varId;
        public SymbolContext(String type, String name, boolean isTemp, int varId){
            this.type = type;
            this.name = name;
            this.isTemp = isTemp;
            this.varId = varId;
        }
    }

    HashMap<String, SymbolContext> symbolTable;
    public String bytecode = "";


    public KharazmiCodeGenerator() {
        symbolTable = new HashMap<>();
        tempSet = new HashSet<>();
    }

    HashSet<Integer> tempSet;
    private boolean isTemp(int id){
        return tempSet.contains(id);
    }

    private int newTemp(){
        int id = newVarId();
        tempSet.contains(id);
        return id;
    }

    private int nextVarId = 1;
    private int newVarId(){
        return nextVarId++;
    }

    @Override
    public void enterProg(KharazmiParser.ProgContext ctx) {
        bytecode += KharazmiHelperFunctions.JasminPrefix();
    }

    @Override
    public void exitProg(KharazmiParser.ProgContext ctx) {
        bytecode += KharazmiHelperFunctions.JasminPostfix();
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
        if (ctx.ID().getText().equals("چاپکن")){
            bytecode += KharazmiHelperFunctions.PrintFunctionCall(ctx.expr());
        }else{
            // TODO: call function ctx.ID()
        }
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

    }

    @Override
    public void exitAssignmentStatement(KharazmiParser.AssignmentStatementContext ctx) {
        String variable_name = ctx.ID().getSymbol().getText();
        String variable_type = ctx.expr().type;
        if (symbolTable.containsKey(variable_name)) {
            if (!symbolTable.get(variable_name).equals(variable_type)) {
                throw new RuntimeException(variable_name + " except " + symbolTable.get(variable_name) + " but it got " + variable_type);
            }
        } else {
            symbolTable.put(variable_name, new SymbolContext(variable_type, variable_name, false, newVarId()));
            // TODO pop push
        }
    }
    @Override
    public void enterInstanceDefinition(KharazmiParser.InstanceDefinitionContext ctx) {

    }

    @Override
    public void exitInstanceDefinition(KharazmiParser.InstanceDefinitionContext ctx) {

    }

    @Override
    public void enterExpr(KharazmiParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(KharazmiParser.ExprContext ctx) {
        if (ctx.ID() != null) {
            if (symbolTable.containsKey(ctx.ID().getText())) {
                ctx.type = symbolTable.get(ctx.ID().getText()).type;
                ctx.isTemp = true;
                // TODO print temp statement
            } else {
                throw new RuntimeException(ctx.ID().getText() + "is used before assignment");
            }
        } else if (ctx.STRING() != null) {
            ctx.type = "str";
            ctx.isTemp = false;
            ctx.value = ctx.STRING();
        } else if (ctx.NUMBER() != null) {
            ctx.type = "int";
            ctx.isTemp = false;
            ctx.value = KharazmiHelperFunctions.ToEnglishNumber(ctx.NUMBER().getText());
        } else if (ctx.operand() != null) {
            System.out.println(ctx.expr(0).type);
            if (ctx.expr(0).type.equals(ctx.expr(1).type)) {
                ctx.type = ctx.expr(0).type;
                // TODO print temp statement
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.operand().getText() + " between "+ctx.expr(0).type + " and "+ctx.expr(1).type);
            }
        }

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
