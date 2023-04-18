// Generated from C:/Users/ESRAA/Downloads/Telegram Desktop/compoailer/src\PAGEParser.g4 by ANTLR 4.9.1

package gen;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PAGEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTPAGE=1, PAGE=2, CONTROLLER=3, CSS_PAGE=4, OBEN_CL=5, PATH=6, CLASS_CSS=7, 
		NAME_CSS=8, CLOSE_CSS=9, CLOSE_CL=10, COLOR=11, NUMBERING_M=12, SEMICOLNE_M=13, 
		BACKGROUNG=14, PADDING=15, MARGINATE=16, WIDTH=17, HEIGHT=18, NUMBER_=19, 
		NUMBER__=20, VALUE_COLOR=21, IF=22, END_IF=23, GO=24, CONTROLS=25, ID_CONTROLLER=26, 
		OPEN_CONTROLLER=27, CLOSE_CONTROLLER=28, FOR=29, PRINT=30, VARIABLE=31, 
		EQUAL_V=32, SEMICOLNE_V=33, ARRAY=34, OBJECT=35, SWITCH=36, COOKIES=37, 
		JSON=38, NAME_CONTROLLER=39, OBERATION_V=40, OBEN_P=41, STATMENT=42, CLOSE_P=43, 
		VALID=44, VAR_IF=45, OPERATION=46, SPACE=47, OBEN=48, CLOSE=49, NAME_VALID=50, 
		OBEN_VALID=51, CLOSE_VALID=52, COMMA_VALID=53, OBEN_PR=54, INSIDE_PR=55, 
		CLOSE_PR=56, INPUT=57, PRAGRAPH=58, EXTENDS=59, OUTPUT=60, ROW=61, TABLE=62, 
		LIST=63, DATA=64, HEAD=65, NAME_PAGE=66, ID_PAGE=67, COMMA_PAGE=68, OPEN_BODY=69, 
		CLOSE_BODY=70, LINK=71, SEMICOLNE_COLUM=72, OBEN_COLUMN=73, NAME_COLUMN=74, 
		COMMA_COLUMN=75, CLOSE_COLUMN=76, PARAGRAPH=77, CLOSE_LIST=78, OBEN_LIST=79, 
		COMMA_LIST=80, CSS=81, SCRIPT=82, EQUAL=83, NAME_TEXT=84, SESSION=85, 
		CLASS=86, VALUE_OPTION=87, NAME_OPTION=88, OPTION=89, SELECT=90, IMAGE=91, 
		EXTENSTION=92, TEXT=93, NUMBERING_MARK=94, FIELD=95, EMAIL=96, NUMBER=97, 
		PASSWORD=98, DATE=99, CHECKBOX=100, RADIO=101, FILE=102, OBEN_NAME=103, 
		CLOSE_NAME=104, COMMA=105, SEMICOLNE=106, ITEM=107, COMMA_S=108, ASSIGNMENT=109, 
		CLOSE_S=110, NAME=111, NAME_V=112, OBEN_CLASS=113, NAME_CLASS=114, COMMA_CLASS=115, 
		CLOSE_CLASS=116, HREF=117, NAME_LINK=118, CLASSTABLE=119;
	public static final int
		RULE_language = 0, RULE_start = 1, RULE_page = 2, RULE_defination_page = 3, 
		RULE_name_page = 4, RULE_body = 5, RULE_head = 6, RULE_css = 7, RULE_script = 8, 
		RULE_inside = 9, RULE_pragraph = 10, RULE_list = 11, RULE_link = 12, RULE_table = 13, 
		RULE_head_table = 14, RULE_column = 15, RULE_row = 16, RULE_output = 17, 
		RULE_input = 18, RULE_type_IN = 19, RULE_select = 20, RULE_type_OUT = 21, 
		RULE_class_ = 22, RULE_class_table = 23, RULE_name = 24, RULE_name_out = 25, 
		RULE_option = 26, RULE_data = 27, RULE_seesion = 28, RULE_array_s = 29, 
		RULE_item = 30, RULE_back_end = 31, RULE_defnation_controller = 32, RULE_name_controller = 33, 
		RULE_name_controller_page = 34, RULE_controller = 35, RULE_body_controller = 36, 
		RULE_if_body = 37, RULE_condition = 38, RULE_for_body = 39, RULE_print_php = 40, 
		RULE_variable = 41, RULE_css_page = 42, RULE_body_css = 43, RULE_body_class = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"language", "start", "page", "defination_page", "name_page", "body", 
			"head", "css", "script", "inside", "pragraph", "list", "link", "table", 
			"head_table", "column", "row", "output", "input", "type_IN", "select", 
			"type_OUT", "class_", "class_table", "name", "name_out", "option", "data", 
			"seesion", "array_s", "item", "back_end", "defnation_controller", "name_controller", 
			"name_controller_page", "controller", "body_controller", "if_body", "condition", 
			"for_body", "print_php", "variable", "css_page", "body_css", "body_class"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'array'", 
			"'object'", "'switch'", "'cookies'", "'json'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'input'", null, null, "'output'", null, null, "'list'", 
			"'data'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'css'", "'script'", null, null, 
			null, "'class'", null, null, null, "'select'", "'image'", null, "'text'", 
			null, "'field'", "'email'", "'number'", "'password'", "'date'", "'checkbox'", 
			"'radio'", "'file'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STARTPAGE", "PAGE", "CONTROLLER", "CSS_PAGE", "OBEN_CL", "PATH", 
			"CLASS_CSS", "NAME_CSS", "CLOSE_CSS", "CLOSE_CL", "COLOR", "NUMBERING_M", 
			"SEMICOLNE_M", "BACKGROUNG", "PADDING", "MARGINATE", "WIDTH", "HEIGHT", 
			"NUMBER_", "NUMBER__", "VALUE_COLOR", "IF", "END_IF", "GO", "CONTROLS", 
			"ID_CONTROLLER", "OPEN_CONTROLLER", "CLOSE_CONTROLLER", "FOR", "PRINT", 
			"VARIABLE", "EQUAL_V", "SEMICOLNE_V", "ARRAY", "OBJECT", "SWITCH", "COOKIES", 
			"JSON", "NAME_CONTROLLER", "OBERATION_V", "OBEN_P", "STATMENT", "CLOSE_P", 
			"VALID", "VAR_IF", "OPERATION", "SPACE", "OBEN", "CLOSE", "NAME_VALID", 
			"OBEN_VALID", "CLOSE_VALID", "COMMA_VALID", "OBEN_PR", "INSIDE_PR", "CLOSE_PR", 
			"INPUT", "PRAGRAPH", "EXTENDS", "OUTPUT", "ROW", "TABLE", "LIST", "DATA", 
			"HEAD", "NAME_PAGE", "ID_PAGE", "COMMA_PAGE", "OPEN_BODY", "CLOSE_BODY", 
			"LINK", "SEMICOLNE_COLUM", "OBEN_COLUMN", "NAME_COLUMN", "COMMA_COLUMN", 
			"CLOSE_COLUMN", "PARAGRAPH", "CLOSE_LIST", "OBEN_LIST", "COMMA_LIST", 
			"CSS", "SCRIPT", "EQUAL", "NAME_TEXT", "SESSION", "CLASS", "VALUE_OPTION", 
			"NAME_OPTION", "OPTION", "SELECT", "IMAGE", "EXTENSTION", "TEXT", "NUMBERING_MARK", 
			"FIELD", "EMAIL", "NUMBER", "PASSWORD", "DATE", "CHECKBOX", "RADIO", 
			"FILE", "OBEN_NAME", "CLOSE_NAME", "COMMA", "SEMICOLNE", "ITEM", "COMMA_S", 
			"ASSIGNMENT", "CLOSE_S", "NAME", "NAME_V", "OBEN_CLASS", "NAME_CLASS", 
			"COMMA_CLASS", "CLOSE_CLASS", "HREF", "NAME_LINK", "CLASSTABLE"
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

	public static class LanguageContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_language);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			start();
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode STARTPAGE() { return getToken(PAGEParser.STARTPAGE, 0); }
		public Css_pageContext css_page() {
			return getRuleContext(Css_pageContext.class,0);
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
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(STARTPAGE);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(93);
				page();
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONTROLLER) {
					{
					{
					setState(94);
					back_end();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PAGE );
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PAGE) {
				{
				setState(104);
				css_page();
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
			setState(107);
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
		public List<HeadContext> head() {
			return getRuleContexts(HeadContext.class);
		}
		public HeadContext head(int i) {
			return getRuleContext(HeadContext.class,i);
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
			setState(109);
			match(PAGE);
			setState(110);
			name_page();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HEAD) {
				{
				{
				setState(111);
				head();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		public List<TerminalNode> ID_PAGE() { return getTokens(PAGEParser.ID_PAGE); }
		public TerminalNode ID_PAGE(int i) {
			return getToken(PAGEParser.ID_PAGE, i);
		}
		public TerminalNode EXTENDS() { return getToken(PAGEParser.EXTENDS, 0); }
		public List<TerminalNode> COMMA_PAGE() { return getTokens(PAGEParser.COMMA_PAGE); }
		public TerminalNode COMMA_PAGE(int i) {
			return getToken(PAGEParser.COMMA_PAGE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(NAME_PAGE);
			setState(120);
			match(ID_PAGE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(121);
				match(EXTENDS);
				setState(122);
				match(ID_PAGE);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_PAGE) {
					{
					{
					setState(123);
					match(COMMA_PAGE);
					setState(124);
					match(ID_PAGE);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(132);
			match(OPEN_BODY);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INPUT - 57)) | (1L << (PRAGRAPH - 57)) | (1L << (OUTPUT - 57)) | (1L << (TABLE - 57)) | (1L << (LIST - 57)) | (1L << (DATA - 57)) | (1L << (LINK - 57)))) != 0)) {
				{
				{
				setState(133);
				inside();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode HEAD() { return getToken(PAGEParser.HEAD, 0); }
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(HEAD);
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS:
				{
				setState(142);
				css();
				}
				break;
			case SCRIPT:
				{
				setState(143);
				script();
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

	public static class CssContext extends ParserRuleContext {
		public TerminalNode CSS() { return getToken(PAGEParser.CSS, 0); }
		public TerminalNode EQUAL() { return getToken(PAGEParser.EQUAL, 0); }
		public TerminalNode NAME_TEXT() { return getToken(PAGEParser.NAME_TEXT, 0); }
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_css);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(CSS);
			setState(147);
			match(EQUAL);
			setState(148);
			match(NAME_TEXT);
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT() { return getToken(PAGEParser.SCRIPT, 0); }
		public TerminalNode EQUAL() { return getToken(PAGEParser.EQUAL, 0); }
		public TerminalNode NAME_TEXT() { return getToken(PAGEParser.NAME_TEXT, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(SCRIPT);
			setState(151);
			match(EQUAL);
			setState(152);
			match(NAME_TEXT);
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
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public PragraphContext pragraph() {
			return getRuleContext(PragraphContext.class,0);
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
		enterRule(_localctx, 18, RULE_inside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				{
				setState(154);
				input();
				}
				break;
			case OUTPUT:
				{
				setState(155);
				output();
				}
				break;
			case LINK:
				{
				setState(156);
				link();
				}
				break;
			case TABLE:
				{
				setState(157);
				table();
				}
				break;
			case LIST:
				{
				setState(158);
				list();
				}
				break;
			case DATA:
				{
				setState(159);
				data();
				}
				break;
			case PRAGRAPH:
				{
				setState(160);
				pragraph();
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

	public static class PragraphContext extends ParserRuleContext {
		public TerminalNode PRAGRAPH() { return getToken(PAGEParser.PRAGRAPH, 0); }
		public TerminalNode OBEN_PR() { return getToken(PAGEParser.OBEN_PR, 0); }
		public TerminalNode CLOSE_PR() { return getToken(PAGEParser.CLOSE_PR, 0); }
		public TerminalNode INSIDE_PR() { return getToken(PAGEParser.INSIDE_PR, 0); }
		public PragraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterPragraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitPragraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitPragraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragraphContext pragraph() throws RecognitionException {
		PragraphContext _localctx = new PragraphContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pragraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PRAGRAPH);
			setState(164);
			match(OBEN_PR);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSIDE_PR) {
				{
				setState(165);
				match(INSIDE_PR);
				}
			}

			setState(168);
			match(CLOSE_PR);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(PAGEParser.LIST, 0); }
		public TerminalNode OBEN_LIST() { return getToken(PAGEParser.OBEN_LIST, 0); }
		public List<TerminalNode> PARAGRAPH() { return getTokens(PAGEParser.PARAGRAPH); }
		public TerminalNode PARAGRAPH(int i) {
			return getToken(PAGEParser.PARAGRAPH, i);
		}
		public TerminalNode CLOSE_LIST() { return getToken(PAGEParser.CLOSE_LIST, 0); }
		public List<TerminalNode> COMMA_LIST() { return getTokens(PAGEParser.COMMA_LIST); }
		public TerminalNode COMMA_LIST(int i) {
			return getToken(PAGEParser.COMMA_LIST, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LIST);
			setState(171);
			match(OBEN_LIST);
			setState(172);
			match(PARAGRAPH);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_LIST) {
				{
				{
				setState(173);
				match(COMMA_LIST);
				setState(174);
				match(PARAGRAPH);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(CLOSE_LIST);
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
		enterRule(_localctx, 24, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LINK);
			setState(183);
			match(NAME_LINK);
			setState(184);
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

	public static class TableContext extends ParserRuleContext {
		public Head_tableContext head_table() {
			return getRuleContext(Head_tableContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			head_table();
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

	public static class Head_tableContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(PAGEParser.TABLE, 0); }
		public TerminalNode OBEN_COLUMN() { return getToken(PAGEParser.OBEN_COLUMN, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode CLOSE_COLUMN() { return getToken(PAGEParser.CLOSE_COLUMN, 0); }
		public TerminalNode SEMICOLNE_COLUM() { return getToken(PAGEParser.SEMICOLNE_COLUM, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public Head_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterHead_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitHead_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitHead_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Head_tableContext head_table() throws RecognitionException {
		Head_tableContext _localctx = new Head_tableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_head_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(TABLE);
			setState(189);
			match(OBEN_COLUMN);
			setState(190);
			column();
			setState(191);
			match(CLOSE_COLUMN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ROW) {
				{
				{
				setState(192);
				row();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(SEMICOLNE_COLUM);
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

	public static class ColumnContext extends ParserRuleContext {
		public List<TerminalNode> NAME_COLUMN() { return getTokens(PAGEParser.NAME_COLUMN); }
		public TerminalNode NAME_COLUMN(int i) {
			return getToken(PAGEParser.NAME_COLUMN, i);
		}
		public List<TerminalNode> COMMA_COLUMN() { return getTokens(PAGEParser.COMMA_COLUMN); }
		public TerminalNode COMMA_COLUMN(int i) {
			return getToken(PAGEParser.COMMA_COLUMN, i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(NAME_COLUMN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_COLUMN) {
				{
				{
				setState(201);
				match(COMMA_COLUMN);
				setState(202);
				match(NAME_COLUMN);
				}
				}
				setState(207);
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(PAGEParser.ROW, 0); }
		public TerminalNode OBEN_COLUMN() { return getToken(PAGEParser.OBEN_COLUMN, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode CLOSE_COLUMN() { return getToken(PAGEParser.CLOSE_COLUMN, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ROW);
			setState(209);
			match(OBEN_COLUMN);
			setState(210);
			column();
			setState(211);
			match(CLOSE_COLUMN);
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
		public TerminalNode NUMBERING_MARK() { return getToken(PAGEParser.NUMBERING_MARK, 0); }
		public Type_OUTContext type_OUT() {
			return getRuleContext(Type_OUTContext.class,0);
		}
		public Name_outContext name_out() {
			return getRuleContext(Name_outContext.class,0);
		}
		public TerminalNode SEMICOLNE() { return getToken(PAGEParser.SEMICOLNE, 0); }
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
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
		enterRule(_localctx, 34, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			match(OUTPUT);
			setState(214);
			match(NUMBERING_MARK);
			setState(215);
			type_OUT();
			setState(216);
			name_out();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(217);
				class_();
				}
			}

			setState(220);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(PAGEParser.INPUT, 0); }
		public TerminalNode NUMBERING_MARK() { return getToken(PAGEParser.NUMBERING_MARK, 0); }
		public TerminalNode SEMICOLNE() { return getToken(PAGEParser.SEMICOLNE, 0); }
		public Type_INContext type_IN() {
			return getRuleContext(Type_INContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
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
		enterRule(_localctx, 36, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(222);
			match(INPUT);
			setState(223);
			match(NUMBERING_MARK);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case FIELD:
			case EMAIL:
			case NUMBER:
			case PASSWORD:
			case DATE:
			case CHECKBOX:
			case RADIO:
			case FILE:
				{
				setState(224);
				type_IN();
				setState(225);
				name();
				}
				break;
			case SELECT:
				{
				setState(227);
				select();
				setState(228);
				name();
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					option();
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPTION );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(236);
				class_();
				}
			}

			setState(239);
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
		public TerminalNode TEXT() { return getToken(PAGEParser.TEXT, 0); }
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
		enterRule(_localctx, 38, RULE_type_IN);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (TEXT - 93)) | (1L << (FIELD - 93)) | (1L << (EMAIL - 93)) | (1L << (NUMBER - 93)) | (1L << (PASSWORD - 93)) | (1L << (DATE - 93)) | (1L << (CHECKBOX - 93)) | (1L << (RADIO - 93)) | (1L << (FILE - 93)))) != 0)) ) {
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PAGEParser.SELECT, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SELECT);
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
		public TerminalNode TEXT() { return getToken(PAGEParser.TEXT, 0); }
		public TerminalNode FILE() { return getToken(PAGEParser.FILE, 0); }
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
		enterRule(_localctx, 42, RULE_type_OUT);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(TEXT);
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FILE);
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(247);
				match(IMAGE);
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PAGEParser.CLASS, 0); }
		public TerminalNode OBEN_CLASS() { return getToken(PAGEParser.OBEN_CLASS, 0); }
		public List<TerminalNode> NAME_CLASS() { return getTokens(PAGEParser.NAME_CLASS); }
		public TerminalNode NAME_CLASS(int i) {
			return getToken(PAGEParser.NAME_CLASS, i);
		}
		public TerminalNode CLOSE_CLASS() { return getToken(PAGEParser.CLOSE_CLASS, 0); }
		public List<TerminalNode> COMMA_CLASS() { return getTokens(PAGEParser.COMMA_CLASS); }
		public TerminalNode COMMA_CLASS(int i) {
			return getToken(PAGEParser.COMMA_CLASS, i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterClass_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitClass_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitClass_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_class_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(CLASS);
			setState(251);
			match(OBEN_CLASS);
			setState(252);
			match(NAME_CLASS);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CLASS) {
				{
				{
				setState(253);
				match(COMMA_CLASS);
				setState(254);
				match(NAME_CLASS);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(CLOSE_CLASS);
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

	public static class Class_tableContext extends ParserRuleContext {
		public TerminalNode CLASSTABLE() { return getToken(PAGEParser.CLASSTABLE, 0); }
		public TerminalNode NUMBERING_MARK() { return getToken(PAGEParser.NUMBERING_MARK, 0); }
		public List<TerminalNode> NAME() { return getTokens(PAGEParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PAGEParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PAGEParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PAGEParser.COMMA, i);
		}
		public Class_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterClass_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitClass_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitClass_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_tableContext class_table() throws RecognitionException {
		Class_tableContext _localctx = new Class_tableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_class_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(CLASSTABLE);
			setState(263);
			match(NUMBERING_MARK);
			setState(264);
			match(NAME);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				match(NAME);
				}
				}
				setState(271);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode OBEN_NAME() { return getToken(PAGEParser.OBEN_NAME, 0); }
		public TerminalNode NAME() { return getToken(PAGEParser.NAME, 0); }
		public TerminalNode CLOSE_NAME() { return getToken(PAGEParser.CLOSE_NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(OBEN_NAME);
			setState(273);
			match(NAME);
			setState(274);
			match(CLOSE_NAME);
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

	public static class Name_outContext extends ParserRuleContext {
		public TerminalNode OBEN_NAME() { return getToken(PAGEParser.OBEN_NAME, 0); }
		public TerminalNode NAME() { return getToken(PAGEParser.NAME, 0); }
		public TerminalNode CLOSE_NAME() { return getToken(PAGEParser.CLOSE_NAME, 0); }
		public TerminalNode EXTENSTION() { return getToken(PAGEParser.EXTENSTION, 0); }
		public Name_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterName_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitName_out(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitName_out(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_outContext name_out() throws RecognitionException {
		Name_outContext _localctx = new Name_outContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_name_out);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OBEN_NAME);
			setState(277);
			match(NAME);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENSTION) {
				{
				setState(278);
				match(EXTENSTION);
				}
			}

			setState(281);
			match(CLOSE_NAME);
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(PAGEParser.OPTION, 0); }
		public TerminalNode NAME_OPTION() { return getToken(PAGEParser.NAME_OPTION, 0); }
		public TerminalNode NAME() { return getToken(PAGEParser.NAME, 0); }
		public TerminalNode CLOSE_NAME() { return getToken(PAGEParser.CLOSE_NAME, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(OPTION);
			setState(284);
			match(NAME_OPTION);
			setState(285);
			match(NAME);
			setState(286);
			match(CLOSE_NAME);
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(PAGEParser.DATA, 0); }
		public TerminalNode NUMBERING_MARK() { return getToken(PAGEParser.NUMBERING_MARK, 0); }
		public SeesionContext seesion() {
			return getRuleContext(SeesionContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(DATA);
			setState(289);
			match(NUMBERING_MARK);
			{
			setState(290);
			seesion();
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

	public static class SeesionContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(PAGEParser.SESSION, 0); }
		public Array_sContext array_s() {
			return getRuleContext(Array_sContext.class,0);
		}
		public TerminalNode CLOSE_S() { return getToken(PAGEParser.CLOSE_S, 0); }
		public TerminalNode SEMICOLNE() { return getToken(PAGEParser.SEMICOLNE, 0); }
		public SeesionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seesion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterSeesion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitSeesion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitSeesion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeesionContext seesion() throws RecognitionException {
		SeesionContext _localctx = new SeesionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_seesion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(SESSION);
			setState(293);
			array_s();
			setState(294);
			match(CLOSE_S);
			setState(295);
			match(SEMICOLNE);
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

	public static class Array_sContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<TerminalNode> COMMA_S() { return getTokens(PAGEParser.COMMA_S); }
		public TerminalNode COMMA_S(int i) {
			return getToken(PAGEParser.COMMA_S, i);
		}
		public Array_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterArray_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitArray_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitArray_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_sContext array_s() throws RecognitionException {
		Array_sContext _localctx = new Array_sContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			item();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_S) {
				{
				{
				setState(298);
				match(COMMA_S);
				setState(299);
				item();
				}
				}
				setState(304);
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

	public static class ItemContext extends ParserRuleContext {
		public List<TerminalNode> ITEM() { return getTokens(PAGEParser.ITEM); }
		public TerminalNode ITEM(int i) {
			return getToken(PAGEParser.ITEM, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PAGEParser.ASSIGNMENT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ITEM);
			setState(306);
			match(ASSIGNMENT);
			setState(307);
			match(ITEM);
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
		enterRule(_localctx, 62, RULE_back_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 64, RULE_defnation_controller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(CONTROLLER);
			setState(312);
			name_controller();
			setState(313);
			match(CONTROLS);
			setState(314);
			name_controller_page();
			setState(315);
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
		public TerminalNode ID_CONTROLLER() { return getToken(PAGEParser.ID_CONTROLLER, 0); }
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
		enterRule(_localctx, 66, RULE_name_controller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(NAME_CONTROLLER);
			setState(318);
			match(ID_CONTROLLER);
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
		public TerminalNode ID_CONTROLLER() { return getToken(PAGEParser.ID_CONTROLLER, 0); }
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
		enterRule(_localctx, 68, RULE_name_controller_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(NAME_CONTROLLER);
			setState(321);
			match(ID_CONTROLLER);
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
		public List<Body_controllerContext> body_controller() {
			return getRuleContexts(Body_controllerContext.class);
		}
		public Body_controllerContext body_controller(int i) {
			return getRuleContext(Body_controllerContext.class,i);
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
		enterRule(_localctx, 70, RULE_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(OPEN_CONTROLLER);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(324);
				body_controller();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GO) {
				{
				setState(330);
				match(GO);
				}
			}

			setState(333);
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

	public static class Body_controllerContext extends ParserRuleContext {
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public For_bodyContext for_body() {
			return getRuleContext(For_bodyContext.class,0);
		}
		public Print_phpContext print_php() {
			return getRuleContext(Print_phpContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Body_controllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterBody_controller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitBody_controller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitBody_controller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_controllerContext body_controller() throws RecognitionException {
		Body_controllerContext _localctx = new Body_controllerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_body_controller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(335);
				if_body();
				}
				break;
			case FOR:
				{
				setState(336);
				for_body();
				}
				break;
			case PRINT:
				{
				setState(337);
				print_php();
				}
				break;
			case VARIABLE:
				{
				setState(338);
				variable();
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

	public static class If_bodyContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PAGEParser.IF, 0); }
		public TerminalNode OBEN() { return getToken(PAGEParser.OBEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(PAGEParser.CLOSE, 0); }
		public TerminalNode END_IF() { return getToken(PAGEParser.END_IF, 0); }
		public List<Body_controllerContext> body_controller() {
			return getRuleContexts(Body_controllerContext.class);
		}
		public Body_controllerContext body_controller(int i) {
			return getRuleContext(Body_controllerContext.class,i);
		}
		public TerminalNode GO() { return getToken(PAGEParser.GO, 0); }
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
		enterRule(_localctx, 74, RULE_if_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IF);
			setState(342);
			match(OBEN);
			setState(343);
			condition();
			setState(344);
			match(CLOSE);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(345);
				body_controller();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GO) {
				{
				setState(351);
				match(GO);
				}
			}

			setState(354);
			match(END_IF);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> VAR_IF() { return getTokens(PAGEParser.VAR_IF); }
		public TerminalNode VAR_IF(int i) {
			return getToken(PAGEParser.VAR_IF, i);
		}
		public TerminalNode OPERATION() { return getToken(PAGEParser.OPERATION, 0); }
		public TerminalNode VALID() { return getToken(PAGEParser.VALID, 0); }
		public TerminalNode OBEN_VALID() { return getToken(PAGEParser.OBEN_VALID, 0); }
		public List<TerminalNode> NAME_VALID() { return getTokens(PAGEParser.NAME_VALID); }
		public TerminalNode NAME_VALID(int i) {
			return getToken(PAGEParser.NAME_VALID, i);
		}
		public TerminalNode CLOSE_VALID() { return getToken(PAGEParser.CLOSE_VALID, 0); }
		public List<TerminalNode> SPACE() { return getTokens(PAGEParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(PAGEParser.SPACE, i);
		}
		public List<TerminalNode> COMMA_VALID() { return getTokens(PAGEParser.COMMA_VALID); }
		public TerminalNode COMMA_VALID(int i) {
			return getToken(PAGEParser.COMMA_VALID, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_IF:
				{
				setState(356);
				match(VAR_IF);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(357);
					match(SPACE);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(OPERATION);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(364);
					match(SPACE);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(VAR_IF);
				}
				break;
			case VALID:
				{
				setState(371);
				match(VALID);
				setState(372);
				match(OBEN_VALID);
				setState(373);
				match(NAME_VALID);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_VALID) {
					{
					{
					setState(374);
					match(COMMA_VALID);
					setState(375);
					match(NAME_VALID);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(CLOSE_VALID);
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
		enterRule(_localctx, 78, RULE_for_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(FOR);
			setState(385);
			match(OBEN);
			setState(386);
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

	public static class Print_phpContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PAGEParser.PRINT, 0); }
		public TerminalNode OBEN_P() { return getToken(PAGEParser.OBEN_P, 0); }
		public TerminalNode STATMENT() { return getToken(PAGEParser.STATMENT, 0); }
		public TerminalNode CLOSE_P() { return getToken(PAGEParser.CLOSE_P, 0); }
		public Print_phpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_php; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterPrint_php(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitPrint_php(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitPrint_php(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_phpContext print_php() throws RecognitionException {
		Print_phpContext _localctx = new Print_phpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_print_php);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(PRINT);
			setState(389);
			match(OBEN_P);
			setState(390);
			match(STATMENT);
			setState(391);
			match(CLOSE_P);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PAGEParser.VARIABLE, 0); }
		public TerminalNode NAME() { return getToken(PAGEParser.NAME, 0); }
		public TerminalNode SEMICOLNE_V() { return getToken(PAGEParser.SEMICOLNE_V, 0); }
		public TerminalNode EQUAL_V() { return getToken(PAGEParser.EQUAL_V, 0); }
		public List<TerminalNode> NAME_V() { return getTokens(PAGEParser.NAME_V); }
		public TerminalNode NAME_V(int i) {
			return getToken(PAGEParser.NAME_V, i);
		}
		public TerminalNode OBERATION_V() { return getToken(PAGEParser.OBERATION_V, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(VARIABLE);
			setState(394);
			match(NAME);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(395);
				match(EQUAL_V);
				setState(396);
				match(NAME_V);
				}
				break;
			case 2:
				{
				setState(397);
				match(EQUAL_V);
				setState(398);
				match(NAME_V);
				setState(399);
				match(OBERATION_V);
				setState(400);
				match(NAME_V);
				}
				break;
			}
			setState(403);
			match(SEMICOLNE_V);
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

	public static class Css_pageContext extends ParserRuleContext {
		public TerminalNode CSS_PAGE() { return getToken(PAGEParser.CSS_PAGE, 0); }
		public TerminalNode CLOSE_CSS() { return getToken(PAGEParser.CLOSE_CSS, 0); }
		public List<Body_cssContext> body_css() {
			return getRuleContexts(Body_cssContext.class);
		}
		public Body_cssContext body_css(int i) {
			return getRuleContext(Body_cssContext.class,i);
		}
		public Css_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterCss_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitCss_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitCss_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_pageContext css_page() throws RecognitionException {
		Css_pageContext _localctx = new Css_pageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_css_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(CSS_PAGE);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH) {
				{
				{
				setState(406);
				body_css();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(CLOSE_CSS);
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

	public static class Body_cssContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(PAGEParser.PATH, 0); }
		public List<TerminalNode> NAME_CSS() { return getTokens(PAGEParser.NAME_CSS); }
		public TerminalNode NAME_CSS(int i) {
			return getToken(PAGEParser.NAME_CSS, i);
		}
		public TerminalNode CLASS_CSS() { return getToken(PAGEParser.CLASS_CSS, 0); }
		public TerminalNode OBEN_CL() { return getToken(PAGEParser.OBEN_CL, 0); }
		public TerminalNode CLOSE_CL() { return getToken(PAGEParser.CLOSE_CL, 0); }
		public List<Body_classContext> body_class() {
			return getRuleContexts(Body_classContext.class);
		}
		public Body_classContext body_class(int i) {
			return getRuleContext(Body_classContext.class,i);
		}
		public Body_cssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterBody_css(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitBody_css(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitBody_css(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_cssContext body_css() throws RecognitionException {
		Body_cssContext _localctx = new Body_cssContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_body_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(PATH);
			setState(415);
			match(NAME_CSS);
			setState(416);
			match(CLASS_CSS);
			setState(417);
			match(NAME_CSS);
			setState(418);
			match(OBEN_CL);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLOR) | (1L << BACKGROUNG) | (1L << PADDING) | (1L << MARGINATE) | (1L << WIDTH) | (1L << HEIGHT))) != 0)) {
				{
				{
				setState(419);
				body_class();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(CLOSE_CL);
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

	public static class Body_classContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(PAGEParser.COLOR, 0); }
		public TerminalNode NUMBERING_M() { return getToken(PAGEParser.NUMBERING_M, 0); }
		public TerminalNode VALUE_COLOR() { return getToken(PAGEParser.VALUE_COLOR, 0); }
		public TerminalNode SEMICOLNE_M() { return getToken(PAGEParser.SEMICOLNE_M, 0); }
		public TerminalNode BACKGROUNG() { return getToken(PAGEParser.BACKGROUNG, 0); }
		public TerminalNode PADDING() { return getToken(PAGEParser.PADDING, 0); }
		public TerminalNode NUMBER_() { return getToken(PAGEParser.NUMBER_, 0); }
		public TerminalNode NUMBER__() { return getToken(PAGEParser.NUMBER__, 0); }
		public TerminalNode MARGINATE() { return getToken(PAGEParser.MARGINATE, 0); }
		public TerminalNode WIDTH() { return getToken(PAGEParser.WIDTH, 0); }
		public TerminalNode HEIGHT() { return getToken(PAGEParser.HEIGHT, 0); }
		public Body_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).enterBody_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGEParserListener ) ((PAGEParserListener)listener).exitBody_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PAGEParserVisitor ) return ((PAGEParserVisitor<? extends T>)visitor).visitBody_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_classContext body_class() throws RecognitionException {
		Body_classContext _localctx = new Body_classContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_body_class);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(COLOR);
				setState(428);
				match(NUMBERING_M);
				setState(429);
				match(VALUE_COLOR);
				setState(430);
				match(SEMICOLNE_M);
				}
				break;
			case BACKGROUNG:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(BACKGROUNG);
				setState(432);
				match(NUMBERING_M);
				setState(433);
				match(VALUE_COLOR);
				setState(434);
				match(SEMICOLNE_M);
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(PADDING);
				setState(436);
				match(NUMBERING_M);
				setState(437);
				match(NUMBER_);
				setState(438);
				match(NUMBER__);
				setState(439);
				match(SEMICOLNE_M);
				}
				break;
			case MARGINATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				match(MARGINATE);
				setState(441);
				match(NUMBERING_M);
				setState(442);
				match(NUMBER_);
				setState(443);
				match(NUMBER__);
				setState(444);
				match(SEMICOLNE_M);
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				match(WIDTH);
				setState(446);
				match(NUMBERING_M);
				setState(447);
				match(NUMBER_);
				setState(448);
				match(NUMBER__);
				setState(449);
				match(SEMICOLNE_M);
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(HEIGHT);
				setState(451);
				match(NUMBERING_M);
				setState(452);
				match(NUMBER_);
				setState(453);
				match(NUMBER__);
				setState(454);
				match(SEMICOLNE_M);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u01cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\7\3b\n\3\f\3\16\3e\13\3\6\3g\n\3"+
		"\r\3\16\3h\3\3\5\3l\n\3\3\4\3\4\3\5\3\5\3\5\7\5s\n\5\f\5\16\5v\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\5\6\u0085"+
		"\n\6\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"\u0093\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00a4\n\13\3\f\3\f\3\f\5\f\u00a9\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00b2\n\r\f\r\16\r\u00b5\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00dd\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u00e9\n\24\r\24\16"+
		"\24\u00ea\5\24\u00ed\n\24\3\24\5\24\u00f0\n\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\5\27\u00fb\n\27\3\30\3\30\3\30\3\30\3\30\7\30\u0102"+
		"\n\30\f\30\16\30\u0105\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u010e"+
		"\n\31\f\31\16\31\u0111\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u011a"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u012f\n\37\f\37\16\37\u0132\13\37"+
		"\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\7%"+
		"\u0148\n%\f%\16%\u014b\13%\3%\5%\u014e\n%\3%\3%\3&\3&\3&\3&\5&\u0156\n"+
		"&\3\'\3\'\3\'\3\'\3\'\7\'\u015d\n\'\f\'\16\'\u0160\13\'\3\'\5\'\u0163"+
		"\n\'\3\'\3\'\3(\3(\7(\u0169\n(\f(\16(\u016c\13(\3(\3(\7(\u0170\n(\f(\16"+
		"(\u0173\13(\3(\3(\3(\3(\3(\3(\7(\u017b\n(\f(\16(\u017e\13(\3(\5(\u0181"+
		"\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0194\n+\3+"+
		"\3+\3,\3,\7,\u019a\n,\f,\16,\u019d\13,\3,\3,\3-\3-\3-\3-\3-\3-\7-\u01a7"+
		"\n-\f-\16-\u01aa\13-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01ca\n.\3.\2\2/\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2"+
		"\3\4\2__ah\2\u01ce\2\\\3\2\2\2\4^\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\ny\3\2"+
		"\2\2\f\u0086\3\2\2\2\16\u008f\3\2\2\2\20\u0094\3\2\2\2\22\u0098\3\2\2"+
		"\2\24\u00a3\3\2\2\2\26\u00a5\3\2\2\2\30\u00ac\3\2\2\2\32\u00b8\3\2\2\2"+
		"\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00ca\3\2\2\2\"\u00d2\3\2\2\2$\u00d7"+
		"\3\2\2\2&\u00e0\3\2\2\2(\u00f3\3\2\2\2*\u00f5\3\2\2\2,\u00fa\3\2\2\2."+
		"\u00fc\3\2\2\2\60\u0108\3\2\2\2\62\u0112\3\2\2\2\64\u0116\3\2\2\2\66\u011d"+
		"\3\2\2\28\u0122\3\2\2\2:\u0126\3\2\2\2<\u012b\3\2\2\2>\u0133\3\2\2\2@"+
		"\u0137\3\2\2\2B\u0139\3\2\2\2D\u013f\3\2\2\2F\u0142\3\2\2\2H\u0145\3\2"+
		"\2\2J\u0155\3\2\2\2L\u0157\3\2\2\2N\u0180\3\2\2\2P\u0182\3\2\2\2R\u0186"+
		"\3\2\2\2T\u018b\3\2\2\2V\u0197\3\2\2\2X\u01a0\3\2\2\2Z\u01c9\3\2\2\2\\"+
		"]\5\4\3\2]\3\3\2\2\2^f\7\3\2\2_c\5\6\4\2`b\5@!\2a`\3\2\2\2be\3\2\2\2c"+
		"a\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f_\3\2\2\2gh\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2ik\3\2\2\2jl\5V,\2kj\3\2\2\2kl\3\2\2\2l\5\3\2\2\2mn\5\b\5\2"+
		"n\7\3\2\2\2op\7\4\2\2pt\5\n\6\2qs\5\16\b\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2"+
		"\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5\f\7\2x\t\3\2\2\2yz\7D\2\2z\u0084"+
		"\7E\2\2{|\7=\2\2|\u0081\7E\2\2}~\7F\2\2~\u0080\7E\2\2\177}\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084{\3\2\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2"+
		"\2\2\u0086\u008a\7G\2\2\u0087\u0089\5\24\13\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7H\2\2\u008e\r\3\2\2\2\u008f\u0092"+
		"\7C\2\2\u0090\u0093\5\20\t\2\u0091\u0093\5\22\n\2\u0092\u0090\3\2\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\17\3\2\2\2\u0094\u0095\7S\2\2\u0095\u0096\7"+
		"U\2\2\u0096\u0097\7V\2\2\u0097\21\3\2\2\2\u0098\u0099\7T\2\2\u0099\u009a"+
		"\7U\2\2\u009a\u009b\7V\2\2\u009b\23\3\2\2\2\u009c\u00a4\5&\24\2\u009d"+
		"\u00a4\5$\23\2\u009e\u00a4\5\32\16\2\u009f\u00a4\5\34\17\2\u00a0\u00a4"+
		"\5\30\r\2\u00a1\u00a4\58\35\2\u00a2\u00a4\5\26\f\2\u00a3\u009c\3\2\2\2"+
		"\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\25\3\2\2\2\u00a5"+
		"\u00a6\7<\2\2\u00a6\u00a8\78\2\2\u00a7\u00a9\79\2\2\u00a8\u00a7\3\2\2"+
		"\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7:\2\2\u00ab\27"+
		"\3\2\2\2\u00ac\u00ad\7A\2\2\u00ad\u00ae\7Q\2\2\u00ae\u00b3\7O\2\2\u00af"+
		"\u00b0\7R\2\2\u00b0\u00b2\7O\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\7P\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\7I\2\2\u00b9"+
		"\u00ba\7x\2\2\u00ba\u00bb\7w\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\5\36\20"+
		"\2\u00bd\35\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1"+
		"\5 \21\2\u00c1\u00c5\7N\2\2\u00c2\u00c4\5\"\22\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7J\2\2\u00c9\37\3\2\2\2\u00ca\u00cf"+
		"\7L\2\2\u00cb\u00cc\7M\2\2\u00cc\u00ce\7L\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0!\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5"+
		"\5 \21\2\u00d5\u00d6\7N\2\2\u00d6#\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9"+
		"\7`\2\2\u00d9\u00da\5,\27\2\u00da\u00dc\5\64\33\2\u00db\u00dd\5.\30\2"+
		"\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\7l\2\2\u00df%\3\2\2\2\u00e0\u00e1\7;\2\2\u00e1\u00ec\7`\2\2\u00e2\u00e3"+
		"\5(\25\2\u00e3\u00e4\5\62\32\2\u00e4\u00ed\3\2\2\2\u00e5\u00e6\5*\26\2"+
		"\u00e6\u00e8\5\62\32\2\u00e7\u00e9\5\66\34\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00e2\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00f0\5.\30\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\7l\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\t\2\2\2\u00f4)\3\2"+
		"\2\2\u00f5\u00f6\7\\\2\2\u00f6+\3\2\2\2\u00f7\u00fb\7_\2\2\u00f8\u00fb"+
		"\7h\2\2\u00f9\u00fb\7]\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb-\3\2\2\2\u00fc\u00fd\7X\2\2\u00fd\u00fe\7s\2\2\u00fe"+
		"\u0103\7t\2\2\u00ff\u0100\7u\2\2\u0100\u0102\7t\2\2\u0101\u00ff\3\2\2"+
		"\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7v\2\2\u0107/\3\2\2\2\u0108\u0109"+
		"\7y\2\2\u0109\u010a\7`\2\2\u010a\u010f\7q\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010e\7q\2\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\61\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113"+
		"\7i\2\2\u0113\u0114\7q\2\2\u0114\u0115\7j\2\2\u0115\63\3\2\2\2\u0116\u0117"+
		"\7i\2\2\u0117\u0119\7q\2\2\u0118\u011a\7^\2\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7j\2\2\u011c\65\3\2\2\2"+
		"\u011d\u011e\7[\2\2\u011e\u011f\7Z\2\2\u011f\u0120\7q\2\2\u0120\u0121"+
		"\7j\2\2\u0121\67\3\2\2\2\u0122\u0123\7B\2\2\u0123\u0124\7`\2\2\u0124\u0125"+
		"\5:\36\2\u01259\3\2\2\2\u0126\u0127\7W\2\2\u0127\u0128\5<\37\2\u0128\u0129"+
		"\7p\2\2\u0129\u012a\7l\2\2\u012a;\3\2\2\2\u012b\u0130\5> \2\u012c\u012d"+
		"\7n\2\2\u012d\u012f\5> \2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131=\3\2\2\2\u0132\u0130\3\2\2\2"+
		"\u0133\u0134\7m\2\2\u0134\u0135\7o\2\2\u0135\u0136\7m\2\2\u0136?\3\2\2"+
		"\2\u0137\u0138\5B\"\2\u0138A\3\2\2\2\u0139\u013a\7\5\2\2\u013a\u013b\5"+
		"D#\2\u013b\u013c\7\33\2\2\u013c\u013d\5F$\2\u013d\u013e\5H%\2\u013eC\3"+
		"\2\2\2\u013f\u0140\7)\2\2\u0140\u0141\7\34\2\2\u0141E\3\2\2\2\u0142\u0143"+
		"\7)\2\2\u0143\u0144\7\34\2\2\u0144G\3\2\2\2\u0145\u0149\7\35\2\2\u0146"+
		"\u0148\5J&\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2"+
		"\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e"+
		"\7\32\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u0150\7\36\2\2\u0150I\3\2\2\2\u0151\u0156\5L\'\2\u0152\u0156\5"+
		"P)\2\u0153\u0156\5R*\2\u0154\u0156\5T+\2\u0155\u0151\3\2\2\2\u0155\u0152"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156K\3\2\2\2\u0157"+
		"\u0158\7\30\2\2\u0158\u0159\7\62\2\2\u0159\u015a\5N(\2\u015a\u015e\7\63"+
		"\2\2\u015b\u015d\5J&\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0163\7\32\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u0165\7\31\2\2\u0165M\3\2\2\2\u0166\u016a\7/\2\2\u0167\u0169"+
		"\7\61\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0171"+
		"\7\60\2\2\u016e\u0170\7\61\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0181\7/\2\2\u0175\u0176\7.\2\2\u0176\u0177\7\65\2\2\u0177"+
		"\u017c\7\64\2\2\u0178\u0179\7\67\2\2\u0179\u017b\7\64\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\7\66\2\2\u0180\u0166\3"+
		"\2\2\2\u0180\u0175\3\2\2\2\u0181O\3\2\2\2\u0182\u0183\7\37\2\2\u0183\u0184"+
		"\7\62\2\2\u0184\u0185\7\63\2\2\u0185Q\3\2\2\2\u0186\u0187\7 \2\2\u0187"+
		"\u0188\7+\2\2\u0188\u0189\7,\2\2\u0189\u018a\7-\2\2\u018aS\3\2\2\2\u018b"+
		"\u018c\7!\2\2\u018c\u0193\7q\2\2\u018d\u018e\7\"\2\2\u018e\u0194\7r\2"+
		"\2\u018f\u0190\7\"\2\2\u0190\u0191\7r\2\2\u0191\u0192\7*\2\2\u0192\u0194"+
		"\7r\2\2\u0193\u018d\3\2\2\2\u0193\u018f\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\7#\2\2\u0196U\3\2\2\2\u0197\u019b\7\6\2\2\u0198"+
		"\u019a\5X-\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2"+
		"\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f"+
		"\7\13\2\2\u019fW\3\2\2\2\u01a0\u01a1\7\b\2\2\u01a1\u01a2\7\n\2\2\u01a2"+
		"\u01a3\7\t\2\2\u01a3\u01a4\7\n\2\2\u01a4\u01a8\7\7\2\2\u01a5\u01a7\5Z"+
		".\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\f"+
		"\2\2\u01acY\3\2\2\2\u01ad\u01ae\7\r\2\2\u01ae\u01af\7\16\2\2\u01af\u01b0"+
		"\7\27\2\2\u01b0\u01ca\7\17\2\2\u01b1\u01b2\7\20\2\2\u01b2\u01b3\7\16\2"+
		"\2\u01b3\u01b4\7\27\2\2\u01b4\u01ca\7\17\2\2\u01b5\u01b6\7\21\2\2\u01b6"+
		"\u01b7\7\16\2\2\u01b7\u01b8\7\25\2\2\u01b8\u01b9\7\26\2\2\u01b9\u01ca"+
		"\7\17\2\2\u01ba\u01bb\7\22\2\2\u01bb\u01bc\7\16\2\2\u01bc\u01bd\7\25\2"+
		"\2\u01bd\u01be\7\26\2\2\u01be\u01ca\7\17\2\2\u01bf\u01c0\7\23\2\2\u01c0"+
		"\u01c1\7\16\2\2\u01c1\u01c2\7\25\2\2\u01c2\u01c3\7\26\2\2\u01c3\u01ca"+
		"\7\17\2\2\u01c4\u01c5\7\24\2\2\u01c5\u01c6\7\16\2\2\u01c6\u01c7\7\25\2"+
		"\2\u01c7\u01c8\7\26\2\2\u01c8\u01ca\7\17\2\2\u01c9\u01ad\3\2\2\2\u01c9"+
		"\u01b1\3\2\2\2\u01c9\u01b5\3\2\2\2\u01c9\u01ba\3\2\2\2\u01c9\u01bf\3\2"+
		"\2\2\u01c9\u01c4\3\2\2\2\u01ca[\3\2\2\2%chkt\u0081\u0084\u008a\u0092\u00a3"+
		"\u00a8\u00b3\u00c5\u00cf\u00dc\u00ea\u00ec\u00ef\u00fa\u0103\u010f\u0119"+
		"\u0130\u0149\u014d\u0155\u015e\u0162\u016a\u0171\u017c\u0180\u0193\u019b"+
		"\u01a8\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}