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
		RULE_character = 0, RULE_specification = 1, RULE_quantifier = 2, RULE_anchor = 3, 
		RULE_character_stmt = 4, RULE_if_stmt = 5, RULE_flag = 6, RULE_quantifiable_stmt = 7, 
		RULE_stmt = 8, RULE_stmts = 9, RULE_block = 10, RULE_group_stmt = 11, 
		RULE_query = 12;
	public static final String[] ruleNames = {
		"character", "specification", "quantifier", "anchor", "character_stmt", 
		"if_stmt", "flag", "quantifiable_stmt", "stmt", "stmts", "block", "group_stmt", 
		"query"
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
	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode KEYW_LITERALLY() { return getToken(SRLParser.KEYW_LITERALLY, 0); }
		public TerminalNode STRING() { return getToken(SRLParser.STRING, 0); }
		public TerminalNode KEYW_UPPERCASE() { return getToken(SRLParser.KEYW_UPPERCASE, 0); }
		public TerminalNode KEYW_DIGIT() { return getToken(SRLParser.KEYW_DIGIT, 0); }
		public TerminalNode KEYW_LETTER() { return getToken(SRLParser.KEYW_LETTER, 0); }
		public TerminalNode KEYW_OF() { return getToken(SRLParser.KEYW_OF, 0); }
		public TerminalNode KEYW_ONE() { return getToken(SRLParser.KEYW_ONE, 0); }
		public TerminalNode KEYW_ANY() { return getToken(SRLParser.KEYW_ANY, 0); }
		public TerminalNode KEYW_CHARACTER() { return getToken(SRLParser.KEYW_CHARACTER, 0); }
		public TerminalNode KEYW_NO() { return getToken(SRLParser.KEYW_NO, 0); }
		public TerminalNode KEYW_ANYHTING() { return getToken(SRLParser.KEYW_ANYHTING, 0); }
		public TerminalNode KEYW_NEW() { return getToken(SRLParser.KEYW_NEW, 0); }
		public TerminalNode KEYW_LINE() { return getToken(SRLParser.KEYW_LINE, 0); }
		public TerminalNode KEYW_WHITESPACE() { return getToken(SRLParser.KEYW_WHITESPACE, 0); }
		public TerminalNode KEYW_TAB() { return getToken(SRLParser.KEYW_TAB, 0); }
		public TerminalNode KEYW_RAW() { return getToken(SRLParser.KEYW_RAW, 0); }
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
		enterRule(_localctx, 0, RULE_character);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				_la = _input.LA(1);
				if (_la==KEYW_UPPERCASE) {
					{
					setState(26);
					match(KEYW_UPPERCASE);
					}
				}

				setState(29);
				match(KEYW_LITERALLY);
				setState(30);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(KEYW_DIGIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				_la = _input.LA(1);
				if (_la==KEYW_UPPERCASE) {
					{
					setState(32);
					match(KEYW_UPPERCASE);
					}
				}

				setState(35);
				match(KEYW_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ONE || _la==KEYW_ANY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(37);
				match(KEYW_OF);
				setState(38);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ANY || _la==KEYW_NO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(40);
				match(KEYW_CHARACTER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				match(KEYW_ANYHTING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				match(KEYW_NEW);
				setState(43);
				match(KEYW_LINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				_la = _input.LA(1);
				if (_la==KEYW_NO) {
					{
					setState(44);
					match(KEYW_NO);
					}
				}

				setState(47);
				match(KEYW_WHITESPACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				match(KEYW_TAB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(49);
				match(KEYW_RAW);
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
		enterRule(_localctx, 2, RULE_specification);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(KEYW_FROM);
				setState(53);
				match(CHAR);
				setState(54);
				match(KEYW_TO);
				setState(55);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(KEYW_FROM);
				setState(57);
				match(DIGIT);
				setState(58);
				match(KEYW_TO);
				setState(59);
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode KEYW_EXACTLY() { return getToken(SRLParser.KEYW_EXACTLY, 0); }
		public TerminalNode DIGIT() { return getToken(SRLParser.DIGIT, 0); }
		public TerminalNode KEYW_TIMES() { return getToken(SRLParser.KEYW_TIMES, 0); }
		public TerminalNode KEYW_BETWEEN() { return getToken(SRLParser.KEYW_BETWEEN, 0); }
		public TerminalNode KEYW_AND() { return getToken(SRLParser.KEYW_AND, 0); }
		public TerminalNode NUMBER() { return getToken(SRLParser.NUMBER, 0); }
		public TerminalNode KEYW_OPTIONAL() { return getToken(SRLParser.KEYW_OPTIONAL, 0); }
		public TerminalNode KEYW_AT() { return getToken(SRLParser.KEYW_AT, 0); }
		public TerminalNode KEYW_LEAST() { return getToken(SRLParser.KEYW_LEAST, 0); }
		public TerminalNode KEYW_OR() { return getToken(SRLParser.KEYW_OR, 0); }
		public TerminalNode KEYW_MORE() { return getToken(SRLParser.KEYW_MORE, 0); }
		public TerminalNode KEYW_ONCE() { return getToken(SRLParser.KEYW_ONCE, 0); }
		public TerminalNode KEYW_NEVER() { return getToken(SRLParser.KEYW_NEVER, 0); }
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
		enterRule(_localctx, 4, RULE_quantifier);
		int _la;
		try {
			setState(82);
			switch (_input.LA(1)) {
			case KEYW_EXACTLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(KEYW_EXACTLY);
				setState(63);
				match(DIGIT);
				setState(64);
				match(KEYW_TIMES);
				}
				break;
			case KEYW_BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(KEYW_BETWEEN);
				setState(66);
				match(DIGIT);
				setState(67);
				match(KEYW_AND);
				setState(68);
				match(NUMBER);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(69);
					match(KEYW_TIMES);
					}
					break;
				}
				}
				break;
			case KEYW_OPTIONAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(KEYW_OPTIONAL);
				}
				break;
			case KEYW_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(KEYW_AT);
				setState(74);
				match(KEYW_LEAST);
				setState(75);
				match(DIGIT);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(76);
					match(KEYW_TIMES);
					}
					break;
				}
				}
				break;
			case KEYW_ONCE:
			case KEYW_NEVER:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ONCE || _la==KEYW_NEVER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(80);
				match(KEYW_OR);
				setState(81);
				match(KEYW_MORE);
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
		enterRule(_localctx, 6, RULE_anchor);
		int _la;
		try {
			setState(89);
			switch (_input.LA(1)) {
			case KEYW_BEGINS:
			case KEYW_STARTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==KEYW_BEGINS || _la==KEYW_STARTS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(85);
				match(KEYW_WITH);
				setState(86);
				block();
				}
				break;
			case KEYW_MUST:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(KEYW_MUST);
				setState(88);
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
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
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
		enterRule(_localctx, 8, RULE_character_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			character();
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(92);
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
		enterRule(_localctx, 10, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(KEYW_IF);
			setState(97);
			_la = _input.LA(1);
			if (_la==KEYW_NOT) {
				{
				setState(96);
				match(KEYW_NOT);
				}
			}

			setState(105);
			switch (_input.LA(1)) {
			case KEYW_FOLLOWED:
				{
				setState(99);
				match(KEYW_FOLLOWED);
				setState(100);
				match(KEYW_BY);
				setState(101);
				block();
				}
				break;
			case KEYW_ALREADY:
				{
				setState(102);
				match(KEYW_ALREADY);
				setState(103);
				match(KEYW_HAD);
				setState(104);
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
		enterRule(_localctx, 12, RULE_flag);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case KEYW_CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(KEYW_CASE);
				setState(108);
				match(KEYW_INSENSITIVE);
				}
				break;
			case KEYW_MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(KEYW_MULTI);
				setState(110);
				match(KEYW_LINE);
				}
				break;
			case KEYW_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(KEYW_ALL);
				setState(112);
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
		enterRule(_localctx, 14, RULE_quantifiable_stmt);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				character_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				group_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__0);
				setState(119);
				stmt(0);
				setState(120);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			switch (_input.LA(1)) {
			case KEYW_CASE:
			case KEYW_MULTI:
			case KEYW_ALL:
				{
				setState(125);
				flag();
				}
				break;
			case KEYW_BEGINS:
			case KEYW_STARTS:
			case KEYW_MUST:
				{
				setState(126);
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
				setState(127);
				quantifiable_stmt();
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(128);
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
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmt);
					setState(133);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(134);
					if_stmt();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 18, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			stmt(0);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << KEYW_LITERALLY) | (1L << KEYW_DIGIT) | (1L << KEYW_LETTER) | (1L << KEYW_UPPERCASE) | (1L << KEYW_ONE) | (1L << KEYW_ANY) | (1L << KEYW_NO) | (1L << KEYW_ANYHTING) | (1L << KEYW_NEW) | (1L << KEYW_WHITESPACE) | (1L << KEYW_TAB) | (1L << KEYW_RAW) | (1L << KEYW_CAPTURE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEYW_IF - 66)) | (1L << (KEYW_CASE - 66)) | (1L << (KEYW_MULTI - 66)) | (1L << (KEYW_ALL - 66)) | (1L << (KEYW_BEGINS - 66)) | (1L << (KEYW_STARTS - 66)) | (1L << (KEYW_MUST - 66)))) != 0)) {
				{
				{
				setState(142);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(141);
					match(T__2);
					}
				}

				setState(144);
				stmt(0);
				}
				}
				setState(149);
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
		enterRule(_localctx, 20, RULE_block);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__0);
				setState(151);
				stmts();
				setState(152);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				stmt(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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

	public static class Group_stmtContext extends ParserRuleContext {
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
		public TerminalNode KEYW_ANY() { return getToken(SRLParser.KEYW_ANY, 0); }
		public TerminalNode KEYW_OF() { return getToken(SRLParser.KEYW_OF, 0); }
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
		enterRule(_localctx, 22, RULE_group_stmt);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case KEYW_CAPTURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(KEYW_CAPTURE);
				setState(159);
				block();
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(160);
					match(KEYW_AS);
					setState(161);
					match(STRING);
					}
					break;
				}
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(164);
					match(KEYW_UNTIL);
					setState(165);
					block();
					}
					break;
				}
				}
				break;
			case KEYW_ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(KEYW_ANY);
				setState(169);
				match(KEYW_OF);
				setState(170);
				block();
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
		enterRule(_localctx, 24, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			stmts();
			setState(174);
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
		case 8:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\3\2\3\2\3\2\5\2$\n\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\2\3\2\3\2\5\2\65"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\3\4\3\4\5\4U\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\5\6`\n\6\3\7\3\7\5\7d\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0084\n\n\5\n\u0086"+
		"\n\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3\13\3\13\5\13\u0091\n"+
		"\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u009f\n\f\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\5\r\u00a9\n\r\3"+
		"\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3\16\3\16\2\3\22\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\6\3\2+,\3\2,-\3\2;<\3\2OP\u00cc\2\64\3\2\2\2\4>\3"+
		"\2\2\2\6T\3\2\2\2\b[\3\2\2\2\n]\3\2\2\2\fa\3\2\2\2\16s\3\2\2\2\20|\3\2"+
		"\2\2\22\u0085\3\2\2\2\24\u008e\3\2\2\2\26\u009e\3\2\2\2\30\u00ad\3\2\2"+
		"\2\32\u00af\3\2\2\2\34\36\7)\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37\3\2"+
		"\2\2\37 \7&\2\2 \65\7\6\2\2!\65\7\'\2\2\"$\7)\2\2#\"\3\2\2\2#$\3\2\2\2"+
		"$%\3\2\2\2%\65\7(\2\2&\'\t\2\2\2\'(\7*\2\2(\65\7\6\2\2)*\t\3\2\2*\65\7"+
		".\2\2+\65\7/\2\2,-\7\60\2\2-\65\7\61\2\2.\60\7-\2\2/.\3\2\2\2/\60\3\2"+
		"\2\2\60\61\3\2\2\2\61\65\7\62\2\2\62\65\7\63\2\2\63\65\7\64\2\2\64\35"+
		"\3\2\2\2\64!\3\2\2\2\64#\3\2\2\2\64&\3\2\2\2\64)\3\2\2\2\64+\3\2\2\2\64"+
		",\3\2\2\2\64/\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\3\3\2\2\2\66\67\7"+
		"%\2\2\678\7\7\2\289\7\65\2\29?\7\7\2\2:;\7%\2\2;<\7\b\2\2<=\7\65\2\2="+
		"?\7\b\2\2>\66\3\2\2\2>:\3\2\2\2?\5\3\2\2\2@A\7\66\2\2AB\7\b\2\2BU\7\67"+
		"\2\2CD\78\2\2DE\7\b\2\2EF\79\2\2FH\7\t\2\2GI\7\67\2\2HG\3\2\2\2HI\3\2"+
		"\2\2IU\3\2\2\2JU\7:\2\2KL\7?\2\2LM\7@\2\2MO\7\b\2\2NP\7\67\2\2ON\3\2\2"+
		"\2OP\3\2\2\2PU\3\2\2\2QR\t\4\2\2RS\7>\2\2SU\7=\2\2T@\3\2\2\2TC\3\2\2\2"+
		"TJ\3\2\2\2TK\3\2\2\2TQ\3\2\2\2U\7\3\2\2\2VW\t\5\2\2WX\7Q\2\2X\\\5\26\f"+
		"\2YZ\7R\2\2Z\\\7S\2\2[V\3\2\2\2[Y\3\2\2\2\\\t\3\2\2\2]_\5\2\2\2^`\5\4"+
		"\3\2_^\3\2\2\2_`\3\2\2\2`\13\3\2\2\2ac\7D\2\2bd\7G\2\2cb\3\2\2\2cd\3\2"+
		"\2\2dk\3\2\2\2ef\7E\2\2fg\7F\2\2gl\5\26\f\2hi\7H\2\2ij\7I\2\2jl\5\26\f"+
		"\2ke\3\2\2\2kh\3\2\2\2l\r\3\2\2\2mn\7J\2\2nt\7K\2\2op\7L\2\2pt\7\61\2"+
		"\2qr\7M\2\2rt\7N\2\2sm\3\2\2\2so\3\2\2\2sq\3\2\2\2t\17\3\2\2\2u}\5\n\6"+
		"\2v}\5\30\r\2w}\5\f\7\2xy\7\3\2\2yz\5\22\n\2z{\7\4\2\2{}\3\2\2\2|u\3\2"+
		"\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2}\21\3\2\2\2~\177\b\n\1\2\177\u0086"+
		"\5\16\b\2\u0080\u0086\5\b\5\2\u0081\u0083\5\20\t\2\u0082\u0084\5\6\4\2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085~\3"+
		"\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0086\u008b\3\2\2\2\u0087"+
		"\u0088\f\4\2\2\u0088\u008a\5\f\7\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\23\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008e\u0095\5\22\n\2\u008f\u0091\7\5\2\2\u0090\u008f\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\5\22\n\2\u0093\u0090"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\25\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\3\2\2\u0099\u009a\5\24\13"+
		"\2\u009a\u009b\7\4\2\2\u009b\u009f\3\2\2\2\u009c\u009f\5\22\n\2\u009d"+
		"\u009f\7\6\2\2\u009e\u0098\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7A\2\2\u00a1\u00a4\5\26\f\2\u00a2\u00a3"+
		"\7B\2\2\u00a3\u00a5\7\6\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a7\7C\2\2\u00a7\u00a9\5\26\f\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab"+
		"\u00ac\7*\2\2\u00ac\u00ae\5\26\f\2\u00ad\u00a0\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ae\31\3\2\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\7\2\2\3\u00b1"+
		"\33\3\2\2\2\31\35#/\64>HOT[_cks|\u0083\u0085\u008b\u0090\u0095\u009e\u00a4"+
		"\u00a8\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}