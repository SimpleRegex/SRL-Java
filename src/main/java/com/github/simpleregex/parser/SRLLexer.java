// Generated from SRL.g by ANTLR 4.5.2
package com.github.simpleregex.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, A=4, B=5, C=6, D=7, E=8, F=9, G=10, H=11, I=12, 
		J=13, K=14, L=15, M=16, N=17, O=18, P=19, Q=20, R=21, S=22, T=23, U=24, 
		V=25, W=26, X=27, Y=28, Z=29, KEYW_FROM=30, KEYW_LITERALLY=31, KEYW_DIGIT=32, 
		KEYW_LETTER=33, KEYW_UPPERCASE=34, KEYW_OF=35, KEYW_ONE=36, KEYW_ANY=37, 
		KEYW_NO=38, KEYW_CHARACTER=39, KEYW_ANYHTING=40, KEYW_NEW=41, KEYW_LINE=42, 
		KEYW_WHITESPACE=43, KEYW_TAB=44, KEYW_RAW=45, KEYW_TO=46, KEYW_EXACTLY=47, 
		KEYW_TIMES=48, KEYW_BETWEEN=49, KEYW_AND=50, KEYW_OPTIONAL=51, KEYW_ONCE=52, 
		KEYW_NEVER=53, KEYW_MORE=54, KEYW_OR=55, KEYW_AT=56, KEYW_LEAST=57, KEYW_CAPTURE=58, 
		KEYW_AS=59, KEYW_UNTIL=60, KEYW_IF=61, KEYW_FOLLOWED=62, KEYW_BY=63, KEYW_NOT=64, 
		KEYW_ALREADY=65, KEYW_HAD=66, KEYW_CASE=67, KEYW_INSENSITIVE=68, KEYW_MULTI=69, 
		KEYW_ALL=70, KEYW_LAZY=71, KEYW_BEGINS=72, KEYW_STARTS=73, KEYW_WITH=74, 
		KEYW_MUST=75, KEYW_END=76, DIGIT=77, NUMBER=78, CHAR=79, STRING=80, WHITESPACE=81;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z", "KEYW_FROM", "KEYW_LITERALLY", "KEYW_DIGIT", "KEYW_LETTER", 
		"KEYW_UPPERCASE", "KEYW_OF", "KEYW_ONE", "KEYW_ANY", "KEYW_NO", "KEYW_CHARACTER", 
		"KEYW_ANYHTING", "KEYW_NEW", "KEYW_LINE", "KEYW_WHITESPACE", "KEYW_TAB", 
		"KEYW_RAW", "KEYW_TO", "KEYW_EXACTLY", "KEYW_TIMES", "KEYW_BETWEEN", "KEYW_AND", 
		"KEYW_OPTIONAL", "KEYW_ONCE", "KEYW_NEVER", "KEYW_MORE", "KEYW_OR", "KEYW_AT", 
		"KEYW_LEAST", "KEYW_CAPTURE", "KEYW_AS", "KEYW_UNTIL", "KEYW_IF", "KEYW_FOLLOWED", 
		"KEYW_BY", "KEYW_NOT", "KEYW_ALREADY", "KEYW_HAD", "KEYW_CASE", "KEYW_INSENSITIVE", 
		"KEYW_MULTI", "KEYW_ALL", "KEYW_LAZY", "KEYW_BEGINS", "KEYW_STARTS", "KEYW_WITH", 
		"KEYW_MUST", "KEYW_END", "DIGIT", "NUMBER", "CHAR", "STRING", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z", "KEYW_FROM", "KEYW_LITERALLY", "KEYW_DIGIT", "KEYW_LETTER", 
		"KEYW_UPPERCASE", "KEYW_OF", "KEYW_ONE", "KEYW_ANY", "KEYW_NO", "KEYW_CHARACTER", 
		"KEYW_ANYHTING", "KEYW_NEW", "KEYW_LINE", "KEYW_WHITESPACE", "KEYW_TAB", 
		"KEYW_RAW", "KEYW_TO", "KEYW_EXACTLY", "KEYW_TIMES", "KEYW_BETWEEN", "KEYW_AND", 
		"KEYW_OPTIONAL", "KEYW_ONCE", "KEYW_NEVER", "KEYW_MORE", "KEYW_OR", "KEYW_AT", 
		"KEYW_LEAST", "KEYW_CAPTURE", "KEYW_AS", "KEYW_UNTIL", "KEYW_IF", "KEYW_FOLLOWED", 
		"KEYW_BY", "KEYW_NOT", "KEYW_ALREADY", "KEYW_HAD", "KEYW_CASE", "KEYW_INSENSITIVE", 
		"KEYW_MULTI", "KEYW_ALL", "KEYW_LAZY", "KEYW_BEGINS", "KEYW_STARTS", "KEYW_WITH", 
		"KEYW_MUST", "KEYW_END", "DIGIT", "NUMBER", "CHAR", "STRING", "WHITESPACE"
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


	public SRLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SRL.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2S\u0215\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A"+
		"\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H"+
		"\3I\3I\3I\3I\3I\3I\5I\u01db\nI\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L"+
		"\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3O\3O\6O\u01f6\nO\rO\16O\u01f7\3P\5P\u01fb"+
		"\nP\3Q\3Q\7Q\u01ff\nQ\fQ\16Q\u0202\13Q\3Q\3Q\3Q\7Q\u0207\nQ\fQ\16Q\u020a"+
		"\13Q\3Q\5Q\u020d\nQ\3R\6R\u0210\nR\rR\16R\u0211\3R\3R\2\2S\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\3\2\37"+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K"+
		"Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u021a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2\2\5\u00a7\3\2\2\2\7\u00a9\3\2\2\2\t\u00ab"+
		"\3\2\2\2\13\u00ad\3\2\2\2\r\u00af\3\2\2\2\17\u00b1\3\2\2\2\21\u00b3\3"+
		"\2\2\2\23\u00b5\3\2\2\2\25\u00b7\3\2\2\2\27\u00b9\3\2\2\2\31\u00bb\3\2"+
		"\2\2\33\u00bd\3\2\2\2\35\u00bf\3\2\2\2\37\u00c1\3\2\2\2!\u00c3\3\2\2\2"+
		"#\u00c5\3\2\2\2%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00cd\3"+
		"\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2"+
		"\65\u00d7\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00ee\3\2\2\2C\u00f4\3\2\2\2E\u00fb\3\2\2\2G"+
		"\u0105\3\2\2\2I\u0108\3\2\2\2K\u010c\3\2\2\2M\u0110\3\2\2\2O\u0113\3\2"+
		"\2\2Q\u011d\3\2\2\2S\u0126\3\2\2\2U\u012a\3\2\2\2W\u012f\3\2\2\2Y\u013a"+
		"\3\2\2\2[\u013e\3\2\2\2]\u0142\3\2\2\2_\u0145\3\2\2\2a\u014d\3\2\2\2c"+
		"\u0153\3\2\2\2e\u015b\3\2\2\2g\u015f\3\2\2\2i\u0168\3\2\2\2k\u016d\3\2"+
		"\2\2m\u0173\3\2\2\2o\u0178\3\2\2\2q\u017b\3\2\2\2s\u017e\3\2\2\2u\u0184"+
		"\3\2\2\2w\u018c\3\2\2\2y\u018f\3\2\2\2{\u0195\3\2\2\2}\u0198\3\2\2\2\177"+
		"\u01a1\3\2\2\2\u0081\u01a4\3\2\2\2\u0083\u01a8\3\2\2\2\u0085\u01b0\3\2"+
		"\2\2\u0087\u01b4\3\2\2\2\u0089\u01b9\3\2\2\2\u008b\u01c5\3\2\2\2\u008d"+
		"\u01cb\3\2\2\2\u008f\u01cf\3\2\2\2\u0091\u01d4\3\2\2\2\u0093\u01dc\3\2"+
		"\2\2\u0095\u01e3\3\2\2\2\u0097\u01e8\3\2\2\2\u0099\u01ed\3\2\2\2\u009b"+
		"\u01f1\3\2\2\2\u009d\u01f3\3\2\2\2\u009f\u01fa\3\2\2\2\u00a1\u020c\3\2"+
		"\2\2\u00a3\u020f\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6\4\3\2\2\2\u00a7\u00a8"+
		"\7*\2\2\u00a8\6\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\b\3\2\2\2\u00ab\u00ac"+
		"\t\2\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae\f\3\2\2\2\u00af\u00b0"+
		"\t\4\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\t\5\2\2\u00b2\20\3\2\2\2\u00b3\u00b4"+
		"\t\6\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\t\7\2\2\u00b6\24\3\2\2\2\u00b7\u00b8"+
		"\t\b\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\t\t\2\2\u00ba\30\3\2\2\2\u00bb\u00bc"+
		"\t\n\2\2\u00bc\32\3\2\2\2\u00bd\u00be\t\13\2\2\u00be\34\3\2\2\2\u00bf"+
		"\u00c0\t\f\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\t\r\2\2\u00c2 \3\2\2\2\u00c3"+
		"\u00c4\t\16\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\t\17\2\2\u00c6$\3\2\2\2\u00c7"+
		"\u00c8\t\20\2\2\u00c8&\3\2\2\2\u00c9\u00ca\t\21\2\2\u00ca(\3\2\2\2\u00cb"+
		"\u00cc\t\22\2\2\u00cc*\3\2\2\2\u00cd\u00ce\t\23\2\2\u00ce,\3\2\2\2\u00cf"+
		"\u00d0\t\24\2\2\u00d0.\3\2\2\2\u00d1\u00d2\t\25\2\2\u00d2\60\3\2\2\2\u00d3"+
		"\u00d4\t\26\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\t\27\2\2\u00d6\64\3\2\2\2"+
		"\u00d7\u00d8\t\30\2\2\u00d8\66\3\2\2\2\u00d9\u00da\t\31\2\2\u00da8\3\2"+
		"\2\2\u00db\u00dc\t\32\2\2\u00dc:\3\2\2\2\u00dd\u00de\t\33\2\2\u00de<\3"+
		"\2\2\2\u00df\u00e0\t\7\2\2\u00e0\u00e1\t\23\2\2\u00e1\u00e2\t\20\2\2\u00e2"+
		"\u00e3\t\16\2\2\u00e3>\3\2\2\2\u00e4\u00e5\5\37\20\2\u00e5\u00e6\5\31"+
		"\r\2\u00e6\u00e7\5/\30\2\u00e7\u00e8\5\21\t\2\u00e8\u00e9\5+\26\2\u00e9"+
		"\u00ea\5\t\5\2\u00ea\u00eb\5\37\20\2\u00eb\u00ec\5\37\20\2\u00ec\u00ed"+
		"\59\35\2\u00ed@\3\2\2\2\u00ee\u00ef\5\17\b\2\u00ef\u00f0\5\31\r\2\u00f0"+
		"\u00f1\5\25\13\2\u00f1\u00f2\5\31\r\2\u00f2\u00f3\5/\30\2\u00f3B\3\2\2"+
		"\2\u00f4\u00f5\5\37\20\2\u00f5\u00f6\5\21\t\2\u00f6\u00f7\5/\30\2\u00f7"+
		"\u00f8\5/\30\2\u00f8\u00f9\5\21\t\2\u00f9\u00fa\5+\26\2\u00faD\3\2\2\2"+
		"\u00fb\u00fc\5\61\31\2\u00fc\u00fd\5\'\24\2\u00fd\u00fe\5\'\24\2\u00fe"+
		"\u00ff\5\21\t\2\u00ff\u0100\5+\26\2\u0100\u0101\5\r\7\2\u0101\u0102\5"+
		"\t\5\2\u0102\u0103\5-\27\2\u0103\u0104\5\21\t\2\u0104F\3\2\2\2\u0105\u0106"+
		"\5%\23\2\u0106\u0107\5\23\n\2\u0107H\3\2\2\2\u0108\u0109\5%\23\2\u0109"+
		"\u010a\5#\22\2\u010a\u010b\5\21\t\2\u010bJ\3\2\2\2\u010c\u010d\5\t\5\2"+
		"\u010d\u010e\5#\22\2\u010e\u010f\59\35\2\u010fL\3\2\2\2\u0110\u0111\5"+
		"#\22\2\u0111\u0112\5%\23\2\u0112N\3\2\2\2\u0113\u0114\5\r\7\2\u0114\u0115"+
		"\5\27\f\2\u0115\u0116\5\t\5\2\u0116\u0117\5+\26\2\u0117\u0118\5\t\5\2"+
		"\u0118\u0119\5\r\7\2\u0119\u011a\5/\30\2\u011a\u011b\5\21\t\2\u011b\u011c"+
		"\5+\26\2\u011cP\3\2\2\2\u011d\u011e\5\t\5\2\u011e\u011f\5#\22\2\u011f"+
		"\u0120\59\35\2\u0120\u0121\5/\30\2\u0121\u0122\5\27\f\2\u0122\u0123\5"+
		"\31\r\2\u0123\u0124\5#\22\2\u0124\u0125\5\25\13\2\u0125R\3\2\2\2\u0126"+
		"\u0127\5#\22\2\u0127\u0128\5\21\t\2\u0128\u0129\5\65\33\2\u0129T\3\2\2"+
		"\2\u012a\u012b\5\37\20\2\u012b\u012c\5\31\r\2\u012c\u012d\5#\22\2\u012d"+
		"\u012e\5\21\t\2\u012eV\3\2\2\2\u012f\u0130\5\65\33\2\u0130\u0131\5\27"+
		"\f\2\u0131\u0132\5\31\r\2\u0132\u0133\5/\30\2\u0133\u0134\5\21\t\2\u0134"+
		"\u0135\5-\27\2\u0135\u0136\5\'\24\2\u0136\u0137\5\t\5\2\u0137\u0138\5"+
		"\r\7\2\u0138\u0139\5\21\t\2\u0139X\3\2\2\2\u013a\u013b\5/\30\2\u013b\u013c"+
		"\5\t\5\2\u013c\u013d\5\13\6\2\u013dZ\3\2\2\2\u013e\u013f\5+\26\2\u013f"+
		"\u0140\5\t\5\2\u0140\u0141\5\65\33\2\u0141\\\3\2\2\2\u0142\u0143\5/\30"+
		"\2\u0143\u0144\5%\23\2\u0144^\3\2\2\2\u0145\u0146\5\21\t\2\u0146\u0147"+
		"\5\67\34\2\u0147\u0148\5\t\5\2\u0148\u0149\5\r\7\2\u0149\u014a\5/\30\2"+
		"\u014a\u014b\5\37\20\2\u014b\u014c\59\35\2\u014c`\3\2\2\2\u014d\u014e"+
		"\5/\30\2\u014e\u014f\5\31\r\2\u014f\u0150\5!\21\2\u0150\u0151\5\21\t\2"+
		"\u0151\u0152\5-\27\2\u0152b\3\2\2\2\u0153\u0154\5\13\6\2\u0154\u0155\5"+
		"\21\t\2\u0155\u0156\5/\30\2\u0156\u0157\5\65\33\2\u0157\u0158\5\21\t\2"+
		"\u0158\u0159\5\21\t\2\u0159\u015a\5#\22\2\u015ad\3\2\2\2\u015b\u015c\5"+
		"\t\5\2\u015c\u015d\5#\22\2\u015d\u015e\5\17\b\2\u015ef\3\2\2\2\u015f\u0160"+
		"\5%\23\2\u0160\u0161\5\'\24\2\u0161\u0162\5/\30\2\u0162\u0163\5\31\r\2"+
		"\u0163\u0164\5%\23\2\u0164\u0165\5#\22\2\u0165\u0166\5\t\5\2\u0166\u0167"+
		"\5\37\20\2\u0167h\3\2\2\2\u0168\u0169\5%\23\2\u0169\u016a\5#\22\2\u016a"+
		"\u016b\5\r\7\2\u016b\u016c\5\21\t\2\u016cj\3\2\2\2\u016d\u016e\5#\22\2"+
		"\u016e\u016f\5\21\t\2\u016f\u0170\5\63\32\2\u0170\u0171\5\21\t\2\u0171"+
		"\u0172\5+\26\2\u0172l\3\2\2\2\u0173\u0174\5!\21\2\u0174\u0175\5%\23\2"+
		"\u0175\u0176\5+\26\2\u0176\u0177\5\21\t\2\u0177n\3\2\2\2\u0178\u0179\5"+
		"%\23\2\u0179\u017a\5+\26\2\u017ap\3\2\2\2\u017b\u017c\5\t\5\2\u017c\u017d"+
		"\5/\30\2\u017dr\3\2\2\2\u017e\u017f\5\37\20\2\u017f\u0180\5\21\t\2\u0180"+
		"\u0181\5\t\5\2\u0181\u0182\5-\27\2\u0182\u0183\5/\30\2\u0183t\3\2\2\2"+
		"\u0184\u0185\5\r\7\2\u0185\u0186\5\t\5\2\u0186\u0187\5\'\24\2\u0187\u0188"+
		"\5/\30\2\u0188\u0189\5\61\31\2\u0189\u018a\5+\26\2\u018a\u018b\5\21\t"+
		"\2\u018bv\3\2\2\2\u018c\u018d\5\t\5\2\u018d\u018e\5-\27\2\u018ex\3\2\2"+
		"\2\u018f\u0190\5\61\31\2\u0190\u0191\5#\22\2\u0191\u0192\5/\30\2\u0192"+
		"\u0193\5\31\r\2\u0193\u0194\5\37\20\2\u0194z\3\2\2\2\u0195\u0196\5\31"+
		"\r\2\u0196\u0197\5\23\n\2\u0197|\3\2\2\2\u0198\u0199\5\23\n\2\u0199\u019a"+
		"\5%\23\2\u019a\u019b\5\37\20\2\u019b\u019c\5\37\20\2\u019c\u019d\5%\23"+
		"\2\u019d\u019e\5\65\33\2\u019e\u019f\5\21\t\2\u019f\u01a0\5\17\b\2\u01a0"+
		"~\3\2\2\2\u01a1\u01a2\5\13\6\2\u01a2\u01a3\59\35\2\u01a3\u0080\3\2\2\2"+
		"\u01a4\u01a5\5#\22\2\u01a5\u01a6\5%\23\2\u01a6\u01a7\5/\30\2\u01a7\u0082"+
		"\3\2\2\2\u01a8\u01a9\5\t\5\2\u01a9\u01aa\5\37\20\2\u01aa\u01ab\5+\26\2"+
		"\u01ab\u01ac\5\21\t\2\u01ac\u01ad\5\t\5\2\u01ad\u01ae\5\17\b\2\u01ae\u01af"+
		"\59\35\2\u01af\u0084\3\2\2\2\u01b0\u01b1\5\27\f\2\u01b1\u01b2\5\t\5\2"+
		"\u01b2\u01b3\5\17\b\2\u01b3\u0086\3\2\2\2\u01b4\u01b5\5\r\7\2\u01b5\u01b6"+
		"\5\t\5\2\u01b6\u01b7\5-\27\2\u01b7\u01b8\5\21\t\2\u01b8\u0088\3\2\2\2"+
		"\u01b9\u01ba\5\31\r\2\u01ba\u01bb\5#\22\2\u01bb\u01bc\5-\27\2\u01bc\u01bd"+
		"\5\21\t\2\u01bd\u01be\5#\22\2\u01be\u01bf\5-\27\2\u01bf\u01c0\5\31\r\2"+
		"\u01c0\u01c1\5/\30\2\u01c1\u01c2\5\31\r\2\u01c2\u01c3\5\63\32\2\u01c3"+
		"\u01c4\5\21\t\2\u01c4\u008a\3\2\2\2\u01c5\u01c6\5!\21\2\u01c6\u01c7\5"+
		"\61\31\2\u01c7\u01c8\5\37\20\2\u01c8\u01c9\5/\30\2\u01c9\u01ca\5\31\r"+
		"\2\u01ca\u008c\3\2\2\2\u01cb\u01cc\5\t\5\2\u01cc\u01cd\5\37\20\2\u01cd"+
		"\u01ce\5\37\20\2\u01ce\u008e\3\2\2\2\u01cf\u01d0\5\37\20\2\u01d0\u01d1"+
		"\5\t\5\2\u01d1\u01d2\5;\36\2\u01d2\u01d3\59\35\2\u01d3\u0090\3\2\2\2\u01d4"+
		"\u01d5\5\13\6\2\u01d5\u01d6\5\21\t\2\u01d6\u01d7\5\25\13\2\u01d7\u01d8"+
		"\5\31\r\2\u01d8\u01da\5#\22\2\u01d9\u01db\5-\27\2\u01da\u01d9\3\2\2\2"+
		"\u01da\u01db\3\2\2\2\u01db\u0092\3\2\2\2\u01dc\u01dd\5-\27\2\u01dd\u01de"+
		"\5/\30\2\u01de\u01df\5\t\5\2\u01df\u01e0\5+\26\2\u01e0\u01e1\5/\30\2\u01e1"+
		"\u01e2\5-\27\2\u01e2\u0094\3\2\2\2\u01e3\u01e4\5\65\33\2\u01e4\u01e5\5"+
		"\31\r\2\u01e5\u01e6\5/\30\2\u01e6\u01e7\5\27\f\2\u01e7\u0096\3\2\2\2\u01e8"+
		"\u01e9\5!\21\2\u01e9\u01ea\5\61\31\2\u01ea\u01eb\5-\27\2\u01eb\u01ec\5"+
		"/\30\2\u01ec\u0098\3\2\2\2\u01ed\u01ee\5\21\t\2\u01ee\u01ef\5#\22\2\u01ef"+
		"\u01f0\5\17\b\2\u01f0\u009a\3\2\2\2\u01f1\u01f2\4\62;\2\u01f2\u009c\3"+
		"\2\2\2\u01f3\u01f5\4\63;\2\u01f4\u01f6\5\u009bN\2\u01f5\u01f4\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u009e"+
		"\3\2\2\2\u01f9\u01fb\t\34\2\2\u01fa\u01f9\3\2\2\2\u01fb\u00a0\3\2\2\2"+
		"\u01fc\u0200\7$\2\2\u01fd\u01ff\n\35\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202"+
		"\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u020d\7$\2\2\u0204\u0208\7)\2\2\u0205\u0207\n\35"+
		"\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\7)"+
		"\2\2\u020c\u01fc\3\2\2\2\u020c\u0204\3\2\2\2\u020d\u00a2\3\2\2\2\u020e"+
		"\u0210\t\36\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3"+
		"\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\bR\2\2\u0214"+
		"\u00a4\3\2\2\2\n\2\u01da\u01f7\u01fa\u0200\u0208\u020c\u0211\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}