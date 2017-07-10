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
		T__0=1, T__1=2, T__2=3, POSTFIX_DEFINE=4, PREFIX_DEFINE=5, WAS=6, CLASS=7, 
		FUNCTION=8, IF=9, ELSE=10, WHILE=11, FOREACH=12, From=13, TO=14, HAS=15, 
		WITH=16, RETURN=17, END=18, NEW=19, AND=20, OR=21, EQUAL=22, GT=23, LT=24, 
		GT_EQUAL=25, LT_EQUAL=26, DOT=27, COMMA=28, COLON=29, KASRE=30, ADD=31, 
		SUB=32, MUL=33, DIV=34, REPEAT=35, TRUE=36, FALSE=37, PRINT_FUNCTION=38, 
		ID=39, NUMBER=40, STRING=41, WS=42;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_statement = 2, RULE_subjectiveFunctionCall = 3, 
		RULE_functionCall = 4, RULE_methodCall = 5, RULE_getAttr = 6, RULE_arguments = 7, 
		RULE_assignmentStatement = 8, RULE_instanceDefinition = 9, RULE_expr = 10, 
		RULE_term = 11, RULE_factor = 12, RULE_or_term = 13, RULE_and_factor = 14, 
		RULE_compare_operation = 15, RULE_classDefinition = 16, RULE_classStatement = 17, 
		RULE_attributedDefinition = 18, RULE_methodDefinition = 19, RULE_functionDefinition = 20, 
		RULE_parameters = 21, RULE_ifStatement = 22, RULE_ifBlock = 23, RULE_elseBlock = 24, 
		RULE_ifHead = 25, RULE_whileStatement = 26, RULE_while_expr = 27, RULE_repeatStatement = 28, 
		RULE_repeatBlock = 29, RULE_foreachStatement = 30, RULE_foreach_to_expr = 31, 
		RULE_returnStatement = 32;
	public static final String[] ruleNames = {
		"prog", "block", "statement", "subjectiveFunctionCall", "functionCall", 
		"methodCall", "getAttr", "arguments", "assignmentStatement", "instanceDefinition", 
		"expr", "term", "factor", "or_term", "and_factor", "compare_operation", 
		"classDefinition", "classStatement", "attributedDefinition", "methodDefinition", 
		"functionDefinition", "parameters", "ifStatement", "ifBlock", "elseBlock", 
		"ifHead", "whileStatement", "while_expr", "repeatStatement", "repeatBlock", 
		"foreachStatement", "foreach_to_expr", "returnStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u0631\u0627'", "'('", "')'", null, "'\u062A\u0639\u0631\u06CC\u0641'", 
		null, "'\u0631\u0633\u062A\u0647'", "'\u062A\u0627\u0628\u0639'", "'\u0627\u06AF\u0631'", 
		"'\u0648\u06AF\u0631\u0646\u0647'", null, "'\u0628\u0631\u0627\u06CC \u0647\u0631'", 
		"'\u0627\u0632'", "'\u062A\u0627'", "'\u062F\u0627\u0631\u062F'", "'\u0628\u0627'", 
		"'\u0628\u0627\u0632\u06AF\u0631\u062F\u0627\u0646'", "'\u062E\u0628'", 
		"'\u06CC\u06A9'", "'\u0648'", "'\u06CC\u0627'", null, null, null, null, 
		null, "'.'", "'\u060C'", "':'", "'\u0650'", null, null, null, null, "'\u0628\u0627\u0631'", 
		"'\u062F\u0631\u0633\u062A'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", "CLASS", 
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
			setState(66);
			block();
			setState(67);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT_FUNCTION) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(74);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				classDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				instanceDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				repeatStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				foreachStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				functionCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
				methodCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(86);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				expr(0);
				setState(90);
				match(T__0);
				setState(91);
				match(ID);
				setState(92);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				expr(0);
				setState(95);
				match(T__0);
				setState(96);
				match(PRINT_FUNCTION);
				setState(97);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(ID);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(102);
					arguments();
					}
				}

				setState(105);
				match(DOT);
				}
				break;
			case PRINT_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(PRINT_FUNCTION);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(107);
					arguments();
					}
				}

				setState(110);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(WITH);
				setState(125);
				expr(0);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(134);
					match(AND);
					setState(135);
					match(WITH);
					setState(136);
					match(ID);
					setState(137);
					match(COLON);
					setState(138);
					expr(0);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(WITH);
				setState(145);
				match(ID);
				setState(146);
				match(COLON);
				setState(147);
				expr(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(148);
					match(AND);
					setState(149);
					match(WITH);
					setState(150);
					match(ID);
					setState(151);
					match(COLON);
					setState(152);
					expr(0);
					}
					}
					setState(157);
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
			setState(160);
			match(ID);
			setState(161);
			match(EQUAL);
			setState(162);
			expr(0);
			setState(163);
			match(POSTFIX_DEFINE);
			setState(164);
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
			setState(166);
			match(ID);
			setState(167);
			match(NEW);
			setState(168);
			expr(0);
			setState(169);
			match(POSTFIX_DEFINE);
			setState(170);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(173);
				functionCall();
				}
				break;
			case 2:
				{
				setState(174);
				getAttr();
				}
				break;
			case 3:
				{
				setState(175);
				methodCall();
				}
				break;
			case 4:
				{
				setState(176);
				term(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(180);
						match(ADD);
						setState(181);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(183);
						match(SUB);
						setState(184);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186);
						or_term();
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						compare_operation();
						setState(189);
						term(0);
						}
						break;
					}
					} 
				}
				setState(195);
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
			setState(197);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						match(MUL);
						setState(201);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						match(DIV);
						setState(204);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						and_factor();
						}
						break;
					}
					} 
				}
				setState(211);
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(STRING);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(T__1);
				setState(218);
				expr(0);
				setState(219);
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
			setState(223);
			match(OR);
			setState(224);
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
			setState(226);
			match(AND);
			setState(227);
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
			setState(229);
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
			setState(231);
			match(CLASS);
			setState(232);
			match(ID);
			setState(233);
			match(COLON);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREFIX_DEFINE || _la==ID) {
				{
				{
				setState(234);
				classStatement();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				attributedDefinition();
				}
				break;
			case PREFIX_DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
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
			setState(246);
			match(ID);
			setState(247);
			match(HAS);
			setState(248);
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
			setState(250);
			match(PREFIX_DEFINE);
			setState(251);
			match(ID);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(252);
				match(WITH);
				setState(253);
				parameters();
				}
			}

			setState(256);
			match(COLON);
			setState(257);
			block();
			setState(258);
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
		enterRule(_localctx, 40, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FUNCTION);
			setState(261);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(262);
				match(WITH);
				setState(263);
				parameters();
				}
			}

			setState(266);
			match(COLON);
			setState(267);
			block();
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
		enterRule(_localctx, 42, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(271);
				match(AND);
				setState(272);
				match(ID);
				}
				}
				setState(277);
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
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			ifBlock();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(279);
				elseBlock();
				}
			}

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
		enterRule(_localctx, 46, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			ifHead();
			setState(285);
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
		enterRule(_localctx, 48, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ELSE);
			setState(288);
			match(COLON);
			setState(289);
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
		enterRule(_localctx, 50, RULE_ifHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IF);
			setState(292);
			expr(0);
			setState(293);
			match(WAS);
			setState(294);
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
		enterRule(_localctx, 52, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			while_expr();
			setState(297);
			match(POSTFIX_DEFINE);
			setState(298);
			match(COLON);
			setState(299);
			block();
			setState(300);
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
		enterRule(_localctx, 54, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(WHILE);
			setState(303);
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
		enterRule(_localctx, 56, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			expr(0);
			setState(306);
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
		enterRule(_localctx, 58, RULE_repeatBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(REPEAT);
			setState(309);
			match(COLON);
			setState(310);
			block();
			setState(311);
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
		enterRule(_localctx, 60, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(FOREACH);
			setState(314);
			match(ID);
			setState(315);
			match(From);
			setState(316);
			expr(0);
			setState(317);
			foreach_to_expr();
			setState(318);
			match(COLON);
			setState(319);
			block();
			setState(320);
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
		enterRule(_localctx, 62, RULE_foreach_to_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(TO);
			setState(323);
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
		enterRule(_localctx, 64, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(RETURN);
			setState(326);
			match(ID);
			setState(327);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5f\n\5\3\6\3\6\5\6j\n\6\3\6\3\6\3\6\5\6o\n\6\3\6\5\6r\n\6"+
		"\3\7\3\7\3\7\5\7w\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u0084\n\t\f\t\16\t\u0087\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t\16"+
		"\t\u0091\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009c\n\t\f\t\16"+
		"\t\u009f\13\t\5\t\u00a1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00b4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e0\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ee\n\22\f\22\16"+
		"\22\u00f1\13\22\3\22\3\22\3\23\3\23\5\23\u00f7\n\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\5\25\u0101\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u010b\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0114\n"+
		"\27\f\27\16\27\u0117\13\27\3\30\3\30\5\30\u011b\n\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\2\4\26\30#\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\3\3\2"+
		"\30\34\2\u0154\2D\3\2\2\2\4J\3\2\2\2\6Y\3\2\2\2\be\3\2\2\2\nq\3\2\2\2"+
		"\fs\3\2\2\2\16z\3\2\2\2\20\u00a0\3\2\2\2\22\u00a2\3\2\2\2\24\u00a8\3\2"+
		"\2\2\26\u00b3\3\2\2\2\30\u00c6\3\2\2\2\32\u00df\3\2\2\2\34\u00e1\3\2\2"+
		"\2\36\u00e4\3\2\2\2 \u00e7\3\2\2\2\"\u00e9\3\2\2\2$\u00f6\3\2\2\2&\u00f8"+
		"\3\2\2\2(\u00fc\3\2\2\2*\u0106\3\2\2\2,\u0110\3\2\2\2.\u0118\3\2\2\2\60"+
		"\u011e\3\2\2\2\62\u0121\3\2\2\2\64\u0125\3\2\2\2\66\u012a\3\2\2\28\u0130"+
		"\3\2\2\2:\u0133\3\2\2\2<\u0136\3\2\2\2>\u013b\3\2\2\2@\u0144\3\2\2\2B"+
		"\u0147\3\2\2\2DE\5\4\3\2EF\7\2\2\3F\3\3\2\2\2GI\5\6\4\2HG\3\2\2\2IL\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LJ\3\2\2\2MZ\5\"\22\2NZ\5*\26\2O"+
		"Z\5\22\n\2PZ\5\24\13\2QZ\5.\30\2RZ\5\66\34\2SZ\5:\36\2TZ\5> \2UZ\5B\""+
		"\2VZ\5\n\6\2WZ\5\f\7\2XZ\5\b\5\2YM\3\2\2\2YN\3\2\2\2YO\3\2\2\2YP\3\2\2"+
		"\2YQ\3\2\2\2YR\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2"+
		"\2YX\3\2\2\2Z\7\3\2\2\2[\\\5\26\f\2\\]\7\3\2\2]^\7)\2\2^_\7\35\2\2_f\3"+
		"\2\2\2`a\5\26\f\2ab\7\3\2\2bc\7(\2\2cd\7\35\2\2df\3\2\2\2e[\3\2\2\2e`"+
		"\3\2\2\2f\t\3\2\2\2gi\7)\2\2hj\5\20\t\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2"+
		"kr\7\35\2\2ln\7(\2\2mo\5\20\t\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\35\2"+
		"\2qg\3\2\2\2ql\3\2\2\2r\13\3\2\2\2st\7)\2\2tv\7)\2\2uw\5\20\t\2vu\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xy\7\35\2\2y\r\3\2\2\2z{\7)\2\2{|\7 \2\2|}\7)"+
		"\2\2}\17\3\2\2\2~\177\7\22\2\2\177\u0085\5\26\f\2\u0080\u0081\7\26\2\2"+
		"\u0081\u0082\7\22\2\2\u0082\u0084\5\26\f\2\u0083\u0080\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008f\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7\26\2\2\u0089\u008a\7\22\2\2\u008a\u008b\7"+
		")\2\2\u008b\u008c\7\37\2\2\u008c\u008e\5\26\f\2\u008d\u0088\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00a1\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\22\2\2\u0093\u0094\7)\2\2\u0094"+
		"\u0095\7\37\2\2\u0095\u009d\5\26\f\2\u0096\u0097\7\26\2\2\u0097\u0098"+
		"\7\22\2\2\u0098\u0099\7)\2\2\u0099\u009a\7\37\2\2\u009a\u009c\5\26\f\2"+
		"\u009b\u0096\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0~\3\2\2\2\u00a0"+
		"\u0092\3\2\2\2\u00a1\21\3\2\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a4\7\30\2"+
		"\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7\35\2\2\u00a7"+
		"\23\3\2\2\2\u00a8\u00a9\7)\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\5\26\f"+
		"\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\7\35\2\2\u00ad\25\3\2\2\2\u00ae\u00af"+
		"\b\f\1\2\u00af\u00b4\5\n\6\2\u00b0\u00b4\5\16\b\2\u00b1\u00b4\5\f\7\2"+
		"\u00b2\u00b4\5\30\r\2\u00b3\u00ae\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00c3\3\2\2\2\u00b5\u00b6\f\7\2\2\u00b6"+
		"\u00b7\7!\2\2\u00b7\u00c2\5\30\r\2\u00b8\u00b9\f\6\2\2\u00b9\u00ba\7\""+
		"\2\2\u00ba\u00c2\5\30\r\2\u00bb\u00bc\f\5\2\2\u00bc\u00c2\5\34\17\2\u00bd"+
		"\u00be\f\4\2\2\u00be\u00bf\5 \21\2\u00bf\u00c0\5\30\r\2\u00c0\u00c2\3"+
		"\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\27\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\r\1\2\u00c7\u00c8"+
		"\5\32\16\2\u00c8\u00d3\3\2\2\2\u00c9\u00ca\f\6\2\2\u00ca\u00cb\7#\2\2"+
		"\u00cb\u00d2\5\32\16\2\u00cc\u00cd\f\5\2\2\u00cd\u00ce\7$\2\2\u00ce\u00d2"+
		"\5\32\16\2\u00cf\u00d0\f\4\2\2\u00d0\u00d2\5\36\20\2\u00d1\u00c9\3\2\2"+
		"\2\u00d1\u00cc\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\31\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00e0\7&\2\2\u00d7\u00e0\7\'\2\2\u00d8\u00e0\7)\2\2\u00d9\u00e0\7*\2"+
		"\2\u00da\u00e0\7+\2\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de"+
		"\7\5\2\2\u00de\u00e0\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d7\3\2\2\2\u00df"+
		"\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2"+
		"\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\7\27\2\2\u00e2\u00e3\5\30\r\2\u00e3"+
		"\35\3\2\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\5\32\16\2\u00e6\37\3\2\2"+
		"\2\u00e7\u00e8\t\2\2\2\u00e8!\3\2\2\2\u00e9\u00ea\7\t\2\2\u00ea\u00eb"+
		"\7)\2\2\u00eb\u00ef\7\37\2\2\u00ec\u00ee\5$\23\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\24\2\2\u00f3#\3\2\2\2\u00f4\u00f7"+
		"\5&\24\2\u00f5\u00f7\5(\25\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"%\3\2\2\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\7\21\2\2\u00fa\u00fb\7\35\2\2"+
		"\u00fb\'\3\2\2\2\u00fc\u00fd\7\7\2\2\u00fd\u0100\7)\2\2\u00fe\u00ff\7"+
		"\22\2\2\u00ff\u0101\5,\27\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\7\37\2\2\u0103\u0104\5\4\3\2\u0104\u0105\7"+
		"\24\2\2\u0105)\3\2\2\2\u0106\u0107\7\n\2\2\u0107\u010a\7)\2\2\u0108\u0109"+
		"\7\22\2\2\u0109\u010b\5,\27\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010d\7\37\2\2\u010d\u010e\5\4\3\2\u010e\u010f"+
		"\7\24\2\2\u010f+\3\2\2\2\u0110\u0115\7)\2\2\u0111\u0112\7\26\2\2\u0112"+
		"\u0114\7)\2\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116-\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a"+
		"\5\60\31\2\u0119\u011b\5\62\32\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011d\7\24\2\2\u011d/\3\2\2\2\u011e\u011f"+
		"\5\64\33\2\u011f\u0120\5\4\3\2\u0120\61\3\2\2\2\u0121\u0122\7\f\2\2\u0122"+
		"\u0123\7\37\2\2\u0123\u0124\5\4\3\2\u0124\63\3\2\2\2\u0125\u0126\7\13"+
		"\2\2\u0126\u0127\5\26\f\2\u0127\u0128\7\b\2\2\u0128\u0129\7\37\2\2\u0129"+
		"\65\3\2\2\2\u012a\u012b\58\35\2\u012b\u012c\7\6\2\2\u012c\u012d\7\37\2"+
		"\2\u012d\u012e\5\4\3\2\u012e\u012f\7\24\2\2\u012f\67\3\2\2\2\u0130\u0131"+
		"\7\r\2\2\u0131\u0132\5\26\f\2\u01329\3\2\2\2\u0133\u0134\5\26\f\2\u0134"+
		"\u0135\5<\37\2\u0135;\3\2\2\2\u0136\u0137\7%\2\2\u0137\u0138\7\37\2\2"+
		"\u0138\u0139\5\4\3\2\u0139\u013a\7\24\2\2\u013a=\3\2\2\2\u013b\u013c\7"+
		"\16\2\2\u013c\u013d\7)\2\2\u013d\u013e\7\17\2\2\u013e\u013f\5\26\f\2\u013f"+
		"\u0140\5@!\2\u0140\u0141\7\37\2\2\u0141\u0142\5\4\3\2\u0142\u0143\7\24"+
		"\2\2\u0143?\3\2\2\2\u0144\u0145\7\20\2\2\u0145\u0146\5\26\f\2\u0146A\3"+
		"\2\2\2\u0147\u0148\7\23\2\2\u0148\u0149\7)\2\2\u0149\u014a\7\35\2\2\u014a"+
		"C\3\2\2\2\31JYeinqv\u0085\u008f\u009d\u00a0\u00b3\u00c1\u00c3\u00d1\u00d3"+
		"\u00df\u00ef\u00f6\u0100\u010a\u0115\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}