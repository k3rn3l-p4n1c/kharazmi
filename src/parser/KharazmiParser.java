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
		FUNCTION=8, IF=9, ELSE=10, WHILE=11, FOREACH=12, IN=13, HAS=14, WITH=15, 
		RETURN=16, END=17, NEW=18, AND=19, OR=20, EQUAL=21, GT=22, LT=23, DOT=24, 
		COMMA=25, COLON=26, KASRE=27, ADD=28, SUB=29, MUL=30, DIV=31, REPEAT=32, 
		PRINT_FUNCTION=33, ID=34, NUMBER=35, STRING=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_statement = 2, RULE_subjectiveFunctionCall = 3, 
		RULE_functionCall = 4, RULE_methodCall = 5, RULE_getAttr = 6, RULE_arguments = 7, 
		RULE_assignmentStatement = 8, RULE_instanceDefinition = 9, RULE_expr = 10, 
		RULE_term = 11, RULE_factor = 12, RULE_bool_operand = 13, RULE_classDefinition = 14, 
		RULE_classStatement = 15, RULE_attributedDefinition = 16, RULE_methodDefinition = 17, 
		RULE_functionDefinition = 18, RULE_parameters = 19, RULE_ifStatement = 20, 
		RULE_whileStatement = 21, RULE_repeatStatement = 22, RULE_foreachStatement = 23, 
		RULE_returnStatement = 24;
	public static final String[] ruleNames = {
		"prog", "block", "statement", "subjectiveFunctionCall", "functionCall", 
		"methodCall", "getAttr", "arguments", "assignmentStatement", "instanceDefinition", 
		"expr", "term", "factor", "bool_operand", "classDefinition", "classStatement", 
		"attributedDefinition", "methodDefinition", "functionDefinition", "parameters", 
		"ifStatement", "whileStatement", "repeatStatement", "foreachStatement", 
		"returnStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u0631\u0627'", "'('", "')'", null, "'\u062A\u0639\u0631\u06CC\u0641'", 
		null, "'\u0631\u0633\u062A\u0647'", "'\u062A\u0627\u0628\u0639'", "'\u0627\u06AF\u0631'", 
		"'\u0648\u06AF\u0631\u0646\u0647'", "'\u062A\u0627 \u0647\u0646\u06AF\u0627\u0645\u06CC \u06A9\u0647'", 
		"'\u0628\u0631\u0627\u06CC \u0647\u0631'", "'\u062F\u0631'", "'\u062F\u0627\u0631\u062F'", 
		"'\u0628\u0627'", "'\u0628\u0627\u0632\u06AF\u0631\u062F\u0627\u0646'", 
		"'\u062E\u0628'", "'\u06CC\u06A9'", "'\u0648'", "'\u06CC\u0627'", null, 
		null, null, "'.'", "'\u060C'", "':'", "'\u0650'", null, null, null, null, 
		"'\u0628\u0627\u0631'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", "CLASS", 
		"FUNCTION", "IF", "ELSE", "WHILE", "FOREACH", "IN", "HAS", "WITH", "RETURN", 
		"END", "NEW", "AND", "OR", "EQUAL", "GT", "LT", "DOT", "COMMA", "COLON", 
		"KASRE", "ADD", "SUB", "MUL", "DIV", "REPEAT", "PRINT_FUNCTION", "ID", 
		"NUMBER", "STRING", "WS"
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
			setState(50);
			block();
			setState(51);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << RETURN) | (1L << PRINT_FUNCTION) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(58);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				classDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				instanceDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				repeatStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				foreachStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				functionCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
				methodCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(70);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				expr(0);
				setState(74);
				match(T__0);
				setState(75);
				match(ID);
				setState(76);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				expr(0);
				setState(79);
				match(T__0);
				setState(80);
				match(PRINT_FUNCTION);
				setState(81);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ID);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(86);
					arguments();
					}
				}

				setState(89);
				match(DOT);
				}
				break;
			case PRINT_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(PRINT_FUNCTION);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(91);
					arguments();
					}
				}

				setState(94);
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
			setState(97);
			match(ID);
			setState(98);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(99);
				arguments();
				}
			}

			setState(102);
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
			setState(104);
			match(ID);
			setState(105);
			match(KASRE);
			setState(106);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(WITH);
				setState(109);
				expr(0);
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						match(AND);
						setState(111);
						match(WITH);
						setState(112);
						expr(0);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(118);
					match(AND);
					setState(119);
					match(WITH);
					setState(120);
					match(ID);
					setState(121);
					match(COLON);
					setState(122);
					expr(0);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(WITH);
				setState(129);
				match(ID);
				setState(130);
				match(COLON);
				setState(131);
				expr(0);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(132);
					match(AND);
					setState(133);
					match(WITH);
					setState(134);
					match(ID);
					setState(135);
					match(COLON);
					setState(136);
					expr(0);
					}
					}
					setState(141);
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
			setState(144);
			match(ID);
			setState(145);
			match(EQUAL);
			setState(146);
			expr(0);
			setState(147);
			match(POSTFIX_DEFINE);
			setState(148);
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
			setState(150);
			match(ID);
			setState(151);
			match(NEW);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_operandContext bool_operand() {
			return getRuleContext(Bool_operandContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KharazmiParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KharazmiParser.SUB, 0); }
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(157);
				functionCall();
				}
				break;
			case 2:
				{
				setState(158);
				getAttr();
				}
				break;
			case 3:
				{
				setState(159);
				methodCall();
				}
				break;
			case 4:
				{
				setState(160);
				term(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(164);
						bool_operand();
						setState(165);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						match(ADD);
						setState(169);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(SUB);
						setState(172);
						term(0);
						}
						break;
					}
					} 
				}
				setState(177);
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
			setState(179);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						match(MUL);
						setState(183);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185);
						match(DIV);
						setState(186);
						factor();
						}
						break;
					}
					} 
				}
				setState(191);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(STRING);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(T__1);
				setState(196);
				expr(0);
				setState(197);
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

	public static class Bool_operandContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(KharazmiParser.OR, 0); }
		public TerminalNode AND() { return getToken(KharazmiParser.AND, 0); }
		public TerminalNode GT() { return getToken(KharazmiParser.GT, 0); }
		public TerminalNode LT() { return getToken(KharazmiParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(KharazmiParser.EQUAL, 0); }
		public Bool_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).enterBool_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KharazmiListener ) ((KharazmiListener)listener).exitBool_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KharazmiVisitor ) return ((KharazmiVisitor<? extends T>)visitor).visitBool_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_operandContext bool_operand() throws RecognitionException {
		Bool_operandContext _localctx = new Bool_operandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << EQUAL) | (1L << GT) | (1L << LT))) != 0)) ) {
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
			setState(203);
			match(CLASS);
			setState(204);
			match(ID);
			setState(205);
			match(COLON);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREFIX_DEFINE || _la==ID) {
				{
				{
				setState(206);
				classStatement();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				attributedDefinition();
				}
				break;
			case PREFIX_DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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
			setState(218);
			match(ID);
			setState(219);
			match(HAS);
			setState(220);
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
			setState(222);
			match(PREFIX_DEFINE);
			setState(223);
			match(ID);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(224);
				match(WITH);
				setState(225);
				parameters();
				}
			}

			setState(228);
			match(COLON);
			setState(229);
			block();
			setState(230);
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
			setState(232);
			match(FUNCTION);
			setState(233);
			match(ID);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(234);
				match(WITH);
				setState(235);
				parameters();
				}
			}

			setState(238);
			match(COLON);
			setState(239);
			block();
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
			setState(242);
			match(ID);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(243);
				match(AND);
				setState(244);
				match(ID);
				}
				}
				setState(249);
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
		public TerminalNode IF() { return getToken(KharazmiParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WAS() { return getToken(KharazmiParser.WAS, 0); }
		public TerminalNode COLON() { return getToken(KharazmiParser.COLON, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode END() { return getToken(KharazmiParser.END, 0); }
		public TerminalNode ELSE() { return getToken(KharazmiParser.ELSE, 0); }
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
			setState(250);
			match(IF);
			setState(251);
			expr(0);
			setState(252);
			match(WAS);
			setState(253);
			match(COLON);
			setState(254);
			block();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(255);
				match(ELSE);
				setState(256);
				block();
				}
			}

			setState(259);
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
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WHILE);
			setState(262);
			expr(0);
			setState(263);
			block();
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
		enterRule(_localctx, 44, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expr(0);
			setState(267);
			match(REPEAT);
			setState(268);
			match(COLON);
			setState(269);
			block();
			setState(270);
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
		enterRule(_localctx, 46, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FOREACH);
			setState(273);
			match(ID);
			setState(274);
			match(IN);
			setState(275);
			expr(0);
			setState(276);
			match(COLON);
			setState(277);
			block();
			setState(278);
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
		enterRule(_localctx, 48, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RETURN);
			setState(281);
			match(ID);
			setState(282);
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
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5V\n\5\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\5\6_\n\6\3\6\5\6b\n\6\3"+
		"\7\3\7\3\7\5\7g\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tt\n"+
		"\t\f\t\16\tw\13\t\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f\13\t\5\t"+
		"\u0091\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00b0\n\f\f\f\16\f\u00b3\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00ca\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00d2\n\20\f\20\16\20"+
		"\u00d5\13\20\3\20\3\20\3\21\3\21\5\21\u00db\n\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\5\23\u00e5\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00ef\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00f8\n"+
		"\25\f\25\16\25\u00fb\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0104"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\2\4"+
		"\26\30\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3"+
		"\2\25\31\2\u012b\2\64\3\2\2\2\4:\3\2\2\2\6I\3\2\2\2\bU\3\2\2\2\na\3\2"+
		"\2\2\fc\3\2\2\2\16j\3\2\2\2\20\u0090\3\2\2\2\22\u0092\3\2\2\2\24\u0098"+
		"\3\2\2\2\26\u00a3\3\2\2\2\30\u00b4\3\2\2\2\32\u00c9\3\2\2\2\34\u00cb\3"+
		"\2\2\2\36\u00cd\3\2\2\2 \u00da\3\2\2\2\"\u00dc\3\2\2\2$\u00e0\3\2\2\2"+
		"&\u00ea\3\2\2\2(\u00f4\3\2\2\2*\u00fc\3\2\2\2,\u0107\3\2\2\2.\u010c\3"+
		"\2\2\2\60\u0112\3\2\2\2\62\u011a\3\2\2\2\64\65\5\4\3\2\65\66\7\2\2\3\66"+
		"\3\3\2\2\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3"+
		"\2\2\2<:\3\2\2\2=J\5\36\20\2>J\5&\24\2?J\5\22\n\2@J\5\24\13\2AJ\5*\26"+
		"\2BJ\5,\27\2CJ\5.\30\2DJ\5\60\31\2EJ\5\62\32\2FJ\5\n\6\2GJ\5\f\7\2HJ\5"+
		"\b\5\2I=\3\2\2\2I>\3\2\2\2I?\3\2\2\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3"+
		"\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\7\3\2\2\2KL"+
		"\5\26\f\2LM\7\3\2\2MN\7$\2\2NO\7\32\2\2OV\3\2\2\2PQ\5\26\f\2QR\7\3\2\2"+
		"RS\7#\2\2ST\7\32\2\2TV\3\2\2\2UK\3\2\2\2UP\3\2\2\2V\t\3\2\2\2WY\7$\2\2"+
		"XZ\5\20\t\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[b\7\32\2\2\\^\7#\2\2]_\5\20"+
		"\t\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\32\2\2aW\3\2\2\2a\\\3\2\2\2b\13"+
		"\3\2\2\2cd\7$\2\2df\7$\2\2eg\5\20\t\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi"+
		"\7\32\2\2i\r\3\2\2\2jk\7$\2\2kl\7\35\2\2lm\7$\2\2m\17\3\2\2\2no\7\21\2"+
		"\2ou\5\26\f\2pq\7\25\2\2qr\7\21\2\2rt\5\26\f\2sp\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2v\177\3\2\2\2wu\3\2\2\2xy\7\25\2\2yz\7\21\2\2z{\7$\2\2"+
		"{|\7\34\2\2|~\5\26\f\2}x\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0091\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\21\2\2\u0083"+
		"\u0084\7$\2\2\u0084\u0085\7\34\2\2\u0085\u008d\5\26\f\2\u0086\u0087\7"+
		"\25\2\2\u0087\u0088\7\21\2\2\u0088\u0089\7$\2\2\u0089\u008a\7\34\2\2\u008a"+
		"\u008c\5\26\f\2\u008b\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"n\3\2\2\2\u0090\u0082\3\2\2\2\u0091\21\3\2\2\2\u0092\u0093\7$\2\2\u0093"+
		"\u0094\7\27\2\2\u0094\u0095\5\26\f\2\u0095\u0096\7\6\2\2\u0096\u0097\7"+
		"\32\2\2\u0097\23\3\2\2\2\u0098\u0099\7$\2\2\u0099\u009a\7\24\2\2\u009a"+
		"\u009b\5\26\f\2\u009b\u009c\7\6\2\2\u009c\u009d\7\32\2\2\u009d\25\3\2"+
		"\2\2\u009e\u009f\b\f\1\2\u009f\u00a4\5\n\6\2\u00a0\u00a4\5\16\b\2\u00a1"+
		"\u00a4\5\f\7\2\u00a2\u00a4\5\30\r\2\u00a3\u009e\3\2\2\2\u00a3\u00a0\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00b1\3\2\2\2\u00a5"+
		"\u00a6\f\4\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\5\26\f\5\u00a8\u00b0"+
		"\3\2\2\2\u00a9\u00aa\f\6\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00b0\5\30\r\2"+
		"\u00ac\u00ad\f\5\2\2\u00ad\u00ae\7\37\2\2\u00ae\u00b0\5\30\r\2\u00af\u00a5"+
		"\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\27\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b5\b\r\1\2\u00b5\u00b6\5\32\16\2\u00b6\u00bf\3\2\2\2\u00b7"+
		"\u00b8\f\5\2\2\u00b8\u00b9\7 \2\2\u00b9\u00be\5\32\16\2\u00ba\u00bb\f"+
		"\4\2\2\u00bb\u00bc\7!\2\2\u00bc\u00be\5\32\16\2\u00bd\u00b7\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\31\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00ca\7$\2\2\u00c3\u00ca"+
		"\7%\2\2\u00c4\u00ca\7&\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\5\26\f\2\u00c7"+
		"\u00c8\7\5\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc"+
		"\t\2\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\7\t\2\2\u00ce\u00cf\7$\2\2\u00cf"+
		"\u00d3\7\34\2\2\u00d0\u00d2\5 \21\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7\23\2\2\u00d7\37\3\2\2\2\u00d8\u00db\5\"\22"+
		"\2\u00d9\u00db\5$\23\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db!"+
		"\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\7\20\2\2\u00de\u00df\7\32\2\2"+
		"\u00df#\3\2\2\2\u00e0\u00e1\7\7\2\2\u00e1\u00e4\7$\2\2\u00e2\u00e3\7\21"+
		"\2\2\u00e3\u00e5\5(\25\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\7\34\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00e9\7"+
		"\23\2\2\u00e9%\3\2\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ee\7$\2\2\u00ec\u00ed"+
		"\7\21\2\2\u00ed\u00ef\5(\25\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\34\2\2\u00f1\u00f2\5\4\3\2\u00f2\u00f3"+
		"\7\23\2\2\u00f3\'\3\2\2\2\u00f4\u00f9\7$\2\2\u00f5\u00f6\7\25\2\2\u00f6"+
		"\u00f8\7$\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa)\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd"+
		"\7\13\2\2\u00fd\u00fe\5\26\f\2\u00fe\u00ff\7\b\2\2\u00ff\u0100\7\34\2"+
		"\2\u0100\u0103\5\4\3\2\u0101\u0102\7\f\2\2\u0102\u0104\5\4\3\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\23\2\2"+
		"\u0106+\3\2\2\2\u0107\u0108\7\r\2\2\u0108\u0109\5\26\f\2\u0109\u010a\5"+
		"\4\3\2\u010a\u010b\7\23\2\2\u010b-\3\2\2\2\u010c\u010d\5\26\f\2\u010d"+
		"\u010e\7\"\2\2\u010e\u010f\7\34\2\2\u010f\u0110\5\4\3\2\u0110\u0111\7"+
		"\23\2\2\u0111/\3\2\2\2\u0112\u0113\7\16\2\2\u0113\u0114\7$\2\2\u0114\u0115"+
		"\7\17\2\2\u0115\u0116\5\26\f\2\u0116\u0117\7\34\2\2\u0117\u0118\5\4\3"+
		"\2\u0118\u0119\7\23\2\2\u0119\61\3\2\2\2\u011a\u011b\7\22\2\2\u011b\u011c"+
		"\7$\2\2\u011c\u011d\7\32\2\2\u011d\63\3\2\2\2\31:IUY^afu\177\u008d\u0090"+
		"\u00a3\u00af\u00b1\u00bd\u00bf\u00c9\u00d3\u00da\u00e4\u00ee\u00f9\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}