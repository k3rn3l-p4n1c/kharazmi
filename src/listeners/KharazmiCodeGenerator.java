package listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.KharazmiListener;
import parser.KharazmiParser;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;


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

    private HashMap<String, SymbolContext> symbolTable;
    private PrintWriter writer;


    public KharazmiCodeGenerator(PrintWriter writer) {
        symbolTable = new HashMap<>();
        tempSet = new HashSet<>();
        this.writer = writer;
    }

    private HashSet<Integer> tempSet;

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
        return "L" + (nextLabelNumber++);
    }

    @Override
    public void enterProg(KharazmiParser.ProgContext ctx) {
        writer.print(KharazmiHelperFunctions.JasminPrefix());
    }

    @Override
    public void exitProg(KharazmiParser.ProgContext ctx) {
        writer.print(KharazmiHelperFunctions.JasminPostfix());
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
        if (ctx.PRINT_FUNCTION() != null) {
            writer.print(KharazmiHelperFunctions.PrintFunctionCall(ctx.expr(), symbolTable));
        } else {
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
            if (!symbolTable.get(variable_name).type.equals(variable_type)) {
                throw new RuntimeException(variable_name + " except " + symbolTable.get(variable_name) + " but it got " + variable_type);
            }

        } else {
            int id = newVarId();
            symbolTable.put(variable_name, new SymbolContext(variable_type, variable_name, false, id));
            if (ctx.expr().isID) {
                writer.println("iload " + symbolTable.get(ctx.expr().value.toString()).varId);
                writer.println("istore " + id);
            } else {
                writer.println("bipush " + ctx.expr().value);
                writer.println("istore " + id);
            }
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
            if (ctx.term().type.equals(ctx.expr().type) && ctx.term().type.equals("int")) {
                if (ctx.expr().isID) {
                    if (ctx.term().isID) {
                        writer.println("iload " + symbolTable.get(ctx.expr().value.toString()).varId);
                        writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                        writer.println("iadd");
                    } else {
                        writer.println("iload " + symbolTable.get(ctx.expr().value.toString()).varId);
                        writer.println("bipush " + ctx.term().value);
                        writer.println("iadd");
                    }
                } else if (ctx.term().isID) {
                    writer.println("bipush " + ctx.expr().value);
                    writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                    writer.println("iadd");
                } else {
                    writer.println("bipush " + ctx.expr().value);
                    writer.println("bipush " + ctx.term().value);
                    writer.println("iadd");
                }
                int id = newTemp();
                ctx.isID = true;
                String variable_name = "#" + id;
                symbolTable.put(variable_name, new SymbolContext("int", variable_name, true, id));
                writer.println("istore " + id);
                ctx.type = "int";
                ctx.value = variable_name;
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.ADD().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
        } else if (ctx.SUB() != null) {
            if (ctx.term().type.equals(ctx.expr().type) && ctx.term().type.equals("int")) {
                if (ctx.expr().isID) {
                    if (ctx.term().isID) {
                        writer.println("iload " + symbolTable.get(ctx.expr().value.toString()).varId);
                        writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                        writer.println("isub");
                    } else {
                        writer.println("iload " + symbolTable.get(ctx.expr().value.toString()).varId);
                        writer.println("bipush " + ctx.term().value);
                        writer.println("isub");
                    }
                } else if (ctx.term().isID) {
                    writer.println("bipush " + ctx.expr().value);
                    writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                    writer.println("isub");
                } else {
                    writer.println("bipush " + ctx.expr().value);
                    writer.println("bipush " + ctx.term().value);
                    writer.println("isub");
                }
                int id = newTemp();
                ctx.isID = true;
                String variable_name = "#" + id;
                symbolTable.put(variable_name, new SymbolContext("int", variable_name, true, id));
                writer.println("istore " + id);
                ctx.type = "int";
                ctx.value = variable_name;
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.SUB().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
        } else if (ctx.compare_operation() != null) {
            if (ctx.term().type.equals(ctx.expr().type) && ctx.term().type.equals("int")) {

                String l1 = newLabel();
                String l2 = newLabel();

                if (ctx.expr().isID) {
                    writer.println("iload " + symbolTable.get(ctx.expr().value.toString()).varId);
                } else {
                    writer.println("bipush " + ctx.expr().value);
                }

                if (ctx.term().isID) {
                    writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                } else {
                    writer.println("bipush " + ctx.term().value);
                }

                if (ctx.compare_operation().GT() != null)
                    writer.println("if_icmple " + l1);
                else if (ctx.compare_operation().GT_EQUAL() != null)
                    writer.println("if_icmplt " + l1);
                else if (ctx.compare_operation().LT() != null)
                    writer.println("if_icmpge " + l1);
                else if (ctx.compare_operation().LT_EQUAL() != null)
                    writer.println("if_icmpgt " + l1);
                else if (ctx.compare_operation().EQUAL() != null)
                    writer.println("if_icmpne " + l1);

                writer.println("iconst_1");
                writer.println("goto " + l2);
                writer.println(l1 + ":");
                writer.println("iconst_0");
                writer.println(l2 + ":");

                int id = newTemp();
                ctx.isID = true;
                String variable_name = "#" + id;
                symbolTable.put(variable_name, new SymbolContext("int", variable_name, true, id));
                writer.println("istore " + id);
                ctx.type = "bool";
                ctx.value = variable_name;

            } else {
                throw new RuntimeException("Can not apply operand " + ctx.compare_operation().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
        } else if (ctx.OR() != null) {
            if (ctx.term().type.equals(ctx.expr().type) && ctx.term().type.equals("bool")) {

            } else {
                throw new RuntimeException("Can not apply operand " + ctx.SUB().getText() + " between " + ctx.expr().type + " and " + ctx.term().type);
            }
        } else if (ctx.term() != null) {
            ctx.type = ctx.term().type;
            ctx.isID = ctx.term().isID;
            ctx.value = ctx.term().value;
        } else {
            // TODO
        }

    }

    @Override
    public void enterTerm(KharazmiParser.TermContext ctx) {

    }

    @Override
    public void exitTerm(KharazmiParser.TermContext ctx) {
        if (ctx.MUL() != null) {
            if (ctx.term().type.equals(ctx.factor().type) && ctx.term().type.equals("int")) {
                if (ctx.term().isID) {
                    if (ctx.factor().isID) {
                        writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                        writer.println("iload " + symbolTable.get(ctx.factor().value.toString()).varId);
                        writer.println("imul");
                    } else {
                        writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                        writer.println("bipush " + ctx.factor().value);
                        writer.println("imul");
                    }
                } else if (ctx.factor().isID) {
                    writer.println("bipush " + ctx.term().value);
                    writer.println("iload " + symbolTable.get(ctx.factor().value.toString()).varId);
                    writer.println("imul");
                } else {
                    writer.println("bipush " + ctx.term().value);
                    writer.println("bipush " + ctx.factor().value);
                    writer.println("imul");
                }
                int id = newTemp();
                ctx.isID = true;
                String variable_name = "#" + id;
                symbolTable.put(variable_name, new SymbolContext("int", variable_name, true, id));
                writer.println("istore " + id);
                ctx.type = "int";
                ctx.value = variable_name;
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.MUL().getText() + " between " + ctx.term().type + " and " + ctx.factor().type);
            }
        } else if (ctx.DIV() != null) {
            if (ctx.term().type.equals(ctx.factor().type) && ctx.term().type.equals("int")) {
                if (ctx.term().isID) {
                    if (ctx.factor().isID) {
                        writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                        writer.println("iload " + symbolTable.get(ctx.factor().value.toString()).varId);
                        writer.println("idiv");
                    } else {
                        writer.println("iload " + symbolTable.get(ctx.term().value.toString()).varId);
                        writer.println("bipush " + ctx.factor().value);
                        writer.println("idiv");
                    }
                } else if (ctx.factor().isID) {
                    writer.println("bipush " + ctx.term().value);
                    writer.println("iload " + symbolTable.get(ctx.factor().value.toString()).varId);
                    writer.println("idiv");
                } else {
                    writer.println("bipush " + ctx.term().value);
                    writer.println("bipush " + ctx.factor().value);
                    writer.println("idiv");
                }
                int id = newTemp();
                ctx.isID = true;
                String variable_name = "#" + id;
                symbolTable.put(variable_name, new SymbolContext("int", variable_name, true, id));
                writer.println("istore " + id);
                ctx.type = "int";
                ctx.value = variable_name;
            } else {
                throw new RuntimeException("Can not apply operand " + ctx.DIV().getText() + " between " + ctx.term().type + " and " + ctx.factor().type);
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
            if (symbolTable.containsKey(ctx.ID().getText())) {
                ctx.type = symbolTable.get(ctx.ID().getText()).type;
                ctx.isID = true;
                ctx.value = ctx.ID().getText();
            } else {
                throw new RuntimeException(ctx.ID().getText() + "is used before assignment");
            }
        } else if (ctx.STRING() != null) {
            ctx.type = "str";
            ctx.isID = false;
            ctx.value = ctx.STRING().getText().substring(1, ctx.getText().length() - 1);
        } else if (ctx.NUMBER() != null) {
            ctx.type = "int";
            ctx.isID = false;
            ctx.value = KharazmiHelperFunctions.ToEnglishNumber(ctx.NUMBER().getText());
        } else if (ctx.TRUE() != null) {
            ctx.type = "bool";
            ctx.isID = false;
            ctx.value = "1";
        } else if (ctx.FALSE() != null) {
            ctx.type = "bool";
            ctx.isID = false;
            ctx.value = "0";
        } else {
            ctx.type = ctx.expr().type;
            ctx.isID = ctx.expr().isID;
            ctx.value = ctx.expr().value;
        }
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
