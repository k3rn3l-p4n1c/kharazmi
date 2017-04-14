// Generated from /Users/Bardia/IdeaProjects/compiler/grammer/Kharazmi.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KharazmiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, POSTFIX_DEFINE=5, PREFIX_DEFINE=6, WAS=7, 
		CLASS=8, FUNCTION=9, IF=10, ELSE=11, WHILE=12, FOREACH=13, IN=14, HAS=15, 
		WITH=16, RETURN=17, END=18, NEW=19, AND=20, OR=21, EQUAL=22, GT=23, LT=24, 
		DOT=25, COMMA=26, COLON=27, KASRE=28, ADD=29, MIN=30, MUL=31, SUB=32, 
		ID=33, NUMBER=34, STRING=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", 
		"CLASS", "FUNCTION", "IF", "ELSE", "WHILE", "FOREACH", "IN", "HAS", "WITH", 
		"RETURN", "END", "NEW", "AND", "OR", "EQUAL", "GT", "LT", "DOT", "COMMA", 
		"COLON", "KASRE", "ADD", "MIN", "MUL", "SUB", "ID", "NUMBER", "STRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'را'", "'('", "')'", "'بار'", null, "'تعریف'", null, "'رسته'", 
		"'تابع'", "'اگر'", "'وگرنه'", "'تا هنگامی که'", "'برای هر'", "'در'", "'دارد'", 
		"'با'", "'بازگردان'", "'خب'", "'یک'", "'و'", "'یا'", null, "'>'", "'<'", 
		"'.'", "'،'", "':'", "'ِ'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", 
		"CLASS", "FUNCTION", "IF", "ELSE", "WHILE", "FOREACH", "IN", "HAS", "WITH", 
		"RETURN", "END", "NEW", "AND", "OR", "EQUAL", "GT", "LT", "DOT", "COMMA", 
		"COLON", "KASRE", "ADD", "MIN", "MUL", "SUB", "ID", "NUMBER", "STRING", 
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


	public KharazmiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kharazmi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u00d3\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\7\"\u00eb\n\"\f\"\16\"\u00ee"+
		"\13\"\3#\3#\7#\u00f2\n#\f#\16#\u00f5\13#\3#\3#\7#\u00f9\n#\f#\16#\u00fc"+
		"\13#\5#\u00fe\n#\3$\3$\6$\u0102\n$\r$\16$\u0103\3$\3$\3%\6%\u0109\n%\r"+
		"%\16%\u010a\3%\3%\3\u0103\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\4\4\2\62;\u0622\u0701"+
		"\5\2\13\f\17\17\"\"\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5N\3\2\2\2\7P\3\2\2\2"+
		"\tR\3\2\2\2\13d\3\2\2\2\rf\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0084"+
		"\3\2\2\2\25\u0089\3\2\2\2\27\u008d\3\2\2\2\31\u0093\3\2\2\2\33\u00a0\3"+
		"\2\2\2\35\u00a8\3\2\2\2\37\u00ab\3\2\2\2!\u00b0\3\2\2\2#\u00b3\3\2\2\2"+
		"%\u00bc\3\2\2\2\'\u00bf\3\2\2\2)\u00c2\3\2\2\2+\u00c4\3\2\2\2-\u00d2\3"+
		"\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2\2"+
		"\2\67\u00dc\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e2\3\2\2\2?\u00e4"+
		"\3\2\2\2A\u00e6\3\2\2\2C\u00e8\3\2\2\2E\u00fd\3\2\2\2G\u00ff\3\2\2\2I"+
		"\u0108\3\2\2\2KL\7\u0633\2\2LM\7\u0629\2\2M\4\3\2\2\2NO\7*\2\2O\6\3\2"+
		"\2\2PQ\7+\2\2Q\b\3\2\2\2RS\7\u062a\2\2ST\7\u0629\2\2TU\7\u0633\2\2U\n"+
		"\3\2\2\2VW\7\u0629\2\2WX\7\u0635\2\2Xe\7\u062c\2\2YZ\7\u0629\2\2Z[\7\u0648"+
		"\2\2[e\7\u0631\2\2\\]\7\u0649\2\2]^\7\u0635\2\2^e\7\u062c\2\2_`\7\u0649"+
		"\2\2`a\7\u0635\2\2ab\7\u062c\2\2bc\7\u0648\2\2ce\7\u0631\2\2dV\3\2\2\2"+
		"dY\3\2\2\2d\\\3\2\2\2d_\3\2\2\2e\f\3\2\2\2fg\7\u062c\2\2gh\7\u063b\2\2"+
		"hi\7\u0633\2\2ij\7\u06ce\2\2jk\7\u0643\2\2k\16\3\2\2\2lm\7\u062a\2\2m"+
		"n\7\u064a\2\2n~\7\u0631\2\2op\7\u062a\2\2pq\7\u0629\2\2qr\7\u0636\2\2"+
		"r~\7\u0631\2\2st\7\u062a\2\2tu\7\u064a\2\2uv\7\u0631\2\2vw\7\u0648\2\2"+
		"w~\7\u0631\2\2xy\7\u062a\2\2yz\7\u0629\2\2z{\7\u0636\2\2{|\7\u0648\2\2"+
		"|~\7\u0631\2\2}l\3\2\2\2}o\3\2\2\2}s\3\2\2\2}x\3\2\2\2~\20\3\2\2\2\177"+
		"\u0080\7\u0633\2\2\u0080\u0081\7\u0635\2\2\u0081\u0082\7\u062c\2\2\u0082"+
		"\u0083\7\u0649\2\2\u0083\22\3\2\2\2\u0084\u0085\7\u062c\2\2\u0085\u0086"+
		"\7\u0629\2\2\u0086\u0087\7\u062a\2\2\u0087\u0088\7\u063b\2\2\u0088\24"+
		"\3\2\2\2\u0089\u008a\7\u0629\2\2\u008a\u008b\7\u06b1\2\2\u008b\u008c\7"+
		"\u0633\2\2\u008c\26\3\2\2\2\u008d\u008e\7\u064a\2\2\u008e\u008f\7\u06b1"+
		"\2\2\u008f\u0090\7\u0633\2\2\u0090\u0091\7\u0648\2\2\u0091\u0092\7\u0649"+
		"\2\2\u0092\30\3\2\2\2\u0093\u0094\7\u062c\2\2\u0094\u0095\7\u0629\2\2"+
		"\u0095\u0096\7\"\2\2\u0096\u0097\7\u0649\2\2\u0097\u0098\7\u0648\2\2\u0098"+
		"\u0099\7\u06b1\2\2\u0099\u009a\7\u0629\2\2\u009a\u009b\7\u0647\2\2\u009b"+
		"\u009c\7\u06ce\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7\u06ab\2\2\u009e\u009f"+
		"\7\u0649\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7\u062a\2\2\u00a1\u00a2\7\u0633"+
		"\2\2\u00a2\u00a3\7\u0629\2\2\u00a3\u00a4\7\u06ce\2\2\u00a4\u00a5\7\"\2"+
		"\2\u00a5\u00a6\7\u0649\2\2\u00a6\u00a7\7\u0633\2\2\u00a7\34\3\2\2\2\u00a8"+
		"\u00a9\7\u0631\2\2\u00a9\u00aa\7\u0633\2\2\u00aa\36\3\2\2\2\u00ab\u00ac"+
		"\7\u0631\2\2\u00ac\u00ad\7\u0629\2\2\u00ad\u00ae\7\u0633\2\2\u00ae\u00af"+
		"\7\u0631\2\2\u00af \3\2\2\2\u00b0\u00b1\7\u062a\2\2\u00b1\u00b2\7\u0629"+
		"\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7\u062a\2\2\u00b4\u00b5\7\u0629\2\2\u00b5"+
		"\u00b6\7\u0634\2\2\u00b6\u00b7\7\u06b1\2\2\u00b7\u00b8\7\u0633\2\2\u00b8"+
		"\u00b9\7\u0631\2\2\u00b9\u00ba\7\u0629\2\2\u00ba\u00bb\7\u0648\2\2\u00bb"+
		"$\3\2\2\2\u00bc\u00bd\7\u0630\2\2\u00bd\u00be\7\u062a\2\2\u00be&\3\2\2"+
		"\2\u00bf\u00c0\7\u06ce\2\2\u00c0\u00c1\7\u06ab\2\2\u00c1(\3\2\2\2\u00c2"+
		"\u00c3\7\u064a\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7\u06ce\2\2\u00c5\u00c6"+
		"\7\u0629\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7\u062a\2\2\u00c8\u00c9\7\u0633"+
		"\2\2\u00c9\u00ca\7\u0629\2\2\u00ca\u00cb\7\u062a\2\2\u00cb\u00d3\7\u0633"+
		"\2\2\u00cc\u00cd\7\u0647\2\2\u00cd\u00ce\7\u0635\2\2\u00ce\u00cf\7\u0629"+
		"\2\2\u00cf\u00d0\7\u064a\2\2\u00d0\u00d3\7\u06ce\2\2\u00d1\u00d3\7?\2"+
		"\2\u00d2\u00c7\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3."+
		"\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7"+
		"\62\3\2\2\2\u00d8\u00d9\7\60\2\2\u00d9\64\3\2\2\2\u00da\u00db\7\u060e"+
		"\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7<\2\2\u00dd8\3\2\2\2\u00de\u00df\7"+
		"\u0652\2\2\u00df:\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1<\3\2\2\2\u00e2\u00e3"+
		"\7/\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7"+
		"\61\2\2\u00e7B\3\2\2\2\u00e8\u00ec\4\u0622\u06f1\2\u00e9\u00eb\t\2\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00edD\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\4\u06f3\u06fb"+
		"\2\u00f0\u00f2\4\u06f2\u06fb\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fe\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00fa\4\63;\2\u00f7\u00f9\4\62;\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ef\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fe"+
		"F\3\2\2\2\u00ff\u0101\7\u00ad\2\2\u0100\u0102\13\2\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\7\u00bd\2\2\u0106H\3\2\2\2\u0107\u0109\t\3"+
		"\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b%\2\2\u010dJ\3\2\2\2\f"+
		"\2d}\u00d2\u00ec\u00f3\u00fa\u00fd\u0103\u010a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}