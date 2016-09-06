// Generated from SRL.g by ANTLR 4.5.2
package com.github.simpleregex.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STRING=4, CHAR=5, DIGIT=6, NUMBER=7, WHITESPACE=8, 
		A=9, B=10, C=11, D=12, E=13, F=14, G=15, H=16, I=17, J=18, K=19, L=20, 
		M=21, N=22, O=23, P=24, Q=25, R=26, S=27, T=28, U=29, V=30, W=31, X=32, 
		Y=33, Z=34, KEYW_FROM=35, KEYW_LITERALLY=36, KEYW_DIGIT=37, KEYW_LETTER=38, 
		KEYW_UPPERCASE=39, KEYW_OF=40, KEYW_ONE=41, KEYW_ANY=42, KEYW_NO=43, KEYW_CHARACTER=44, 
		KEYW_ANYHTING=45, KEYW_NEW=46, KEYW_LINE=47, KEYW_WHITESPACE=48, KEYW_TAB=49, 
		KEYW_RAW=50, KEYW_TO=51, KEYW_EXACTLY=52, KEYW_TIMES=53, KEYW_BETWEEN=54, 
		KEYW_AND=55, KEYW_OPTIONAL=56, KEYW_ONCE=57, KEYW_NEVER=58, KEYW_MORE=59, 
		KEYW_OR=60, KEYW_AT=61, KEYW_LEAST=62, KEYW_CAPTURE=63, KEYW_AS=64, KEYW_UNTIL=65, 
		KEYW_IF=66, KEYW_FOLLOWED=67, KEYW_BY=68, KEYW_NOT=69, KEYW_ALREADY=70, 
		KEYW_HAD=71, KEYW_CASE=72, KEYW_INSENSITIVE=73, KEYW_MULTI=74, KEYW_ALL=75, 
		KEYW_LAZY=76, KEYW_BEGINS=77, KEYW_STARTS=78, KEYW_WITH=79, KEYW_MUST=80, 
		KEYW_END=81;
	public static final int
		RULE_literally = 0, RULE_letter = 1, RULE_of = 2, RULE_character = 3, 
		RULE_provider = 4, RULE_specification = 5, RULE_exactly = 6, RULE_between = 7, 
		RULE_at_least = 8, RULE_or_more = 9, RULE_quantifier = 10, RULE_anchor = 11, 
		RULE_character_stmt = 12, RULE_if_stmt = 13, RULE_flag = 14, RULE_quantifiable_stmt = 15, 
		RULE_stmt = 16, RULE_stmts = 17, RULE_block = 18, RULE_capture = 19, RULE_any_of = 20, 
		RULE_group_stmt = 21, RULE_query = 22;
	public static final String[] ruleNames = {
		"literally", "letter", "of", "character", "provider", "specification", 
		"exactly", "between", "at_least", "or_more", "quantifier", "anchor", "character_stmt", 
		"if_stmt", "flag", "quantifiable_stmt", "stmt", "stmts", "block", "capture", 
		"any_of", "group_stmt", "query"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "STRING", "CHAR", "DIGIT", "NUMBER", "WHITESPACE", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "KEYW_FROM", 
		"KEYW_LITERALLY", "KEYW_DIGIT", "KEYW_LETTER", "KEYW_UPPERCASE", "KEYW_OF", 
		"KEYW_ONE", "KEYW_ANY", "KEYW_NO", "KEYW_CHARACTER", "KEYW_ANYHTING", 
		"KEYW_NEW", "KEYW_LINE", "KEYW_WHITESPACE", "KEYW_TAB", "KEYW_RAW", "KEYW_TO", 
		"KEYW_EXACTLY", "KEYW_TIMES", "KEYW_BETWEEN", "KEYW_AND", "KEYW_OPTIONAL", 
		"KEYW_ONCE", "KEYW_NEVER", "KEYW_MORE", "KEYW_OR", "KEYW_AT", "KEYW_LEAST", 
		"KEYW_CAPTURE", "KEYW_AS", "KEYW_UNTIL", "KEYW_IF", "KEYW_FOLLOWED", "KEYW_BY", 
		"KEYW_NOT", "KEYW_ALREADY", "KEYW_HAD", "KEYW_CASE", "KEYW_INSENSITIVE", 
		"KEYW_MULTI", "KEYW_ALL", "KEYW_LAZY", "KEYW_BEGINS", "KEYW_STARTS", "KEYW_WITH", 
		"KEYW_MUST", "KEYW_END"
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
	public String getGrammarFileName() { return "SRL.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SRLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiterallyContext extends ParserRuleContext {
		public TerminalNode KEYW_LITERALLY() { return getToken(SRLParser.KEYW_LITERALLY, 0); }
		public TerminalNode STRING() { return getToken(SRLParser.STRING, 0); }
		public LiterallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterLiterally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitLiterally(this);
		}
	}

	public final LiterallyContext literally() throws RecognitionException {
		LiterallyContext _localctx = new LiterallyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literally);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(KEYW_LITERALLY);
			setState(47);
			match(STRING);
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

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode KEYW_LETTER() { return getToken(SRLParser.KEYW_LETTER, 0); }
		public TerminalNode KEYW_UPPERCASE() { return getToken(SRLParser.KEYW_UPPERCASE, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitLetter(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if (_la==KEYW_UPPERCASE) {
				{
				setState(49);
				match(KEYW_UPPERCASE);
				}
			}

			setState(52);
			match(KEYW_LETTER);
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

	public static class OfContext extends ParserRuleContext {
		public TerminalNode KEYW_OF() { return getToken(SRLParser.KEYW_OF, 0); }
		public TerminalNode STRING() { return getToken(SRLParser.STRING, 0); }
		public TerminalNode KEYW_ONE() { return getToken(SRLParser.KEYW_ONE, 0); }
		public TerminalNode KEYW_ANY() { return getToken(SRLParser.KEYW_ANY, 0); }
		public OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitOf(this);
		}
	}

	public final OfContext of() throws RecognitionException {
		OfContext _localctx = new OfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_of);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==KEYW_ONE || _la==KEYW_ANY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(55);
			match(KEYW_OF);
			setState(56);
			match(STRING);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode KEYW_CHARACTER() { return getToken(SRLParser.KEYW_CHARACTER, 0); }
		public TerminalNode KEYW_ANY() { return getToken(SRLParser.KEYW_ANY, 0); }
		public TerminalNode KEYW_NO() { return getToken(SRLParser.KEYW_NO, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==KEYW_ANY || _la==KEYW_NO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(59);
			match(KEYW_CHARACTER);
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

	public static class ProviderContext extends ParserRuleContext {
		public LiterallyContext literally() {
			return getRuleContext(LiterallyContext.class,0);
		}
		public TerminalNode KEYW_DIGIT() { return getToken(SRLParser.KEYW_DIGIT, 0); }
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public OfContext of() {
			return getRuleContext(OfContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public TerminalNode KEYW_ANYHTING() { return getToken(SRLParser.KEYW_ANYHTING, 0); }
		public TerminalNode KEYW_NEW() { return getToken(SRLParser.KEYW_NEW, 0); }
		public TerminalNode KEYW_LINE() { return getToken(SRLParser.KEYW_LINE, 0); }
		public TerminalNode KEYW_WHITESPACE() { return getToken(SRLParser.KEYW_WHITESPACE, 0); }
		public TerminalNode KEYW_NO() { return getToken(SRLParser.KEYW_NO, 0); }
		public TerminalNode KEYW_TAB() { return getToken(SRLParser.KEYW_TAB, 0); }
		public TerminalNode KEYW_RAW() { return getToken(SRLParser.KEYW_RAW, 0); }
		public TerminalNode STRING() { return getToken(SRLParser.STRING, 0); }
		public ProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitProvider(this);
		}
	}

	public final ProviderContext provider() throws RecognitionException {
		ProviderContext _localctx = new ProviderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_provider);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				literally();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(KEYW_DIGIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				letter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				of();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				character();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				match(KEYW_ANYHTING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(KEYW_NEW);
				setState(68);
				match(KEYW_LINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				_la = _input.LA(1);
				if (_la==KEYW_NO) {
					{
					setState(69);
					match(KEYW_NO);
					}
				}

				setState(72);
				match(KEYW_WHITESPACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				match(KEYW_TAB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				match(KEYW_RAW);
				setState(75);
				match(STRING);
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

	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode KEYW_FROM() { return getToken(SRLParser.KEYW_FROM, 0); }
		public List<TerminalNode> CHAR() { return getTokens(SRLParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(SRLParser.CHAR, i);
		}
		public TerminalNode KEYW_TO() { return getToken(SRLParser.KEYW_TO, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(SRLParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SRLParser.DIGIT, i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specification);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(KEYW_FROM);
				setState(79);
				match(CHAR);
				setState(80);
				match(KEYW_TO);
				setState(81);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(KEYW_FROM);
				setState(83);
				match(DIGIT);
				setState(84);
				match(KEYW_TO);
				setState(85);
				match(DIGIT);
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

	public static class ExactlyContext extends ParserRuleContext {
		public TerminalNode KEYW_EXACTLY() { return getToken(SRLParser.KEYW_EXACTLY, 0); }
		public TerminalNode DIGIT() { return getToken(SRLParser.DIGIT, 0); }
		public TerminalNode KEYW_TIMES() { return getToken(SRLParser.KEYW_TIMES, 0); }
		public ExactlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exactly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterExactly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitExactly(this);
		}
	}

	public final ExactlyContext exactly() throws RecognitionException {
		ExactlyContext _localctx = new ExactlyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(KEYW_EXACTLY);
			setState(89);
			match(DIGIT);
			setState(90);
			match(KEYW_TIMES);
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

	public static class BetweenContext extends ParserRuleContext {
		public TerminalNode KEYW_BETWEEN() { return getToken(SRLParser.KEYW_BETWEEN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(SRLParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SRLParser.DIGIT, i);
		}
		public TerminalNode KEYW_AND() { return getToken(SRLParser.KEYW_AND, 0); }
		public TerminalNode KEYW_TIMES() { return getToken(SRLParser.KEYW_TIMES, 0); }
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitBetween(this);
		}
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(KEYW_BETWEEN);
			setState(93);
			match(DIGIT);
			setState(94);
			match(KEYW_AND);
			setState(95);
			match(DIGIT);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(96);
				match(KEYW_TIMES);
				}
				break;
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

	public static class At_leastContext extends ParserRuleContext {
		public TerminalNode KEYW_AT() { return getToken(SRLParser.KEYW_AT, 0); }
		public TerminalNode KEYW_LEAST() { return getToken(SRLParser.KEYW_LEAST, 0); }
		public TerminalNode DIGIT() { return getToken(SRLParser.DIGIT, 0); }
		public TerminalNode KEYW_TIMES() { return getToken(SRLParser.KEYW_TIMES, 0); }
		public At_leastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at_least; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterAt_least(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitAt_least(this);
		}
	}

	public final At_leastContext at_least() throws RecognitionException {
		At_leastContext _localctx = new At_leastContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_at_least);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(KEYW_AT);
			setState(100);
			match(KEYW_LEAST);
			setState(101);
			match(DIGIT);
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(102);
				match(KEYW_TIMES);
				}
				break;
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

	public static class Or_moreContext extends ParserRuleContext {
		public TerminalNode KEYW_OR() { return getToken(SRLParser.KEYW_OR, 0); }
		public TerminalNode KEYW_MORE() { return getToken(SRLParser.KEYW_MORE, 0); }
		public TerminalNode KEYW_ONCE() { return getToken(SRLParser.KEYW_ONCE, 0); }
		public TerminalNode KEYW_NEVER() { return getToken(SRLParser.KEYW_NEVER, 0); }
		public Or_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterOr_more(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitOr_more(this);
		}
	}

	public final Or_moreContext or_more() throws RecognitionException {
		Or_moreContext _localctx = new Or_moreContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_or_more);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==KEYW_ONCE || _la==KEYW_NEVER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(106);
			match(KEYW_OR);
			setState(107);
			match(KEYW_MORE);
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

	public static class QuantifierContext extends ParserRuleContext {
		public ExactlyContext exactly() {
			return getRuleContext(ExactlyContext.class,0);
		}
		public BetweenContext between() {
			return getRuleContext(BetweenContext.class,0);
		}
		public TerminalNode KEYW_OPTIONAL() { return getToken(SRLParser.KEYW_OPTIONAL, 0); }
		public At_leastContext at_least() {
			return getRuleContext(At_leastContext.class,0);
		}
		public Or_moreContext or_more() {
			return getRuleContext(Or_moreContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quantifier);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case KEYW_EXACTLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				exactly();
				}
				break;
			case KEYW_BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				between();
				}
				break;
			case KEYW_OPTIONAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(KEYW_OPTIONAL);
				}
				break;
			case KEYW_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				at_least();
				}
				break;
			case KEYW_ONCE:
			case KEYW_NEVER:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				or_more();
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

	public static class AnchorContext extends ParserRuleContext {
		public TerminalNode KEYW_WITH() { return getToken(SRLParser.KEYW_WITH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KEYW_BEGINS() { return getToken(SRLParser.KEYW_BEGINS, 0); }
		public TerminalNode KEYW_STARTS() { return getToken(SRLParser.KEYW_STARTS, 0); }
		public TerminalNode KEYW_MUST() { return getToken(SRLParser.KEYW_MUST, 0); }
		public TerminalNode KEYW_END() { return getToken(SRLParser.KEYW_END, 0); }
		public AnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitAnchor(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_anchor);
		int _la;
		try {
			setState(121);
			switch (_input.LA(1)) {
			case KEYW_BEGINS:
			case KEYW_STARTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==KEYW_BEGINS || _la==KEYW_STARTS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(117);
				match(KEYW_WITH);
				setState(118);
				block();
				}
				break;
			case KEYW_MUST:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(KEYW_MUST);
				setState(120);
				match(KEYW_END);
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

	public static class Character_stmtContext extends ParserRuleContext {
		public ProviderContext provider() {
			return getRuleContext(ProviderContext.class,0);
		}
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public Character_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterCharacter_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitCharacter_stmt(this);
		}
	}

	public final Character_stmtContext character_stmt() throws RecognitionException {
		Character_stmtContext _localctx = new Character_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_character_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			provider();
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(124);
				specification();
				}
				break;
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode KEYW_IF() { return getToken(SRLParser.KEYW_IF, 0); }
		public TerminalNode KEYW_FOLLOWED() { return getToken(SRLParser.KEYW_FOLLOWED, 0); }
		public TerminalNode KEYW_BY() { return getToken(SRLParser.KEYW_BY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KEYW_ALREADY() { return getToken(SRLParser.KEYW_ALREADY, 0); }
		public TerminalNode KEYW_HAD() { return getToken(SRLParser.KEYW_HAD, 0); }
		public TerminalNode KEYW_NOT() { return getToken(SRLParser.KEYW_NOT, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(KEYW_IF);
			setState(129);
			_la = _input.LA(1);
			if (_la==KEYW_NOT) {
				{
				setState(128);
				match(KEYW_NOT);
				}
			}

			setState(137);
			switch (_input.LA(1)) {
			case KEYW_FOLLOWED:
				{
				setState(131);
				match(KEYW_FOLLOWED);
				setState(132);
				match(KEYW_BY);
				setState(133);
				block();
				}
				break;
			case KEYW_ALREADY:
				{
				setState(134);
				match(KEYW_ALREADY);
				setState(135);
				match(KEYW_HAD);
				setState(136);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FlagContext extends ParserRuleContext {
		public TerminalNode KEYW_CASE() { return getToken(SRLParser.KEYW_CASE, 0); }
		public TerminalNode KEYW_INSENSITIVE() { return getToken(SRLParser.KEYW_INSENSITIVE, 0); }
		public TerminalNode KEYW_MULTI() { return getToken(SRLParser.KEYW_MULTI, 0); }
		public TerminalNode KEYW_LINE() { return getToken(SRLParser.KEYW_LINE, 0); }
		public TerminalNode KEYW_ALL() { return getToken(SRLParser.KEYW_ALL, 0); }
		public TerminalNode KEYW_LAZY() { return getToken(SRLParser.KEYW_LAZY, 0); }
		public FlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterFlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitFlag(this);
		}
	}

	public final FlagContext flag() throws RecognitionException {
		FlagContext _localctx = new FlagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_flag);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case KEYW_CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(KEYW_CASE);
				setState(140);
				match(KEYW_INSENSITIVE);
				}
				break;
			case KEYW_MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(KEYW_MULTI);
				setState(142);
				match(KEYW_LINE);
				}
				break;
			case KEYW_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(KEYW_ALL);
				setState(144);
				match(KEYW_LAZY);
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

	public static class Quantifiable_stmtContext extends ParserRuleContext {
		public Character_stmtContext character_stmt() {
			return getRuleContext(Character_stmtContext.class,0);
		}
		public Group_stmtContext group_stmt() {
			return getRuleContext(Group_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Quantifiable_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiable_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterQuantifiable_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitQuantifiable_stmt(this);
		}
	}

	public final Quantifiable_stmtContext quantifiable_stmt() throws RecognitionException {
		Quantifiable_stmtContext _localctx = new Quantifiable_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quantifiable_stmt);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				character_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				group_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(T__0);
				setState(151);
				stmt(0);
				setState(152);
				match(T__1);
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

	public static class StmtContext extends ParserRuleContext {
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
		}
		public Quantifiable_stmtContext quantifiable_stmt() {
			return getRuleContext(Quantifiable_stmtContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			switch (_input.LA(1)) {
			case KEYW_CASE:
			case KEYW_MULTI:
			case KEYW_ALL:
				{
				setState(157);
				flag();
				}
				break;
			case KEYW_BEGINS:
			case KEYW_STARTS:
			case KEYW_MUST:
				{
				setState(158);
				anchor();
				}
				break;
			case T__0:
			case KEYW_LITERALLY:
			case KEYW_DIGIT:
			case KEYW_LETTER:
			case KEYW_UPPERCASE:
			case KEYW_ONE:
			case KEYW_ANY:
			case KEYW_NO:
			case KEYW_ANYHTING:
			case KEYW_NEW:
			case KEYW_WHITESPACE:
			case KEYW_TAB:
			case KEYW_RAW:
			case KEYW_CAPTURE:
			case KEYW_IF:
				{
				setState(159);
				quantifiable_stmt();
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(160);
					quantifier();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmt);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					if_stmt();
					}
					} 
				}
				setState(171);
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			stmt(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << KEYW_LITERALLY) | (1L << KEYW_DIGIT) | (1L << KEYW_LETTER) | (1L << KEYW_UPPERCASE) | (1L << KEYW_ONE) | (1L << KEYW_ANY) | (1L << KEYW_NO) | (1L << KEYW_ANYHTING) | (1L << KEYW_NEW) | (1L << KEYW_WHITESPACE) | (1L << KEYW_TAB) | (1L << KEYW_RAW) | (1L << KEYW_CAPTURE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEYW_IF - 66)) | (1L << (KEYW_CASE - 66)) | (1L << (KEYW_MULTI - 66)) | (1L << (KEYW_ALL - 66)) | (1L << (KEYW_BEGINS - 66)) | (1L << (KEYW_STARTS - 66)) | (1L << (KEYW_MUST - 66)))) != 0)) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(173);
					match(T__2);
					}
				}

				setState(176);
				stmt(0);
				}
				}
				setState(181);
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

	public static class BlockContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SRLParser.STRING, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__0);
				setState(183);
				stmts();
				setState(184);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				stmt(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(STRING);
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

	public static class CaptureContext extends ParserRuleContext {
		public TerminalNode KEYW_CAPTURE() { return getToken(SRLParser.KEYW_CAPTURE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode KEYW_AS() { return getToken(SRLParser.KEYW_AS, 0); }
		public TerminalNode STRING() { return getToken(SRLParser.STRING, 0); }
		public TerminalNode KEYW_UNTIL() { return getToken(SRLParser.KEYW_UNTIL, 0); }
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(KEYW_CAPTURE);
			setState(191);
			block();
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(192);
				match(KEYW_AS);
				setState(193);
				match(STRING);
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(196);
				match(KEYW_UNTIL);
				setState(197);
				block();
				}
				break;
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

	public static class Any_ofContext extends ParserRuleContext {
		public TerminalNode KEYW_ANY() { return getToken(SRLParser.KEYW_ANY, 0); }
		public TerminalNode KEYW_OF() { return getToken(SRLParser.KEYW_OF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Any_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterAny_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitAny_of(this);
		}
	}

	public final Any_ofContext any_of() throws RecognitionException {
		Any_ofContext _localctx = new Any_ofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_any_of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(KEYW_ANY);
			setState(201);
			match(KEYW_OF);
			setState(202);
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

	public static class Group_stmtContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public Any_ofContext any_of() {
			return getRuleContext(Any_ofContext.class,0);
		}
		public Group_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterGroup_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitGroup_stmt(this);
		}
	}

	public final Group_stmtContext group_stmt() throws RecognitionException {
		Group_stmtContext _localctx = new Group_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_group_stmt);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case KEYW_CAPTURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				capture();
				}
				break;
			case KEYW_ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				any_of();
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

	public static class QueryContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SRLParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRLListener ) ((SRLListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			stmts();
			setState(209);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\5\3\65\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\td\n\t"+
		"\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"u\n\f\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\5\16\u0080\n\16\3\17\3\17"+
		"\5\17\u0084\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0094\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u009d\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a4\n\22\5\22\u00a6"+
		"\n\22\3\22\3\22\7\22\u00aa\n\22\f\22\16\22\u00ad\13\22\3\23\3\23\5\23"+
		"\u00b1\n\23\3\23\7\23\u00b4\n\23\f\23\16\23\u00b7\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00bf\n\24\3\25\3\25\3\25\3\25\5\25\u00c5\n\25\3"+
		"\25\3\25\5\25\u00c9\n\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00d1\n\27"+
		"\3\30\3\30\3\30\3\30\2\3\"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\2\6\3\2+,\3\2,-\3\2;<\3\2OP\u00e4\2\60\3\2\2\2\4\64\3\2\2\2\6"+
		"8\3\2\2\2\b<\3\2\2\2\nN\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22"+
		"e\3\2\2\2\24k\3\2\2\2\26t\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\u0081\3\2"+
		"\2\2\36\u0093\3\2\2\2 \u009c\3\2\2\2\"\u00a5\3\2\2\2$\u00ae\3\2\2\2&\u00be"+
		"\3\2\2\2(\u00c0\3\2\2\2*\u00ca\3\2\2\2,\u00d0\3\2\2\2.\u00d2\3\2\2\2\60"+
		"\61\7&\2\2\61\62\7\6\2\2\62\3\3\2\2\2\63\65\7)\2\2\64\63\3\2\2\2\64\65"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\7(\2\2\67\5\3\2\2\289\t\2\2\29:\7*\2\2:;"+
		"\7\6\2\2;\7\3\2\2\2<=\t\3\2\2=>\7.\2\2>\t\3\2\2\2?O\5\2\2\2@O\7\'\2\2"+
		"AO\5\4\3\2BO\5\6\4\2CO\5\b\5\2DO\7/\2\2EF\7\60\2\2FO\7\61\2\2GI\7-\2\2"+
		"HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JO\7\62\2\2KO\7\63\2\2LM\7\64\2\2MO\7\6"+
		"\2\2N?\3\2\2\2N@\3\2\2\2NA\3\2\2\2NB\3\2\2\2NC\3\2\2\2ND\3\2\2\2NE\3\2"+
		"\2\2NH\3\2\2\2NK\3\2\2\2NL\3\2\2\2O\13\3\2\2\2PQ\7%\2\2QR\7\7\2\2RS\7"+
		"\65\2\2SY\7\7\2\2TU\7%\2\2UV\7\b\2\2VW\7\65\2\2WY\7\b\2\2XP\3\2\2\2XT"+
		"\3\2\2\2Y\r\3\2\2\2Z[\7\66\2\2[\\\7\b\2\2\\]\7\67\2\2]\17\3\2\2\2^_\7"+
		"8\2\2_`\7\b\2\2`a\79\2\2ac\7\b\2\2bd\7\67\2\2cb\3\2\2\2cd\3\2\2\2d\21"+
		"\3\2\2\2ef\7?\2\2fg\7@\2\2gi\7\b\2\2hj\7\67\2\2ih\3\2\2\2ij\3\2\2\2j\23"+
		"\3\2\2\2kl\t\4\2\2lm\7>\2\2mn\7=\2\2n\25\3\2\2\2ou\5\16\b\2pu\5\20\t\2"+
		"qu\7:\2\2ru\5\22\n\2su\5\24\13\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2"+
		"\2ts\3\2\2\2u\27\3\2\2\2vw\t\5\2\2wx\7Q\2\2x|\5&\24\2yz\7R\2\2z|\7S\2"+
		"\2{v\3\2\2\2{y\3\2\2\2|\31\3\2\2\2}\177\5\n\6\2~\u0080\5\f\7\2\177~\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\33\3\2\2\2\u0081\u0083\7D\2\2\u0082\u0084"+
		"\7G\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008b\3\2\2\2\u0085"+
		"\u0086\7E\2\2\u0086\u0087\7F\2\2\u0087\u008c\5&\24\2\u0088\u0089\7H\2"+
		"\2\u0089\u008a\7I\2\2\u008a\u008c\5&\24\2\u008b\u0085\3\2\2\2\u008b\u0088"+
		"\3\2\2\2\u008c\35\3\2\2\2\u008d\u008e\7J\2\2\u008e\u0094\7K\2\2\u008f"+
		"\u0090\7L\2\2\u0090\u0094\7\61\2\2\u0091\u0092\7M\2\2\u0092\u0094\7N\2"+
		"\2\u0093\u008d\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094\37"+
		"\3\2\2\2\u0095\u009d\5\32\16\2\u0096\u009d\5,\27\2\u0097\u009d\5\34\17"+
		"\2\u0098\u0099\7\3\2\2\u0099\u009a\5\"\22\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2"+
		"\2\2\u009c\u0098\3\2\2\2\u009d!\3\2\2\2\u009e\u009f\b\22\1\2\u009f\u00a6"+
		"\5\36\20\2\u00a0\u00a6\5\30\r\2\u00a1\u00a3\5 \21\2\u00a2\u00a4\5\26\f"+
		"\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009e"+
		"\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00ab\3\2\2\2\u00a7"+
		"\u00a8\f\4\2\2\u00a8\u00aa\5\34\17\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac#\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b5\5\"\22\2\u00af\u00b1\7\5\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5\"\22\2\u00b3\u00b0"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"%\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba\5$\23\2"+
		"\u00ba\u00bb\7\4\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00bf\5\"\22\2\u00bd\u00bf"+
		"\7\6\2\2\u00be\u00b8\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\'\3\2\2\2\u00c0\u00c1\7A\2\2\u00c1\u00c4\5&\24\2\u00c2\u00c3\7B\2\2\u00c3"+
		"\u00c5\7\6\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c9\5&\24\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9)\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cc\7*\2\2\u00cc"+
		"\u00cd\5&\24\2\u00cd+\3\2\2\2\u00ce\u00d1\5(\25\2\u00cf\u00d1\5*\26\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1-\3\2\2\2\u00d2\u00d3\5"+
		"$\23\2\u00d3\u00d4\7\2\2\3\u00d4/\3\2\2\2\30\64HNXcit{\177\u0083\u008b"+
		"\u0093\u009c\u00a3\u00a5\u00ab\u00b0\u00b5\u00be\u00c4\u00c8\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}