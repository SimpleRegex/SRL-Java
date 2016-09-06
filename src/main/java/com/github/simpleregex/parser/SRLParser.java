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
		RULE_character_stmt = 4, RULE_if_stmt = 5, RULE_flag = 6, RULE_stmt = 7, 
		RULE_stmts = 8, RULE_block = 9, RULE_group_stmt = 10, RULE_query = 11;
	public static final String[] ruleNames = {
		"character", "specification", "quantifier", "anchor", "character_stmt", 
		"if_stmt", "flag", "stmt", "stmts", "block", "group_stmt", "query"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_character);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				_la = _input.LA(1);
				if (_la==KEYW_UPPERCASE) {
					{
					setState(24);
					match(KEYW_UPPERCASE);
					}
				}

				setState(27);
				match(KEYW_LITERALLY);
				setState(28);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(KEYW_DIGIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				_la = _input.LA(1);
				if (_la==KEYW_UPPERCASE) {
					{
					setState(30);
					match(KEYW_UPPERCASE);
					}
				}

				setState(33);
				match(KEYW_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ONE || _la==KEYW_ANY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(35);
				match(KEYW_OF);
				setState(36);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ANY || _la==KEYW_NO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(38);
				match(KEYW_CHARACTER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				match(KEYW_ANYHTING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				match(KEYW_NEW);
				setState(41);
				match(KEYW_LINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				_la = _input.LA(1);
				if (_la==KEYW_NO) {
					{
					setState(42);
					match(KEYW_NO);
					}
				}

				setState(45);
				match(KEYW_WHITESPACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				match(KEYW_TAB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_specification);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(KEYW_FROM);
				setState(51);
				match(CHAR);
				setState(52);
				match(KEYW_TO);
				setState(53);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(KEYW_FROM);
				setState(55);
				match(DIGIT);
				setState(56);
				match(KEYW_TO);
				setState(57);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quantifier);
		int _la;
		try {
			setState(80);
			switch (_input.LA(1)) {
			case KEYW_EXACTLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(KEYW_EXACTLY);
				setState(61);
				match(DIGIT);
				setState(62);
				match(KEYW_TIMES);
				}
				break;
			case KEYW_BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(KEYW_BETWEEN);
				setState(64);
				match(DIGIT);
				setState(65);
				match(KEYW_AND);
				setState(66);
				match(NUMBER);
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(67);
					match(KEYW_TIMES);
					}
					break;
				}
				}
				break;
			case KEYW_OPTIONAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(KEYW_OPTIONAL);
				}
				break;
			case KEYW_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(KEYW_AT);
				setState(72);
				match(KEYW_LEAST);
				setState(73);
				match(DIGIT);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(74);
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
				setState(77);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ONCE || _la==KEYW_NEVER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(78);
				match(KEYW_OR);
				setState(79);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anchor);
		int _la;
		try {
			setState(87);
			switch (_input.LA(1)) {
			case KEYW_BEGINS:
			case KEYW_STARTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==KEYW_BEGINS || _la==KEYW_STARTS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(83);
				match(KEYW_WITH);
				setState(84);
				block();
				}
				break;
			case KEYW_MUST:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(KEYW_MUST);
				setState(86);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitCharacter_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_stmtContext character_stmt() throws RecognitionException {
		Character_stmtContext _localctx = new Character_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_character_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			character();
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(90);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(KEYW_IF);
			setState(95);
			_la = _input.LA(1);
			if (_la==KEYW_NOT) {
				{
				setState(94);
				match(KEYW_NOT);
				}
			}

			setState(103);
			switch (_input.LA(1)) {
			case KEYW_FOLLOWED:
				{
				setState(97);
				match(KEYW_FOLLOWED);
				setState(98);
				match(KEYW_BY);
				setState(99);
				block();
				}
				break;
			case KEYW_ALREADY:
				{
				setState(100);
				match(KEYW_ALREADY);
				setState(101);
				match(KEYW_HAD);
				setState(102);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagContext flag() throws RecognitionException {
		FlagContext _localctx = new FlagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flag);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case KEYW_CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(KEYW_CASE);
				setState(106);
				match(KEYW_INSENSITIVE);
				}
				break;
			case KEYW_MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(KEYW_MULTI);
				setState(108);
				match(KEYW_LINE);
				}
				break;
			case KEYW_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(KEYW_ALL);
				setState(110);
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

	public static class StmtContext extends ParserRuleContext {
		public Character_stmtContext character_stmt() {
			return getRuleContext(Character_stmtContext.class,0);
		}
		public Group_stmtContext group_stmt() {
			return getRuleContext(Group_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch (_input.LA(1)) {
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
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(114);
					character_stmt();
					}
					break;
				case 2:
					{
					setState(115);
					group_stmt();
					}
					break;
				case 3:
					{
					setState(116);
					if_stmt();
					}
					break;
				}
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(119);
					quantifier();
					}
					break;
				}
				}
				break;
			case KEYW_CASE:
			case KEYW_MULTI:
			case KEYW_ALL:
				{
				setState(122);
				flag();
				}
				break;
			case KEYW_BEGINS:
			case KEYW_STARTS:
			case KEYW_MUST:
				{
				setState(123);
				anchor();
				}
				break;
			case T__0:
				{
				setState(124);
				match(T__0);
				setState(125);
				stmt(0);
				setState(126);
				match(T__1);
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(127);
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
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmt);
					setState(132);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(133);
					if_stmt();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			stmt(0);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << KEYW_LITERALLY) | (1L << KEYW_DIGIT) | (1L << KEYW_LETTER) | (1L << KEYW_UPPERCASE) | (1L << KEYW_ONE) | (1L << KEYW_ANY) | (1L << KEYW_NO) | (1L << KEYW_ANYHTING) | (1L << KEYW_NEW) | (1L << KEYW_WHITESPACE) | (1L << KEYW_TAB) | (1L << KEYW_RAW) | (1L << KEYW_CAPTURE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEYW_IF - 66)) | (1L << (KEYW_CASE - 66)) | (1L << (KEYW_MULTI - 66)) | (1L << (KEYW_ALL - 66)) | (1L << (KEYW_BEGINS - 66)) | (1L << (KEYW_STARTS - 66)) | (1L << (KEYW_MUST - 66)))) != 0)) {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(140);
					match(T__2);
					}
				}

				setState(143);
				stmt(0);
				}
				}
				setState(148);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__0);
				setState(150);
				stmts();
				setState(151);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				stmt(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitGroup_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_stmtContext group_stmt() throws RecognitionException {
		Group_stmtContext _localctx = new Group_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_group_stmt);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case KEYW_CAPTURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(KEYW_CAPTURE);
				setState(158);
				block();
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(159);
					match(KEYW_AS);
					setState(160);
					match(STRING);
					}
					break;
				}
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(163);
					match(KEYW_UNTIL);
					setState(164);
					block();
					}
					break;
				}
				}
				break;
			case KEYW_ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(KEYW_ANY);
				setState(168);
				match(KEYW_OF);
				setState(169);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRLVisitor ) return ((SRLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			stmts();
			setState(173);
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
		case 7:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\2\3\2\3\2\5\2\63\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"G\n\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\5\4S\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5Z\n\5\3\6\3\6\5\6^\n\6\3\7\3\7\5\7b\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\t\3\t\5\tx\n"+
		"\t\3\t\5\t{\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\5\t\u0085\n\t\3"+
		"\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\n\3\n\5\n\u0090\n\n\3\n\7\n"+
		"\u0093\n\n\f\n\16\n\u0096\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\5\f\u00a8\n\f\3\f\3\f\3\f"+
		"\5\f\u00ad\n\f\3\r\3\r\3\r\3\r\2\3\20\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\6\3\2+,\3\2,-\3\2;<\3\2OP\u00cd\2\62\3\2\2\2\4<\3\2\2\2\6R\3\2\2\2"+
		"\bY\3\2\2\2\n[\3\2\2\2\f_\3\2\2\2\16q\3\2\2\2\20\u0084\3\2\2\2\22\u008d"+
		"\3\2\2\2\24\u009d\3\2\2\2\26\u00ac\3\2\2\2\30\u00ae\3\2\2\2\32\34\7)\2"+
		"\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7&\2\2\36\63\7\6\2"+
		"\2\37\63\7\'\2\2 \"\7)\2\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#\63\7(\2\2"+
		"$%\t\2\2\2%&\7*\2\2&\63\7\6\2\2\'(\t\3\2\2(\63\7.\2\2)\63\7/\2\2*+\7\60"+
		"\2\2+\63\7\61\2\2,.\7-\2\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\63\7\62\2\2"+
		"\60\63\7\63\2\2\61\63\7\64\2\2\62\33\3\2\2\2\62\37\3\2\2\2\62!\3\2\2\2"+
		"\62$\3\2\2\2\62\'\3\2\2\2\62)\3\2\2\2\62*\3\2\2\2\62-\3\2\2\2\62\60\3"+
		"\2\2\2\62\61\3\2\2\2\63\3\3\2\2\2\64\65\7%\2\2\65\66\7\7\2\2\66\67\7\65"+
		"\2\2\67=\7\7\2\289\7%\2\29:\7\b\2\2:;\7\65\2\2;=\7\b\2\2<\64\3\2\2\2<"+
		"8\3\2\2\2=\5\3\2\2\2>?\7\66\2\2?@\7\b\2\2@S\7\67\2\2AB\78\2\2BC\7\b\2"+
		"\2CD\79\2\2DF\7\t\2\2EG\7\67\2\2FE\3\2\2\2FG\3\2\2\2GS\3\2\2\2HS\7:\2"+
		"\2IJ\7?\2\2JK\7@\2\2KM\7\b\2\2LN\7\67\2\2ML\3\2\2\2MN\3\2\2\2NS\3\2\2"+
		"\2OP\t\4\2\2PQ\7>\2\2QS\7=\2\2R>\3\2\2\2RA\3\2\2\2RH\3\2\2\2RI\3\2\2\2"+
		"RO\3\2\2\2S\7\3\2\2\2TU\t\5\2\2UV\7Q\2\2VZ\5\24\13\2WX\7R\2\2XZ\7S\2\2"+
		"YT\3\2\2\2YW\3\2\2\2Z\t\3\2\2\2[]\5\2\2\2\\^\5\4\3\2]\\\3\2\2\2]^\3\2"+
		"\2\2^\13\3\2\2\2_a\7D\2\2`b\7G\2\2a`\3\2\2\2ab\3\2\2\2bi\3\2\2\2cd\7E"+
		"\2\2de\7F\2\2ej\5\24\13\2fg\7H\2\2gh\7I\2\2hj\5\24\13\2ic\3\2\2\2if\3"+
		"\2\2\2j\r\3\2\2\2kl\7J\2\2lr\7K\2\2mn\7L\2\2nr\7\61\2\2op\7M\2\2pr\7N"+
		"\2\2qk\3\2\2\2qm\3\2\2\2qo\3\2\2\2r\17\3\2\2\2sw\b\t\1\2tx\5\n\6\2ux\5"+
		"\26\f\2vx\5\f\7\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2y{\5\6\4\2zy"+
		"\3\2\2\2z{\3\2\2\2{\u0085\3\2\2\2|\u0085\5\16\b\2}\u0085\5\b\5\2~\177"+
		"\7\3\2\2\177\u0080\5\20\t\2\u0080\u0082\7\4\2\2\u0081\u0083\5\6\4\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084s\3\2\2\2"+
		"\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0085\u008a\3\2\2\2\u0086"+
		"\u0087\f\4\2\2\u0087\u0089\5\f\7\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\21\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0094\5\20\t\2\u008e\u0090\7\5\2\2\u008f\u008e\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\5\20\t\2\u0092\u008f"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\23\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u0099\5\22\n"+
		"\2\u0099\u009a\7\4\2\2\u009a\u009e\3\2\2\2\u009b\u009e\5\20\t\2\u009c"+
		"\u009e\7\6\2\2\u009d\u0097\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\25\3\2\2\2\u009f\u00a0\7A\2\2\u00a0\u00a3\5\24\13\2\u00a1\u00a2"+
		"\7B\2\2\u00a2\u00a4\7\6\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a8\5\24\13\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa"+
		"\u00ab\7*\2\2\u00ab\u00ad\5\24\13\2\u00ac\u009f\3\2\2\2\u00ac\u00a9\3"+
		"\2\2\2\u00ad\27\3\2\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0\7\2\2\3\u00b0"+
		"\31\3\2\2\2\32\33!-\62<FMRY]aiqwz\u0082\u0084\u008a\u008f\u0094\u009d"+
		"\u00a3\u00a7\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}