// Generated from C:/Users/ESRAA/Downloads/Telegram Desktop/compoailer/src\css3.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class css3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Comment=16, 
		Space=17, Cdo=18, Cdc=19, Includes=20, DashMatch=21, Hash=22, Import=23, 
		Page=24, Media=25, Namespace=26, Charset=27, Important=28, Percentage=29, 
		Uri=30, UnicodeRange=31, MediaOnly=32, Not=33, And=34, Dimension=35, UnknownDimension=36, 
		Plus=37, Minus=38, Greater=39, Comma=40, Tilde=41, PseudoNot=42, Number=43, 
		String_=44, PrefixMatch=45, SuffixMatch=46, SubstringMatch=47, FontFace=48, 
		Supports=49, Or=50, Keyframes=51, From=52, To=53, Calc=54, Viewport=55, 
		CounterStyle=56, FontFeatureValues=57, DxImageTransform=58, Variable=59, 
		Var=60, Ident=61, Function_=62;
	public static final int
		RULE_stylesheet = 0, RULE_charset = 1, RULE_imports = 2, RULE_namespace_ = 3, 
		RULE_namespacePrefix = 4, RULE_media = 5, RULE_mediaQueryList = 6, RULE_mediaQuery = 7, 
		RULE_mediaType = 8, RULE_mediaExpression = 9, RULE_mediaFeature = 10, 
		RULE_page = 11, RULE_pseudoPage = 12, RULE_selectorGroup = 13, RULE_selector = 14, 
		RULE_combinator = 15, RULE_simpleSelectorSequence = 16, RULE_typeSelector = 17, 
		RULE_typeNamespacePrefix = 18, RULE_elementName = 19, RULE_universal = 20, 
		RULE_className = 21, RULE_attrib = 22, RULE_pseudo = 23, RULE_functionalPseudo = 24, 
		RULE_expression = 25, RULE_negation = 26, RULE_negationArg = 27, RULE_operator_ = 28, 
		RULE_property_ = 29, RULE_ruleset = 30, RULE_declarationList = 31, RULE_declaration = 32, 
		RULE_prio = 33, RULE_value = 34, RULE_expr = 35, RULE_term = 36, RULE_function_ = 37, 
		RULE_dxImageTransform = 38, RULE_hexcolor = 39, RULE_number = 40, RULE_percentage = 41, 
		RULE_dimension = 42, RULE_unknownDimension = 43, RULE_any_ = 44, RULE_atRule = 45, 
		RULE_atKeyword = 46, RULE_unused = 47, RULE_block = 48, RULE_nestedStatement = 49, 
		RULE_groupRuleBody = 50, RULE_supportsRule = 51, RULE_supportsCondition = 52, 
		RULE_supportsConditionInParens = 53, RULE_supportsNegation = 54, RULE_supportsConjunction = 55, 
		RULE_supportsDisjunction = 56, RULE_supportsDeclarationCondition = 57, 
		RULE_generalEnclosed = 58, RULE_var_ = 59, RULE_calc = 60, RULE_calcSum = 61, 
		RULE_calcProduct = 62, RULE_calcValue = 63, RULE_fontFaceRule = 64, RULE_fontFaceDeclaration = 65, 
		RULE_keyframesRule = 66, RULE_keyframesBlocks = 67, RULE_keyframeSelector = 68, 
		RULE_viewport = 69, RULE_counterStyle = 70, RULE_fontFeatureValuesRule = 71, 
		RULE_fontFamilyNameList = 72, RULE_fontFamilyName = 73, RULE_featureValueBlock = 74, 
		RULE_featureType = 75, RULE_featureValueDefinition = 76, RULE_ident = 77, 
		RULE_ws = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "charset", "imports", "namespace_", "namespacePrefix", 
			"media", "mediaQueryList", "mediaQuery", "mediaType", "mediaExpression", 
			"mediaFeature", "page", "pseudoPage", "selectorGroup", "selector", "combinator", 
			"simpleSelectorSequence", "typeSelector", "typeNamespacePrefix", "elementName", 
			"universal", "className", "attrib", "pseudo", "functionalPseudo", "expression", 
			"negation", "negationArg", "operator_", "property_", "ruleset", "declarationList", 
			"declaration", "prio", "value", "expr", "term", "function_", "dxImageTransform", 
			"hexcolor", "number", "percentage", "dimension", "unknownDimension", 
			"any_", "atRule", "atKeyword", "unused", "block", "nestedStatement", 
			"groupRuleBody", "supportsRule", "supportsCondition", "supportsConditionInParens", 
			"supportsNegation", "supportsConjunction", "supportsDisjunction", "supportsDeclarationCondition", 
			"generalEnclosed", "var_", "calc", "calcSum", "calcProduct", "calcValue", 
			"fontFaceRule", "fontFaceDeclaration", "keyframesRule", "keyframesBlocks", 
			"keyframeSelector", "viewport", "counterStyle", "fontFeatureValuesRule", 
			"fontFamilyNameList", "fontFamilyName", "featureValueBlock", "featureType", 
			"featureValueDefinition", "ident", "ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "':'", "')'", "'{'", "'}'", "'*'", "'|'", "'.'", 
			"'['", "'='", "']'", "'/'", "'_'", "'@'", null, null, "'<!--'", "'-->'", 
			"'~='", "'|='", null, null, null, null, null, "'@charset '", null, null, 
			null, null, null, null, null, null, null, "'+'", "'-'", "'>'", "','", 
			"'~'", null, null, null, "'^='", "'$='", "'*='", null, null, null, null, 
			null, null, "'calc('", null, null, null, null, null, "'var('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Comment", "Space", "Cdo", "Cdc", "Includes", 
			"DashMatch", "Hash", "Import", "Page", "Media", "Namespace", "Charset", 
			"Important", "Percentage", "Uri", "UnicodeRange", "MediaOnly", "Not", 
			"And", "Dimension", "UnknownDimension", "Plus", "Minus", "Greater", "Comma", 
			"Tilde", "PseudoNot", "Number", "String_", "PrefixMatch", "SuffixMatch", 
			"SubstringMatch", "FontFace", "Supports", "Or", "Keyframes", "From", 
			"To", "Calc", "Viewport", "CounterStyle", "FontFeatureValues", "DxImageTransform", 
			"Variable", "Var", "Ident", "Function_"
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
	public String getGrammarFileName() { return "css3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public css3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StylesheetContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(css3Parser.EOF, 0); }
		public List<CharsetContext> charset() {
			return getRuleContexts(CharsetContext.class);
		}
		public CharsetContext charset(int i) {
			return getRuleContext(CharsetContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<Namespace_Context> namespace_() {
			return getRuleContexts(Namespace_Context.class);
		}
		public Namespace_Context namespace_(int i) {
			return getRuleContext(Namespace_Context.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<TerminalNode> Comment() { return getTokens(css3Parser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(css3Parser.Comment, i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<TerminalNode> Cdo() { return getTokens(css3Parser.Cdo); }
		public TerminalNode Cdo(int i) {
			return getToken(css3Parser.Cdo, i);
		}
		public List<TerminalNode> Cdc() { return getTokens(css3Parser.Cdc); }
		public TerminalNode Cdc(int i) {
			return getToken(css3Parser.Cdc, i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			ws();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Charset) {
				{
				{
				setState(159);
				charset();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(160);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(171);
				imports();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(172);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Namespace) {
				{
				{
				setState(183);
				namespace_();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(184);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__14) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Page) | (1L << Media) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << PseudoNot) | (1L << Number) | (1L << String_) | (1L << FontFace) | (1L << Supports) | (1L << Or) | (1L << Keyframes) | (1L << From) | (1L << To) | (1L << Viewport) | (1L << CounterStyle) | (1L << FontFeatureValues) | (1L << Ident) | (1L << Function_))) != 0)) {
				{
				{
				setState(195);
				nestedStatement();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(196);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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

	public static class CharsetContext extends ParserRuleContext {
		public CharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset; }
	 
		public CharsetContext() { }
		public void copyFrom(CharsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadCharsetContext extends CharsetContext {
		public TerminalNode Charset() { return getToken(css3Parser.Charset, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public BadCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitBadCharset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoodCharsetContext extends CharsetContext {
		public TerminalNode Charset() { return getToken(css3Parser.Charset, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public GoodCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitGoodCharset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetContext charset() throws RecognitionException {
		CharsetContext _localctx = new CharsetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_charset);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new GoodCharsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(Charset);
				setState(210);
				ws();
				setState(211);
				match(String_);
				setState(212);
				ws();
				setState(213);
				match(T__0);
				setState(214);
				ws();
				}
				break;
			case 2:
				_localctx = new BadCharsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(Charset);
				setState(217);
				ws();
				setState(218);
				match(String_);
				setState(219);
				ws();
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

	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadImportContext extends ImportsContext {
		public TerminalNode Import() { return getToken(css3Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public BadImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitBadImport(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoodImportContext extends ImportsContext {
		public TerminalNode Import() { return getToken(css3Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public GoodImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitGoodImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(Import);
				setState(224);
				ws();
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				ws();
				setState(227);
				mediaQueryList();
				setState(228);
				match(T__0);
				setState(229);
				ws();
				}
				break;
			case 2:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(Import);
				setState(232);
				ws();
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				ws();
				setState(235);
				match(T__0);
				setState(236);
				ws();
				}
				break;
			case 3:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(Import);
				setState(239);
				ws();
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				ws();
				setState(242);
				mediaQueryList();
				}
				break;
			case 4:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(Import);
				setState(245);
				ws();
				setState(246);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				ws();
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

	public static class Namespace_Context extends ParserRuleContext {
		public Namespace_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_; }
	 
		public Namespace_Context() { }
		public void copyFrom(Namespace_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GoodNamespaceContext extends Namespace_Context {
		public TerminalNode Namespace() { return getToken(css3Parser.Namespace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public GoodNamespaceContext(Namespace_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitGoodNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BadNamespaceContext extends Namespace_Context {
		public TerminalNode Namespace() { return getToken(css3Parser.Namespace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public BadNamespaceContext(Namespace_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitBadNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_Context namespace_() throws RecognitionException {
		Namespace_Context _localctx = new Namespace_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace_);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new GoodNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(Namespace);
				setState(252);
				ws();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
					{
					setState(253);
					namespacePrefix();
					setState(254);
					ws();
					}
				}

				setState(258);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				ws();
				setState(260);
				match(T__0);
				setState(261);
				ws();
				}
				break;
			case 2:
				_localctx = new BadNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(Namespace);
				setState(264);
				ws();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
					{
					setState(265);
					namespacePrefix();
					setState(266);
					ws();
					}
				}

				setState(270);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				ws();
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

	public static class NamespacePrefixContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacePrefixContext namespacePrefix() throws RecognitionException {
		NamespacePrefixContext _localctx = new NamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			ident();
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

	public static class MediaContext extends ParserRuleContext {
		public TerminalNode Media() { return getToken(css3Parser.Media, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Media);
			setState(278);
			ws();
			setState(279);
			mediaQueryList();
			setState(280);
			groupRuleBody();
			setState(281);
			ws();
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

	public static class MediaQueryListContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitMediaQueryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(283);
				mediaQuery();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(284);
					match(Comma);
					setState(285);
					ws();
					setState(286);
					mediaQuery();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(295);
			ws();
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

	public static class MediaQueryContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaTypeContext mediaType() {
			return getRuleContext(MediaTypeContext.class,0);
		}
		public List<TerminalNode> And() { return getTokens(css3Parser.And); }
		public TerminalNode And(int i) {
			return getToken(css3Parser.And, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode MediaOnly() { return getToken(css3Parser.MediaOnly, 0); }
		public TerminalNode Not() { return getToken(css3Parser.Not, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comment:
			case Space:
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(297);
					_la = _input.LA(1);
					if ( !(_la==MediaOnly || _la==Not) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(300);
				ws();
				setState(301);
				mediaType();
				setState(302);
				ws();
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						match(And);
						setState(304);
						ws();
						setState(305);
						mediaExpression();
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				mediaExpression();
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						match(And);
						setState(314);
						ws();
						setState(315);
						mediaExpression();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class MediaTypeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MediaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitMediaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaTypeContext mediaType() throws RecognitionException {
		MediaTypeContext _localctx = new MediaTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			ident();
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

	public static class MediaExpressionContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaFeatureContext mediaFeature() {
			return getRuleContext(MediaFeatureContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitMediaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__1);
			setState(327);
			ws();
			setState(328);
			mediaFeature();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(329);
				match(T__2);
				setState(330);
				ws();
				setState(331);
				expr();
				}
			}

			setState(335);
			match(T__3);
			setState(336);
			ws();
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

	public static class MediaFeatureContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public MediaFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitMediaFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaFeatureContext mediaFeature() throws RecognitionException {
		MediaFeatureContext _localctx = new MediaFeatureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			ident();
			setState(339);
			ws();
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
		public TerminalNode Page() { return getToken(css3Parser.Page, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public PseudoPageContext pseudoPage() {
			return getRuleContext(PseudoPageContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Page);
			setState(342);
			ws();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(343);
				pseudoPage();
				}
			}

			setState(346);
			match(T__4);
			setState(347);
			ws();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(348);
				declaration();
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(351);
				match(T__0);
				setState(352);
				ws();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(353);
					declaration();
					}
				}

				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__5);
			setState(362);
			ws();
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

	public static class PseudoPageContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PseudoPageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoPage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPseudoPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPseudoPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitPseudoPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoPageContext pseudoPage() throws RecognitionException {
		PseudoPageContext _localctx = new PseudoPageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pseudoPage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__2);
			setState(365);
			ident();
			setState(366);
			ws();
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

	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			selector();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(369);
				match(Comma);
				setState(370);
				ws();
				setState(371);
				selector();
				}
				}
				setState(377);
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

	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorSequenceContext> simpleSelectorSequence() {
			return getRuleContexts(SimpleSelectorSequenceContext.class);
		}
		public SimpleSelectorSequenceContext simpleSelectorSequence(int i) {
			return getRuleContext(SimpleSelectorSequenceContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			simpleSelectorSequence();
			setState(379);
			ws();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Space) | (1L << Plus) | (1L << Greater) | (1L << Tilde))) != 0)) {
				{
				{
				setState(380);
				combinator();
				setState(381);
				simpleSelectorSequence();
				setState(382);
				ws();
				}
				}
				setState(388);
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

	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Greater() { return getToken(css3Parser.Greater, 0); }
		public TerminalNode Tilde() { return getToken(css3Parser.Tilde, 0); }
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_combinator);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(Plus);
				setState(390);
				ws();
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(Greater);
				setState(392);
				ws();
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(Tilde);
				setState(394);
				ws();
				}
				break;
			case Space:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				match(Space);
				setState(396);
				ws();
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

	public static class SimpleSelectorSequenceContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<TerminalNode> Hash() { return getTokens(css3Parser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(css3Parser.Hash, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public SimpleSelectorSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSimpleSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSimpleSelectorSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSimpleSelectorSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(399);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(400);
					universal();
					}
					break;
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << Hash) | (1L << PseudoNot))) != 0)) {
					{
					setState(408);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(403);
						match(Hash);
						}
						break;
					case T__8:
						{
						setState(404);
						className();
						}
						break;
					case T__9:
						{
						setState(405);
						attrib();
						}
						break;
					case T__2:
						{
						setState(406);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(407);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
			case T__8:
			case T__9:
			case Hash:
			case PseudoNot:
				enterOuterAlt(_localctx, 2);
				{
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(418);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(413);
						match(Hash);
						}
						break;
					case T__8:
						{
						setState(414);
						className();
						}
						break;
					case T__9:
						{
						setState(415);
						attrib();
						}
						break;
					case T__2:
						{
						setState(416);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(417);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(420); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << Hash) | (1L << PseudoNot))) != 0) );
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

	public static class TypeSelectorContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(424);
				typeNamespacePrefix();
				}
				break;
			}
			setState(427);
			elementName();
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

	public static class TypeNamespacePrefixContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterTypeNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitTypeNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitTypeNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				{
				setState(429);
				ident();
				}
				break;
			case T__6:
				{
				setState(430);
				match(T__6);
				}
				break;
			case T__7:
				break;
			default:
				break;
			}
			setState(433);
			match(T__7);
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

	public static class ElementNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			ident();
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

	public static class UniversalContext extends ParserRuleContext {
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(437);
				typeNamespacePrefix();
				}
				break;
			}
			setState(440);
			match(T__6);
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

	public static class ClassNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__8);
			setState(443);
			ident();
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

	public static class AttribContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode PrefixMatch() { return getToken(css3Parser.PrefixMatch, 0); }
		public TerminalNode SuffixMatch() { return getToken(css3Parser.SuffixMatch, 0); }
		public TerminalNode SubstringMatch() { return getToken(css3Parser.SubstringMatch, 0); }
		public TerminalNode Includes() { return getToken(css3Parser.Includes, 0); }
		public TerminalNode DashMatch() { return getToken(css3Parser.DashMatch, 0); }
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__9);
			setState(446);
			ws();
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(447);
				typeNamespacePrefix();
				}
				break;
			}
			setState(450);
			ident();
			setState(451);
			ws();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << Includes) | (1L << DashMatch) | (1L << PrefixMatch) | (1L << SuffixMatch) | (1L << SubstringMatch))) != 0)) {
				{
				setState(452);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << Includes) | (1L << DashMatch) | (1L << PrefixMatch) | (1L << SuffixMatch) | (1L << SubstringMatch))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(453);
				ws();
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MediaOnly:
				case Not:
				case And:
				case Or:
				case From:
				case To:
				case Ident:
					{
					setState(454);
					ident();
					}
					break;
				case String_:
					{
					setState(455);
					match(String_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(458);
				ws();
				}
			}

			setState(462);
			match(T__11);
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

	public static class PseudoContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(T__2);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(465);
				match(T__2);
				}
			}

			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				{
				setState(468);
				ident();
				}
				break;
			case Function_:
				{
				setState(469);
				functionalPseudo();
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

	public static class FunctionalPseudoContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(css3Parser.Function_, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalPseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFunctionalPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFunctionalPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFunctionalPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionalPseudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(Function_);
			setState(473);
			ws();
			setState(474);
			expression();
			setState(475);
			match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(css3Parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(css3Parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(css3Parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(css3Parser.Minus, i);
		}
		public List<TerminalNode> Dimension() { return getTokens(css3Parser.Dimension); }
		public TerminalNode Dimension(int i) {
			return getToken(css3Parser.Dimension, i);
		}
		public List<TerminalNode> UnknownDimension() { return getTokens(css3Parser.UnknownDimension); }
		public TerminalNode UnknownDimension(int i) {
			return getToken(css3Parser.UnknownDimension, i);
		}
		public List<TerminalNode> Number() { return getTokens(css3Parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(css3Parser.Number, i);
		}
		public List<TerminalNode> String_() { return getTokens(css3Parser.String_); }
		public TerminalNode String_(int i) {
			return getToken(css3Parser.String_, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(477);
					match(Plus);
					}
					break;
				case Minus:
					{
					setState(478);
					match(Minus);
					}
					break;
				case Dimension:
					{
					setState(479);
					match(Dimension);
					}
					break;
				case UnknownDimension:
					{
					setState(480);
					match(UnknownDimension);
					}
					break;
				case Number:
					{
					setState(481);
					match(Number);
					}
					break;
				case String_:
					{
					setState(482);
					match(String_);
					}
					break;
				case MediaOnly:
				case Not:
				case And:
				case Or:
				case From:
				case To:
				case Ident:
					{
					setState(483);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(486);
				ws();
				}
				}
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String_) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0) );
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

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode PseudoNot() { return getToken(css3Parser.PseudoNot, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public NegationArgContext negationArg() {
			return getRuleContext(NegationArgContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(PseudoNot);
			setState(492);
			ws();
			setState(493);
			negationArg();
			setState(494);
			ws();
			setState(495);
			match(T__3);
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

	public static class NegationArgContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public TerminalNode Hash() { return getToken(css3Parser.Hash, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public NegationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNegationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNegationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitNegationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationArgContext negationArg() throws RecognitionException {
		NegationArgContext _localctx = new NegationArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_negationArg);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				typeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				universal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				match(Hash);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				className();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				attrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				pseudo();
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

	public static class Operator_Context extends ParserRuleContext {
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
	 
		public Operator_Context() { }
		public void copyFrom(Operator_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadOperatorContext extends Operator_Context {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public BadOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitBadOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoodOperatorContext extends Operator_Context {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Comma() { return getToken(css3Parser.Comma, 0); }
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public GoodOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitGoodOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_operator_);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(T__12);
				setState(506);
				ws();
				}
				break;
			case Comma:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(Comma);
				setState(508);
				ws();
				}
				break;
			case Space:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(Space);
				setState(510);
				ws();
				}
				break;
			case T__10:
				_localctx = new BadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(T__10);
				setState(512);
				ws();
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

	public static class Property_Context extends ParserRuleContext {
		public Property_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_; }
	 
		public Property_Context() { }
		public void copyFrom(Property_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadPropertyContext extends Property_Context {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BadPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitBadProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoodPropertyContext extends Property_Context {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Variable() { return getToken(css3Parser.Variable, 0); }
		public GoodPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitGoodProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_Context property_() throws RecognitionException {
		Property_Context _localctx = new Property_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_property_);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				ident();
				setState(516);
				ws();
				}
				break;
			case Variable:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(Variable);
				setState(519);
				ws();
				}
				break;
			case T__6:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(T__6);
				setState(521);
				ident();
				}
				break;
			case T__13:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				match(T__13);
				setState(523);
				ident();
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

	public static class RulesetContext extends ParserRuleContext {
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
	 
		public RulesetContext() { }
		public void copyFrom(RulesetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownRulesetContext extends RulesetContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public UnknownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUnknownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KnownRulesetContext extends RulesetContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public KnownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitKnownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ruleset);
		int _la;
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new KnownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				selectorGroup();
				setState(527);
				match(T__4);
				setState(528);
				ws();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(529);
					declarationList();
					}
				}

				setState(532);
				match(T__5);
				setState(533);
				ws();
				}
				break;
			case 2:
				_localctx = new UnknownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String_) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function_))) != 0)) {
					{
					{
					setState(535);
					any_();
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(541);
				match(T__4);
				setState(542);
				ws();
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(543);
					declarationList();
					}
				}

				setState(546);
				match(T__5);
				setState(547);
				ws();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(551);
				match(T__0);
				setState(552);
				ws();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			declaration();
			setState(559);
			ws();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					match(T__0);
					setState(561);
					ws();
					setState(563);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(562);
						declaration();
						}
						break;
					}
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUnknownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KnownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public KnownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitKnownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaration);
		int _la;
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new KnownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				property_();
				setState(571);
				match(T__2);
				setState(572);
				ws();
				setState(573);
				expr();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Important) {
					{
					setState(574);
					prio();
					}
				}

				}
				break;
			case 2:
				_localctx = new UnknownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				property_();
				setState(578);
				match(T__2);
				setState(579);
				ws();
				setState(580);
				value();
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

	public static class PrioContext extends ParserRuleContext {
		public TerminalNode Important() { return getToken(css3Parser.Important, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PrioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPrio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPrio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitPrio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrioContext prio() throws RecognitionException {
		PrioContext _localctx = new PrioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_prio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(Important);
			setState(585);
			ws();
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

	public static class ValueContext extends ParserRuleContext {
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<AtKeywordContext> atKeyword() {
			return getRuleContexts(AtKeywordContext.class);
		}
		public AtKeywordContext atKeyword(int i) {
			return getRuleContext(AtKeywordContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(592);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(587);
						any_();
						}
						break;
					case T__4:
						{
						setState(588);
						block();
						}
						break;
					case T__14:
						{
						setState(589);
						atKeyword();
						setState(590);
						ws();
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
				setState(594); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Operator_Context> operator_() {
			return getRuleContexts(Operator_Context.class);
		}
		public Operator_Context operator_(int i) {
			return getRuleContext(Operator_Context.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			term();
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << Space) | (1L << Comma))) != 0)) {
						{
						setState(597);
						operator_();
						}
					}

					setState(600);
					term();
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadTermContext extends TermContext {
		public DxImageTransformContext dxImageTransform() {
			return getRuleContext(DxImageTransformContext.class,0);
		}
		public BadTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitBadTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KnownTermContext extends TermContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public TerminalNode UnicodeRange() { return getToken(css3Parser.UnicodeRange, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public HexcolorContext hexcolor() {
			return getRuleContext(HexcolorContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public KnownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitKnownTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnknownTermContext extends TermContext {
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public UnknownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUnknownTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_term);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				number();
				setState(607);
				ws();
				}
				break;
			case 2:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				percentage();
				setState(610);
				ws();
				}
				break;
			case 3:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				dimension();
				setState(613);
				ws();
				}
				break;
			case 4:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				match(String_);
				setState(616);
				ws();
				}
				break;
			case 5:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(617);
				match(UnicodeRange);
				setState(618);
				ws();
				}
				break;
			case 6:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(619);
				ident();
				setState(620);
				ws();
				}
				break;
			case 7:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(622);
				var_();
				}
				break;
			case 8:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(623);
				match(Uri);
				setState(624);
				ws();
				}
				break;
			case 9:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(625);
				hexcolor();
				}
				break;
			case 10:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(626);
				calc();
				}
				break;
			case 11:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(627);
				function_();
				}
				break;
			case 12:
				_localctx = new UnknownTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(628);
				unknownDimension();
				setState(629);
				ws();
				}
				break;
			case 13:
				_localctx = new BadTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(631);
				dxImageTransform();
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

	public static class Function_Context extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(css3Parser.Function_, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(Function_);
			setState(635);
			ws();
			setState(636);
			expr();
			setState(637);
			match(T__3);
			setState(638);
			ws();
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

	public static class DxImageTransformContext extends ParserRuleContext {
		public TerminalNode DxImageTransform() { return getToken(css3Parser.DxImageTransform, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DxImageTransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dxImageTransform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterDxImageTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitDxImageTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitDxImageTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DxImageTransformContext dxImageTransform() throws RecognitionException {
		DxImageTransformContext _localctx = new DxImageTransformContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dxImageTransform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(DxImageTransform);
			setState(641);
			ws();
			setState(642);
			expr();
			setState(643);
			match(T__3);
			setState(644);
			ws();
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

	public static class HexcolorContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(css3Parser.Hash, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public HexcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterHexcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitHexcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitHexcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexcolorContext hexcolor() throws RecognitionException {
		HexcolorContext _localctx = new HexcolorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(Hash);
			setState(647);
			ws();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(css3Parser.Number, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(649);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(652);
			match(Number);
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

	public static class PercentageContext extends ParserRuleContext {
		public TerminalNode Percentage() { return getToken(css3Parser.Percentage, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitPercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_percentage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(654);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(657);
			match(Percentage);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode Dimension() { return getToken(css3Parser.Dimension, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(659);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(662);
			match(Dimension);
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

	public static class UnknownDimensionContext extends ParserRuleContext {
		public TerminalNode UnknownDimension() { return getToken(css3Parser.UnknownDimension, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public UnknownDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUnknownDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownDimensionContext unknownDimension() throws RecognitionException {
		UnknownDimensionContext _localctx = new UnknownDimensionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unknownDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(664);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(667);
			match(UnknownDimension);
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

	public static class Any_Context extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public TerminalNode Hash() { return getToken(css3Parser.Hash, 0); }
		public TerminalNode UnicodeRange() { return getToken(css3Parser.UnicodeRange, 0); }
		public TerminalNode Includes() { return getToken(css3Parser.Includes, 0); }
		public TerminalNode DashMatch() { return getToken(css3Parser.DashMatch, 0); }
		public TerminalNode Function_() { return getToken(css3Parser.Function_, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public Any_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterAny_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitAny_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitAny_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_Context any_() throws RecognitionException {
		Any_Context _localctx = new Any_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_any_);
		int _la;
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				ident();
				setState(670);
				ws();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				number();
				setState(673);
				ws();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				percentage();
				setState(676);
				ws();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				dimension();
				setState(679);
				ws();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(681);
				unknownDimension();
				setState(682);
				ws();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(684);
				match(String_);
				setState(685);
				ws();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(686);
				match(Uri);
				setState(687);
				ws();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(688);
				match(Hash);
				setState(689);
				ws();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(690);
				match(UnicodeRange);
				setState(691);
				ws();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(692);
				match(Includes);
				setState(693);
				ws();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(694);
				match(DashMatch);
				setState(695);
				ws();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(696);
				match(T__2);
				setState(697);
				ws();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(698);
				match(Function_);
				setState(699);
				ws();
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String_) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function_))) != 0)) {
					{
					setState(702);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(700);
						any_();
						}
						break;
					case T__0:
					case T__4:
					case T__14:
					case Cdo:
					case Cdc:
						{
						setState(701);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(707);
				match(T__3);
				setState(708);
				ws();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(710);
				match(T__1);
				setState(711);
				ws();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String_) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function_))) != 0)) {
					{
					setState(714);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(712);
						any_();
						}
						break;
					case T__0:
					case T__4:
					case T__14:
					case Cdo:
					case Cdc:
						{
						setState(713);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(719);
				match(T__3);
				setState(720);
				ws();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(722);
				match(T__9);
				setState(723);
				ws();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String_) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function_))) != 0)) {
					{
					setState(726);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(724);
						any_();
						}
						break;
					case T__0:
					case T__4:
					case T__14:
					case Cdo:
					case Cdc:
						{
						setState(725);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(731);
				match(T__11);
				setState(732);
				ws();
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

	public static class AtRuleContext extends ParserRuleContext {
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
	 
		public AtRuleContext() { }
		public void copyFrom(AtRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownAtRuleContext extends AtRuleContext {
		public AtKeywordContext atKeyword() {
			return getRuleContext(AtKeywordContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public UnknownAtRuleContext(AtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUnknownAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_atRule);
		int _la;
		try {
			_localctx = new UnknownAtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			atKeyword();
			setState(737);
			ws();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String_) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function_))) != 0)) {
				{
				{
				setState(738);
				any_();
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(744);
				block();
				}
				break;
			case T__0:
				{
				setState(745);
				match(T__0);
				setState(746);
				ws();
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

	public static class AtKeywordContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public AtKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterAtKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitAtKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitAtKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtKeywordContext atKeyword() throws RecognitionException {
		AtKeywordContext _localctx = new AtKeywordContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_atKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(T__14);
			setState(750);
			ident();
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

	public static class UnusedContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AtKeywordContext atKeyword() {
			return getRuleContext(AtKeywordContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Cdo() { return getToken(css3Parser.Cdo, 0); }
		public TerminalNode Cdc() { return getToken(css3Parser.Cdc, 0); }
		public UnusedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unused; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnused(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnused(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUnused(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnusedContext unused() throws RecognitionException {
		UnusedContext _localctx = new UnusedContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unused);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				block();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				atKeyword();
				setState(754);
				ws();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(T__0);
				setState(757);
				ws();
				}
				break;
			case Cdo:
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				match(Cdo);
				setState(759);
				ws();
				}
				break;
			case Cdc:
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				match(Cdc);
				setState(761);
				ws();
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

	public static class BlockContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<AtKeywordContext> atKeyword() {
			return getRuleContexts(AtKeywordContext.class);
		}
		public AtKeywordContext atKeyword(int i) {
			return getRuleContext(AtKeywordContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(T__4);
			setState(765);
			ws();
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Page) | (1L << Media) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << PseudoNot) | (1L << Number) | (1L << String_) | (1L << FontFace) | (1L << Supports) | (1L << Or) | (1L << Keyframes) | (1L << From) | (1L << To) | (1L << Viewport) | (1L << CounterStyle) | (1L << FontFeatureValues) | (1L << Variable) | (1L << Ident) | (1L << Function_))) != 0)) {
				{
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(766);
					declarationList();
					}
					break;
				case 2:
					{
					setState(767);
					nestedStatement();
					}
					break;
				case 3:
					{
					setState(768);
					any_();
					}
					break;
				case 4:
					{
					setState(769);
					block();
					}
					break;
				case 5:
					{
					setState(770);
					atKeyword();
					setState(771);
					ws();
					}
					break;
				case 6:
					{
					setState(773);
					match(T__0);
					setState(774);
					ws();
					}
					break;
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			match(T__5);
			setState(781);
			ws();
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

	public static class NestedStatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public FontFaceRuleContext fontFaceRule() {
			return getRuleContext(FontFaceRuleContext.class,0);
		}
		public KeyframesRuleContext keyframesRule() {
			return getRuleContext(KeyframesRuleContext.class,0);
		}
		public SupportsRuleContext supportsRule() {
			return getRuleContext(SupportsRuleContext.class,0);
		}
		public ViewportContext viewport() {
			return getRuleContext(ViewportContext.class,0);
		}
		public CounterStyleContext counterStyle() {
			return getRuleContext(CounterStyleContext.class,0);
		}
		public FontFeatureValuesRuleContext fontFeatureValuesRule() {
			return getRuleContext(FontFeatureValuesRuleContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public NestedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNestedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitNestedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedStatementContext nestedStatement() throws RecognitionException {
		NestedStatementContext _localctx = new NestedStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nestedStatement);
		try {
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Includes:
			case DashMatch:
			case Hash:
			case Percentage:
			case Uri:
			case UnicodeRange:
			case MediaOnly:
			case Not:
			case And:
			case Dimension:
			case UnknownDimension:
			case Plus:
			case Minus:
			case PseudoNot:
			case Number:
			case String_:
			case Or:
			case From:
			case To:
			case Ident:
			case Function_:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				ruleset();
				}
				break;
			case Media:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				media();
				}
				break;
			case Page:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				page();
				}
				break;
			case FontFace:
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				fontFaceRule();
				}
				break;
			case Keyframes:
				enterOuterAlt(_localctx, 5);
				{
				setState(787);
				keyframesRule();
				}
				break;
			case Supports:
				enterOuterAlt(_localctx, 6);
				{
				setState(788);
				supportsRule();
				}
				break;
			case Viewport:
				enterOuterAlt(_localctx, 7);
				{
				setState(789);
				viewport();
				}
				break;
			case CounterStyle:
				enterOuterAlt(_localctx, 8);
				{
				setState(790);
				counterStyle();
				}
				break;
			case FontFeatureValues:
				enterOuterAlt(_localctx, 9);
				{
				setState(791);
				fontFeatureValuesRule();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 10);
				{
				setState(792);
				atRule();
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

	public static class GroupRuleBodyContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public GroupRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupRuleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGroupRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGroupRuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitGroupRuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupRuleBodyContext groupRuleBody() throws RecognitionException {
		GroupRuleBodyContext _localctx = new GroupRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_groupRuleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(T__4);
			setState(796);
			ws();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__14) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Page) | (1L << Media) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << PseudoNot) | (1L << Number) | (1L << String_) | (1L << FontFace) | (1L << Supports) | (1L << Or) | (1L << Keyframes) | (1L << From) | (1L << To) | (1L << Viewport) | (1L << CounterStyle) | (1L << FontFeatureValues) | (1L << Ident) | (1L << Function_))) != 0)) {
				{
				{
				setState(797);
				nestedStatement();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
			match(T__5);
			setState(804);
			ws();
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

	public static class SupportsRuleContext extends ParserRuleContext {
		public TerminalNode Supports() { return getToken(css3Parser.Supports, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public SupportsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSupportsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsRuleContext supportsRule() throws RecognitionException {
		SupportsRuleContext _localctx = new SupportsRuleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_supportsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(Supports);
			setState(807);
			ws();
			setState(808);
			supportsCondition();
			setState(809);
			ws();
			setState(810);
			groupRuleBody();
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

	public static class SupportsConditionContext extends ParserRuleContext {
		public SupportsNegationContext supportsNegation() {
			return getRuleContext(SupportsNegationContext.class,0);
		}
		public SupportsConjunctionContext supportsConjunction() {
			return getRuleContext(SupportsConjunctionContext.class,0);
		}
		public SupportsDisjunctionContext supportsDisjunction() {
			return getRuleContext(SupportsDisjunctionContext.class,0);
		}
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSupportsCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionContext supportsCondition() throws RecognitionException {
		SupportsConditionContext _localctx = new SupportsConditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_supportsCondition);
		try {
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				supportsNegation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				supportsConjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(814);
				supportsDisjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(815);
				supportsConditionInParens();
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

	public static class SupportsConditionInParensContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public SupportsDeclarationConditionContext supportsDeclarationCondition() {
			return getRuleContext(SupportsDeclarationConditionContext.class,0);
		}
		public GeneralEnclosedContext generalEnclosed() {
			return getRuleContext(GeneralEnclosedContext.class,0);
		}
		public SupportsConditionInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConditionInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsConditionInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsConditionInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSupportsConditionInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionInParensContext supportsConditionInParens() throws RecognitionException {
		SupportsConditionInParensContext _localctx = new SupportsConditionInParensContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_supportsConditionInParens);
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(T__1);
				setState(819);
				ws();
				setState(820);
				supportsCondition();
				setState(821);
				ws();
				setState(822);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				supportsDeclarationCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				generalEnclosed();
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

	public static class SupportsNegationContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(css3Parser.Not, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSupportsNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsNegationContext supportsNegation() throws RecognitionException {
		SupportsNegationContext _localctx = new SupportsNegationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_supportsNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(Not);
			setState(829);
			ws();
			setState(830);
			match(Space);
			setState(831);
			ws();
			setState(832);
			supportsConditionInParens();
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

	public static class SupportsConjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<TerminalNode> And() { return getTokens(css3Parser.And); }
		public TerminalNode And(int i) {
			return getToken(css3Parser.And, i);
		}
		public SupportsConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSupportsConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConjunctionContext supportsConjunction() throws RecognitionException {
		SupportsConjunctionContext _localctx = new SupportsConjunctionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_supportsConjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			supportsConditionInParens();
			setState(844); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(835);
					ws();
					setState(836);
					match(Space);
					setState(837);
					ws();
					setState(838);
					match(And);
					setState(839);
					ws();
					setState(840);
					match(Space);
					setState(841);
					ws();
					setState(842);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(846); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class SupportsDisjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<TerminalNode> Or() { return getTokens(css3Parser.Or); }
		public TerminalNode Or(int i) {
			return getToken(css3Parser.Or, i);
		}
		public SupportsDisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDisjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSupportsDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDisjunctionContext supportsDisjunction() throws RecognitionException {
		SupportsDisjunctionContext _localctx = new SupportsDisjunctionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_supportsDisjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			supportsConditionInParens();
			setState(858); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(849);
					ws();
					setState(850);
					match(Space);
					setState(851);
					ws();
					setState(852);
					match(Or);
					setState(853);
					ws();
					setState(854);
					match(Space);
					setState(855);
					ws();
					setState(856);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(860); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class SupportsDeclarationConditionContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SupportsDeclarationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDeclarationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsDeclarationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsDeclarationCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitSupportsDeclarationCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDeclarationConditionContext supportsDeclarationCondition() throws RecognitionException {
		SupportsDeclarationConditionContext _localctx = new SupportsDeclarationConditionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_supportsDeclarationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(T__1);
			setState(863);
			ws();
			setState(864);
			declaration();
			setState(865);
			match(T__3);
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

	public static class GeneralEnclosedContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(css3Parser.Function_, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public GeneralEnclosedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalEnclosed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGeneralEnclosed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGeneralEnclosed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitGeneralEnclosed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralEnclosedContext generalEnclosed() throws RecognitionException {
		GeneralEnclosedContext _localctx = new GeneralEnclosedContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_generalEnclosed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==Function_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String_) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function_))) != 0)) {
				{
				setState(870);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__9:
				case Includes:
				case DashMatch:
				case Hash:
				case Percentage:
				case Uri:
				case UnicodeRange:
				case MediaOnly:
				case Not:
				case And:
				case Dimension:
				case UnknownDimension:
				case Plus:
				case Minus:
				case Number:
				case String_:
				case Or:
				case From:
				case To:
				case Ident:
				case Function_:
					{
					setState(868);
					any_();
					}
					break;
				case T__0:
				case T__4:
				case T__14:
				case Cdo:
				case Cdc:
					{
					setState(869);
					unused();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(875);
			match(T__3);
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

	public static class Var_Context extends ParserRuleContext {
		public TerminalNode Var() { return getToken(css3Parser.Var, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Variable() { return getToken(css3Parser.Variable, 0); }
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterVar_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitVar_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitVar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_var_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(Var);
			setState(878);
			ws();
			setState(879);
			match(Variable);
			setState(880);
			ws();
			setState(881);
			match(T__3);
			setState(882);
			ws();
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

	public static class CalcContext extends ParserRuleContext {
		public TerminalNode Calc() { return getToken(css3Parser.Calc, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(Calc);
			setState(885);
			ws();
			setState(886);
			calcSum();
			setState(887);
			match(T__3);
			setState(888);
			ws();
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

	public static class CalcSumContext extends ParserRuleContext {
		public List<CalcProductContext> calcProduct() {
			return getRuleContexts(CalcProductContext.class);
		}
		public CalcProductContext calcProduct(int i) {
			return getRuleContext(CalcProductContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(css3Parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(css3Parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(css3Parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(css3Parser.Minus, i);
		}
		public CalcSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcSum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalcSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalcSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitCalcSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcSumContext calcSum() throws RecognitionException {
		CalcSumContext _localctx = new CalcSumContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_calcSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			calcProduct();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(891);
				match(Space);
				setState(892);
				ws();
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(894);
				ws();
				setState(895);
				match(Space);
				setState(896);
				ws();
				setState(897);
				calcProduct();
				}
				}
				setState(903);
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

	public static class CalcProductContext extends ParserRuleContext {
		public List<CalcValueContext> calcValue() {
			return getRuleContexts(CalcValueContext.class);
		}
		public CalcValueContext calcValue(int i) {
			return getRuleContext(CalcValueContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public CalcProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalcProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalcProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitCalcProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcProductContext calcProduct() throws RecognitionException {
		CalcProductContext _localctx = new CalcProductContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_calcProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			calcValue();
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__12) {
				{
				setState(914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(905);
					match(T__6);
					setState(906);
					ws();
					setState(907);
					calcValue();
					}
					break;
				case T__12:
					{
					setState(909);
					match(T__12);
					setState(910);
					ws();
					setState(911);
					number();
					setState(912);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(918);
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

	public static class CalcValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public CalcValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalcValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalcValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitCalcValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcValueContext calcValue() throws RecognitionException {
		CalcValueContext _localctx = new CalcValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_calcValue);
		try {
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				number();
				setState(920);
				ws();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				dimension();
				setState(923);
				ws();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(925);
				unknownDimension();
				setState(926);
				ws();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				percentage();
				setState(929);
				ws();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(931);
				match(T__1);
				setState(932);
				ws();
				setState(933);
				calcSum();
				setState(934);
				match(T__3);
				setState(935);
				ws();
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

	public static class FontFaceRuleContext extends ParserRuleContext {
		public TerminalNode FontFace() { return getToken(css3Parser.FontFace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<FontFaceDeclarationContext> fontFaceDeclaration() {
			return getRuleContexts(FontFaceDeclarationContext.class);
		}
		public FontFaceDeclarationContext fontFaceDeclaration(int i) {
			return getRuleContext(FontFaceDeclarationContext.class,i);
		}
		public FontFaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFaceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFontFaceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceRuleContext fontFaceRule() throws RecognitionException {
		FontFaceRuleContext _localctx = new FontFaceRuleContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_fontFaceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(FontFace);
			setState(940);
			ws();
			setState(941);
			match(T__4);
			setState(942);
			ws();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(943);
				fontFaceDeclaration();
				}
			}

			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(946);
				match(T__0);
				setState(947);
				ws();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(948);
					fontFaceDeclaration();
					}
				}

				}
				}
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(956);
			match(T__5);
			setState(957);
			ws();
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

	public static class FontFaceDeclarationContext extends ParserRuleContext {
		public FontFaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceDeclaration; }
	 
		public FontFaceDeclarationContext() { }
		public void copyFrom(FontFaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KnownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KnownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitKnownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnknownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitUnknownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceDeclarationContext fontFaceDeclaration() throws RecognitionException {
		FontFaceDeclarationContext _localctx = new FontFaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_fontFaceDeclaration);
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new KnownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				property_();
				setState(960);
				match(T__2);
				setState(961);
				ws();
				setState(962);
				expr();
				}
				break;
			case 2:
				_localctx = new UnknownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				property_();
				setState(965);
				match(T__2);
				setState(966);
				ws();
				setState(967);
				value();
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

	public static class KeyframesRuleContext extends ParserRuleContext {
		public TerminalNode Keyframes() { return getToken(css3Parser.Keyframes, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public KeyframesBlocksContext keyframesBlocks() {
			return getRuleContext(KeyframesBlocksContext.class,0);
		}
		public KeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKeyframesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKeyframesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitKeyframesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesRuleContext keyframesRule() throws RecognitionException {
		KeyframesRuleContext _localctx = new KeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_keyframesRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(Keyframes);
			setState(972);
			ws();
			setState(973);
			match(Space);
			setState(974);
			ws();
			setState(975);
			ident();
			setState(976);
			ws();
			setState(977);
			match(T__4);
			setState(978);
			ws();
			setState(979);
			keyframesBlocks();
			setState(980);
			match(T__5);
			setState(981);
			ws();
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

	public static class KeyframesBlocksContext extends ParserRuleContext {
		public List<KeyframeSelectorContext> keyframeSelector() {
			return getRuleContexts(KeyframeSelectorContext.class);
		}
		public KeyframeSelectorContext keyframeSelector(int i) {
			return getRuleContext(KeyframeSelectorContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public KeyframesBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesBlocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKeyframesBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKeyframesBlocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitKeyframesBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesBlocksContext keyframesBlocks() throws RecognitionException {
		KeyframesBlocksContext _localctx = new KeyframesBlocksContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_keyframesBlocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Percentage) | (1L << From) | (1L << To))) != 0)) {
				{
				{
				setState(983);
				keyframeSelector();
				setState(984);
				match(T__4);
				setState(985);
				ws();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(986);
					declarationList();
					}
				}

				setState(989);
				match(T__5);
				setState(990);
				ws();
				}
				}
				setState(996);
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

	public static class KeyframeSelectorContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> From() { return getTokens(css3Parser.From); }
		public TerminalNode From(int i) {
			return getToken(css3Parser.From, i);
		}
		public List<TerminalNode> To() { return getTokens(css3Parser.To); }
		public TerminalNode To(int i) {
			return getToken(css3Parser.To, i);
		}
		public List<TerminalNode> Percentage() { return getTokens(css3Parser.Percentage); }
		public TerminalNode Percentage(int i) {
			return getToken(css3Parser.Percentage, i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKeyframeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitKeyframeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Percentage) | (1L << From) | (1L << To))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(998);
			ws();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(999);
				match(Comma);
				setState(1000);
				ws();
				setState(1001);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Percentage) | (1L << From) | (1L << To))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1002);
				ws();
				}
				}
				setState(1008);
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

	public static class ViewportContext extends ParserRuleContext {
		public TerminalNode Viewport() { return getToken(css3Parser.Viewport, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ViewportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterViewport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitViewport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitViewport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportContext viewport() throws RecognitionException {
		ViewportContext _localctx = new ViewportContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_viewport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(Viewport);
			setState(1010);
			ws();
			setState(1011);
			match(T__4);
			setState(1012);
			ws();
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(1013);
				declarationList();
				}
			}

			setState(1016);
			match(T__5);
			setState(1017);
			ws();
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

	public static class CounterStyleContext extends ParserRuleContext {
		public TerminalNode CounterStyle() { return getToken(css3Parser.CounterStyle, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public CounterStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_counterStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCounterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCounterStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitCounterStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CounterStyleContext counterStyle() throws RecognitionException {
		CounterStyleContext _localctx = new CounterStyleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_counterStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(CounterStyle);
			setState(1020);
			ws();
			setState(1021);
			ident();
			setState(1022);
			ws();
			setState(1023);
			match(T__4);
			setState(1024);
			ws();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(1025);
				declarationList();
				}
			}

			setState(1028);
			match(T__5);
			setState(1029);
			ws();
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

	public static class FontFeatureValuesRuleContext extends ParserRuleContext {
		public TerminalNode FontFeatureValues() { return getToken(css3Parser.FontFeatureValues, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public FontFamilyNameListContext fontFamilyNameList() {
			return getRuleContext(FontFamilyNameListContext.class,0);
		}
		public List<FeatureValueBlockContext> featureValueBlock() {
			return getRuleContexts(FeatureValueBlockContext.class);
		}
		public FeatureValueBlockContext featureValueBlock(int i) {
			return getRuleContext(FeatureValueBlockContext.class,i);
		}
		public FontFeatureValuesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFeatureValuesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFeatureValuesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFeatureValuesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFontFeatureValuesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFeatureValuesRuleContext fontFeatureValuesRule() throws RecognitionException {
		FontFeatureValuesRuleContext _localctx = new FontFeatureValuesRuleContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_fontFeatureValuesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(FontFeatureValues);
			setState(1032);
			ws();
			setState(1033);
			fontFamilyNameList();
			setState(1034);
			ws();
			setState(1035);
			match(T__4);
			setState(1036);
			ws();
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1037);
				featureValueBlock();
				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1043);
			match(T__5);
			setState(1044);
			ws();
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

	public static class FontFamilyNameListContext extends ParserRuleContext {
		public List<FontFamilyNameContext> fontFamilyName() {
			return getRuleContexts(FontFamilyNameContext.class);
		}
		public FontFamilyNameContext fontFamilyName(int i) {
			return getRuleContext(FontFamilyNameContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public FontFamilyNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFamilyNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFamilyNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFontFamilyNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameListContext fontFamilyNameList() throws RecognitionException {
		FontFamilyNameListContext _localctx = new FontFamilyNameListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_fontFamilyNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			fontFamilyName();
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047);
					ws();
					setState(1048);
					match(Comma);
					setState(1049);
					ws();
					setState(1050);
					fontFamilyName();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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

	public static class FontFamilyNameContext extends ParserRuleContext {
		public TerminalNode String_() { return getToken(css3Parser.String_, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public FontFamilyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFamilyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFamilyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFontFamilyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameContext fontFamilyName() throws RecognitionException {
		FontFamilyNameContext _localctx = new FontFamilyNameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_fontFamilyName);
		try {
			int _alt;
			setState(1067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				match(String_);
				}
				break;
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				ident();
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1059);
						ws();
						setState(1060);
						ident();
						}
						} 
					}
					setState(1066);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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

	public static class FeatureValueBlockContext extends ParserRuleContext {
		public FeatureTypeContext featureType() {
			return getRuleContext(FeatureTypeContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<FeatureValueDefinitionContext> featureValueDefinition() {
			return getRuleContexts(FeatureValueDefinitionContext.class);
		}
		public FeatureValueDefinitionContext featureValueDefinition(int i) {
			return getRuleContext(FeatureValueDefinitionContext.class,i);
		}
		public FeatureValueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFeatureValueBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFeatureValueBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFeatureValueBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueBlockContext featureValueBlock() throws RecognitionException {
		FeatureValueBlockContext _localctx = new FeatureValueBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_featureValueBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			featureType();
			setState(1070);
			ws();
			setState(1071);
			match(T__4);
			setState(1072);
			ws();
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
				{
				setState(1073);
				featureValueDefinition();
				}
			}

			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Comment) | (1L << Space))) != 0)) {
				{
				{
				setState(1076);
				ws();
				setState(1077);
				match(T__0);
				setState(1078);
				ws();
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
					{
					setState(1079);
					featureValueDefinition();
					}
				}

				}
				}
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1087);
			match(T__5);
			setState(1088);
			ws();
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

	public static class FeatureTypeContext extends ParserRuleContext {
		public AtKeywordContext atKeyword() {
			return getRuleContext(AtKeywordContext.class,0);
		}
		public FeatureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFeatureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFeatureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFeatureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureTypeContext featureType() throws RecognitionException {
		FeatureTypeContext _localctx = new FeatureTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_featureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			atKeyword();
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

	public static class FeatureValueDefinitionContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public FeatureValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFeatureValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFeatureValueDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitFeatureValueDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueDefinitionContext featureValueDefinition() throws RecognitionException {
		FeatureValueDefinitionContext _localctx = new FeatureValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_featureValueDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			ident();
			setState(1093);
			ws();
			setState(1094);
			match(T__2);
			setState(1095);
			ws();
			setState(1096);
			number();
			setState(1102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1097);
					ws();
					setState(1098);
					number();
					}
					} 
				}
				setState(1104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(css3Parser.Ident, 0); }
		public TerminalNode MediaOnly() { return getToken(css3Parser.MediaOnly, 0); }
		public TerminalNode Not() { return getToken(css3Parser.Not, 0); }
		public TerminalNode And() { return getToken(css3Parser.And, 0); }
		public TerminalNode Or() { return getToken(css3Parser.Or, 0); }
		public TerminalNode From() { return getToken(css3Parser.From, 0); }
		public TerminalNode To() { return getToken(css3Parser.To, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) ) {
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

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> Comment() { return getTokens(css3Parser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(css3Parser.Comment, i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof css3Visitor ) return ((css3Visitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1107);
					_la = _input.LA(1);
					if ( !(_la==Comment || _la==Space) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u045c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\7\2\u00a4\n"+
		"\2\f\2\16\2\u00a7\13\2\7\2\u00a9\n\2\f\2\16\2\u00ac\13\2\3\2\3\2\7\2\u00b0"+
		"\n\2\f\2\16\2\u00b3\13\2\7\2\u00b5\n\2\f\2\16\2\u00b8\13\2\3\2\3\2\7\2"+
		"\u00bc\n\2\f\2\16\2\u00bf\13\2\7\2\u00c1\n\2\f\2\16\2\u00c4\13\2\3\2\3"+
		"\2\7\2\u00c8\n\2\f\2\16\2\u00cb\13\2\7\2\u00cd\n\2\f\2\16\2\u00d0\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e0\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00fc\n\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0103\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u010f\n\5\3\5"+
		"\3\5\3\5\5\5\u0114\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u0123\n\b\f\b\16\b\u0126\13\b\5\b\u0128\n\b\3\b\3\b\3\t\5\t\u012d"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0136\n\t\f\t\16\t\u0139\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u0140\n\t\f\t\16\t\u0143\13\t\5\t\u0145\n\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0150\n\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\5\r\u015b\n\r\3\r\3\r\3\r\5\r\u0160\n\r\3\r\3\r"+
		"\3\r\5\r\u0165\n\r\7\r\u0167\n\r\f\r\16\r\u016a\13\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0178\n\17\f\17\16\17\u017b"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0183\n\20\f\20\16\20\u0186"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0190\n\21\3\22\3"+
		"\22\5\22\u0194\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u019b\n\22\f\22\16\22"+
		"\u019e\13\22\3\22\3\22\3\22\3\22\3\22\6\22\u01a5\n\22\r\22\16\22\u01a6"+
		"\5\22\u01a9\n\22\3\23\5\23\u01ac\n\23\3\23\3\23\3\24\3\24\5\24\u01b2\n"+
		"\24\3\24\3\24\3\25\3\25\3\26\5\26\u01b9\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\5\30\u01c3\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01cb"+
		"\n\30\3\30\3\30\5\30\u01cf\n\30\3\30\3\30\3\31\3\31\5\31\u01d5\n\31\3"+
		"\31\3\31\5\31\u01d9\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01e7\n\33\3\33\6\33\u01ea\n\33\r\33\16\33\u01eb"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01fa"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0204\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u020f\n\37\3 \3 \3 \3 \5 \u0215"+
		"\n \3 \3 \3 \3 \7 \u021b\n \f \16 \u021e\13 \3 \3 \3 \5 \u0223\n \3 \3"+
		" \3 \5 \u0228\n \3!\3!\7!\u022c\n!\f!\16!\u022f\13!\3!\3!\3!\3!\3!\5!"+
		"\u0236\n!\7!\u0238\n!\f!\16!\u023b\13!\3\"\3\"\3\"\3\"\3\"\5\"\u0242\n"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u0249\n\"\3#\3#\3#\3$\3$\3$\3$\3$\6$\u0253"+
		"\n$\r$\16$\u0254\3%\3%\5%\u0259\n%\3%\7%\u025c\n%\f%\16%\u025f\13%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\5&\u027b\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3*\5*\u028d\n*\3*\3*\3+\5+\u0292\n+\3+\3+\3,\5,\u0297\n,\3,\3,\3-\5-"+
		"\u029c\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u02c1\n.\f.\16.\u02c4"+
		"\13.\3.\3.\3.\3.\3.\3.\3.\7.\u02cd\n.\f.\16.\u02d0\13.\3.\3.\3.\3.\3."+
		"\3.\3.\7.\u02d9\n.\f.\16.\u02dc\13.\3.\3.\3.\5.\u02e1\n.\3/\3/\3/\7/\u02e6"+
		"\n/\f/\16/\u02e9\13/\3/\3/\3/\5/\u02ee\n/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02fd\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u030a\n\62\f\62\16\62\u030d\13"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5"+
		"\63\u031c\n\63\3\64\3\64\3\64\7\64\u0321\n\64\f\64\16\64\u0324\13\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u0333"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u033d\n\67\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\39\39\39\69\u034f\n9\r9\169\u0350\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\6:\u035d\n:\r:\16:\u035e\3;\3;\3;\3;\3;\3<\3"+
		"<\3<\7<\u0369\n<\f<\16<\u036c\13<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>"+
		"\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0386\n?\f?\16?\u0389\13?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0395\n@\f@\16@\u0398\13@\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03ac\nA\3B\3B\3B\3B\3B\5B"+
		"\u03b3\nB\3B\3B\3B\5B\u03b8\nB\7B\u03ba\nB\fB\16B\u03bd\13B\3B\3B\3B\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u03cc\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\5E\u03de\nE\3E\3E\3E\7E\u03e3\nE\fE\16E\u03e6\13E"+
		"\3F\3F\3F\3F\3F\3F\3F\7F\u03ef\nF\fF\16F\u03f2\13F\3G\3G\3G\3G\3G\5G\u03f9"+
		"\nG\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\5H\u0405\nH\3H\3H\3H\3I\3I\3I\3I\3I"+
		"\3I\3I\7I\u0411\nI\fI\16I\u0414\13I\3I\3I\3I\3J\3J\3J\3J\3J\3J\7J\u041f"+
		"\nJ\fJ\16J\u0422\13J\3K\3K\3K\3K\3K\7K\u0429\nK\fK\16K\u042c\13K\5K\u042e"+
		"\nK\3L\3L\3L\3L\3L\5L\u0435\nL\3L\3L\3L\3L\5L\u043b\nL\7L\u043d\nL\fL"+
		"\16L\u0440\13L\3L\3L\3L\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\7N\u044f\nN\fN\16"+
		"N\u0452\13N\3O\3O\3P\7P\u0457\nP\fP\16P\u045a\13P\3P\2\2Q\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\13\3\2\22\25\4\2  ..\3\2"+
		"\"#\5\2\r\r\26\27/\61\3\2\'(\4\2\4\4@@\4\2\37\37\66\67\6\2\"$\64\64\66"+
		"\67??\3\2\22\23\2\u04bc\2\u00a0\3\2\2\2\4\u00df\3\2\2\2\6\u00fb\3\2\2"+
		"\2\b\u0113\3\2\2\2\n\u0115\3\2\2\2\f\u0117\3\2\2\2\16\u0127\3\2\2\2\20"+
		"\u0144\3\2\2\2\22\u0146\3\2\2\2\24\u0148\3\2\2\2\26\u0154\3\2\2\2\30\u0157"+
		"\3\2\2\2\32\u016e\3\2\2\2\34\u0172\3\2\2\2\36\u017c\3\2\2\2 \u018f\3\2"+
		"\2\2\"\u01a8\3\2\2\2$\u01ab\3\2\2\2&\u01b1\3\2\2\2(\u01b5\3\2\2\2*\u01b8"+
		"\3\2\2\2,\u01bc\3\2\2\2.\u01bf\3\2\2\2\60\u01d2\3\2\2\2\62\u01da\3\2\2"+
		"\2\64\u01e9\3\2\2\2\66\u01ed\3\2\2\28\u01f9\3\2\2\2:\u0203\3\2\2\2<\u020e"+
		"\3\2\2\2>\u0227\3\2\2\2@\u022d\3\2\2\2B\u0248\3\2\2\2D\u024a\3\2\2\2F"+
		"\u0252\3\2\2\2H\u0256\3\2\2\2J\u027a\3\2\2\2L\u027c\3\2\2\2N\u0282\3\2"+
		"\2\2P\u0288\3\2\2\2R\u028c\3\2\2\2T\u0291\3\2\2\2V\u0296\3\2\2\2X\u029b"+
		"\3\2\2\2Z\u02e0\3\2\2\2\\\u02e2\3\2\2\2^\u02ef\3\2\2\2`\u02fc\3\2\2\2"+
		"b\u02fe\3\2\2\2d\u031b\3\2\2\2f\u031d\3\2\2\2h\u0328\3\2\2\2j\u0332\3"+
		"\2\2\2l\u033c\3\2\2\2n\u033e\3\2\2\2p\u0344\3\2\2\2r\u0352\3\2\2\2t\u0360"+
		"\3\2\2\2v\u0365\3\2\2\2x\u036f\3\2\2\2z\u0376\3\2\2\2|\u037c\3\2\2\2~"+
		"\u038a\3\2\2\2\u0080\u03ab\3\2\2\2\u0082\u03ad\3\2\2\2\u0084\u03cb\3\2"+
		"\2\2\u0086\u03cd\3\2\2\2\u0088\u03e4\3\2\2\2\u008a\u03e7\3\2\2\2\u008c"+
		"\u03f3\3\2\2\2\u008e\u03fd\3\2\2\2\u0090\u0409\3\2\2\2\u0092\u0418\3\2"+
		"\2\2\u0094\u042d\3\2\2\2\u0096\u042f\3\2\2\2\u0098\u0444\3\2\2\2\u009a"+
		"\u0446\3\2\2\2\u009c\u0453\3\2\2\2\u009e\u0458\3\2\2\2\u00a0\u00aa\5\u009e"+
		"P\2\u00a1\u00a5\5\4\3\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b6\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00b1\5\6\4\2\u00ae\u00b0\t\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c2\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00bd\5\b\5\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00ce\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c9\5d\63\2\u00c6\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7\2\2\3\u00d2\3\3\2\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d5"+
		"\5\u009eP\2\u00d5\u00d6\7.\2\2\u00d6\u00d7\5\u009eP\2\u00d7\u00d8\7\3"+
		"\2\2\u00d8\u00d9\5\u009eP\2\u00d9\u00e0\3\2\2\2\u00da\u00db\7\35\2\2\u00db"+
		"\u00dc\5\u009eP\2\u00dc\u00dd\7.\2\2\u00dd\u00de\5\u009eP\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00d3\3\2\2\2\u00df\u00da\3\2\2\2\u00e0\5\3\2\2\2\u00e1"+
		"\u00e2\7\31\2\2\u00e2\u00e3\5\u009eP\2\u00e3\u00e4\t\3\2\2\u00e4\u00e5"+
		"\5\u009eP\2\u00e5\u00e6\5\16\b\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5\u009e"+
		"P\2\u00e8\u00fc\3\2\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00eb\5\u009eP\2\u00eb"+
		"\u00ec\t\3\2\2\u00ec\u00ed\5\u009eP\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef"+
		"\5\u009eP\2\u00ef\u00fc\3\2\2\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2\5\u009e"+
		"P\2\u00f2\u00f3\t\3\2\2\u00f3\u00f4\5\u009eP\2\u00f4\u00f5\5\16\b\2\u00f5"+
		"\u00fc\3\2\2\2\u00f6\u00f7\7\31\2\2\u00f7\u00f8\5\u009eP\2\u00f8\u00f9"+
		"\t\3\2\2\u00f9\u00fa\5\u009eP\2\u00fa\u00fc\3\2\2\2\u00fb\u00e1\3\2\2"+
		"\2\u00fb\u00e9\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc\7"+
		"\3\2\2\2\u00fd\u00fe\7\34\2\2\u00fe\u0102\5\u009eP\2\u00ff\u0100\5\n\6"+
		"\2\u0100\u0101\5\u009eP\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\t\3\2\2\u0105\u0106\5\u009e"+
		"P\2\u0106\u0107\7\3\2\2\u0107\u0108\5\u009eP\2\u0108\u0114\3\2\2\2\u0109"+
		"\u010a\7\34\2\2\u010a\u010e\5\u009eP\2\u010b\u010c\5\n\6\2\u010c\u010d"+
		"\5\u009eP\2\u010d\u010f\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010f\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0111\t\3\2\2\u0111\u0112\5\u009eP\2\u0112"+
		"\u0114\3\2\2\2\u0113\u00fd\3\2\2\2\u0113\u0109\3\2\2\2\u0114\t\3\2\2\2"+
		"\u0115\u0116\5\u009cO\2\u0116\13\3\2\2\2\u0117\u0118\7\33\2\2\u0118\u0119"+
		"\5\u009eP\2\u0119\u011a\5\16\b\2\u011a\u011b\5f\64\2\u011b\u011c\5\u009e"+
		"P\2\u011c\r\3\2\2\2\u011d\u0124\5\20\t\2\u011e\u011f\7*\2\2\u011f\u0120"+
		"\5\u009eP\2\u0120\u0121\5\20\t\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2"+
		"\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u011d\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\5\u009eP\2\u012a\17\3\2\2\2\u012b\u012d\t\4"+
		"\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\5\u009eP\2\u012f\u0130\5\22\n\2\u0130\u0137\5\u009eP\2\u0131\u0132"+
		"\7$\2\2\u0132\u0133\5\u009eP\2\u0133\u0134\5\24\13\2\u0134\u0136\3\2\2"+
		"\2\u0135\u0131\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0145\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0141\5\24\13\2"+
		"\u013b\u013c\7$\2\2\u013c\u013d\5\u009eP\2\u013d\u013e\5\24\13\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013b\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u012c\3\2\2\2\u0144\u013a\3\2\2\2\u0145\21\3\2\2\2\u0146\u0147\5\u009c"+
		"O\2\u0147\23\3\2\2\2\u0148\u0149\7\4\2\2\u0149\u014a\5\u009eP\2\u014a"+
		"\u014f\5\26\f\2\u014b\u014c\7\5\2\2\u014c\u014d\5\u009eP\2\u014d\u014e"+
		"\5H%\2\u014e\u0150\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\7\6\2\2\u0152\u0153\5\u009eP\2\u0153\25\3\2"+
		"\2\2\u0154\u0155\5\u009cO\2\u0155\u0156\5\u009eP\2\u0156\27\3\2\2\2\u0157"+
		"\u0158\7\32\2\2\u0158\u015a\5\u009eP\2\u0159\u015b\5\32\16\2\u015a\u0159"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7\7\2\2\u015d"+
		"\u015f\5\u009eP\2\u015e\u0160\5B\"\2\u015f\u015e\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\u0168\3\2\2\2\u0161\u0162\7\3\2\2\u0162\u0164\5\u009eP\2"+
		"\u0163\u0165\5B\"\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0161\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\b"+
		"\2\2\u016c\u016d\5\u009eP\2\u016d\31\3\2\2\2\u016e\u016f\7\5\2\2\u016f"+
		"\u0170\5\u009cO\2\u0170\u0171\5\u009eP\2\u0171\33\3\2\2\2\u0172\u0179"+
		"\5\36\20\2\u0173\u0174\7*\2\2\u0174\u0175\5\u009eP\2\u0175\u0176\5\36"+
		"\20\2\u0176\u0178\3\2\2\2\u0177\u0173\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\35\3\2\2\2\u017b\u0179\3\2\2"+
		"\2\u017c\u017d\5\"\22\2\u017d\u0184\5\u009eP\2\u017e\u017f\5 \21\2\u017f"+
		"\u0180\5\"\22\2\u0180\u0181\5\u009eP\2\u0181\u0183\3\2\2\2\u0182\u017e"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\37\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\'\2\2\u0188\u0190\5\u009e"+
		"P\2\u0189\u018a\7)\2\2\u018a\u0190\5\u009eP\2\u018b\u018c\7+\2\2\u018c"+
		"\u0190\5\u009eP\2\u018d\u018e\7\23\2\2\u018e\u0190\5\u009eP\2\u018f\u0187"+
		"\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"!\3\2\2\2\u0191\u0194\5$\23\2\u0192\u0194\5*\26\2\u0193\u0191\3\2\2\2"+
		"\u0193\u0192\3\2\2\2\u0194\u019c\3\2\2\2\u0195\u019b\7\30\2\2\u0196\u019b"+
		"\5,\27\2\u0197\u019b\5.\30\2\u0198\u019b\5\60\31\2\u0199\u019b\5\66\34"+
		"\2\u019a\u0195\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u01a9\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a5\7\30"+
		"\2\2\u01a0\u01a5\5,\27\2\u01a1\u01a5\5.\30\2\u01a2\u01a5\5\60\31\2\u01a3"+
		"\u01a5\5\66\34\2\u01a4\u019f\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a4\u01a1\3"+
		"\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u0193\3\2"+
		"\2\2\u01a8\u01a4\3\2\2\2\u01a9#\3\2\2\2\u01aa\u01ac\5&\24\2\u01ab\u01aa"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5(\25\2\u01ae"+
		"%\3\2\2\2\u01af\u01b2\5\u009cO\2\u01b0\u01b2\7\t\2\2\u01b1\u01af\3\2\2"+
		"\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\7\n\2\2\u01b4\'\3\2\2\2\u01b5\u01b6\5\u009cO\2\u01b6)\3\2\2\2\u01b7\u01b9"+
		"\5&\24\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\7\t\2\2\u01bb+\3\2\2\2\u01bc\u01bd\7\13\2\2\u01bd\u01be\5\u009c"+
		"O\2\u01be-\3\2\2\2\u01bf\u01c0\7\f\2\2\u01c0\u01c2\5\u009eP\2\u01c1\u01c3"+
		"\5&\24\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\5\u009cO\2\u01c5\u01ce\5\u009eP\2\u01c6\u01c7\t\5\2\2\u01c7\u01ca"+
		"\5\u009eP\2\u01c8\u01cb\5\u009cO\2\u01c9\u01cb\7.\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\5\u009eP\2\u01cd"+
		"\u01cf\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\7\16\2\2\u01d1/\3\2\2\2\u01d2\u01d4\7\5\2\2\u01d3\u01d5"+
		"\7\5\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d9\5\u009cO\2\u01d7\u01d9\5\62\32\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7"+
		"\3\2\2\2\u01d9\61\3\2\2\2\u01da\u01db\7@\2\2\u01db\u01dc\5\u009eP\2\u01dc"+
		"\u01dd\5\64\33\2\u01dd\u01de\7\6\2\2\u01de\63\3\2\2\2\u01df\u01e7\7\'"+
		"\2\2\u01e0\u01e7\7(\2\2\u01e1\u01e7\7%\2\2\u01e2\u01e7\7&\2\2\u01e3\u01e7"+
		"\7-\2\2\u01e4\u01e7\7.\2\2\u01e5\u01e7\5\u009cO\2\u01e6\u01df\3\2\2\2"+
		"\u01e6\u01e0\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e3"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ea\5\u009eP\2\u01e9\u01e6\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\65\3\2\2\2\u01ed\u01ee\7,\2\2\u01ee"+
		"\u01ef\5\u009eP\2\u01ef\u01f0\58\35\2\u01f0\u01f1\5\u009eP\2\u01f1\u01f2"+
		"\7\6\2\2\u01f2\67\3\2\2\2\u01f3\u01fa\5$\23\2\u01f4\u01fa\5*\26\2\u01f5"+
		"\u01fa\7\30\2\2\u01f6\u01fa\5,\27\2\u01f7\u01fa\5.\30\2\u01f8\u01fa\5"+
		"\60\31\2\u01f9\u01f3\3\2\2\2\u01f9\u01f4\3\2\2\2\u01f9\u01f5\3\2\2\2\u01f9"+
		"\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa9\3\2\2\2"+
		"\u01fb\u01fc\7\17\2\2\u01fc\u0204\5\u009eP\2\u01fd\u01fe\7*\2\2\u01fe"+
		"\u0204\5\u009eP\2\u01ff\u0200\7\23\2\2\u0200\u0204\5\u009eP\2\u0201\u0202"+
		"\7\r\2\2\u0202\u0204\5\u009eP\2\u0203\u01fb\3\2\2\2\u0203\u01fd\3\2\2"+
		"\2\u0203\u01ff\3\2\2\2\u0203\u0201\3\2\2\2\u0204;\3\2\2\2\u0205\u0206"+
		"\5\u009cO\2\u0206\u0207\5\u009eP\2\u0207\u020f\3\2\2\2\u0208\u0209\7="+
		"\2\2\u0209\u020f\5\u009eP\2\u020a\u020b\7\t\2\2\u020b\u020f\5\u009cO\2"+
		"\u020c\u020d\7\20\2\2\u020d\u020f\5\u009cO\2\u020e\u0205\3\2\2\2\u020e"+
		"\u0208\3\2\2\2\u020e\u020a\3\2\2\2\u020e\u020c\3\2\2\2\u020f=\3\2\2\2"+
		"\u0210\u0211\5\34\17\2\u0211\u0212\7\7\2\2\u0212\u0214\5\u009eP\2\u0213"+
		"\u0215\5@!\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2"+
		"\2\u0216\u0217\7\b\2\2\u0217\u0218\5\u009eP\2\u0218\u0228\3\2\2\2\u0219"+
		"\u021b\5Z.\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2"+
		"\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220"+
		"\7\7\2\2\u0220\u0222\5\u009eP\2\u0221\u0223\5@!\2\u0222\u0221\3\2\2\2"+
		"\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7\b\2\2\u0225\u0226"+
		"\5\u009eP\2\u0226\u0228\3\2\2\2\u0227\u0210\3\2\2\2\u0227\u021c\3\2\2"+
		"\2\u0228?\3\2\2\2\u0229\u022a\7\3\2\2\u022a\u022c\5\u009eP\2\u022b\u0229"+
		"\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\5B\"\2\u0231\u0239\5\u009e"+
		"P\2\u0232\u0233\7\3\2\2\u0233\u0235\5\u009eP\2\u0234\u0236\5B\"\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0232\3\2"+
		"\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"A\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\5<\37\2\u023d\u023e\7\5\2\2"+
		"\u023e\u023f\5\u009eP\2\u023f\u0241\5H%\2\u0240\u0242\5D#\2\u0241\u0240"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0249\3\2\2\2\u0243\u0244\5<\37\2\u0244"+
		"\u0245\7\5\2\2\u0245\u0246\5\u009eP\2\u0246\u0247\5F$\2\u0247\u0249\3"+
		"\2\2\2\u0248\u023c\3\2\2\2\u0248\u0243\3\2\2\2\u0249C\3\2\2\2\u024a\u024b"+
		"\7\36\2\2\u024b\u024c\5\u009eP\2\u024cE\3\2\2\2\u024d\u0253\5Z.\2\u024e"+
		"\u0253\5b\62\2\u024f\u0250\5^\60\2\u0250\u0251\5\u009eP\2\u0251\u0253"+
		"\3\2\2\2\u0252\u024d\3\2\2\2\u0252\u024e\3\2\2\2\u0252\u024f\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255G\3\2\2\2"+
		"\u0256\u025d\5J&\2\u0257\u0259\5:\36\2\u0258\u0257\3\2\2\2\u0258\u0259"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\5J&\2\u025b\u0258\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025eI\3\2\2\2"+
		"\u025f\u025d\3\2\2\2\u0260\u0261\5R*\2\u0261\u0262\5\u009eP\2\u0262\u027b"+
		"\3\2\2\2\u0263\u0264\5T+\2\u0264\u0265\5\u009eP\2\u0265\u027b\3\2\2\2"+
		"\u0266\u0267\5V,\2\u0267\u0268\5\u009eP\2\u0268\u027b\3\2\2\2\u0269\u026a"+
		"\7.\2\2\u026a\u027b\5\u009eP\2\u026b\u026c\7!\2\2\u026c\u027b\5\u009e"+
		"P\2\u026d\u026e\5\u009cO\2\u026e\u026f\5\u009eP\2\u026f\u027b\3\2\2\2"+
		"\u0270\u027b\5x=\2\u0271\u0272\7 \2\2\u0272\u027b\5\u009eP\2\u0273\u027b"+
		"\5P)\2\u0274\u027b\5z>\2\u0275\u027b\5L\'\2\u0276\u0277\5X-\2\u0277\u0278"+
		"\5\u009eP\2\u0278\u027b\3\2\2\2\u0279\u027b\5N(\2\u027a\u0260\3\2\2\2"+
		"\u027a\u0263\3\2\2\2\u027a\u0266\3\2\2\2\u027a\u0269\3\2\2\2\u027a\u026b"+
		"\3\2\2\2\u027a\u026d\3\2\2\2\u027a\u0270\3\2\2\2\u027a\u0271\3\2\2\2\u027a"+
		"\u0273\3\2\2\2\u027a\u0274\3\2\2\2\u027a\u0275\3\2\2\2\u027a\u0276\3\2"+
		"\2\2\u027a\u0279\3\2\2\2\u027bK\3\2\2\2\u027c\u027d\7@\2\2\u027d\u027e"+
		"\5\u009eP\2\u027e\u027f\5H%\2\u027f\u0280\7\6\2\2\u0280\u0281\5\u009e"+
		"P\2\u0281M\3\2\2\2\u0282\u0283\7<\2\2\u0283\u0284\5\u009eP\2\u0284\u0285"+
		"\5H%\2\u0285\u0286\7\6\2\2\u0286\u0287\5\u009eP\2\u0287O\3\2\2\2\u0288"+
		"\u0289\7\30\2\2\u0289\u028a\5\u009eP\2\u028aQ\3\2\2\2\u028b\u028d\t\6"+
		"\2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u028f\7-\2\2\u028fS\3\2\2\2\u0290\u0292\t\6\2\2\u0291\u0290\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\7\37\2\2\u0294U\3\2\2\2"+
		"\u0295\u0297\t\6\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u0299\7%\2\2\u0299W\3\2\2\2\u029a\u029c\t\6\2\2\u029b\u029a"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7&\2\2\u029e"+
		"Y\3\2\2\2\u029f\u02a0\5\u009cO\2\u02a0\u02a1\5\u009eP\2\u02a1\u02e1\3"+
		"\2\2\2\u02a2\u02a3\5R*\2\u02a3\u02a4\5\u009eP\2\u02a4\u02e1\3\2\2\2\u02a5"+
		"\u02a6\5T+\2\u02a6\u02a7\5\u009eP\2\u02a7\u02e1\3\2\2\2\u02a8\u02a9\5"+
		"V,\2\u02a9\u02aa\5\u009eP\2\u02aa\u02e1\3\2\2\2\u02ab\u02ac\5X-\2\u02ac"+
		"\u02ad\5\u009eP\2\u02ad\u02e1\3\2\2\2\u02ae\u02af\7.\2\2\u02af\u02e1\5"+
		"\u009eP\2\u02b0\u02b1\7 \2\2\u02b1\u02e1\5\u009eP\2\u02b2\u02b3\7\30\2"+
		"\2\u02b3\u02e1\5\u009eP\2\u02b4\u02b5\7!\2\2\u02b5\u02e1\5\u009eP\2\u02b6"+
		"\u02b7\7\26\2\2\u02b7\u02e1\5\u009eP\2\u02b8\u02b9\7\27\2\2\u02b9\u02e1"+
		"\5\u009eP\2\u02ba\u02bb\7\5\2\2\u02bb\u02e1\5\u009eP\2\u02bc\u02bd\7@"+
		"\2\2\u02bd\u02c2\5\u009eP\2\u02be\u02c1\5Z.\2\u02bf\u02c1\5`\61\2\u02c0"+
		"\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5"+
		"\u02c6\7\6\2\2\u02c6\u02c7\5\u009eP\2\u02c7\u02e1\3\2\2\2\u02c8\u02c9"+
		"\7\4\2\2\u02c9\u02ce\5\u009eP\2\u02ca\u02cd\5Z.\2\u02cb\u02cd\5`\61\2"+
		"\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1"+
		"\u02d2\7\6\2\2\u02d2\u02d3\5\u009eP\2\u02d3\u02e1\3\2\2\2\u02d4\u02d5"+
		"\7\f\2\2\u02d5\u02da\5\u009eP\2\u02d6\u02d9\5Z.\2\u02d7\u02d9\5`\61\2"+
		"\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd"+
		"\u02de\7\16\2\2\u02de\u02df\5\u009eP\2\u02df\u02e1\3\2\2\2\u02e0\u029f"+
		"\3\2\2\2\u02e0\u02a2\3\2\2\2\u02e0\u02a5\3\2\2\2\u02e0\u02a8\3\2\2\2\u02e0"+
		"\u02ab\3\2\2\2\u02e0\u02ae\3\2\2\2\u02e0\u02b0\3\2\2\2\u02e0\u02b2\3\2"+
		"\2\2\u02e0\u02b4\3\2\2\2\u02e0\u02b6\3\2\2\2\u02e0\u02b8\3\2\2\2\u02e0"+
		"\u02ba\3\2\2\2\u02e0\u02bc\3\2\2\2\u02e0\u02c8\3\2\2\2\u02e0\u02d4\3\2"+
		"\2\2\u02e1[\3\2\2\2\u02e2\u02e3\5^\60\2\u02e3\u02e7\5\u009eP\2\u02e4\u02e6"+
		"\5Z.\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02ed\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02ee\5b"+
		"\62\2\u02eb\u02ec\7\3\2\2\u02ec\u02ee\5\u009eP\2\u02ed\u02ea\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee]\3\2\2\2\u02ef\u02f0\7\21\2\2\u02f0\u02f1\5\u009c"+
		"O\2\u02f1_\3\2\2\2\u02f2\u02fd\5b\62\2\u02f3\u02f4\5^\60\2\u02f4\u02f5"+
		"\5\u009eP\2\u02f5\u02fd\3\2\2\2\u02f6\u02f7\7\3\2\2\u02f7\u02fd\5\u009e"+
		"P\2\u02f8\u02f9\7\24\2\2\u02f9\u02fd\5\u009eP\2\u02fa\u02fb\7\25\2\2\u02fb"+
		"\u02fd\5\u009eP\2\u02fc\u02f2\3\2\2\2\u02fc\u02f3\3\2\2\2\u02fc\u02f6"+
		"\3\2\2\2\u02fc\u02f8\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fda\3\2\2\2\u02fe"+
		"\u02ff\7\7\2\2\u02ff\u030b\5\u009eP\2\u0300\u030a\5@!\2\u0301\u030a\5"+
		"d\63\2\u0302\u030a\5Z.\2\u0303\u030a\5b\62\2\u0304\u0305\5^\60\2\u0305"+
		"\u0306\5\u009eP\2\u0306\u030a\3\2\2\2\u0307\u0308\7\3\2\2\u0308\u030a"+
		"\5\u009eP\2\u0309\u0300\3\2\2\2\u0309\u0301\3\2\2\2\u0309\u0302\3\2\2"+
		"\2\u0309\u0303\3\2\2\2\u0309\u0304\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030d"+
		"\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030e\u030f\7\b\2\2\u030f\u0310\5\u009eP\2\u0310c\3\2\2"+
		"\2\u0311\u031c\5> \2\u0312\u031c\5\f\7\2\u0313\u031c\5\30\r\2\u0314\u031c"+
		"\5\u0082B\2\u0315\u031c\5\u0086D\2\u0316\u031c\5h\65\2\u0317\u031c\5\u008c"+
		"G\2\u0318\u031c\5\u008eH\2\u0319\u031c\5\u0090I\2\u031a\u031c\5\\/\2\u031b"+
		"\u0311\3\2\2\2\u031b\u0312\3\2\2\2\u031b\u0313\3\2\2\2\u031b\u0314\3\2"+
		"\2\2\u031b\u0315\3\2\2\2\u031b\u0316\3\2\2\2\u031b\u0317\3\2\2\2\u031b"+
		"\u0318\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031ce\3\2\2\2"+
		"\u031d\u031e\7\7\2\2\u031e\u0322\5\u009eP\2\u031f\u0321\5d\63\2\u0320"+
		"\u031f\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323\u0325\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0326\7\b\2\2\u0326"+
		"\u0327\5\u009eP\2\u0327g\3\2\2\2\u0328\u0329\7\63\2\2\u0329\u032a\5\u009e"+
		"P\2\u032a\u032b\5j\66\2\u032b\u032c\5\u009eP\2\u032c\u032d\5f\64\2\u032d"+
		"i\3\2\2\2\u032e\u0333\5n8\2\u032f\u0333\5p9\2\u0330\u0333\5r:\2\u0331"+
		"\u0333\5l\67\2\u0332\u032e\3\2\2\2\u0332\u032f\3\2\2\2\u0332\u0330\3\2"+
		"\2\2\u0332\u0331\3\2\2\2\u0333k\3\2\2\2\u0334\u0335\7\4\2\2\u0335\u0336"+
		"\5\u009eP\2\u0336\u0337\5j\66\2\u0337\u0338\5\u009eP\2\u0338\u0339\7\6"+
		"\2\2\u0339\u033d\3\2\2\2\u033a\u033d\5t;\2\u033b\u033d\5v<\2\u033c\u0334"+
		"\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033b\3\2\2\2\u033dm\3\2\2\2\u033e"+
		"\u033f\7#\2\2\u033f\u0340\5\u009eP\2\u0340\u0341\7\23\2\2\u0341\u0342"+
		"\5\u009eP\2\u0342\u0343\5l\67\2\u0343o\3\2\2\2\u0344\u034e\5l\67\2\u0345"+
		"\u0346\5\u009eP\2\u0346\u0347\7\23\2\2\u0347\u0348\5\u009eP\2\u0348\u0349"+
		"\7$\2\2\u0349\u034a\5\u009eP\2\u034a\u034b\7\23\2\2\u034b\u034c\5\u009e"+
		"P\2\u034c\u034d\5l\67\2\u034d\u034f\3\2\2\2\u034e\u0345\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351q\3\2\2\2"+
		"\u0352\u035c\5l\67\2\u0353\u0354\5\u009eP\2\u0354\u0355\7\23\2\2\u0355"+
		"\u0356\5\u009eP\2\u0356\u0357\7\64\2\2\u0357\u0358\5\u009eP\2\u0358\u0359"+
		"\7\23\2\2\u0359\u035a\5\u009eP\2\u035a\u035b\5l\67\2\u035b\u035d\3\2\2"+
		"\2\u035c\u0353\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f"+
		"\3\2\2\2\u035fs\3\2\2\2\u0360\u0361\7\4\2\2\u0361\u0362\5\u009eP\2\u0362"+
		"\u0363\5B\"\2\u0363\u0364\7\6\2\2\u0364u\3\2\2\2\u0365\u036a\t\7\2\2\u0366"+
		"\u0369\5Z.\2\u0367\u0369\5`\61\2\u0368\u0366\3\2\2\2\u0368\u0367\3\2\2"+
		"\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d"+
		"\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036e\7\6\2\2\u036ew\3\2\2\2\u036f"+
		"\u0370\7>\2\2\u0370\u0371\5\u009eP\2\u0371\u0372\7=\2\2\u0372\u0373\5"+
		"\u009eP\2\u0373\u0374\7\6\2\2\u0374\u0375\5\u009eP\2\u0375y\3\2\2\2\u0376"+
		"\u0377\78\2\2\u0377\u0378\5\u009eP\2\u0378\u0379\5|?\2\u0379\u037a\7\6"+
		"\2\2\u037a\u037b\5\u009eP\2\u037b{\3\2\2\2\u037c\u0387\5~@\2\u037d\u037e"+
		"\7\23\2\2\u037e\u037f\5\u009eP\2\u037f\u0380\t\6\2\2\u0380\u0381\5\u009e"+
		"P\2\u0381\u0382\7\23\2\2\u0382\u0383\5\u009eP\2\u0383\u0384\5~@\2\u0384"+
		"\u0386\3\2\2\2\u0385\u037d\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0387\u0388\3\2\2\2\u0388}\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u0396"+
		"\5\u0080A\2\u038b\u038c\7\t\2\2\u038c\u038d\5\u009eP\2\u038d\u038e\5\u0080"+
		"A\2\u038e\u0395\3\2\2\2\u038f\u0390\7\17\2\2\u0390\u0391\5\u009eP\2\u0391"+
		"\u0392\5R*\2\u0392\u0393\5\u009eP\2\u0393\u0395\3\2\2\2\u0394\u038b\3"+
		"\2\2\2\u0394\u038f\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\177\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039a\5R*\2"+
		"\u039a\u039b\5\u009eP\2\u039b\u03ac\3\2\2\2\u039c\u039d\5V,\2\u039d\u039e"+
		"\5\u009eP\2\u039e\u03ac\3\2\2\2\u039f\u03a0\5X-\2\u03a0\u03a1\5\u009e"+
		"P\2\u03a1\u03ac\3\2\2\2\u03a2\u03a3\5T+\2\u03a3\u03a4\5\u009eP\2\u03a4"+
		"\u03ac\3\2\2\2\u03a5\u03a6\7\4\2\2\u03a6\u03a7\5\u009eP\2\u03a7\u03a8"+
		"\5|?\2\u03a8\u03a9\7\6\2\2\u03a9\u03aa\5\u009eP\2\u03aa\u03ac\3\2\2\2"+
		"\u03ab\u0399\3\2\2\2\u03ab\u039c\3\2\2\2\u03ab\u039f\3\2\2\2\u03ab\u03a2"+
		"\3\2\2\2\u03ab\u03a5\3\2\2\2\u03ac\u0081\3\2\2\2\u03ad\u03ae\7\62\2\2"+
		"\u03ae\u03af\5\u009eP\2\u03af\u03b0\7\7\2\2\u03b0\u03b2\5\u009eP\2\u03b1"+
		"\u03b3\5\u0084C\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03bb"+
		"\3\2\2\2\u03b4\u03b5\7\3\2\2\u03b5\u03b7\5\u009eP\2\u03b6\u03b8\5\u0084"+
		"C\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9"+
		"\u03b4\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2"+
		"\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03bf\7\b\2\2\u03bf"+
		"\u03c0\5\u009eP\2\u03c0\u0083\3\2\2\2\u03c1\u03c2\5<\37\2\u03c2\u03c3"+
		"\7\5\2\2\u03c3\u03c4\5\u009eP\2\u03c4\u03c5\5H%\2\u03c5\u03cc\3\2\2\2"+
		"\u03c6\u03c7\5<\37\2\u03c7\u03c8\7\5\2\2\u03c8\u03c9\5\u009eP\2\u03c9"+
		"\u03ca\5F$\2\u03ca\u03cc\3\2\2\2\u03cb\u03c1\3\2\2\2\u03cb\u03c6\3\2\2"+
		"\2\u03cc\u0085\3\2\2\2\u03cd\u03ce\7\65\2\2\u03ce\u03cf\5\u009eP\2\u03cf"+
		"\u03d0\7\23\2\2\u03d0\u03d1\5\u009eP\2\u03d1\u03d2\5\u009cO\2\u03d2\u03d3"+
		"\5\u009eP\2\u03d3\u03d4\7\7\2\2\u03d4\u03d5\5\u009eP\2\u03d5\u03d6\5\u0088"+
		"E\2\u03d6\u03d7\7\b\2\2\u03d7\u03d8\5\u009eP\2\u03d8\u0087\3\2\2\2\u03d9"+
		"\u03da\5\u008aF\2\u03da\u03db\7\7\2\2\u03db\u03dd\5\u009eP\2\u03dc\u03de"+
		"\5@!\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u03e0\7\b\2\2\u03e0\u03e1\5\u009eP\2\u03e1\u03e3\3\2\2\2\u03e2\u03d9"+
		"\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u0089\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e8\t\b\2\2\u03e8\u03f0\5\u009e"+
		"P\2\u03e9\u03ea\7*\2\2\u03ea\u03eb\5\u009eP\2\u03eb\u03ec\t\b\2\2\u03ec"+
		"\u03ed\5\u009eP\2\u03ed\u03ef\3\2\2\2\u03ee\u03e9\3\2\2\2\u03ef\u03f2"+
		"\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u008b\3\2\2\2\u03f2"+
		"\u03f0\3\2\2\2\u03f3\u03f4\79\2\2\u03f4\u03f5\5\u009eP\2\u03f5\u03f6\7"+
		"\7\2\2\u03f6\u03f8\5\u009eP\2\u03f7\u03f9\5@!\2\u03f8\u03f7\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\7\b\2\2\u03fb\u03fc\5\u009e"+
		"P\2\u03fc\u008d\3\2\2\2\u03fd\u03fe\7:\2\2\u03fe\u03ff\5\u009eP\2\u03ff"+
		"\u0400\5\u009cO\2\u0400\u0401\5\u009eP\2\u0401\u0402\7\7\2\2\u0402\u0404"+
		"\5\u009eP\2\u0403\u0405\5@!\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2"+
		"\u0405\u0406\3\2\2\2\u0406\u0407\7\b\2\2\u0407\u0408\5\u009eP\2\u0408"+
		"\u008f\3\2\2\2\u0409\u040a\7;\2\2\u040a\u040b\5\u009eP\2\u040b\u040c\5"+
		"\u0092J\2\u040c\u040d\5\u009eP\2\u040d\u040e\7\7\2\2\u040e\u0412\5\u009e"+
		"P\2\u040f\u0411\5\u0096L\2\u0410\u040f\3\2\2\2\u0411\u0414\3\2\2\2\u0412"+
		"\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\3\2\2\2\u0414\u0412\3\2"+
		"\2\2\u0415\u0416\7\b\2\2\u0416\u0417\5\u009eP\2\u0417\u0091\3\2\2\2\u0418"+
		"\u0420\5\u0094K\2\u0419\u041a\5\u009eP\2\u041a\u041b\7*\2\2\u041b\u041c"+
		"\5\u009eP\2\u041c\u041d\5\u0094K\2\u041d\u041f\3\2\2\2\u041e\u0419\3\2"+
		"\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u0093\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u042e\7.\2\2\u0424\u042a\5\u009c"+
		"O\2\u0425\u0426\5\u009eP\2\u0426\u0427\5\u009cO\2\u0427\u0429\3\2\2\2"+
		"\u0428\u0425\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b"+
		"\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u0423\3\2\2\2\u042d"+
		"\u0424\3\2\2\2\u042e\u0095\3\2\2\2\u042f\u0430\5\u0098M\2\u0430\u0431"+
		"\5\u009eP\2\u0431\u0432\7\7\2\2\u0432\u0434\5\u009eP\2\u0433\u0435\5\u009a"+
		"N\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u043e\3\2\2\2\u0436"+
		"\u0437\5\u009eP\2\u0437\u0438\7\3\2\2\u0438\u043a\5\u009eP\2\u0439\u043b"+
		"\5\u009aN\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\3\2\2"+
		"\2\u043c\u0436\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f"+
		"\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u0442\7\b\2\2\u0442"+
		"\u0443\5\u009eP\2\u0443\u0097\3\2\2\2\u0444\u0445\5^\60\2\u0445\u0099"+
		"\3\2\2\2\u0446\u0447\5\u009cO\2\u0447\u0448\5\u009eP\2\u0448\u0449\7\5"+
		"\2\2\u0449\u044a\5\u009eP\2\u044a\u0450\5R*\2\u044b\u044c\5\u009eP\2\u044c"+
		"\u044d\5R*\2\u044d\u044f\3\2\2\2\u044e\u044b\3\2\2\2\u044f\u0452\3\2\2"+
		"\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u009b\3\2\2\2\u0452\u0450"+
		"\3\2\2\2\u0453\u0454\t\t\2\2\u0454\u009d\3\2\2\2\u0455\u0457\t\n\2\2\u0456"+
		"\u0455\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2"+
		"\2\2\u0459\u009f\3\2\2\2\u045a\u0458\3\2\2\2l\u00a5\u00aa\u00b1\u00b6"+
		"\u00bd\u00c2\u00c9\u00ce\u00df\u00fb\u0102\u010e\u0113\u0124\u0127\u012c"+
		"\u0137\u0141\u0144\u014f\u015a\u015f\u0164\u0168\u0179\u0184\u018f\u0193"+
		"\u019a\u019c\u01a4\u01a6\u01a8\u01ab\u01b1\u01b8\u01c2\u01ca\u01ce\u01d4"+
		"\u01d8\u01e6\u01eb\u01f9\u0203\u020e\u0214\u021c\u0222\u0227\u022d\u0235"+
		"\u0239\u0241\u0248\u0252\u0254\u0258\u025d\u027a\u028c\u0291\u0296\u029b"+
		"\u02c0\u02c2\u02cc\u02ce\u02d8\u02da\u02e0\u02e7\u02ed\u02fc\u0309\u030b"+
		"\u031b\u0322\u0332\u033c\u0350\u035e\u0368\u036a\u0387\u0394\u0396\u03ab"+
		"\u03b2\u03b7\u03bb\u03cb\u03dd\u03e4\u03f0\u03f8\u0404\u0412\u0420\u042a"+
		"\u042d\u0434\u043a\u043e\u0450\u0458";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}