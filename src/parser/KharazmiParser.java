// Generated from /media/asemanmanzar/Mohsen/Programming/Java/KharazmiCompiler/grammer/Kharazmi.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KharazmiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, RETURN_STR=4, RETURN_INT=5, RETURN_BOOL=6, PARAM_STR=7, 
		PARAM_INT=8, PARAM_BOOL=9, POSTFIX_DEFINE=10, PREFIX_DEFINE=11, WAS=12, 
		CLASS=13, FUNCTION=14, IF=15, ELSE=16, WHILE=17, FOREACH=18, From=19, 
		TO=20, HAS=21, WITH=22, RETURN=23, END=24, NEW=25, AND=26, OR=27, EQUAL=28, 
		GT=29, LT=30, GT_EQUAL=31, LT_EQUAL=32, DOT=33, COMMA=34, COLON=35, KASRE=36, 
		ADD=37, SUB=38, MUL=39, DIV=40, REPEAT=41, TRUE=42, FALSE=43, PRINT_FUNCTION=44, 
		ID=45, NUMBER=46, STRING=47, WS=48;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_statement = 2, RULE_subjectiveFunctionCall = 3, 
		RULE_functionCall = 4, RULE_methodCall = 5, RULE_getAttr = 6, RULE_arguments = 7, 
		RULE_assignmentStatement = 8, RULE_instanceDefinition = 9, RULE_expr = 10, 
		RULE_term = 11, RULE_factor = 12, RULE_or_term = 13, RULE_and_factor = 14, 
		RULE_compare_operation = 15, RULE_classDefinition = 16, RULE_classStatement = 17, 
		RULE_attributedDefinition = 18, RULE_methodDefinition = 19, RULE_functionDefinition = 20, 
		RULE_functionDefinitionHead = 21, RULE_parameters = 22, RULE_param = 23, 
		RULE_ifStatement = 24, RULE_ifBlock = 25, RULE_elseBlock = 26, RULE_ifHead = 27, 
		RULE_whileStatement = 28, RULE_while_expr = 29, RULE_repeatStatement = 30, 
		RULE_repeatBlock = 31, RULE_foreachStatement = 32, RULE_foreach_to_expr = 33, 
		RULE_returnStatement = 34;
	public static final String[] ruleNames = {
		"prog", "block", "statement", "subjectiveFunctionCall", "functionCall", 
		"methodCall", "getAttr", "arguments", "assignmentStatement", "instanceDefinition", 
		"expr", "term", "factor", "or_term", "and_factor", "compare_operation", 
		"classDefinition", "classStatement", "attributedDefinition", "methodDefinition", 
		"functionDefinition", "functionDefinitionHead", "parameters", "param", 
		"ifStatement", "ifBlock", "elseBlock", "ifHead", "whileStatement", "while_expr", 
		"repeatStatement", "repeatBlock", "foreachStatement", "foreach_to_expr", 
		"returnStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u0631\u0627'", "'('", "')'", "'\u0631\u0634\u062A\u0647 \u0627\u06CC'", 
		"'\u0639\u062F\u062F\u06CC'", "'\u0628\u0648\u0644\u06CC'", "'\u0631\u0634\u062A\u0647'", 
		"'\u0639\u062F\u062F'", "'\u0628\u0648\u0644\u06CC\u0646'", null, "'\u062A\u0639\u0631\u06CC\u0641'", 
		null, "'\u0631\u0633\u062A\u0647'", "'\u062A\u0627\u0628\u0639'", "'\u0627\u06AF\u0631'", 
		"'\u0648\u06AF\u0631\u0646\u0647'", null, "'\u0628\u0631\u0627\u06CC \u0647\u0631'", 
		"'\u0627\u0632'", "'\u062A\u0627'", "'\u062F\u0627\u0631\u062F'", "'\u0628\u0627'", 
		"'\u0628\u0627\u0632\u06AF\u0631\u062F\u0627\u0646'", "'\u062E\u0628'", 
		"'\u06CC\u06A9'", "'\u0648'", "'\u06CC\u0627'", null, null, null, null, 
		null, "'.'", "'\u060C'", "':'", "'\u0650'", null, null, null, null, "'\u0628\u0627\u0631'", 
		"'\u062F\u0631\u0633\u062A'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "RETURN_STR", "RETURN_INT", "RETURN_BOOL", "PARAM_STR", 
		"PARAM_INT", "PARAM_BOOL", "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", "CLASS", 
		"FUNCTION", "IF", "ELSE", "WHILE", "FOREACH", "From", "TO", "HAS", "WITH", 
		"RETURN", "END", "NEW", "AND", "OR", "EQUAL", "GT", "LT", "GT_EQUAL", 
		"LT_EQUAL", "DOT", "COMMA", "COLON", "KASRE", "ADD", "SUB", "MUL", "DIV", 
		"REPEAT", "TRUE", "FALSE", "PRINT_FUNCTION", "ID", "NUMBER", "STRING", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Kharazmi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KharazmiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KharazmiParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			block();
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT_FUNCTION) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(73);
				statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public InstanceDefinitionContext instanceDefinition() {
			return getRuleContext(InstanceDefinitionContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public SubjectiveFunctionCallContext subjectiveFunctionCall() {
			return getRuleContext(SubjectiveFunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				classDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				instanceDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				repeatStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				foreachStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				functionCall();
				setState(89);
				match(DOT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				methodCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(92);
				subjectiveFunctionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectiveFunctionCallContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
		public TerminalNode PRINT_FUNCTION() { return getToken(KharazmiParser.PRINT_FUNCTION, 0); }
		public SubjectiveFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjectiveFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterSubjectiveFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitSubjectiveFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitSubjectiveFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectiveFunctionCallContext subjectiveFunctionCall() throws RecognitionException {
		SubjectiveFunctionCallContext _localctx = new SubjectiveFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subjectiveFunctionCall);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				expr(0);
				setState(96);
				match(T__0);
				setState(97);
				match(ID);
				setState(98);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				expr(0);
				setState(101);
				match(T__0);
				setState(102);
				match(PRINT_FUNCTION);
				setState(103);
				match(DOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PRINT_FUNCTION() { return getToken(KharazmiParser.PRINT_FUNCTION, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(ID);
				setState(108);
				arguments();
				}
				break;
			case PRINT_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(PRINT_FUNCTION);
				setState(110);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KharazmiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KharazmiParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(114);
			match(ID);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(115);
				arguments();
				}
			}

			setState(118);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetAttrContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KharazmiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KharazmiParser.ID, i);
		}
		public TerminalNode KASRE() { return getToken(KharazmiParser.KASRE, 0); }
		public GetAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterGetAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitGetAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitGetAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetAttrContext getAttr() throws RecognitionException {
		GetAttrContext _localctx = new GetAttrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_getAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(KASRE);
			setState(122);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> WITH() { return getTokens(KharazmiParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(KharazmiParser.WITH, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(KharazmiParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KharazmiParser.AND, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(WITH);
			setState(125);
			expr(0);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					match(AND);
					setState(127);
					match(WITH);
					setState(128);
					expr(0);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(KharazmiParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode POSTFIX_DEFINE() { return getToken(KharazmiParser.POSTFIX_DEFINE, 0); }
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(135);
			match(EQUAL);
			setState(136);
			expr(0);
			setState(137);
			match(POSTFIX_DEFINE);
			setState(138);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode NEW() { return getToken(KharazmiParser.NEW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode POSTFIX_DEFINE() { return getToken(KharazmiParser.POSTFIX_DEFINE, 0); }
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
		public InstanceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterInstanceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitInstanceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitInstanceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceDefinitionContext instanceDefinition() throws RecognitionException {
		InstanceDefinitionContext _localctx = new InstanceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instanceDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(NEW);
			setState(142);
			expr(0);
			setState(143);
			match(POSTFIX_DEFINE);
			setState(144);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String type;
		public Object value;
		public boolean isID;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GetAttrContext getAttr() {
			return getRuleContext(GetAttrContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KharazmiParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KharazmiParser.SUB, 0); }
		public Or_termContext or_term() {
			return getRuleContext(Or_termContext.class,0);
		}
		public Compare_operationContext compare_operation() {
			return getRuleContext(Compare_operationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(147);
				functionCall();
				}
				break;
			case 2:
				{
				setState(148);
				getAttr();
				}
				break;
			case 3:
				{
				setState(149);
				methodCall();
				}
				break;
			case 4:
				{
				setState(150);
				term(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
						match(ADD);
						setState(155);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						match(SUB);
						setState(158);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						or_term();
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						compare_operation();
						setState(163);
						term(0);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public String type;
		public Object value;
		public boolean isID;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(KharazmiParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(KharazmiParser.DIV, 0); }
		public And_factorContext and_factor() {
			return getRuleContext(And_factorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(173);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(174);
						match(MUL);
						setState(175);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						match(DIV);
						setState(178);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						and_factor();
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public String type;
		public Object value;
		public boolean isID;
		public TerminalNode TRUE() { return getToken(KharazmiParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KharazmiParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(KharazmiParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(KharazmiParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(STRING);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(T__1);
				setState(192);
				expr(0);
				setState(193);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_termContext extends ParserRuleContext {
		public String l_1;
		public String l_0;
		public String l_end;
		public TerminalNode OR() { return getToken(KharazmiParser.OR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Or_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterOr_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitOr_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitOr_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_termContext or_term() throws RecognitionException {
		Or_termContext _localctx = new Or_termContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(OR);
			setState(198);
			term(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_factorContext extends ParserRuleContext {
		public String l_0;
		public String l_end;
		public TerminalNode AND() { return getToken(KharazmiParser.AND, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public And_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterAnd_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitAnd_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitAnd_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_factorContext and_factor() throws RecognitionException {
		And_factorContext _localctx = new And_factorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_and_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(AND);
			setState(201);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compare_operationContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(KharazmiParser.GT, 0); }
		public TerminalNode LT() { return getToken(KharazmiParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(KharazmiParser.EQUAL, 0); }
		public TerminalNode GT_EQUAL() { return getToken(KharazmiParser.GT_EQUAL, 0); }
		public TerminalNode LT_EQUAL() { return getToken(KharazmiParser.LT_EQUAL, 0); }
		public Compare_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterCompare_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitCompare_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitCompare_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_operationContext compare_operation() throws RecognitionException {
		Compare_operationContext _localctx = new Compare_operationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compare_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GT) | (1L << LT) | (1L << GT_EQUAL) | (1L << LT_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(KharazmiParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CLASS);
			setState(206);
			match(ID);
			setState(207);
			match(COLON);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREFIX_DEFINE || _la==ID) {
				{
				{
				setState(208);
				classStatement();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassStatementContext extends ParserRuleContext {
		public AttributedDefinitionContext attributedDefinition() {
			return getRuleContext(AttributedDefinitionContext.class,0);
		}
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classStatement);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				attributedDefinition();
				}
				break;
			case PREFIX_DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				methodDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode HAS() { return getToken(KharazmiParser.HAS, 0); }
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
		public AttributedDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterAttributedDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitAttributedDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitAttributedDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributedDefinitionContext attributedDefinition() throws RecognitionException {
		AttributedDefinitionContext _localctx = new AttributedDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attributedDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ID);
			setState(221);
			match(HAS);
			setState(222);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public TerminalNode PREFIX_DEFINE() { return getToken(KharazmiParser.PREFIX_DEFINE, 0); }
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public TerminalNode WITH() { return getToken(KharazmiParser.WITH, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(PREFIX_DEFINE);
			setState(225);
			match(ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(226);
				match(WITH);
				setState(227);
				parameters();
				}
			}

			setState(230);
			match(COLON);
			setState(231);
			block();
			setState(232);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinitionHeadContext functionDefinitionHead() {
			return getRuleContext(FunctionDefinitionHeadContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			functionDefinitionHead();
			setState(235);
			match(COLON);
			setState(236);
			block();
			setState(237);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionHeadContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(KharazmiParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RETURN_STR() { return getToken(KharazmiParser.RETURN_STR, 0); }
		public TerminalNode RETURN_INT() { return getToken(KharazmiParser.RETURN_INT, 0); }
		public TerminalNode RETURN_BOOL() { return getToken(KharazmiParser.RETURN_BOOL, 0); }
		public FunctionDefinitionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitionHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterFunctionDefinitionHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitFunctionDefinitionHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitFunctionDefinitionHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionHeadContext functionDefinitionHead() throws RecognitionException {
		FunctionDefinitionHeadContext _localctx = new FunctionDefinitionHeadContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDefinitionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(FUNCTION);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN_STR) | (1L << RETURN_INT) | (1L << RETURN_BOOL))) != 0)) {
				{
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN_STR) | (1L << RETURN_INT) | (1L << RETURN_BOOL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(243);
			match(ID);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(244);
				parameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> WITH() { return getTokens(KharazmiParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(KharazmiParser.WITH, i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(KharazmiParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KharazmiParser.AND, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(WITH);
			setState(248);
			param();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(249);
				match(AND);
				setState(250);
				match(WITH);
				setState(251);
				param();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode PARAM_STR() { return getToken(KharazmiParser.PARAM_STR, 0); }
		public TerminalNode PARAM_INT() { return getToken(KharazmiParser.PARAM_INT, 0); }
		public TerminalNode PARAM_BOOL() { return getToken(KharazmiParser.PARAM_BOOL, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARAM_STR) | (1L << PARAM_INT) | (1L << PARAM_BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public String elseLabel;
		public String endLabel;
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			ifBlock();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(261);
				elseBlock();
				}
			}

			setState(264);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public IfHeadContext ifHead() {
			return getRuleContext(IfHeadContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			ifHead();
			setState(267);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KharazmiParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ELSE);
			setState(270);
			match(COLON);
			setState(271);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfHeadContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KharazmiParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WAS() { return getToken(KharazmiParser.WAS, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public IfHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterIfHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitIfHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitIfHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfHeadContext ifHead() throws RecognitionException {
		IfHeadContext _localctx = new IfHeadContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IF);
			setState(274);
			expr(0);
			setState(275);
			match(WAS);
			setState(276);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public String l_end;
		public String l_loop;
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public TerminalNode POSTFIX_DEFINE() { return getToken(KharazmiParser.POSTFIX_DEFINE, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			while_expr();
			setState(279);
			match(POSTFIX_DEFINE);
			setState(280);
			match(COLON);
			setState(281);
			block();
			setState(282);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_exprContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KharazmiParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterWhile_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitWhile_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitWhile_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(WHILE);
			setState(285);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStatementContext extends ParserRuleContext {
		public int itratorIndex;
		public String startLabel;
		public String endLabel;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeatBlockContext repeatBlock() {
			return getRuleContext(RepeatBlockContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expr(0);
			setState(288);
			repeatBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatBlockContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(KharazmiParser.REPEAT, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public RepeatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterRepeatBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitRepeatBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitRepeatBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatBlockContext repeatBlock() throws RecognitionException {
		RepeatBlockContext _localctx = new RepeatBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_repeatBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(REPEAT);
			setState(291);
			match(COLON);
			setState(292);
			block();
			setState(293);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public String l_end;
		public String l_loop;
		public TerminalNode FOREACH() { return getToken(KharazmiParser.FOREACH, 0); }
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode From() { return getToken(KharazmiParser.From, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Foreach_to_exprContext foreach_to_expr() {
			return getRuleContext(Foreach_to_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(FOREACH);
			setState(296);
			match(ID);
			setState(297);
			match(From);
			setState(298);
			expr(0);
			setState(299);
			foreach_to_expr();
			setState(300);
			match(COLON);
			setState(301);
			block();
			setState(302);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_to_exprContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(KharazmiParser.TO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Foreach_to_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_to_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterForeach_to_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitForeach_to_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitForeach_to_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_to_exprContext foreach_to_expr() throws RecognitionException {
		Foreach_to_exprContext _localctx = new Foreach_to_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_foreach_to_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(TO);
			setState(305);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KharazmiParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(RETURN);
			setState(308);
			match(ID);
			setState(309);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 11:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u013a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\7\3M\n\3\f\3\16\3P\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3"+
		"\7\3\7\5\7w\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0084"+
		"\n\t\f\t\16\t\u0087\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u009a\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00d4\n\22\f\22\16"+
		"\22\u00d7\13\22\3\22\3\22\3\23\3\23\5\23\u00dd\n\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\5\25\u00e7\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\5\27\u00f4\n\27\3\27\3\27\5\27\u00f8\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\7\30\u00ff\n\30\f\30\16\30\u0102\13\30\3\31\3\31\3"+
		"\31\3\32\3\32\5\32\u0109\n\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\2\4\26\30%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDF\2\5\3\2\36\"\3\2\6\b\3\2\t\13\2\u013c\2"+
		"H\3\2\2\2\4N\3\2\2\2\6_\3\2\2\2\bk\3\2\2\2\nq\3\2\2\2\fs\3\2\2\2\16z\3"+
		"\2\2\2\20~\3\2\2\2\22\u0088\3\2\2\2\24\u008e\3\2\2\2\26\u0099\3\2\2\2"+
		"\30\u00ac\3\2\2\2\32\u00c5\3\2\2\2\34\u00c7\3\2\2\2\36\u00ca\3\2\2\2 "+
		"\u00cd\3\2\2\2\"\u00cf\3\2\2\2$\u00dc\3\2\2\2&\u00de\3\2\2\2(\u00e2\3"+
		"\2\2\2*\u00ec\3\2\2\2,\u00f1\3\2\2\2.\u00f9\3\2\2\2\60\u0103\3\2\2\2\62"+
		"\u0106\3\2\2\2\64\u010c\3\2\2\2\66\u010f\3\2\2\28\u0113\3\2\2\2:\u0118"+
		"\3\2\2\2<\u011e\3\2\2\2>\u0121\3\2\2\2@\u0124\3\2\2\2B\u0129\3\2\2\2D"+
		"\u0132\3\2\2\2F\u0135\3\2\2\2HI\5\4\3\2IJ\7\2\2\3J\3\3\2\2\2KM\5\6\4\2"+
		"LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PN\3\2\2\2Q`\5\"\22"+
		"\2R`\5*\26\2S`\5\22\n\2T`\5\24\13\2U`\5\62\32\2V`\5:\36\2W`\5> \2X`\5"+
		"B\"\2Y`\5F$\2Z[\5\n\6\2[\\\7#\2\2\\`\3\2\2\2]`\5\f\7\2^`\5\b\5\2_Q\3\2"+
		"\2\2_R\3\2\2\2_S\3\2\2\2_T\3\2\2\2_U\3\2\2\2_V\3\2\2\2_W\3\2\2\2_X\3\2"+
		"\2\2_Y\3\2\2\2_Z\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\5\26\f\2bc\7"+
		"\3\2\2cd\7/\2\2de\7#\2\2el\3\2\2\2fg\5\26\f\2gh\7\3\2\2hi\7.\2\2ij\7#"+
		"\2\2jl\3\2\2\2ka\3\2\2\2kf\3\2\2\2l\t\3\2\2\2mn\7/\2\2nr\5\20\t\2op\7"+
		".\2\2pr\5\20\t\2qm\3\2\2\2qo\3\2\2\2r\13\3\2\2\2st\7/\2\2tv\7/\2\2uw\5"+
		"\20\t\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7#\2\2y\r\3\2\2\2z{\7/\2\2{|\7"+
		"&\2\2|}\7/\2\2}\17\3\2\2\2~\177\7\30\2\2\177\u0085\5\26\f\2\u0080\u0081"+
		"\7\34\2\2\u0081\u0082\7\30\2\2\u0082\u0084\5\26\f\2\u0083\u0080\3\2\2"+
		"\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7/\2\2\u0089\u008a\7\36\2\2\u008a"+
		"\u008b\5\26\f\2\u008b\u008c\7\f\2\2\u008c\u008d\7#\2\2\u008d\23\3\2\2"+
		"\2\u008e\u008f\7/\2\2\u008f\u0090\7\33\2\2\u0090\u0091\5\26\f\2\u0091"+
		"\u0092\7\f\2\2\u0092\u0093\7#\2\2\u0093\25\3\2\2\2\u0094\u0095\b\f\1\2"+
		"\u0095\u009a\5\n\6\2\u0096\u009a\5\16\b\2\u0097\u009a\5\f\7\2\u0098\u009a"+
		"\5\30\r\2\u0099\u0094\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u00a9\3\2\2\2\u009b\u009c\f\7\2\2\u009c\u009d"+
		"\7\'\2\2\u009d\u00a8\5\30\r\2\u009e\u009f\f\6\2\2\u009f\u00a0\7(\2\2\u00a0"+
		"\u00a8\5\30\r\2\u00a1\u00a2\f\5\2\2\u00a2\u00a8\5\34\17\2\u00a3\u00a4"+
		"\f\4\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\5\30\r\2\u00a6\u00a8\3\2\2\2"+
		"\u00a7\u009b\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a3"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\27\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\r\1\2\u00ad\u00ae\5\32\16"+
		"\2\u00ae\u00b9\3\2\2\2\u00af\u00b0\f\6\2\2\u00b0\u00b1\7)\2\2\u00b1\u00b8"+
		"\5\32\16\2\u00b2\u00b3\f\5\2\2\u00b3\u00b4\7*\2\2\u00b4\u00b8\5\32\16"+
		"\2\u00b5\u00b6\f\4\2\2\u00b6\u00b8\5\36\20\2\u00b7\u00af\3\2\2\2\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c6"+
		"\7,\2\2\u00bd\u00c6\7-\2\2\u00be\u00c6\7/\2\2\u00bf\u00c6\7\60\2\2\u00c0"+
		"\u00c6\7\61\2\2\u00c1\u00c2\7\4\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7"+
		"\5\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5"+
		"\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c6\33\3\2\2\2\u00c7\u00c8\7\35\2\2\u00c8\u00c9\5\30\r\2\u00c9"+
		"\35\3\2\2\2\u00ca\u00cb\7\34\2\2\u00cb\u00cc\5\32\16\2\u00cc\37\3\2\2"+
		"\2\u00cd\u00ce\t\2\2\2\u00ce!\3\2\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d1"+
		"\7/\2\2\u00d1\u00d5\7%\2\2\u00d2\u00d4\5$\23\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\32\2\2\u00d9#\3\2\2\2\u00da\u00dd"+
		"\5&\24\2\u00db\u00dd\5(\25\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"%\3\2\2\2\u00de\u00df\7/\2\2\u00df\u00e0\7\27\2\2\u00e0\u00e1\7#\2\2\u00e1"+
		"\'\3\2\2\2\u00e2\u00e3\7\r\2\2\u00e3\u00e6\7/\2\2\u00e4\u00e5\7\30\2\2"+
		"\u00e5\u00e7\5.\30\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e9\7%\2\2\u00e9\u00ea\5\4\3\2\u00ea\u00eb\7\32\2\2\u00eb"+
		")\3\2\2\2\u00ec\u00ed\5,\27\2\u00ed\u00ee\7%\2\2\u00ee\u00ef\5\4\3\2\u00ef"+
		"\u00f0\7\32\2\2\u00f0+\3\2\2\2\u00f1\u00f3\7\20\2\2\u00f2\u00f4\t\3\2"+
		"\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\7/\2\2\u00f6\u00f8\5.\30\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"-\3\2\2\2\u00f9\u00fa\7\30\2\2\u00fa\u0100\5\60\31\2\u00fb\u00fc\7\34"+
		"\2\2\u00fc\u00fd\7\30\2\2\u00fd\u00ff\5\60\31\2\u00fe\u00fb\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101/\3\2\2\2"+
		"\u0102\u0100\3\2\2\2\u0103\u0104\t\4\2\2\u0104\u0105\7/\2\2\u0105\61\3"+
		"\2\2\2\u0106\u0108\5\64\33\2\u0107\u0109\5\66\34\2\u0108\u0107\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\32\2\2\u010b\63"+
		"\3\2\2\2\u010c\u010d\58\35\2\u010d\u010e\5\4\3\2\u010e\65\3\2\2\2\u010f"+
		"\u0110\7\22\2\2\u0110\u0111\7%\2\2\u0111\u0112\5\4\3\2\u0112\67\3\2\2"+
		"\2\u0113\u0114\7\21\2\2\u0114\u0115\5\26\f\2\u0115\u0116\7\16\2\2\u0116"+
		"\u0117\7%\2\2\u01179\3\2\2\2\u0118\u0119\5<\37\2\u0119\u011a\7\f\2\2\u011a"+
		"\u011b\7%\2\2\u011b\u011c\5\4\3\2\u011c\u011d\7\32\2\2\u011d;\3\2\2\2"+
		"\u011e\u011f\7\23\2\2\u011f\u0120\5\26\f\2\u0120=\3\2\2\2\u0121\u0122"+
		"\5\26\f\2\u0122\u0123\5@!\2\u0123?\3\2\2\2\u0124\u0125\7+\2\2\u0125\u0126"+
		"\7%\2\2\u0126\u0127\5\4\3\2\u0127\u0128\7\32\2\2\u0128A\3\2\2\2\u0129"+
		"\u012a\7\24\2\2\u012a\u012b\7/\2\2\u012b\u012c\7\25\2\2\u012c\u012d\5"+
		"\26\f\2\u012d\u012e\5D#\2\u012e\u012f\7%\2\2\u012f\u0130\5\4\3\2\u0130"+
		"\u0131\7\32\2\2\u0131C\3\2\2\2\u0132\u0133\7\26\2\2\u0133\u0134\5\26\f"+
		"\2\u0134E\3\2\2\2\u0135\u0136\7\31\2\2\u0136\u0137\7/\2\2\u0137\u0138"+
		"\7#\2\2\u0138G\3\2\2\2\25N_kqv\u0085\u0099\u00a7\u00a9\u00b7\u00b9\u00c5"+
		"\u00d5\u00dc\u00e6\u00f3\u00f7\u0100\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}