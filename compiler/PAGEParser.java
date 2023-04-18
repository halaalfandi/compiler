// Generated from C:/Users/lina/IdeaProjects/compoailer/src\PAGEParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PAGEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTPAGE=1, PAGE=2, EXTENDS=3, HEAD=4, NAME_PAGE=5, ID_PAGE=6, OPEN_BODY=7, 
		CLOSE_BODY=8, LINK=9, NAME_LINK=10, HREF=11, OUTPUT=12, INPUT=13, NAME=14, 
		SEMICOLNE=15, FIELD=16, EMAIL=17, NUMBER=18, PASSWORD=19, DATE=20, CHECKBOX=21, 
		RADIO=22, FILE=23, TEXT_OUT=24, FILE_out=25, IMAGE=26, CONTROLLER=27, 
		CONTROLS=28, NAME_CONTROLLER=29, OPEN_CONTROLLER=30, GO=31, CLOSE_CONTROLLER=32, 
		IF=33, OBEN=34, CONDITION=35, CLOSE=36, FOR=37;
	public static final int
		RULE_program = 0, RULE_startpage = 1, RULE_page = 2, RULE_defination_page = 3, 
		RULE_name_page = 4, RULE_body = 5, RULE_inside = 6, RULE_link = 7, RULE_output = 8, 
		RULE_input = 9, RULE_type_IN = 10, RULE_type_OUT = 11, RULE_back_end = 12, 
		RULE_defnation_controller = 13, RULE_name_controller = 14, RULE_name_controller_page = 15, 
		RULE_controller = 16, RULE_if_body = 17, RULE_for_body = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "startpage", "page", "defination_page", "name_page", "body", 
			"inside", "link", "output", "input", "type_IN", "type_OUT", "back_end", 
			"defnation_controller", "name_controller", "name_controller_page", "controller", 
			"if_body", "for_body"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STARTPAGE", "PAGE", "EXTENDS", "HEAD", "NAME_PAGE", "ID_PAGE", 
			"OPEN_BODY", "CLOSE_BODY", "LINK", "NAME_LINK", "HREF", "OUTPUT", "INPUT", 
			"NAME", "SEMICOLNE", "FIELD", "EMAIL", "NUMBER", "PASSWORD", "DATE", 
			"CHECKBOX", "RADIO", "FILE", "TEXT_OUT", "FILE_out", "IMAGE", "CONTROLLER", 
			"CONTROLS", "NAME_CONTROLLER", "OPEN_CONTROLLER", "GO", "CLOSE_CONTROLLER", 
			"IF", "OBEN", "CONDITION", "CLOSE", "FOR"
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

	@Override
	public String getGrammarFileName() { return "PAGEParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PAGEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StartpageContext startpage() {
			return getRuleContext(StartpageContext.class,0);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public List<Back_endContext> back_end() {
			return getRuleContexts(Back_endContext.class);
		}
		public Back_endContext back_end(int i) {
			return getRuleContext(Back_endContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			startpage();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAGE) {
				{
				{
				setState(40); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(39);
						page();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(42); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONTROLLER) {
					{
					{
					setState(44);
					back_end();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(54);
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

	public static class StartpageContext extends ParserRuleContext {
		public TerminalNode STARTPAGE() { return getToken(PAGEParser.STARTPAGE, 0); }
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public Back_endContext back_end() {
			return getRuleContext(Back_endContext.class,0);
		}
		public StartpageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startpage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterStartpage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitStartpage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitStartpage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartpageContext startpage() throws RecognitionException {
		StartpageContext _localctx = new StartpageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startpage);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STARTPAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(STARTPAGE);
				setState(56);
				page();
				}
				break;
			case CONTROLLER:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				back_end();
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

	public static class PageContext extends ParserRuleContext {
		public Defination_pageContext defination_page() {
			return getRuleContext(Defination_pageContext.class,0);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
			defination_page();
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

	public static class Defination_pageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(PAGEParser.PAGE, 0); }
		public Name_pageContext name_page() {
			return getRuleContext(Name_pageContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> EXTENDS() { return getTokens(PAGEParser.EXTENDS); }
		public TerminalNode EXTENDS(int i) {
			return getToken(PAGEParser.EXTENDS, i);
		}
		public List<TerminalNode> HEAD() { return getTokens(PAGEParser.HEAD); }
		public TerminalNode HEAD(int i) {
			return getToken(PAGEParser.HEAD, i);
		}
		public Defination_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defination_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterDefination_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitDefination_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitDefination_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defination_pageContext defination_page() throws RecognitionException {
		Defination_pageContext _localctx = new Defination_pageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defination_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			match(PAGE);
			setState(63);
			name_page();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXTENDS) {
				{
				{
				setState(64);
				match(EXTENDS);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HEAD) {
				{
				{
				setState(70);
				match(HEAD);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			body();
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

	public static class Name_pageContext extends ParserRuleContext {
		public TerminalNode NAME_PAGE() { return getToken(PAGEParser.NAME_PAGE, 0); }
		public TerminalNode ID_PAGE() { return getToken(PAGEParser.ID_PAGE, 0); }
		public Name_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterName_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitName_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitName_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_pageContext name_page() throws RecognitionException {
		Name_pageContext _localctx = new Name_pageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(NAME_PAGE);
			setState(79);
			match(ID_PAGE);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BODY() { return getToken(PAGEParser.OPEN_BODY, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(PAGEParser.CLOSE_BODY, 0); }
		public List<InsideContext> inside() {
			return getRuleContexts(InsideContext.class);
		}
		public InsideContext inside(int i) {
			return getRuleContext(InsideContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(OPEN_BODY);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINK) | (1L << OUTPUT) | (1L << INPUT))) != 0)) {
				{
				{
				setState(82);
				inside();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(CLOSE_BODY);
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

	public static class InsideContext extends ParserRuleContext {
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public InsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideContext inside() throws RecognitionException {
		InsideContext _localctx = new InsideContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inside);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(105);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INPUT:
						{
						setState(91); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(90);
								input();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(93); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case OUTPUT:
						{
						setState(96); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(95);
								output();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(98); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case LINK:
						{
						setState(101); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(100);
								link();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(103); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(PAGEParser.LINK, 0); }
		public TerminalNode NAME_LINK() { return getToken(PAGEParser.NAME_LINK, 0); }
		public TerminalNode HREF() { return getToken(PAGEParser.HREF, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LINK);
			setState(110);
			match(NAME_LINK);
			setState(111);
			match(HREF);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(PAGEParser.OUTPUT, 0); }
		public Type_OUTContext type_OUT() {
			return getRuleContext(Type_OUTContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(113);
			match(OUTPUT);
			setState(114);
			type_OUT();
			}
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode SEMICOLNE() { return getToken(PAGEParser.SEMICOLNE, 0); }
		public List<TerminalNode> INPUT() { return getTokens(PAGEParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(PAGEParser.INPUT, i);
		}
		public List<Type_INContext> type_IN() {
			return getRuleContexts(Type_INContext.class);
		}
		public Type_INContext type_IN(int i) {
			return getRuleContext(Type_INContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(PAGEParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PAGEParser.NAME, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(INPUT);
				setState(117);
				type_IN();
				setState(118);
				match(NAME);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INPUT );
			setState(124);
			match(SEMICOLNE);
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

	public static class Type_INContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(PAGEParser.FIELD, 0); }
		public TerminalNode EMAIL() { return getToken(PAGEParser.EMAIL, 0); }
		public TerminalNode NUMBER() { return getToken(PAGEParser.NUMBER, 0); }
		public TerminalNode PASSWORD() { return getToken(PAGEParser.PASSWORD, 0); }
		public TerminalNode DATE() { return getToken(PAGEParser.DATE, 0); }
		public TerminalNode CHECKBOX() { return getToken(PAGEParser.CHECKBOX, 0); }
		public TerminalNode RADIO() { return getToken(PAGEParser.RADIO, 0); }
		public TerminalNode FILE() { return getToken(PAGEParser.FILE, 0); }
		public Type_INContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_IN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterType_IN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitType_IN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitType_IN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_INContext type_IN() throws RecognitionException {
		Type_INContext _localctx = new Type_INContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_IN);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD) | (1L << EMAIL) | (1L << NUMBER) | (1L << PASSWORD) | (1L << DATE) | (1L << CHECKBOX) | (1L << RADIO) | (1L << FILE))) != 0)) ) {
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

	public static class Type_OUTContext extends ParserRuleContext {
		public TerminalNode TEXT_OUT() { return getToken(PAGEParser.TEXT_OUT, 0); }
		public TerminalNode FILE_out() { return getToken(PAGEParser.FILE_out, 0); }
		public TerminalNode IMAGE() { return getToken(PAGEParser.IMAGE, 0); }
		public Type_OUTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_OUT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterType_OUT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitType_OUT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitType_OUT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_OUTContext type_OUT() throws RecognitionException {
		Type_OUTContext _localctx = new Type_OUTContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_OUT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_OUT) | (1L << FILE_out) | (1L << IMAGE))) != 0)) ) {
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

	public static class Back_endContext extends ParserRuleContext {
		public Defnation_controllerContext defnation_controller() {
			return getRuleContext(Defnation_controllerContext.class,0);
		}
		public Back_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterBack_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitBack_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitBack_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Back_endContext back_end() throws RecognitionException {
		Back_endContext _localctx = new Back_endContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_back_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			defnation_controller();
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

	public static class Defnation_controllerContext extends ParserRuleContext {
		public TerminalNode CONTROLLER() { return getToken(PAGEParser.CONTROLLER, 0); }
		public Name_controllerContext name_controller() {
			return getRuleContext(Name_controllerContext.class,0);
		}
		public TerminalNode CONTROLS() { return getToken(PAGEParser.CONTROLS, 0); }
		public Name_controller_pageContext name_controller_page() {
			return getRuleContext(Name_controller_pageContext.class,0);
		}
		public ControllerContext controller() {
			return getRuleContext(ControllerContext.class,0);
		}
		public Defnation_controllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defnation_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterDefnation_controller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitDefnation_controller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitDefnation_controller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defnation_controllerContext defnation_controller() throws RecognitionException {
		Defnation_controllerContext _localctx = new Defnation_controllerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defnation_controller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CONTROLLER);
			setState(133);
			name_controller();
			setState(134);
			match(CONTROLS);
			setState(135);
			name_controller_page();
			setState(136);
			controller();
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

	public static class Name_controllerContext extends ParserRuleContext {
		public TerminalNode NAME_CONTROLLER() { return getToken(PAGEParser.NAME_CONTROLLER, 0); }
		public Name_controllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterName_controller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitName_controller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitName_controller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_controllerContext name_controller() throws RecognitionException {
		Name_controllerContext _localctx = new Name_controllerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name_controller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(NAME_CONTROLLER);
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

	public static class Name_controller_pageContext extends ParserRuleContext {
		public TerminalNode NAME_CONTROLLER() { return getToken(PAGEParser.NAME_CONTROLLER, 0); }
		public Name_controller_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_controller_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterName_controller_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitName_controller_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitName_controller_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_controller_pageContext name_controller_page() throws RecognitionException {
		Name_controller_pageContext _localctx = new Name_controller_pageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name_controller_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(NAME_CONTROLLER);
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

	public static class ControllerContext extends ParserRuleContext {
		public TerminalNode OPEN_CONTROLLER() { return getToken(PAGEParser.OPEN_CONTROLLER, 0); }
		public TerminalNode CLOSE_CONTROLLER() { return getToken(PAGEParser.CLOSE_CONTROLLER, 0); }
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public List<For_bodyContext> for_body() {
			return getRuleContexts(For_bodyContext.class);
		}
		public For_bodyContext for_body(int i) {
			return getRuleContext(For_bodyContext.class,i);
		}
		public TerminalNode GO() { return getToken(PAGEParser.GO, 0); }
		public ControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerContext controller() throws RecognitionException {
		ControllerContext _localctx = new ControllerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(OPEN_CONTROLLER);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(143);
					if_body();
					}
					break;
				case FOR:
					{
					setState(144);
					for_body();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF || _la==FOR );
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GO) {
				{
				setState(149);
				match(GO);
				}
			}

			setState(152);
			match(CLOSE_CONTROLLER);
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

	public static class If_bodyContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PAGEParser.IF, 0); }
		public TerminalNode OBEN() { return getToken(PAGEParser.OBEN, 0); }
		public TerminalNode CONDITION() { return getToken(PAGEParser.CONDITION, 0); }
		public TerminalNode CLOSE() { return getToken(PAGEParser.CLOSE, 0); }
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IF);
			setState(155);
			match(OBEN);
			setState(156);
			match(CONDITION);
			setState(157);
			match(CLOSE);
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

	public static class For_bodyContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PAGEParser.FOR, 0); }
		public TerminalNode OBEN() { return getToken(PAGEParser.OBEN, 0); }
		public TerminalNode CLOSE() { return getToken(PAGEParser.CLOSE, 0); }
		public For_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterFor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitFor_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitFor_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_bodyContext for_body() throws RecognitionException {
		For_bodyContext _localctx = new For_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FOR);
			setState(160);
			match(OBEN);
			setState(161);
			match(CLOSE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\6\2+\n\2\r\2\16\2,\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\5"+
		"\3\5\3\5\7\5D\n\5\f\5\16\5G\13\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\7\3\7\3\b\6\b^\n\b\r\b\16"+
		"\b_\3\b\6\bc\n\b\r\b\16\bd\3\b\6\bh\n\b\r\b\16\bi\6\bl\n\b\r\b\16\bm\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\6\13{\n\13\r\13\16\13|"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\6\22\u0094\n\22\r\22\16\22\u0095\3\22\5"+
		"\22\u0099\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\22\31"+
		"\3\2\32\34\2\u00a3\2(\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nP\3\2"+
		"\2\2\fS\3\2\2\2\16k\3\2\2\2\20o\3\2\2\2\22s\3\2\2\2\24z\3\2\2\2\26\u0080"+
		"\3\2\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u0086\3\2\2\2\36\u008c\3"+
		"\2\2\2 \u008e\3\2\2\2\"\u0090\3\2\2\2$\u009c\3\2\2\2&\u00a1\3\2\2\2(\66"+
		"\5\4\3\2)+\5\6\4\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2"+
		".\60\5\32\16\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\64*\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\3\3\2\2\28\66\3\2\2\29:\7\3\2\2:=\5\6\4\2;=\5\32\16\2<9\3\2\2"+
		"\2<;\3\2\2\2=\5\3\2\2\2>?\5\b\5\2?\7\3\2\2\2@A\7\4\2\2AE\5\n\6\2BD\7\5"+
		"\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2\2HJ\7\6"+
		"\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\5\f"+
		"\7\2O\t\3\2\2\2PQ\7\7\2\2QR\7\b\2\2R\13\3\2\2\2SW\7\t\2\2TV\5\16\b\2U"+
		"T\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\n\2\2"+
		"[\r\3\2\2\2\\^\5\24\13\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`l\3"+
		"\2\2\2ac\5\22\n\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2el\3\2\2\2fh"+
		"\5\20\t\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2k]\3\2\2\2"+
		"kb\3\2\2\2kg\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\17\3\2\2\2op\7\13"+
		"\2\2pq\7\f\2\2qr\7\r\2\2r\21\3\2\2\2st\7\16\2\2tu\5\30\r\2u\23\3\2\2\2"+
		"vw\7\17\2\2wx\5\26\f\2xy\7\20\2\2y{\3\2\2\2zv\3\2\2\2{|\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\21\2\2\177\25\3\2\2\2\u0080\u0081\t\2"+
		"\2\2\u0081\27\3\2\2\2\u0082\u0083\t\3\2\2\u0083\31\3\2\2\2\u0084\u0085"+
		"\5\34\17\2\u0085\33\3\2\2\2\u0086\u0087\7\35\2\2\u0087\u0088\5\36\20\2"+
		"\u0088\u0089\7\36\2\2\u0089\u008a\5 \21\2\u008a\u008b\5\"\22\2\u008b\35"+
		"\3\2\2\2\u008c\u008d\7\37\2\2\u008d\37\3\2\2\2\u008e\u008f\7\37\2\2\u008f"+
		"!\3\2\2\2\u0090\u0093\7 \2\2\u0091\u0094\5$\23\2\u0092\u0094\5&\24\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\7!\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\""+
		"\2\2\u009b#\3\2\2\2\u009c\u009d\7#\2\2\u009d\u009e\7$\2\2\u009e\u009f"+
		"\7%\2\2\u009f\u00a0\7&\2\2\u00a0%\3\2\2\2\u00a1\u00a2\7\'\2\2\u00a2\u00a3"+
		"\7$\2\2\u00a3\u00a4\7&\2\2\u00a4\'\3\2\2\2\22,\61\66<EKW_dikm|\u0093\u0095"+
		"\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}