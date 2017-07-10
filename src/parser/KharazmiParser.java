// Generated from /Users/Bardia/IdeaProjects/compiler/grammer/Kharazmi.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, POSTFIX_DEFINE=4, PREFIX_DEFINE=5, WAS=6, CLASS=7, 
		FUNCTION=8, IF=9, ELSE=10, WHILE=11, FOREACH=12, IN=13, HAS=14, WITH=15, 
		RETURN=16, END=17, NEW=18, AND=19, OR=20, EQUAL=21, GT=22, LT=23, GT_EQUAL=24, 
		LT_EQUAL=25, DOT=26, COMMA=27, COLON=28, KASRE=29, ADD=30, SUB=31, MUL=32, 
		DIV=33, REPEAT=34, PRINT_FUNCTION=35, ID=36, NUMBER=37, STRING=38, TRUE=39, 
		FALSE=40, WS=41;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_statement = 2, RULE_subjectiveFunctionCall = 3, 
		RULE_functionCall = 4, RULE_methodCall = 5, RULE_getAttr = 6, RULE_arguments = 7, 
		RULE_assignmentStatement = 8, RULE_instanceDefinition = 9, RULE_expr = 10, 
		RULE_term = 11, RULE_factor = 12, RULE_compare_operation = 13, RULE_classDefinition = 14, 
		RULE_classStatement = 15, RULE_attributedDefinition = 16, RULE_methodDefinition = 17, 
		RULE_functionDefinition = 18, RULE_parameters = 19, RULE_ifStatement = 20, 
		RULE_ifBlock = 21, RULE_elseBlock = 22, RULE_ifHead = 23, RULE_whileStatement = 24, 
		RULE_repeatStatement = 25, RULE_foreachStatement = 26, RULE_returnStatement = 27;
	public static final String[] ruleNames = {
		"prog", "block", "statement", "subjectiveFunctionCall", "functionCall", 
		"methodCall", "getAttr", "arguments", "assignmentStatement", "instanceDefinition", 
		"expr", "term", "factor", "compare_operation", "classDefinition", "classStatement", 
		"attributedDefinition", "methodDefinition", "functionDefinition", "parameters", 
		"ifStatement", "ifBlock", "elseBlock", "ifHead", "whileStatement", "repeatStatement", 
		"foreachStatement", "returnStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u0631\u0627'", "'('", "')'", null, "'\u062A\u0639\u0631\u06CC\u0641'", 
		null, "'\u0631\u0633\u062A\u0647'", "'\u062A\u0627\u0628\u0639'", "'\u0627\u06AF\u0631'", 
		"'\u0648\u06AF\u0631\u0646\u0647'", "'\u062A\u0627 \u0647\u0646\u06AF\u0627\u0645\u06CC \u06A9\u0647'", 
		"'\u0628\u0631\u0627\u06CC \u0647\u0631'", "'\u062F\u0631'", "'\u062F\u0627\u0631\u062F'", 
		"'\u0628\u0627'", "'\u0628\u0627\u0632\u06AF\u0631\u062F\u0627\u0646'", 
		"'\u062E\u0628'", "'\u06CC\u06A9'", "'\u0648'", "'\u06CC\u0627'", null, 
		null, null, null, null, "'.'", "'\u060C'", "':'", "'\u0650'", null, null, 
		null, null, "'\u0628\u0627\u0631'", null, null, null, null, "'\u062F\u0631\u0633\u062A'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", "CLASS", 
		"FUNCTION", "IF", "ELSE", "WHILE", "FOREACH", "IN", "HAS", "WITH", "RETURN", 
		"END", "NEW", "AND", "OR", "EQUAL", "GT", "LT", "GT_EQUAL", "LT_EQUAL", 
		"DOT", "COMMA", "COLON", "KASRE", "ADD", "SUB", "MUL", "DIV", "REPEAT", 
		"PRINT_FUNCTION", "ID", "NUMBER", "STRING", "TRUE", "FALSE", "WS"
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
			setState(56);
			block();
			setState(57);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << RETURN) | (1L << PRINT_FUNCTION) | (1L << ID) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(59);
				statement();
				}
				}
				setState(64);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				classDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				instanceDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				repeatStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				foreachStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				functionCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(75);
				methodCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(76);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				expr(0);
				setState(80);
				match(T__0);
				setState(81);
				match(ID);
				setState(82);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				expr(0);
				setState(85);
				match(T__0);
				setState(86);
				match(PRINT_FUNCTION);
				setState(87);
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
		public TerminalNode DOT() { return getToken(KharazmiParser.DOT, 0); }
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
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(92);
					arguments();
					}
				}

				setState(95);
				match(DOT);
				}
				break;
			case PRINT_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(PRINT_FUNCTION);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(97);
					arguments();
					}
				}

				setState(100);
				match(DOT);
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
			setState(103);
			match(ID);
			setState(104);
			match(ID);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(105);
				arguments();
				}
			}

			setState(108);
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
			setState(110);
			match(ID);
			setState(111);
			match(KASRE);
			setState(112);
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
		public List<TerminalNode> ID() { return getTokens(KharazmiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KharazmiParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(KharazmiParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KharazmiParser.COLON, i);
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
		int _la;
		try {
			int _alt;
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(WITH);
				setState(115);
				expr(0);
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116);
						match(AND);
						setState(117);
						match(WITH);
						setState(118);
						expr(0);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(124);
					match(AND);
					setState(125);
					match(WITH);
					setState(126);
					match(ID);
					setState(127);
					match(COLON);
					setState(128);
					expr(0);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(WITH);
				setState(135);
				match(ID);
				setState(136);
				match(COLON);
				setState(137);
				expr(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(138);
					match(AND);
					setState(139);
					match(WITH);
					setState(140);
					match(ID);
					setState(141);
					match(COLON);
					setState(142);
					expr(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(150);
			match(ID);
			setState(151);
			match(EQUAL);
			setState(152);
			expr(0);
			setState(153);
			match(POSTFIX_DEFINE);
			setState(154);
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
			setState(156);
			match(ID);
			setState(157);
			match(NEW);
			setState(158);
			expr(0);
			setState(159);
			match(POSTFIX_DEFINE);
			setState(160);
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
		public TerminalNode OR() { return getToken(KharazmiParser.OR, 0); }
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163);
				functionCall();
				}
				break;
			case 2:
				{
				setState(164);
				getAttr();
				}
				break;
			case 3:
				{
				setState(165);
				methodCall();
				}
				break;
			case 4:
				{
				setState(166);
				term(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						match(ADD);
						setState(171);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						match(SUB);
						setState(174);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(176);
						match(OR);
						setState(177);
						term(0);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(179);
						compare_operation();
						setState(180);
						term(0);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode AND() { return getToken(KharazmiParser.AND, 0); }
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
			setState(188);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
						match(MUL);
						setState(192);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(193);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(194);
						match(DIV);
						setState(195);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(AND);
						setState(198);
						factor();
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(STRING);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(T__1);
				setState(210);
				expr(0);
				setState(211);
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
		enterRule(_localctx, 26, RULE_compare_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 28, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(CLASS);
			setState(218);
			match(ID);
			setState(219);
			match(COLON);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREFIX_DEFINE || _la==ID) {
				{
				{
				setState(220);
				classStatement();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
		enterRule(_localctx, 30, RULE_classStatement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				attributedDefinition();
				}
				break;
			case PREFIX_DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
		enterRule(_localctx, 32, RULE_attributedDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ID);
			setState(233);
			match(HAS);
			setState(234);
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
		enterRule(_localctx, 34, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(PREFIX_DEFINE);
			setState(237);
			match(ID);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(238);
				match(WITH);
				setState(239);
				parameters();
				}
			}

			setState(242);
			match(COLON);
			setState(243);
			block();
			setState(244);
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
		public TerminalNode FUNCTION() { return getToken(KharazmiParser.FUNCTION, 0); }
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
		enterRule(_localctx, 36, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(FUNCTION);
			setState(247);
			match(ID);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(248);
				match(WITH);
				setState(249);
				parameters();
				}
			}

			setState(252);
			match(COLON);
			setState(253);
			block();
			setState(254);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KharazmiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KharazmiParser.ID, i);
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
		enterRule(_localctx, 38, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(257);
				match(AND);
				setState(258);
				match(ID);
				}
				}
				setState(263);
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

	public static class IfStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			ifBlock();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(265);
				elseBlock();
				}
			}

			setState(268);
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
		enterRule(_localctx, 42, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			ifHead();
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
		enterRule(_localctx, 44, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ELSE);
			setState(274);
			match(COLON);
			setState(275);
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
		enterRule(_localctx, 46, RULE_ifHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(IF);
			setState(278);
			expr(0);
			setState(279);
			match(WAS);
			setState(280);
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
		public TerminalNode WHILE() { return getToken(KharazmiParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(WHILE);
			setState(283);
			expr(0);
			setState(284);
			block();
			setState(285);
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode REPEAT() { return getToken(KharazmiParser.REPEAT, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
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
		enterRule(_localctx, 50, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expr(0);
			setState(288);
			match(REPEAT);
			setState(289);
			match(COLON);
			setState(290);
			block();
			setState(291);
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
		public TerminalNode FOREACH() { return getToken(KharazmiParser.FOREACH, 0); }
		public TerminalNode ID() { return getToken(KharazmiParser.ID, 0); }
		public TerminalNode IN() { return getToken(KharazmiParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 52, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(FOREACH);
			setState(294);
			match(ID);
			setState(295);
			match(IN);
			setState(296);
			expr(0);
			setState(297);
			match(COLON);
			setState(298);
			block();
			setState(299);
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
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(RETURN);
			setState(302);
			match(ID);
			setState(303);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\5\6`\n\6\3\6"+
		"\3\6\3\6\5\6e\n\6\3\6\5\6h\n\6\3\7\3\7\3\7\5\7m\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0092\n\t\f\t\16\t\u0095\13\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b9\n\f\f\f\16"+
		"\f\u00bc\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ca"+
		"\n\r\f\r\16\r\u00cd\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00d8\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00e0\n\20\f\20\16"+
		"\20\u00e3\13\20\3\20\3\20\3\21\3\21\5\21\u00e9\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u00f3\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00fd\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u0106\n"+
		"\25\f\25\16\25\u0109\13\25\3\26\3\26\5\26\u010d\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\2\4\26\30\36\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\3\2\27\33\2\u0141\2:\3\2\2\2"+
		"\4@\3\2\2\2\6O\3\2\2\2\b[\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16p\3\2\2\2\20"+
		"\u0096\3\2\2\2\22\u0098\3\2\2\2\24\u009e\3\2\2\2\26\u00a9\3\2\2\2\30\u00bd"+
		"\3\2\2\2\32\u00d7\3\2\2\2\34\u00d9\3\2\2\2\36\u00db\3\2\2\2 \u00e8\3\2"+
		"\2\2\"\u00ea\3\2\2\2$\u00ee\3\2\2\2&\u00f8\3\2\2\2(\u0102\3\2\2\2*\u010a"+
		"\3\2\2\2,\u0110\3\2\2\2.\u0113\3\2\2\2\60\u0117\3\2\2\2\62\u011c\3\2\2"+
		"\2\64\u0121\3\2\2\2\66\u0127\3\2\2\28\u012f\3\2\2\2:;\5\4\3\2;<\7\2\2"+
		"\3<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2"+
		"\2\2B@\3\2\2\2CP\5\36\20\2DP\5&\24\2EP\5\22\n\2FP\5\24\13\2GP\5*\26\2"+
		"HP\5\62\32\2IP\5\64\33\2JP\5\66\34\2KP\58\35\2LP\5\n\6\2MP\5\f\7\2NP\5"+
		"\b\5\2OC\3\2\2\2OD\3\2\2\2OE\3\2\2\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3"+
		"\2\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR"+
		"\5\26\f\2RS\7\3\2\2ST\7&\2\2TU\7\34\2\2U\\\3\2\2\2VW\5\26\f\2WX\7\3\2"+
		"\2XY\7%\2\2YZ\7\34\2\2Z\\\3\2\2\2[Q\3\2\2\2[V\3\2\2\2\\\t\3\2\2\2]_\7"+
		"&\2\2^`\5\20\t\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ah\7\34\2\2bd\7%\2\2ce\5"+
		"\20\t\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\7\34\2\2g]\3\2\2\2gb\3\2\2\2h"+
		"\13\3\2\2\2ij\7&\2\2jl\7&\2\2km\5\20\t\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"no\7\34\2\2o\r\3\2\2\2pq\7&\2\2qr\7\37\2\2rs\7&\2\2s\17\3\2\2\2tu\7\21"+
		"\2\2u{\5\26\f\2vw\7\25\2\2wx\7\21\2\2xz\5\26\f\2yv\3\2\2\2z}\3\2\2\2{"+
		"y\3\2\2\2{|\3\2\2\2|\u0085\3\2\2\2}{\3\2\2\2~\177\7\25\2\2\177\u0080\7"+
		"\21\2\2\u0080\u0081\7&\2\2\u0081\u0082\7\36\2\2\u0082\u0084\5\26\f\2\u0083"+
		"~\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0097\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\21\2\2\u0089\u008a"+
		"\7&\2\2\u008a\u008b\7\36\2\2\u008b\u0093\5\26\f\2\u008c\u008d\7\25\2\2"+
		"\u008d\u008e\7\21\2\2\u008e\u008f\7&\2\2\u008f\u0090\7\36\2\2\u0090\u0092"+
		"\5\26\f\2\u0091\u008c\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096t\3"+
		"\2\2\2\u0096\u0088\3\2\2\2\u0097\21\3\2\2\2\u0098\u0099\7&\2\2\u0099\u009a"+
		"\7\27\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7\6\2\2\u009c\u009d\7\34\2"+
		"\2\u009d\23\3\2\2\2\u009e\u009f\7&\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a1"+
		"\5\26\f\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7\34\2\2\u00a3\25\3\2\2\2\u00a4"+
		"\u00a5\b\f\1\2\u00a5\u00aa\5\n\6\2\u00a6\u00aa\5\16\b\2\u00a7\u00aa\5"+
		"\f\7\2\u00a8\u00aa\5\30\r\2\u00a9\u00a4\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ba\3\2\2\2\u00ab\u00ac\f\7"+
		"\2\2\u00ac\u00ad\7 \2\2\u00ad\u00b9\5\30\r\2\u00ae\u00af\f\6\2\2\u00af"+
		"\u00b0\7!\2\2\u00b0\u00b9\5\30\r\2\u00b1\u00b2\f\5\2\2\u00b2\u00b3\7\26"+
		"\2\2\u00b3\u00b9\5\30\r\2\u00b4\u00b5\f\4\2\2\u00b5\u00b6\5\34\17\2\u00b6"+
		"\u00b7\5\30\r\2\u00b7\u00b9\3\2\2\2\u00b8\u00ab\3\2\2\2\u00b8\u00ae\3"+
		"\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00ba\3\2\2"+
		"\2\u00bd\u00be\b\r\1\2\u00be\u00bf\5\32\16\2\u00bf\u00cb\3\2\2\2\u00c0"+
		"\u00c1\f\6\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00ca\5\32\16\2\u00c3\u00c4\f"+
		"\5\2\2\u00c4\u00c5\7#\2\2\u00c5\u00ca\5\32\16\2\u00c6\u00c7\f\4\2\2\u00c7"+
		"\u00c8\7\25\2\2\u00c8\u00ca\5\32\16\2\u00c9\u00c0\3\2\2\2\u00c9\u00c3"+
		"\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d8\7)\2\2"+
		"\u00cf\u00d8\7*\2\2\u00d0\u00d8\7&\2\2\u00d1\u00d8\7\'\2\2\u00d2\u00d8"+
		"\7(\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\7\5\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d0\3\2"+
		"\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8"+
		"\33\3\2\2\2\u00d9\u00da\t\2\2\2\u00da\35\3\2\2\2\u00db\u00dc\7\t\2\2\u00dc"+
		"\u00dd\7&\2\2\u00dd\u00e1\7\36\2\2\u00de\u00e0\5 \21\2\u00df\u00de\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\23\2\2\u00e5\37\3\2\2"+
		"\2\u00e6\u00e9\5\"\22\2\u00e7\u00e9\5$\23\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00eb\7&\2\2\u00eb\u00ec\7\20\2\2"+
		"\u00ec\u00ed\7\34\2\2\u00ed#\3\2\2\2\u00ee\u00ef\7\7\2\2\u00ef\u00f2\7"+
		"&\2\2\u00f0\u00f1\7\21\2\2\u00f1\u00f3\5(\25\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\36\2\2\u00f5\u00f6\5"+
		"\4\3\2\u00f6\u00f7\7\23\2\2\u00f7%\3\2\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fc"+
		"\7&\2\2\u00fa\u00fb\7\21\2\2\u00fb\u00fd\5(\25\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\36\2\2\u00ff\u0100\5"+
		"\4\3\2\u0100\u0101\7\23\2\2\u0101\'\3\2\2\2\u0102\u0107\7&\2\2\u0103\u0104"+
		"\7\25\2\2\u0104\u0106\7&\2\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108)\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\u010a\u010c\5,\27\2\u010b\u010d\5.\30\2\u010c\u010b\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\23\2\2\u010f+\3\2\2\2\u0110"+
		"\u0111\5\60\31\2\u0111\u0112\5\4\3\2\u0112-\3\2\2\2\u0113\u0114\7\f\2"+
		"\2\u0114\u0115\7\36\2\2\u0115\u0116\5\4\3\2\u0116/\3\2\2\2\u0117\u0118"+
		"\7\13\2\2\u0118\u0119\5\26\f\2\u0119\u011a\7\b\2\2\u011a\u011b\7\36\2"+
		"\2\u011b\61\3\2\2\2\u011c\u011d\7\r\2\2\u011d\u011e\5\26\f\2\u011e\u011f"+
		"\5\4\3\2\u011f\u0120\7\23\2\2\u0120\63\3\2\2\2\u0121\u0122\5\26\f\2\u0122"+
		"\u0123\7$\2\2\u0123\u0124\7\36\2\2\u0124\u0125\5\4\3\2\u0125\u0126\7\23"+
		"\2\2\u0126\65\3\2\2\2\u0127\u0128\7\16\2\2\u0128\u0129\7&\2\2\u0129\u012a"+
		"\7\17\2\2\u012a\u012b\5\26\f\2\u012b\u012c\7\36\2\2\u012c\u012d\5\4\3"+
		"\2\u012d\u012e\7\23\2\2\u012e\67\3\2\2\2\u012f\u0130\7\22\2\2\u0130\u0131"+
		"\7&\2\2\u0131\u0132\7\34\2\2\u01329\3\2\2\2\31@O[_dgl{\u0085\u0093\u0096"+
		"\u00a9\u00b8\u00ba\u00c9\u00cb\u00d7\u00e1\u00e8\u00f2\u00fc\u0107\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}