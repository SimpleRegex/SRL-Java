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
	public static final int
		RULE_character = 0, RULE_specification = 1, RULE_quantifier = 2, RULE_anchor = 3, 
		RULE_character_stmt = 4, RULE_if_stmt = 5, RULE_flag = 6, RULE_stmt = 7, 
		RULE_stmts = 8, RULE_block = 9, RULE_group_stmt = 10;
	public static final String[] ruleNames = {
		"character", "specification", "quantifier", "anchor", "character_stmt", 
		"if_stmt", "flag", "stmt", "stmts", "block", "group_stmt"
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				_la = _input.LA(1);
				if (_la==KEYW_UPPERCASE) {
					{
					setState(22);
					match(KEYW_UPPERCASE);
					}
				}

				setState(25);
				match(KEYW_LITERALLY);
				setState(26);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(KEYW_DIGIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(KEYW_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ONE || _la==KEYW_ANY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(30);
				match(KEYW_OF);
				setState(31);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ANY || _la==KEYW_NO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(33);
				match(KEYW_CHARACTER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				match(KEYW_ANYHTING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(35);
				match(KEYW_NEW);
				setState(36);
				match(KEYW_LINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(38);
				_la = _input.LA(1);
				if (_la==KEYW_NO) {
					{
					setState(37);
					match(KEYW_NO);
					}
				}

				setState(40);
				match(KEYW_WHITESPACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(41);
				match(KEYW_TAB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(42);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(KEYW_FROM);
				setState(46);
				match(CHAR);
				setState(47);
				match(KEYW_TO);
				setState(48);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(KEYW_FROM);
				setState(50);
				match(DIGIT);
				setState(51);
				match(KEYW_TO);
				setState(52);
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
		public List<TerminalNode> NUMBER() { return getTokens(SRLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SRLParser.NUMBER, i);
		}
		public TerminalNode KEYW_TIMES() { return getToken(SRLParser.KEYW_TIMES, 0); }
		public TerminalNode KEYW_BETWEEN() { return getToken(SRLParser.KEYW_BETWEEN, 0); }
		public TerminalNode KEYW_AND() { return getToken(SRLParser.KEYW_AND, 0); }
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
			setState(75);
			switch (_input.LA(1)) {
			case KEYW_EXACTLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(KEYW_EXACTLY);
				setState(56);
				match(NUMBER);
				setState(57);
				match(KEYW_TIMES);
				}
				break;
			case KEYW_BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(KEYW_BETWEEN);
				setState(59);
				match(NUMBER);
				setState(60);
				match(KEYW_AND);
				setState(61);
				match(NUMBER);
				setState(63);
				_la = _input.LA(1);
				if (_la==KEYW_TIMES) {
					{
					setState(62);
					match(KEYW_TIMES);
					}
				}

				}
				break;
			case KEYW_OPTIONAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(KEYW_OPTIONAL);
				}
				break;
			case KEYW_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(KEYW_AT);
				setState(67);
				match(KEYW_LEAST);
				setState(68);
				match(NUMBER);
				setState(70);
				_la = _input.LA(1);
				if (_la==KEYW_TIMES) {
					{
					setState(69);
					match(KEYW_TIMES);
					}
				}

				}
				break;
			case KEYW_ONCE:
			case KEYW_NEVER:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==KEYW_ONCE || _la==KEYW_NEVER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(73);
				match(KEYW_OR);
				setState(74);
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
			setState(82);
			switch (_input.LA(1)) {
			case KEYW_BEGINS:
			case KEYW_STARTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				_la = _input.LA(1);
				if ( !(_la==KEYW_BEGINS || _la==KEYW_STARTS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(78);
				match(KEYW_WITH);
				setState(79);
				block();
				}
				break;
			case KEYW_MUST:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(KEYW_MUST);
				setState(81);
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
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			character();
			setState(86);
			_la = _input.LA(1);
			if (_la==KEYW_FROM) {
				{
				setState(85);
				specification();
				}
			}

			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(88);
				quantifier();
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
			setState(91);
			match(KEYW_IF);
			setState(93);
			_la = _input.LA(1);
			if (_la==KEYW_NOT) {
				{
				setState(92);
				match(KEYW_NOT);
				}
			}

			setState(101);
			switch (_input.LA(1)) {
			case KEYW_FOLLOWED:
				{
				setState(95);
				match(KEYW_FOLLOWED);
				setState(96);
				match(KEYW_BY);
				setState(97);
				block();
				}
				break;
			case KEYW_ALREADY:
				{
				setState(98);
				match(KEYW_ALREADY);
				setState(99);
				match(KEYW_HAD);
				setState(100);
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
			setState(109);
			switch (_input.LA(1)) {
			case KEYW_CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(KEYW_CASE);
				setState(104);
				match(KEYW_INSENSITIVE);
				}
				break;
			case KEYW_MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(KEYW_MULTI);
				setState(106);
				match(KEYW_LINE);
				}
				break;
			case KEYW_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(KEYW_ALL);
				setState(108);
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
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
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
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(120);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(111);
					character_stmt();
					}
					break;
				case 2:
					{
					setState(112);
					group_stmt();
					}
					break;
				}
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(115);
					if_stmt();
					}
					break;
				}
				}
				break;
			case KEYW_CASE:
			case KEYW_MULTI:
			case KEYW_ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				flag();
				}
				break;
			case KEYW_BEGINS:
			case KEYW_STARTS:
			case KEYW_MUST:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				anchor();
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
			setState(122);
			stmt();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << KEYW_LITERALLY) | (1L << KEYW_DIGIT) | (1L << KEYW_LETTER) | (1L << KEYW_UPPERCASE) | (1L << KEYW_ONE) | (1L << KEYW_ANY) | (1L << KEYW_NO) | (1L << KEYW_ANYHTING) | (1L << KEYW_NEW) | (1L << KEYW_WHITESPACE) | (1L << KEYW_TAB) | (1L << KEYW_RAW) | (1L << KEYW_CAPTURE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (KEYW_CASE - 67)) | (1L << (KEYW_MULTI - 67)) | (1L << (KEYW_ALL - 67)) | (1L << (KEYW_BEGINS - 67)) | (1L << (KEYW_STARTS - 67)) | (1L << (KEYW_MUST - 67)))) != 0)) {
				{
				{
				setState(124);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(123);
					match(T__0);
					}
				}

				setState(126);
				stmt();
				}
				}
				setState(131);
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
			setState(138);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__1);
				setState(133);
				stmts();
				setState(134);
				match(T__2);
				}
				break;
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
			case KEYW_CASE:
			case KEYW_MULTI:
			case KEYW_ALL:
			case KEYW_BEGINS:
			case KEYW_STARTS:
			case KEYW_MUST:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				stmt();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(STRING);
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

	public static class Group_stmtContext extends ParserRuleContext {
		public TerminalNode KEYW_CAPTURE() { return getToken(SRLParser.KEYW_CAPTURE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KEYW_AS() { return getToken(SRLParser.KEYW_AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SRLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SRLParser.STRING, i);
		}
		public TerminalNode KEYW_UNTIL() { return getToken(SRLParser.KEYW_UNTIL, 0); }
		public TerminalNode KEYW_ANY() { return getToken(SRLParser.KEYW_ANY, 0); }
		public TerminalNode KEYW_OF() { return getToken(SRLParser.KEYW_OF, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
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
			setState(156);
			switch (_input.LA(1)) {
			case KEYW_CAPTURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(KEYW_CAPTURE);
				setState(141);
				block();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(142);
					match(KEYW_AS);
					setState(143);
					match(STRING);
					}
					break;
				}
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(146);
					match(KEYW_UNTIL);
					setState(147);
					match(STRING);
					}
					break;
				}
				}
				break;
			case KEYW_ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(KEYW_ANY);
				setState(151);
				match(KEYW_OF);
				setState(152);
				block();
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(153);
					quantifier();
					}
					break;
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\5\2\32\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2)\n\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4I\n\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\5\5U\n\5\3\6\3\6\5"+
		"\6Y\n\6\3\6\5\6\\\n\6\3\7\3\7\5\7`\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7h\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\5\tt\n\t\3\t\5\tw\n\t\3\t"+
		"\3\t\5\t{\n\t\3\n\3\n\5\n\177\n\n\3\n\7\n\u0082\n\n\f\n\16\n\u0085\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\3\f\5\f\u0093"+
		"\n\f\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\5\f\u009f\n\f"+
		"\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\6\3\2&\'\3\2\'(\3\2\66\67\3\2"+
		"JK\u00ba\2-\3\2\2\2\4\67\3\2\2\2\6M\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\f]\3"+
		"\2\2\2\16o\3\2\2\2\20z\3\2\2\2\22|\3\2\2\2\24\u008c\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\32\7$\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7"+
		"!\2\2\34.\7R\2\2\35.\7\"\2\2\36.\7#\2\2\37 \t\2\2\2 !\7%\2\2!.\7R\2\2"+
		"\"#\t\3\2\2#.\7)\2\2$.\7*\2\2%&\7+\2\2&.\7,\2\2\')\7(\2\2(\'\3\2\2\2("+
		")\3\2\2\2)*\3\2\2\2*.\7-\2\2+.\7.\2\2,.\7/\2\2-\31\3\2\2\2-\35\3\2\2\2"+
		"-\36\3\2\2\2-\37\3\2\2\2-\"\3\2\2\2-$\3\2\2\2-%\3\2\2\2-(\3\2\2\2-+\3"+
		"\2\2\2-,\3\2\2\2.\3\3\2\2\2/\60\7 \2\2\60\61\7Q\2\2\61\62\7\60\2\2\62"+
		"8\7Q\2\2\63\64\7 \2\2\64\65\7O\2\2\65\66\7\60\2\2\668\7O\2\2\67/\3\2\2"+
		"\2\67\63\3\2\2\28\5\3\2\2\29:\7\61\2\2:;\7P\2\2;N\7\62\2\2<=\7\63\2\2"+
		"=>\7P\2\2>?\7\64\2\2?A\7P\2\2@B\7\62\2\2A@\3\2\2\2AB\3\2\2\2BN\3\2\2\2"+
		"CN\7\65\2\2DE\7:\2\2EF\7;\2\2FH\7P\2\2GI\7\62\2\2HG\3\2\2\2HI\3\2\2\2"+
		"IN\3\2\2\2JK\t\4\2\2KL\79\2\2LN\78\2\2M9\3\2\2\2M<\3\2\2\2MC\3\2\2\2M"+
		"D\3\2\2\2MJ\3\2\2\2N\7\3\2\2\2OP\t\5\2\2PQ\7L\2\2QU\5\24\13\2RS\7M\2\2"+
		"SU\7N\2\2TO\3\2\2\2TR\3\2\2\2U\t\3\2\2\2VX\5\2\2\2WY\5\4\3\2XW\3\2\2\2"+
		"XY\3\2\2\2Y[\3\2\2\2Z\\\5\6\4\2[Z\3\2\2\2[\\\3\2\2\2\\\13\3\2\2\2]_\7"+
		"?\2\2^`\7B\2\2_^\3\2\2\2_`\3\2\2\2`g\3\2\2\2ab\7@\2\2bc\7A\2\2ch\5\24"+
		"\13\2de\7C\2\2ef\7D\2\2fh\5\24\13\2ga\3\2\2\2gd\3\2\2\2h\r\3\2\2\2ij\7"+
		"E\2\2jp\7F\2\2kl\7G\2\2lp\7,\2\2mn\7H\2\2np\7I\2\2oi\3\2\2\2ok\3\2\2\2"+
		"om\3\2\2\2p\17\3\2\2\2qt\5\n\6\2rt\5\26\f\2sq\3\2\2\2sr\3\2\2\2tv\3\2"+
		"\2\2uw\5\f\7\2vu\3\2\2\2vw\3\2\2\2w{\3\2\2\2x{\5\16\b\2y{\5\b\5\2zs\3"+
		"\2\2\2zx\3\2\2\2zy\3\2\2\2{\21\3\2\2\2|\u0083\5\20\t\2}\177\7\3\2\2~}"+
		"\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\5\20\t\2\u0081~\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\23\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\4\2\2\u0087\u0088\5\22\n"+
		"\2\u0088\u0089\7\5\2\2\u0089\u008d\3\2\2\2\u008a\u008d\5\20\t\2\u008b"+
		"\u008d\7R\2\2\u008c\u0086\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\25\3\2\2\2\u008e\u008f\7<\2\2\u008f\u0092\5\24\13\2\u0090\u0091"+
		"\7=\2\2\u0091\u0093\7R\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0097\7R\2\2\u0096\u0094\3\2\2"+
		"\2\u0096\u0097\3\2\2\2\u0097\u009f\3\2\2\2\u0098\u0099\7\'\2\2\u0099\u009a"+
		"\7%\2\2\u009a\u009c\5\24\13\2\u009b\u009d\5\6\4\2\u009c\u009b\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u008e\3\2\2\2\u009e\u0098"+
		"\3\2\2\2\u009f\27\3\2\2\2\31\31(-\67AHMTX[_gosvz~\u0083\u008c\u0092\u0096"+
		"\u009c\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}