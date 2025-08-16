// Generated from E:/Coding/Saxion/2021-2022/Code-S3/Compilers/78/src/nl/saxion/cos\Viper.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ViperLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		V_CLASS_KW=32, V_CASE_KW=33, V_SWITCH_KW=34, V_ELSE_KW=35, V_ELSEIF_KW=36, 
		V_IF_KW=37, V_BREAK_KW=38, V_CONTINUE_KW=39, V_RETURN_KW=40, V_NEW_KW=41, 
		V_STATIC_KW=42, V_PUBLIC_KW=43, V_PRIVATE_KW=44, V_WHILE_KW=45, V_THIS_KW=46, 
		V_STRING_KW=47, V_BOOL_KW=48, V_FLOAT_KW=49, V_INT_KW=50, V_STRING=51, 
		V_BOOL=52, V_FLOAT=53, V_INT=54, V_IDENTIFIER=55, V_WS=56, V_COMMENT=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "V_CLASS_KW", "V_CASE_KW", 
			"V_SWITCH_KW", "V_ELSE_KW", "V_ELSEIF_KW", "V_IF_KW", "V_BREAK_KW", "V_CONTINUE_KW", 
			"V_RETURN_KW", "V_NEW_KW", "V_STATIC_KW", "V_PUBLIC_KW", "V_PRIVATE_KW", 
			"V_WHILE_KW", "V_THIS_KW", "V_STRING_KW", "V_BOOL_KW", "V_FLOAT_KW", 
			"V_INT_KW", "V_STRING", "V_BOOL", "V_FLOAT", "V_INT", "V_IDENTIFIER", 
			"V_WS", "V_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "','", "')'", "'{'", "'}'", "':'", "'='", 
			"'-'", "'!'", "'*'", "'/'", "'%'", "'&'", "'^'", "'|'", "'+'", "'<<'", 
			"'>>'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'?'", "'++'", "'--'", "'class'", "'case'", "'switch'", "'else'", "'elseif'", 
			"'if'", "'break'", "'continue'", "'return'", "'new'", "'static'", "'public'", 
			"'private'", "'while'", "'this'", "'string'", "'bool'", "'float'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "V_CLASS_KW", "V_CASE_KW", 
			"V_SWITCH_KW", "V_ELSE_KW", "V_ELSEIF_KW", "V_IF_KW", "V_BREAK_KW", "V_CONTINUE_KW", 
			"V_RETURN_KW", "V_NEW_KW", "V_STATIC_KW", "V_PUBLIC_KW", "V_PRIVATE_KW", 
			"V_WHILE_KW", "V_THIS_KW", "V_STRING_KW", "V_BOOL_KW", "V_FLOAT_KW", 
			"V_INT_KW", "V_STRING", "V_BOOL", "V_FLOAT", "V_INT", "V_IDENTIFIER", 
			"V_WS", "V_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ViperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Viper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u018d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\7\64\u0132\n\64\f\64\16\64\u0135\13\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0142\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u0149\n\66\f\66\16\66\u014c\13\66\3\66\3\66"+
		"\6\66\u0150\n\66\r\66\16\66\u0151\3\66\3\66\3\66\3\66\7\66\u0158\n\66"+
		"\f\66\16\66\u015b\13\66\3\66\3\66\7\66\u015f\n\66\f\66\16\66\u0162\13"+
		"\66\5\66\u0164\n\66\3\67\3\67\3\67\7\67\u0169\n\67\f\67\16\67\u016c\13"+
		"\67\5\67\u016e\n\67\38\38\78\u0172\n8\f8\168\u0175\138\39\69\u0178\n9"+
		"\r9\169\u0179\39\39\3:\3:\3:\3:\7:\u0182\n:\f:\16:\u0185\13:\3:\6:\u0188"+
		"\n:\r:\16:\u0189\3:\3:\4\u0133\u0183\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\b\3\2\63;\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u019a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3"+
		"\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23"+
		"\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2\33\u008d"+
		"\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2"+
		"\2%\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009c\3\2\2\2+\u009f\3\2\2\2-\u00a1"+
		"\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00ac\3\2"+
		"\2\2\67\u00af\3\2\2\29\u00b2\3\2\2\2;\u00b5\3\2\2\2=\u00b7\3\2\2\2?\u00ba"+
		"\3\2\2\2A\u00bd\3\2\2\2C\u00c3\3\2\2\2E\u00c8\3\2\2\2G\u00cf\3\2\2\2I"+
		"\u00d4\3\2\2\2K\u00db\3\2\2\2M\u00de\3\2\2\2O\u00e4\3\2\2\2Q\u00ed\3\2"+
		"\2\2S\u00f4\3\2\2\2U\u00f8\3\2\2\2W\u00ff\3\2\2\2Y\u0106\3\2\2\2[\u010e"+
		"\3\2\2\2]\u0114\3\2\2\2_\u0119\3\2\2\2a\u0120\3\2\2\2c\u0125\3\2\2\2e"+
		"\u012b\3\2\2\2g\u012f\3\2\2\2i\u0141\3\2\2\2k\u0163\3\2\2\2m\u016d\3\2"+
		"\2\2o\u016f\3\2\2\2q\u0177\3\2\2\2s\u017d\3\2\2\2uv\7=\2\2v\4\3\2\2\2"+
		"wx\7\60\2\2x\6\3\2\2\2yz\7*\2\2z\b\3\2\2\2{|\7.\2\2|\n\3\2\2\2}~\7+\2"+
		"\2~\f\3\2\2\2\177\u0080\7}\2\2\u0080\16\3\2\2\2\u0081\u0082\7\177\2\2"+
		"\u0082\20\3\2\2\2\u0083\u0084\7<\2\2\u0084\22\3\2\2\2\u0085\u0086\7?\2"+
		"\2\u0086\24\3\2\2\2\u0087\u0088\7/\2\2\u0088\26\3\2\2\2\u0089\u008a\7"+
		"#\2\2\u008a\30\3\2\2\2\u008b\u008c\7,\2\2\u008c\32\3\2\2\2\u008d\u008e"+
		"\7\61\2\2\u008e\34\3\2\2\2\u008f\u0090\7\'\2\2\u0090\36\3\2\2\2\u0091"+
		"\u0092\7(\2\2\u0092 \3\2\2\2\u0093\u0094\7`\2\2\u0094\"\3\2\2\2\u0095"+
		"\u0096\7~\2\2\u0096$\3\2\2\2\u0097\u0098\7-\2\2\u0098&\3\2\2\2\u0099\u009a"+
		"\7>\2\2\u009a\u009b\7>\2\2\u009b(\3\2\2\2\u009c\u009d\7@\2\2\u009d\u009e"+
		"\7@\2\2\u009e*\3\2\2\2\u009f\u00a0\7>\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7"+
		">\2\2\u00a2\u00a3\7?\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\60\3"+
		"\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8\7?\2\2\u00a8\62\3\2\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\u00ab\7?\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1\7(\2\2\u00b18"+
		"\3\2\2\2\u00b2\u00b3\7~\2\2\u00b3\u00b4\7~\2\2\u00b4:\3\2\2\2\u00b5\u00b6"+
		"\7A\2\2\u00b6<\3\2\2\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\7-\2\2\u00b9>\3"+
		"\2\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bc\7/\2\2\u00bc@\3\2\2\2\u00bd\u00be"+
		"\7e\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7y\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7e\2\2"+
		"\u00cd\u00ce\7j\2\2\u00ceF\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7n\2"+
		"\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3H\3\2\2\2\u00d4\u00d5\7"+
		"g\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7h\2\2\u00daJ\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7h\2\2\u00ddL\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7m\2\2\u00e3N\3\2\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ecP\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7v\2"+
		"\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7p\2\2\u00f3R\3\2"+
		"\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7y\2\2\u00f7T\3"+
		"\2\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7e\2\2\u00feV\3\2\2\2\u00ff"+
		"\u0100\7r\2\2\u0100\u0101\7w\2\2\u0101\u0102\7d\2\2\u0102\u0103\7n\2\2"+
		"\u0103\u0104\7k\2\2\u0104\u0105\7e\2\2\u0105X\3\2\2\2\u0106\u0107\7r\2"+
		"\2\u0107\u0108\7t\2\2\u0108\u0109\7k\2\2\u0109\u010a\7x\2\2\u010a\u010b"+
		"\7c\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2\u010dZ\3\2\2\2\u010e\u010f"+
		"\7y\2\2\u010f\u0110\7j\2\2\u0110\u0111\7k\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7g\2\2\u0113\\\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7j\2\2\u0116"+
		"\u0117\7k\2\2\u0117\u0118\7u\2\2\u0118^\3\2\2\2\u0119\u011a\7u\2\2\u011a"+
		"\u011b\7v\2\2\u011b\u011c\7t\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2"+
		"\u011e\u011f\7i\2\2\u011f`\3\2\2\2\u0120\u0121\7d\2\2\u0121\u0122\7q\2"+
		"\2\u0122\u0123\7q\2\2\u0123\u0124\7n\2\2\u0124b\3\2\2\2\u0125\u0126\7"+
		"h\2\2\u0126\u0127\7n\2\2\u0127\u0128\7q\2\2\u0128\u0129\7c\2\2\u0129\u012a"+
		"\7v\2\2\u012ad\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u012e"+
		"\7v\2\2\u012ef\3\2\2\2\u012f\u0133\7$\2\2\u0130\u0132\13\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7$\2\2\u0137h\3\2\2\2\u0138"+
		"\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7w\2\2\u013b\u0142\7g\2\2"+
		"\u013c\u013d\7h\2\2\u013d\u013e\7c\2\2\u013e\u013f\7n\2\2\u013f\u0140"+
		"\7u\2\2\u0140\u0142\7g\2\2\u0141\u0138\3\2\2\2\u0141\u013c\3\2\2\2\u0142"+
		"j\3\2\2\2\u0143\u0144\7\62\2\2\u0144\u0145\7\60\2\2\u0145\u0164\7\62\2"+
		"\2\u0146\u014a\t\2\2\2\u0147\u0149\t\3\2\2\u0148\u0147\3\2\2\2\u0149\u014c"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014f\7\60\2\2\u014e\u0150\t\3\2\2\u014f\u014e\3"+
		"\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0164\3\2\2\2\u0153\u0154\7\62\2\2\u0154\u0155\7\60\2\2\u0155\u0159\3"+
		"\2\2\2\u0156\u0158\t\3\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u0160\t\2\2\2\u015d\u015f\t\3\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0143\3\2\2\2\u0163\u0146\3\2\2\2\u0163"+
		"\u0153\3\2\2\2\u0164l\3\2\2\2\u0165\u016e\7\62\2\2\u0166\u016a\t\2\2\2"+
		"\u0167\u0169\t\3\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0165\3\2\2\2\u016d\u0166\3\2\2\2\u016en\3\2\2\2\u016f\u0173\t\4\2\2"+
		"\u0170\u0172\t\5\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174p\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0178\t\6\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b9\2\2\u017c"+
		"r\3\2\2\2\u017d\u017e\7\61\2\2\u017e\u017f\7\61\2\2\u017f\u0183\3\2\2"+
		"\2\u0180\u0182\13\2\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0186\u0188\t\7\2\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b:"+
		"\2\2\u018ct\3\2\2\2\20\2\u0133\u0141\u014a\u0151\u0159\u0160\u0163\u016a"+
		"\u016d\u0173\u0179\u0183\u0189\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}