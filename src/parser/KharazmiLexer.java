// Generated from /Users/Bardia/IdeaProjects/compiler/grammer/Kharazmi.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KharazmiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, POSTFIX_DEFINE=4, PREFIX_DEFINE=5, WAS=6, CLASS=7, 
		FUNCTION=8, IF=9, ELSE=10, WHILE=11, FOREACH=12, IN=13, HAS=14, WITH=15, 
		RETURN=16, END=17, NEW=18, AND=19, OR=20, EQUAL=21, GT=22, LT=23, DOT=24, 
		COMMA=25, COLON=26, KASRE=27, ADD=28, MIN=29, MUL=30, SUB=31, REPEAT=32, 
		ID=33, NUMBER=34, STRING=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", "CLASS", 
		"FUNCTION", "IF", "ELSE", "WHILE", "FOREACH", "IN", "HAS", "WITH", "RETURN", 
		"END", "NEW", "AND", "OR", "EQUAL", "GT", "LT", "DOT", "COMMA", "COLON", 
		"KASRE", "ADD", "MIN", "MUL", "SUB", "REPEAT", "ID", "NUMBER", "STRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'را'", "'('", "')'", null, "'تعریف'", null, "'رسته'", "'تابع'", 
		"'اگر'", "'وگرنه'", "'تا هنگامی که'", "'برای هر'", "'در'", "'دارد'", "'با'", 
		"'بازگردان'", "'خب'", "'یک'", "'و'", "'یا'", null, null, null, "'.'", 
		"'،'", "':'", "'ِ'", "'+'", "'-'", "'*'", "'/'", "'بار'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "POSTFIX_DEFINE", "PREFIX_DEFINE", "WAS", "CLASS", 
		"FUNCTION", "IF", "ELSE", "WHILE", "FOREACH", "IN", "HAS", "WITH", "RETURN", 
		"END", "NEW", "AND", "OR", "EQUAL", "GT", "LT", "DOT", "COMMA", "COLON", 
		"KASRE", "ADD", "MIN", "MUL", "SUB", "REPEAT", "ID", "NUMBER", "STRING", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00cf\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00d8\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00e1\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\7\"\u00f9\n\"\f\"\16\""+
		"\u00fc\13\"\3#\3#\7#\u0100\n#\f#\16#\u0103\13#\3#\3#\7#\u0107\n#\f#\16"+
		"#\u010a\13#\5#\u010c\n#\3$\3$\6$\u0110\n$\r$\16$\u0111\3$\3$\3$\6$\u0117"+
		"\n$\r$\16$\u0118\3$\5$\u011c\n$\3%\6%\u011f\n%\r%\16%\u0120\3%\3%\4\u0111"+
		"\u0118\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&\3\2\4\5\2\62;\u0622\u0701\u200e\u200e\5\2\13"+
		"\f\17\17\"\"\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5N\3\2\2\2\7P\3\2\2\2\t`\3\2"+
		"\2\2\13b\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21\u0080\3\2\2\2\23\u0085\3\2"+
		"\2\2\25\u0089\3\2\2\2\27\u008f\3\2\2\2\31\u009c\3\2\2\2\33\u00a4\3\2\2"+
		"\2\35\u00a7\3\2\2\2\37\u00ac\3\2\2\2!\u00af\3\2\2\2#\u00b8\3\2\2\2%\u00bb"+
		"\3\2\2\2\'\u00be\3\2\2\2)\u00c0\3\2\2\2+\u00ce\3\2\2\2-\u00d7\3\2\2\2"+
		"/\u00e0\3\2\2\2\61\u00e2\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2\2\2\67"+
		"\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f0\3\2"+
		"\2\2A\u00f2\3\2\2\2C\u00f6\3\2\2\2E\u010b\3\2\2\2G\u011b\3\2\2\2I\u011e"+
		"\3\2\2\2KL\7\u0633\2\2LM\7\u0629\2\2M\4\3\2\2\2NO\7*\2\2O\6\3\2\2\2PQ"+
		"\7+\2\2Q\b\3\2\2\2RS\7\u0629\2\2ST\7\u0635\2\2Ta\7\u062c\2\2UV\7\u0629"+
		"\2\2VW\7\u0648\2\2Wa\7\u0631\2\2XY\7\u0649\2\2YZ\7\u0635\2\2Za\7\u062c"+
		"\2\2[\\\7\u0649\2\2\\]\7\u0635\2\2]^\7\u062c\2\2^_\7\u0648\2\2_a\7\u0631"+
		"\2\2`R\3\2\2\2`U\3\2\2\2`X\3\2\2\2`[\3\2\2\2a\n\3\2\2\2bc\7\u062c\2\2"+
		"cd\7\u063b\2\2de\7\u0633\2\2ef\7\u06ce\2\2fg\7\u0643\2\2g\f\3\2\2\2hi"+
		"\7\u062a\2\2ij\7\u064a\2\2jz\7\u0631\2\2kl\7\u062a\2\2lm\7\u0629\2\2m"+
		"n\7\u0636\2\2nz\7\u0631\2\2op\7\u062a\2\2pq\7\u064a\2\2qr\7\u0631\2\2"+
		"rs\7\u0648\2\2sz\7\u0631\2\2tu\7\u062a\2\2uv\7\u0629\2\2vw\7\u0636\2\2"+
		"wx\7\u0648\2\2xz\7\u0631\2\2yh\3\2\2\2yk\3\2\2\2yo\3\2\2\2yt\3\2\2\2z"+
		"\16\3\2\2\2{|\7\u0633\2\2|}\7\u0635\2\2}~\7\u062c\2\2~\177\7\u0649\2\2"+
		"\177\20\3\2\2\2\u0080\u0081\7\u062c\2\2\u0081\u0082\7\u0629\2\2\u0082"+
		"\u0083\7\u062a\2\2\u0083\u0084\7\u063b\2\2\u0084\22\3\2\2\2\u0085\u0086"+
		"\7\u0629\2\2\u0086\u0087\7\u06b1\2\2\u0087\u0088\7\u0633\2\2\u0088\24"+
		"\3\2\2\2\u0089\u008a\7\u064a\2\2\u008a\u008b\7\u06b1\2\2\u008b\u008c\7"+
		"\u0633\2\2\u008c\u008d\7\u0648\2\2\u008d\u008e\7\u0649\2\2\u008e\26\3"+
		"\2\2\2\u008f\u0090\7\u062c\2\2\u0090\u0091\7\u0629\2\2\u0091\u0092\7\""+
		"\2\2\u0092\u0093\7\u0649\2\2\u0093\u0094\7\u0648\2\2\u0094\u0095\7\u06b1"+
		"\2\2\u0095\u0096\7\u0629\2\2\u0096\u0097\7\u0647\2\2\u0097\u0098\7\u06ce"+
		"\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7\u06ab\2\2\u009a\u009b\7\u0649\2"+
		"\2\u009b\30\3\2\2\2\u009c\u009d\7\u062a\2\2\u009d\u009e\7\u0633\2\2\u009e"+
		"\u009f\7\u0629\2\2\u009f\u00a0\7\u06ce\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2"+
		"\7\u0649\2\2\u00a2\u00a3\7\u0633\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7\u0631"+
		"\2\2\u00a5\u00a6\7\u0633\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7\u0631\2\2"+
		"\u00a8\u00a9\7\u0629\2\2\u00a9\u00aa\7\u0633\2\2\u00aa\u00ab\7\u0631\2"+
		"\2\u00ab\36\3\2\2\2\u00ac\u00ad\7\u062a\2\2\u00ad\u00ae\7\u0629\2\2\u00ae"+
		" \3\2\2\2\u00af\u00b0\7\u062a\2\2\u00b0\u00b1\7\u0629\2\2\u00b1\u00b2"+
		"\7\u0634\2\2\u00b2\u00b3\7\u06b1\2\2\u00b3\u00b4\7\u0633\2\2\u00b4\u00b5"+
		"\7\u0631\2\2\u00b5\u00b6\7\u0629\2\2\u00b6\u00b7\7\u0648\2\2\u00b7\"\3"+
		"\2\2\2\u00b8\u00b9\7\u0630\2\2\u00b9\u00ba\7\u062a\2\2\u00ba$\3\2\2\2"+
		"\u00bb\u00bc\7\u06ce\2\2\u00bc\u00bd\7\u06ab\2\2\u00bd&\3\2\2\2\u00be"+
		"\u00bf\7\u064a\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7\u06ce\2\2\u00c1\u00c2"+
		"\7\u0629\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7\u062a\2\2\u00c4\u00c5\7\u0633"+
		"\2\2\u00c5\u00c6\7\u0629\2\2\u00c6\u00c7\7\u062a\2\2\u00c7\u00cf\7\u0633"+
		"\2\2\u00c8\u00c9\7\u0647\2\2\u00c9\u00ca\7\u0635\2\2\u00ca\u00cb\7\u0629"+
		"\2\2\u00cb\u00cc\7\u064a\2\2\u00cc\u00cf\7\u06ce\2\2\u00cd\u00cf\7?\2"+
		"\2\u00ce\u00c3\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf,"+
		"\3\2\2\2\u00d0\u00d8\7>\2\2\u00d1\u00d2\7\u062a\2\2\u00d2\u00d3\7\u0634"+
		"\2\2\u00d3\u00d4\7\u0633\2\2\u00d4\u00d5\7\u06b1\2\2\u00d5\u00d6\7\u062c"+
		"\2\2\u00d6\u00d8\7\u0633\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d8"+
		".\3\2\2\2\u00d9\u00e1\7@\2\2\u00da\u00db\7\u06ab\2\2\u00db\u00dc\7\u064a"+
		"\2\2\u00dc\u00dd\7\u0688\2\2\u00dd\u00de\7\u06ab\2\2\u00de\u00df\7\u062c"+
		"\2\2\u00df\u00e1\7\u0633\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00da\3\2\2\2\u00e1"+
		"\60\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7\u060e"+
		"\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7<\2\2\u00e7\66\3\2\2\2\u00e8\u00e9"+
		"\7\u0652\2\2\u00e98\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb:\3\2\2\2\u00ec\u00ed"+
		"\7/\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7"+
		"\61\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7\u062a\2\2\u00f3\u00f4\7\u0629\2\2"+
		"\u00f4\u00f5\7\u0633\2\2\u00f5B\3\2\2\2\u00f6\u00fa\4\u0622\u06f1\2\u00f7"+
		"\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fbD\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0101"+
		"\4\u06f3\u06fb\2\u00fe\u0100\4\u06f2\u06fb\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u010c\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0108\4\63;\2\u0105\u0107\4\62;\2\u0106"+
		"\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u00fd\3\2\2\2\u010b"+
		"\u0104\3\2\2\2\u010cF\3\2\2\2\u010d\u010f\7\u00ad\2\2\u010e\u0110\13\2"+
		"\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011c\7\u00bd\2\2\u0114\u0116"+
		"\7\u00bd\2\2\u0115\u0117\13\2\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\7\u00ad\2\2\u011b\u010d\3\2\2\2\u011b\u0114\3\2\2\2\u011cH\3\2"+
		"\2\2\u011d\u011f\t\3\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b%"+
		"\2\2\u0123J\3\2\2\2\20\2`y\u00ce\u00d7\u00e0\u00fa\u0101\u0108\u010b\u0111"+
		"\u0118\u011b\u0120\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}