package listeners;

import org.antlr.v4.codegen.model.SrcOp;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.KharazmiListener;
import parser.KharazmiParser;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;


public class KharazmiCodeGenerator implements KharazmiListener {

    class SymbolContext {
        String type;
        String name;
        boolean isTemp;
        int varId;

        SymbolContext(String type, String name, boolean isTemp, int varId) {
            this.type = type;
            this.name = name;
            this.isTemp = isTemp;
            this.varId = varId;
        }
    }

    public Stack<HashMap<String, SymbolContext>> symbolTableStack;
    private PrintWriter writer;
    private boolean printOnBottom = false;

    public KharazmiCodeGenerator(PrintWriter writer) {
        symbolTableStack = new Stack<>();
        symbolTableStack.push(new HashMap<>());
        tempSet = new HashSet<>();
        funcMap = new HashMap<>();
        this.writer = writer;
    }

    private HashSet<Integer> tempSet;
    private HashMap<String, String> funcMap;

    private boolean isTemp(int id) {
        return tempSet.contains(id);
    }

    private int newTemp() {
        int id = newVarId();
        tempSet.contains(id);
        return id;
    }

    private int nextVarId = 1;

    private int newVarId() {
        return nextVarId++;
    }

    private int nextLabelNumber = 1;

    private String newLabel() {
        nextLabelNumber++;
        return "L" + (nextLabelNumber);
    }

    private String tempCodes = "";
    private void println(String s){
        if (printOnBottom)
            tempCodes += s + "\n";
        else
            writer.println(s);
    }

    private void programFinished(){
        writer.print(tempCodes);
    }

    @Override
    public void enterProg(KharazmiParser.ProgContext ctx) {
        writer.print(KharazmiHelperFunctions.JasminPrefix());
    }

    @Override
    public void exitProg(KharazmiParser.ProgContext ctx) {
        writer.print(KharazmiHelperFunctions.JasminPostfix());
        programFinished();
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
        if (ctx.PRINT_FUNCTION() != null) {
            println("getstatic java/lang/System/out Ljava/io/PrintStream;");
        } else {
            // TODO: call function ctx.ID()
        }

    }

    @Override
    public void exitSubjectiveFunctionCall(KharazmiParser.SubjectiveFunctionCallContext ctx) {
        if (ctx.PRINT_FUNCTION() != null) {
            String type = ctx.expr().type.equals("str")? "Ljava/lang/String;" : (ctx.expr().type.equals("int")? "I" : "Z");
            println("invokevirtual java/io/PrintStream/println("+type+")V");
        } else {
            // TODO: call function ctx.ID()
        }
    }

    @Override
    public void enterFunctionCall(KharazmiParser.FunctionCallContext ctx) {

    }

    @Override
    public void exitFunctionCall(KharazmiParser.FunctionCallContext ctx) {
        println("invokestatic KharazmiProgram/"+funcMap.get(ctx.ID().getText()));
        if (ctx.getParent() instanceof KharazmiParser.StatementContext){
            println("pop");
        }
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
        if (symbolTableStack.peek().containsKey(variable_name)) {
            if (!symbolTableStack.peek().get(variable_name).type.equals(variable_type)) {
                throw new RuntimeException(variable_name + " except " + symbolTableStack.peek().get(variable_name).type + " but it got " + variable_type);
            }
            println("istore " + symbolTableStack.peek().get(variable_name).varId);
        } else {
            int id = newVarId();
            symbolTableStack.peek().put(variable_name, new SymbolContext(variable_type, variable_name, false, id));
            println("istore " + id);
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
        if (ctx.ADD() != null) {
            if (!ctx.term().type.equals(ctx.expr().type) || !ctx.term().type.equals("int")) {
                throw new RuntimeException("Can not apply operand " + ctx.ADD().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
            println("iadd");
            ctx.type = "int";
        } else if (ctx.SUB() != null) {
            if (!ctx.term().type.equals(ctx.expr().type) || !ctx.term().type.equals("int")) {
                throw new RuntimeException("Can not apply operand " + ctx.SUB().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
            println("isub");
            ctx.type = "int";
        } else if (ctx.compare_operation() != null) {
            if (ctx.term().type.equals(ctx.expr().type) && ctx.term().type.equals("int")) {

                String l1 = newLabel();
                String l2 = newLabel();

                if (ctx.compare_operation().GT() != null)
                    println("if_icmple " + l1);
                else if (ctx.compare_operation().GT_EQUAL() != null)
                    println("if_icmplt " + l1);
                else if (ctx.compare_operation().LT() != null)
                    println("if_icmpge " + l1);
                else if (ctx.compare_operation().LT_EQUAL() != null)
                    println("if_icmpgt " + l1);
                else if (ctx.compare_operation().EQUAL() != null)
                    println("if_icmpne " + l1);

                println("iconst_1");
                println("goto " + l2);
                println(l1 + ":");
                println("iconst_0");
                println(l2 + ":");
                ctx.type = "bool";
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.compare_operation().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
        } else if (ctx.or_term() != null) {
            if (ctx.or_term().term().type.equals(ctx.expr().type) && ctx.expr().type.equals("bool")) {
                // codes in or_term
                ctx.type = "bool";
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.or_term().OR().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
        } else if (ctx.term() != null) {
            ctx.type = ctx.term().type;
            ctx.isID = ctx.term().isID;
            ctx.value = ctx.term().value;
        } else if (ctx.functionCall() != null) {
            ctx.type = "int"; // TODO
        }else{
            // TODO
        }

    }

    @Override
    public void enterTerm(KharazmiParser.TermContext ctx) {

    }

    @Override
    public void exitTerm(KharazmiParser.TermContext ctx) {
        if (ctx.MUL() != null) {
            if (!ctx.term().type.equals(ctx.factor().type) || !ctx.term().type.equals("int")) {
                throw new RuntimeException("Can not apply operand " + ctx.MUL().getText() + " between " + ctx.term().type + " and " + ctx.factor().type);
            }
            ctx.type = "int";
            println("imul");
        } else if (ctx.DIV() != null) {
            if (!ctx.term().type.equals(ctx.factor().type) || !ctx.term().type.equals("int")) {
                throw new RuntimeException("Can not apply operand " + ctx.DIV().getText() + " between " + ctx.term().type + " and " + ctx.factor().type);
            }
            ctx.type = "int";
            println("idiv");
        } else if (ctx.and_factor() != null) {
            if (ctx.term().type.equals(ctx.and_factor().factor().type) && ctx.term().type.equals("bool")) {
                // codes in and_factor
                ctx.type = "bool";
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.and_factor().AND().getText() + " between " + ctx.term().type + " and " + ctx.factor().type);
            }
        } else {
            ctx.type = ctx.factor().type;
            ctx.isID = ctx.factor().isID;
            ctx.value = ctx.factor().value;
        }
    }

    @Override
    public void enterFactor(KharazmiParser.FactorContext ctx) {

    }

    @Override
    public void exitFactor(KharazmiParser.FactorContext ctx) {
        if (ctx.ID() != null) {
            if (symbolTableStack.peek().containsKey(ctx.ID().getText())) {
                ctx.type = symbolTableStack.peek().get(ctx.ID().getText()).type;
                ctx.isID = true;
                ctx.value = ctx.ID().getText();
                println("iload " + symbolTableStack.peek().get(ctx.value.toString()).varId);
            } else {
                throw new RuntimeException(ctx.ID().getText() + "is used before assignment");
            }
        } else if (ctx.STRING() != null) {
            ctx.type = "str";
            ctx.isID = false;
            ctx.value = ctx.STRING().getText().substring(1, ctx.getText().length() - 1);
            println("ldc \"" + ctx.value + "\"");
        } else if (ctx.NUMBER() != null) {
            ctx.type = "int";
            ctx.isID = false;
            ctx.value = KharazmiHelperFunctions.ToEnglishNumber(ctx.NUMBER().getText());
            println("bipush " + ctx.value);
        } else if (ctx.TRUE() != null) {
            ctx.type = "bool";
            ctx.isID = false;
            ctx.value = "1";
            println("bipush " + ctx.value);
        } else if (ctx.FALSE() != null) {
            ctx.type = "bool";
            ctx.isID = false;
            ctx.value = "0";
            println("bipush " + ctx.value);
        } else {
            ctx.type = ctx.expr().type;
            ctx.isID = ctx.expr().isID;
            ctx.value = ctx.expr().value;
            println("bipush " + ctx.value);
        }
    }

    @Override
    public void enterOr_term(KharazmiParser.Or_termContext ctx) {
        ctx.l_0 = newLabel();
        ctx.l_1 = newLabel();
        ctx.l_end = newLabel();

        println("ifne " + ctx.l_1);
    }

    @Override
    public void exitOr_term(KharazmiParser.Or_termContext ctx) {
        println("ifeq " + ctx.l_0);
        println(ctx.l_1+":");
        println("iconst_1");
        println("goto "+ctx.l_end);
        println(ctx.l_0+":");
        println("iconst_0");
        println(ctx.l_end+":");
    }

    @Override
    public void enterAnd_factor(KharazmiParser.And_factorContext ctx) {
        ctx.l_0 = newLabel();
        ctx.l_end = newLabel();

        println("ifeq " + ctx.l_0);
    }

    @Override
    public void exitAnd_factor(KharazmiParser.And_factorContext ctx) {
        println("ifeq " + ctx.l_0);
        println("iconst_1");
        println("goto "+ctx.l_end);
        println(ctx.l_0+":");
        println("iconst_0");
        println(ctx.l_end+":");
    }

    @Override
    public void enterCompare_operation(KharazmiParser.Compare_operationContext ctx) {

    }

    @Override
    public void exitCompare_operation(KharazmiParser.Compare_operationContext ctx) {

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
        String ret_type;
        if (ctx.functionDefinitionHead().RETURN_STR() != null){
            ret_type = "areturn";
        }else if (ctx.functionDefinitionHead().RETURN_BOOL() != null){
            ret_type = "ireturn";
        }else if (ctx.functionDefinitionHead().RETURN_INT() != null){
            ret_type = "ireturn";
        }else{
            ret_type = "return";
        }
        println(ret_type);
        println(".end method");
        printOnBottom = false;
        symbolTableStack.pop();
    }

    @Override
    public void enterFunctionDefinitionHead(KharazmiParser.FunctionDefinitionHeadContext ctx) {

    }

    @Override
    public void exitFunctionDefinitionHead(KharazmiParser.FunctionDefinitionHeadContext ctx) {
        if (printOnBottom) throw new RuntimeException("Nested function is not supported.");
        printOnBottom = true;
        symbolTableStack.push(new HashMap<>());

        String ret_type;

        if (ctx.RETURN_STR() != null){
            ret_type = "Ljava/lang/String;";
        }else if (ctx.RETURN_BOOL() != null){
            ret_type = "Z";
        }else if (ctx.RETURN_INT() != null){
            ret_type = "I";
        }else{
            ret_type = "V";
        }

        String params = "";
        int paramI = 0;
        if (ctx.parameters() != null)
            for (KharazmiParser.ParamContext element : ctx.parameters().param()) {
                if (element.PARAM_STR() != null) {
                    params += "Ljava/lang/String;";
                    nextVarId++;
                    symbolTableStack.peek().put(element.ID().getText(),
                            new SymbolContext("str", element.ID().getText(), false, paramI++));
                } else if (element.PARAM_BOOL() != null) {
                    params += "Z";
                    nextVarId++;
                    symbolTableStack.peek().put(element.ID().getText(),
                            new SymbolContext("bool", element.ID().getText(), false, paramI++));
                } else if (element.PARAM_INT() != null) {
                    params += "I";
                    nextVarId++;
                    symbolTableStack.peek().put(element.ID().getText(),
                            new SymbolContext("int", element.ID().getText(), false, paramI++));
                }
            }

        funcMap.put(ctx.ID().getText(), ctx.ID().getText()+"("+params+")"+ret_type);
        println(".method static "+ctx.ID().getText()+"("+params+")"+ret_type);
        println("    .limit stack 100\n" +
                "    .limit locals 100");

    }

    @Override
    public void enterParameters(KharazmiParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(KharazmiParser.ParametersContext ctx) {

    }

    @Override
    public void enterParam(KharazmiParser.ParamContext ctx) {

    }

    @Override
    public void exitParam(KharazmiParser.ParamContext ctx) {

    }

    @Override
    public void enterIfStatement(KharazmiParser.IfStatementContext ctx) {
        ctx.endLabel = newLabel();
        ctx.elseLabel = newLabel();
    }

    @Override
    public void exitIfStatement(KharazmiParser.IfStatementContext ctx) {
        println(ctx.endLabel + ":");
    }

    @Override
    public void enterIfBlock(KharazmiParser.IfBlockContext ctx) {

    }

    @Override
    public void exitIfBlock(KharazmiParser.IfBlockContext ctx) {
        KharazmiParser.IfStatementContext ifStCtx = (KharazmiParser.IfStatementContext) ctx.getParent();

        println("goto " + ifStCtx.endLabel);
        println(ifStCtx.elseLabel + ":");
    }

    @Override
    public void enterElseBlock(KharazmiParser.ElseBlockContext ctx) {

    }

    @Override
    public void exitElseBlock(KharazmiParser.ElseBlockContext ctx) {

    }

    @Override
    public void enterIfHead(KharazmiParser.IfHeadContext ctx) {

    }

    @Override
    public void exitIfHead(KharazmiParser.IfHeadContext ctx) {
        KharazmiParser.IfStatementContext ifStCtx = (KharazmiParser.IfStatementContext) ctx.getParent().getParent();
        println("ifeq " + ifStCtx.elseLabel);
    }

    @Override
    public void enterWhileStatement(KharazmiParser.WhileStatementContext ctx) {
        ctx.l_loop = newLabel();
        ctx.l_end = newLabel();
        println(ctx.l_loop+":");
    }

    @Override
    public void exitWhileStatement(KharazmiParser.WhileStatementContext ctx) {
        println("goto "+ctx.l_loop);
        println(ctx.l_end+":");
    }

    @Override
    public void enterWhile_expr(KharazmiParser.While_exprContext ctx) {

    }

    @Override
    public void exitWhile_expr(KharazmiParser.While_exprContext ctx) {
        println("ifeq " + ((KharazmiParser.WhileStatementContext)ctx.getParent()).l_end);
    }

    @Override
    public void enterRepeatStatement(KharazmiParser.RepeatStatementContext ctx) {
        ctx.itratorIndex = newTemp();
        ctx.startLabel = newLabel();
        ctx.endLabel = newLabel();
        println("iconst_0");
        println("istore " + ctx.itratorIndex);
        println(ctx.startLabel + ":");
    }

    @Override
    public void exitRepeatStatement(KharazmiParser.RepeatStatementContext ctx) {
        println("iinc " + ctx.itratorIndex + " 1");
        println("goto " + ctx.startLabel);
        println(ctx.endLabel + ":");
    }

    @Override
    public void enterRepeatBlock(KharazmiParser.RepeatBlockContext ctx) {
        KharazmiParser.RepeatStatementContext repeateStCtx = (KharazmiParser.RepeatStatementContext)ctx.getParent();
        println("iload " + repeateStCtx.itratorIndex);
        println("if_icmple " + repeateStCtx.endLabel);
    }

    @Override
    public void exitRepeatBlock(KharazmiParser.RepeatBlockContext ctx) {

    }

    @Override
    public void enterForeachStatement(KharazmiParser.ForeachStatementContext ctx) {
        ctx.l_end = newLabel();
        ctx.l_loop = newLabel();
    }

    @Override
    public void exitForeachStatement(KharazmiParser.ForeachStatementContext ctx) {
        if (!ctx.expr().type.equals(ctx.foreach_to_expr().expr().type) || !ctx.expr().type.equals("int")) {
            throw new RuntimeException("cannot iterate on non-int range");
        }

        println("iinc "+symbolTableStack.peek().get(ctx.ID().getText()).varId+" 1");
        println("goto " + ctx.l_loop);
        println(ctx.l_end+":");
    }

    @Override
    public void enterForeach_to_expr(KharazmiParser.Foreach_to_exprContext ctx) {

        String variable_name = ((KharazmiParser.ForeachStatementContext)ctx.getParent()).ID().getSymbol().getText();
        String variable_type = "int";
        int id = newVarId();
        symbolTableStack.peek().put(variable_name, new SymbolContext(variable_type, variable_name, false, id));
        println("istore " + id);
    }

    @Override
    public void exitForeach_to_expr(KharazmiParser.Foreach_to_exprContext ctx) {
        String variable_type = "int";
        int id = newTemp();
        String variable_name = "$"+id;
        symbolTableStack.peek().put(variable_name, new SymbolContext(variable_type, variable_name, false, id));
        println("istore " + id);

        println(((KharazmiParser.ForeachStatementContext)ctx.getParent()).l_loop+":");

        println("iload " + symbolTableStack.peek().get(((KharazmiParser.ForeachStatementContext)ctx.getParent()).ID().getSymbol().getText()).varId);
        println("iload " + id);
        println("if_icmpge " + ((KharazmiParser.ForeachStatementContext)ctx.getParent()).l_end);
    }

    @Override
    public void enterReturnStatement(KharazmiParser.ReturnStatementContext ctx) {

    }

    @Override
    public void exitReturnStatement(KharazmiParser.ReturnStatementContext ctx) {
        if (symbolTableStack.peek().containsKey(ctx.ID().getText())) {
            println("iload " + symbolTableStack.peek().get(ctx.ID().toString()).varId);
        } else {
            throw new RuntimeException(ctx.ID().getText() + "is used before assignment");
        }
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
