// Generated from miniC.g4 by ANTLR 4.9.2
package ANTLR4_compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WS=38, IDENT=39, 
		NUMBER=40;
	public static final int
		RULE_mini_c = 0, RULE_translation_unit = 1, RULE_external_dcl = 2, RULE_function_def = 3, 
		RULE_function_header = 4, RULE_dcl_spec = 5, RULE_dcl_specifiers = 6, 
		RULE_dcl_specifier = 7, RULE_type_qualifier = 8, RULE_type_specifier = 9, 
		RULE_function_name = 10, RULE_formal_param = 11, RULE_opt_formal_param = 12, 
		RULE_formal_param_list = 13, RULE_param_dcl = 14, RULE_compound_st = 15, 
		RULE_opt_dcl_list = 16, RULE_declaration_list = 17, RULE_declaration = 18, 
		RULE_init_dcl_list = 19, RULE_init_declarator = 20, RULE_declarator = 21, 
		RULE_opt_number = 22, RULE_opt_stat_list = 23, RULE_statement_list = 24, 
		RULE_statement = 25, RULE_expression_st = 26, RULE_opt_expression = 27, 
		RULE_if_st = 28, RULE_while_st = 29, RULE_return_st = 30, RULE_expression = 31, 
		RULE_assignment_exp = 32, RULE_logical_or_exp = 33, RULE_logical_and_exp = 34, 
		RULE_equality_exp = 35, RULE_relational_exp = 36, RULE_additive_exp = 37, 
		RULE_multiplicative_exp = 38, RULE_unary_exp = 39, RULE_postfix_exp = 40, 
		RULE_opt_actual_param = 41, RULE_actual_param = 42, RULE_actual_param_list = 43, 
		RULE_primary_exp = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"mini_c", "translation_unit", "external_dcl", "function_def", "function_header", 
			"dcl_spec", "dcl_specifiers", "dcl_specifier", "type_qualifier", "type_specifier", 
			"function_name", "formal_param", "opt_formal_param", "formal_param_list", 
			"param_dcl", "compound_st", "opt_dcl_list", "declaration_list", "declaration", 
			"init_dcl_list", "init_declarator", "declarator", "opt_number", "opt_stat_list", 
			"statement_list", "statement", "expression_st", "opt_expression", "if_st", 
			"while_st", "return_st", "expression", "assignment_exp", "logical_or_exp", 
			"logical_and_exp", "equality_exp", "relational_exp", "additive_exp", 
			"multiplicative_exp", "unary_exp", "postfix_exp", "opt_actual_param", 
			"actual_param", "actual_param_list", "primary_exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'int'", "'void'", "'('", "')'", "','", "'{'", "'}'", 
			"';'", "'='", "'['", "']'", "'if'", "'else'", "'while'", "'return'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'||'", "'&&'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", 
			"'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "IDENT", "NUMBER"
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
	public String getGrammarFileName() { return "miniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Mini_cContext extends ParserRuleContext {
		public Mini_cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mini_c; }
	 
		public Mini_cContext() { }
		public void copyFrom(Mini_cContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PROGRAMContext extends Mini_cContext {
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public PROGRAMContext(Mini_cContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPROGRAM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPROGRAM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitPROGRAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mini_cContext mini_c() throws RecognitionException {
		Mini_cContext _localctx = new Mini_cContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mini_c);
		try {
			_localctx = new PROGRAMContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			translation_unit(0);
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

	public static class Translation_unitContext extends ParserRuleContext {
		public External_dclContext external_dcl() {
			return getRuleContext(External_dclContext.class,0);
		}
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitTranslation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitTranslation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		return translation_unit(0);
	}

	private Translation_unitContext translation_unit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, _parentState);
		Translation_unitContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_translation_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			external_dcl();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Translation_unitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translation_unit);
					setState(95);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(96);
					external_dcl();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class External_dclContext extends ParserRuleContext {
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public External_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterExternal_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitExternal_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitExternal_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_dclContext external_dcl() throws RecognitionException {
		External_dclContext _localctx = new External_dclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_external_dcl);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				function_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				declaration();
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

	public static class Function_defContext extends ParserRuleContext {
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
	 
		public Function_defContext() { }
		public void copyFrom(Function_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FUNC_DEFContext extends Function_defContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Compound_stContext compound_st() {
			return getRuleContext(Compound_stContext.class,0);
		}
		public FUNC_DEFContext(Function_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterFUNC_DEF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitFUNC_DEF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitFUNC_DEF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_def);
		try {
			_localctx = new FUNC_DEFContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			function_header();
			setState(107);
			compound_st();
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

	public static class Function_headerContext extends ParserRuleContext {
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
	 
		public Function_headerContext() { }
		public void copyFrom(Function_headerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FUNC_HEADContext extends Function_headerContext {
		public Dcl_specContext dcl_spec() {
			return getRuleContext(Dcl_specContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public FUNC_HEADContext(Function_headerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterFUNC_HEAD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitFUNC_HEAD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitFUNC_HEAD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_header);
		try {
			_localctx = new FUNC_HEADContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			dcl_spec();
			setState(110);
			function_name();
			setState(111);
			formal_param();
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

	public static class Dcl_specContext extends ParserRuleContext {
		public Dcl_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl_spec; }
	 
		public Dcl_specContext() { }
		public void copyFrom(Dcl_specContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DCL_SPECIContext extends Dcl_specContext {
		public Dcl_specifiersContext dcl_specifiers() {
			return getRuleContext(Dcl_specifiersContext.class,0);
		}
		public DCL_SPECIContext(Dcl_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDCL_SPECI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDCL_SPECI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDCL_SPECI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_specContext dcl_spec() throws RecognitionException {
		Dcl_specContext _localctx = new Dcl_specContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dcl_spec);
		try {
			_localctx = new DCL_SPECIContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			dcl_specifiers(0);
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

	public static class Dcl_specifiersContext extends ParserRuleContext {
		public Dcl_specifierContext dcl_specifier() {
			return getRuleContext(Dcl_specifierContext.class,0);
		}
		public Dcl_specifiersContext dcl_specifiers() {
			return getRuleContext(Dcl_specifiersContext.class,0);
		}
		public Dcl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDcl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDcl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDcl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_specifiersContext dcl_specifiers() throws RecognitionException {
		return dcl_specifiers(0);
	}

	private Dcl_specifiersContext dcl_specifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dcl_specifiersContext _localctx = new Dcl_specifiersContext(_ctx, _parentState);
		Dcl_specifiersContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_dcl_specifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			dcl_specifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dcl_specifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dcl_specifiers);
					setState(118);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(119);
					dcl_specifier();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Dcl_specifierContext extends ParserRuleContext {
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Dcl_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDcl_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDcl_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDcl_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_specifierContext dcl_specifier() throws RecognitionException {
		Dcl_specifierContext _localctx = new Dcl_specifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dcl_specifier);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				type_qualifier();
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				type_specifier();
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

	public static class Type_qualifierContext extends ParserRuleContext {
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
	 
		public Type_qualifierContext() { }
		public void copyFrom(Type_qualifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CONST_NODEContext extends Type_qualifierContext {
		public CONST_NODEContext(Type_qualifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterCONST_NODE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitCONST_NODE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitCONST_NODE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_qualifier);
		try {
			_localctx = new CONST_NODEContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__0);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	 
		public Type_specifierContext() { }
		public void copyFrom(Type_specifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class INT_NODEContext extends Type_specifierContext {
		public INT_NODEContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterINT_NODE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitINT_NODE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitINT_NODE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VOID_NODEContext extends Type_specifierContext {
		public VOID_NODEContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterVOID_NODE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitVOID_NODE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitVOID_NODE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_specifier);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new INT_NODEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new VOID_NODEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__2);
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(miniCParser.IDENT, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENT);
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

	public static class Formal_paramContext extends ParserRuleContext {
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
	 
		public Formal_paramContext() { }
		public void copyFrom(Formal_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FORMAL_PARAContext extends Formal_paramContext {
		public Opt_formal_paramContext opt_formal_param() {
			return getRuleContext(Opt_formal_paramContext.class,0);
		}
		public FORMAL_PARAContext(Formal_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterFORMAL_PARA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitFORMAL_PARA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitFORMAL_PARA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formal_param);
		try {
			_localctx = new FORMAL_PARAContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__3);
			setState(138);
			opt_formal_param();
			setState(139);
			match(T__4);
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

	public static class Opt_formal_paramContext extends ParserRuleContext {
		public Formal_param_listContext formal_param_list() {
			return getRuleContext(Formal_param_listContext.class,0);
		}
		public Opt_formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterOpt_formal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitOpt_formal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitOpt_formal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_formal_paramContext opt_formal_param() throws RecognitionException {
		Opt_formal_paramContext _localctx = new Opt_formal_paramContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opt_formal_param);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				formal_param_list(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Formal_param_listContext extends ParserRuleContext {
		public Param_dclContext param_dcl() {
			return getRuleContext(Param_dclContext.class,0);
		}
		public Formal_param_listContext formal_param_list() {
			return getRuleContext(Formal_param_listContext.class,0);
		}
		public Formal_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterFormal_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitFormal_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitFormal_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_param_listContext formal_param_list() throws RecognitionException {
		return formal_param_list(0);
	}

	private Formal_param_listContext formal_param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Formal_param_listContext _localctx = new Formal_param_listContext(_ctx, _parentState);
		Formal_param_listContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_formal_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			param_dcl();
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Formal_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_formal_param_list);
					setState(148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(149);
					match(T__5);
					setState(150);
					param_dcl();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Param_dclContext extends ParserRuleContext {
		public Param_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_dcl; }
	 
		public Param_dclContext() { }
		public void copyFrom(Param_dclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PARA_DCLContext extends Param_dclContext {
		public Dcl_specContext dcl_spec() {
			return getRuleContext(Dcl_specContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public PARA_DCLContext(Param_dclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPARA_DCL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPARA_DCL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitPARA_DCL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_dclContext param_dcl() throws RecognitionException {
		Param_dclContext _localctx = new Param_dclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param_dcl);
		try {
			_localctx = new PARA_DCLContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			dcl_spec();
			setState(157);
			declarator();
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

	public static class Compound_stContext extends ParserRuleContext {
		public Compound_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_st; }
	 
		public Compound_stContext() { }
		public void copyFrom(Compound_stContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class COMPOUND_STATContext extends Compound_stContext {
		public Opt_dcl_listContext opt_dcl_list() {
			return getRuleContext(Opt_dcl_listContext.class,0);
		}
		public Opt_stat_listContext opt_stat_list() {
			return getRuleContext(Opt_stat_listContext.class,0);
		}
		public COMPOUND_STATContext(Compound_stContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterCOMPOUND_STAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitCOMPOUND_STAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitCOMPOUND_STAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stContext compound_st() throws RecognitionException {
		Compound_stContext _localctx = new Compound_stContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compound_st);
		try {
			_localctx = new COMPOUND_STATContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__6);
			setState(160);
			opt_dcl_list();
			setState(161);
			opt_stat_list();
			setState(162);
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

	public static class Opt_dcl_listContext extends ParserRuleContext {
		public Opt_dcl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_dcl_list; }
	 
		public Opt_dcl_listContext() { }
		public void copyFrom(Opt_dcl_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DCL_LISTContext extends Opt_dcl_listContext {
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public DCL_LISTContext(Opt_dcl_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDCL_LIST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDCL_LIST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDCL_LIST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL1Context extends Opt_dcl_listContext {
		public NULL1Context(Opt_dcl_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_dcl_listContext opt_dcl_list() throws RecognitionException {
		Opt_dcl_listContext _localctx = new Opt_dcl_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_opt_dcl_list);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				_localctx = new DCL_LISTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				declaration_list(0);
				}
				break;
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__12:
			case T__14:
			case T__15:
			case T__30:
			case T__34:
			case T__35:
			case T__36:
			case IDENT:
			case NUMBER:
				_localctx = new NULL1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Declaration_listContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDeclaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDeclaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDeclaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		return declaration_list(0);
	}

	private Declaration_listContext declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, _parentState);
		Declaration_listContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaration_list);
					setState(171);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(172);
					declaration();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class DCLContext extends DeclarationContext {
		public Dcl_specContext dcl_spec() {
			return getRuleContext(Dcl_specContext.class,0);
		}
		public Init_dcl_listContext init_dcl_list() {
			return getRuleContext(Init_dcl_listContext.class,0);
		}
		public DCLContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDCL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDCL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDCL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			_localctx = new DCLContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			dcl_spec();
			setState(179);
			init_dcl_list(0);
			setState(180);
			match(T__8);
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

	public static class Init_dcl_listContext extends ParserRuleContext {
		public Init_declaratorContext init_declarator() {
			return getRuleContext(Init_declaratorContext.class,0);
		}
		public Init_dcl_listContext init_dcl_list() {
			return getRuleContext(Init_dcl_listContext.class,0);
		}
		public Init_dcl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_dcl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterInit_dcl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitInit_dcl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitInit_dcl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_dcl_listContext init_dcl_list() throws RecognitionException {
		return init_dcl_list(0);
	}

	private Init_dcl_listContext init_dcl_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Init_dcl_listContext _localctx = new Init_dcl_listContext(_ctx, _parentState);
		Init_dcl_listContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_init_dcl_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			init_declarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Init_dcl_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_init_dcl_list);
					setState(185);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(186);
					match(T__5);
					setState(187);
					init_declarator();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	 
		public Init_declaratorContext() { }
		public void copyFrom(Init_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DCL_ITEMContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(miniCParser.NUMBER, 0); }
		public DCL_ITEMContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDCL_ITEM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDCL_ITEM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDCL_ITEM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_init_declarator);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DCL_ITEMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				declarator();
				}
				break;
			case 2:
				_localctx = new DCL_ITEMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				declarator();
				setState(195);
				match(T__9);
				setState(196);
				match(NUMBER);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	 
		public DeclaratorContext() { }
		public void copyFrom(DeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SIMPLE_VARContext extends DeclaratorContext {
		public TerminalNode IDENT() { return getToken(miniCParser.IDENT, 0); }
		public SIMPLE_VARContext(DeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterSIMPLE_VAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitSIMPLE_VAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitSIMPLE_VAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ARRAY_VARContext extends DeclaratorContext {
		public TerminalNode IDENT() { return getToken(miniCParser.IDENT, 0); }
		public Opt_numberContext opt_number() {
			return getRuleContext(Opt_numberContext.class,0);
		}
		public ARRAY_VARContext(DeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterARRAY_VAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitARRAY_VAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitARRAY_VAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declarator);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SIMPLE_VARContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(IDENT);
				}
				break;
			case 2:
				_localctx = new ARRAY_VARContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(IDENT);
				setState(202);
				match(T__10);
				setState(203);
				opt_number();
				setState(204);
				match(T__11);
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

	public static class Opt_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(miniCParser.NUMBER, 0); }
		public Opt_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterOpt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitOpt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitOpt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_numberContext opt_number() throws RecognitionException {
		Opt_numberContext _localctx = new Opt_numberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opt_number);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(NUMBER);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Opt_stat_listContext extends ParserRuleContext {
		public Opt_stat_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_stat_list; }
	 
		public Opt_stat_listContext() { }
		public void copyFrom(Opt_stat_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class STAT_LISTContext extends Opt_stat_listContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public STAT_LISTContext(Opt_stat_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterSTAT_LIST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitSTAT_LIST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitSTAT_LIST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL2Context extends Opt_stat_listContext {
		public NULL2Context(Opt_stat_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_stat_listContext opt_stat_list() throws RecognitionException {
		Opt_stat_listContext _localctx = new Opt_stat_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opt_stat_list);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__8:
			case T__12:
			case T__14:
			case T__15:
			case T__30:
			case T__34:
			case T__35:
			case T__36:
			case IDENT:
			case NUMBER:
				_localctx = new STAT_LISTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				statement_list(0);
				}
				break;
			case T__7:
				_localctx = new NULL2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		return statement_list(0);
	}

	private Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState);
		Statement_listContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(219);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(220);
					statement();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public Compound_stContext compound_st() {
			return getRuleContext(Compound_stContext.class,0);
		}
		public Expression_stContext expression_st() {
			return getRuleContext(Expression_stContext.class,0);
		}
		public If_stContext if_st() {
			return getRuleContext(If_stContext.class,0);
		}
		public While_stContext while_st() {
			return getRuleContext(While_stContext.class,0);
		}
		public Return_stContext return_st() {
			return getRuleContext(Return_stContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				compound_st();
				}
				break;
			case T__3:
			case T__8:
			case T__30:
			case T__34:
			case T__35:
			case T__36:
			case IDENT:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				expression_st();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				if_st();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				while_st();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				return_st();
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

	public static class Expression_stContext extends ParserRuleContext {
		public Expression_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_st; }
	 
		public Expression_stContext() { }
		public void copyFrom(Expression_stContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EXP_STATContext extends Expression_stContext {
		public Opt_expressionContext opt_expression() {
			return getRuleContext(Opt_expressionContext.class,0);
		}
		public EXP_STATContext(Expression_stContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterEXP_STAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitEXP_STAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitEXP_STAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_stContext expression_st() throws RecognitionException {
		Expression_stContext _localctx = new Expression_stContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression_st);
		try {
			_localctx = new EXP_STATContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			opt_expression();
			setState(234);
			match(T__8);
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

	public static class Opt_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Opt_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterOpt_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitOpt_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitOpt_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_expressionContext opt_expression() throws RecognitionException {
		Opt_expressionContext _localctx = new Opt_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opt_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				setState(236);
				expression();
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

	public static class If_stContext extends ParserRuleContext {
		public If_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_st; }
	 
		public If_stContext() { }
		public void copyFrom(If_stContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IF_ELSE_STATContext extends If_stContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IF_ELSE_STATContext(If_stContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterIF_ELSE_STAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitIF_ELSE_STAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitIF_ELSE_STAT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IF_STATContext extends If_stContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IF_STATContext(If_stContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterIF_STAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitIF_STAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitIF_STAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stContext if_st() throws RecognitionException {
		If_stContext _localctx = new If_stContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_st);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new IF_STATContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__12);
				setState(240);
				match(T__3);
				setState(241);
				expression();
				setState(242);
				match(T__4);
				setState(243);
				statement();
				}
				break;
			case 2:
				_localctx = new IF_ELSE_STATContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__12);
				setState(246);
				match(T__3);
				setState(247);
				expression();
				setState(248);
				match(T__4);
				setState(249);
				statement();
				setState(250);
				match(T__13);
				setState(251);
				statement();
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

	public static class While_stContext extends ParserRuleContext {
		public While_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_st; }
	 
		public While_stContext() { }
		public void copyFrom(While_stContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WHILE_STATContext extends While_stContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WHILE_STATContext(While_stContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterWHILE_STAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitWHILE_STAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitWHILE_STAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stContext while_st() throws RecognitionException {
		While_stContext _localctx = new While_stContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while_st);
		try {
			_localctx = new WHILE_STATContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__14);
			setState(256);
			match(T__3);
			setState(257);
			expression();
			setState(258);
			match(T__4);
			setState(259);
			statement();
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

	public static class Return_stContext extends ParserRuleContext {
		public Return_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_st; }
	 
		public Return_stContext() { }
		public void copyFrom(Return_stContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RETURN_STATContext extends Return_stContext {
		public Opt_expressionContext opt_expression() {
			return getRuleContext(Opt_expressionContext.class,0);
		}
		public RETURN_STATContext(Return_stContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterRETURN_STAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitRETURN_STAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitRETURN_STAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stContext return_st() throws RecognitionException {
		Return_stContext _localctx = new Return_stContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_return_st);
		try {
			_localctx = new RETURN_STATContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__15);
			setState(262);
			opt_expression();
			setState(263);
			match(T__8);
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
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			assignment_exp();
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

	public static class Assignment_expContext extends ParserRuleContext {
		public Assignment_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_exp; }
	 
		public Assignment_expContext() { }
		public void copyFrom(Assignment_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DIV_ASSIGNContext extends Assignment_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public DIV_ASSIGNContext(Assignment_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDIV_ASSIGN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDIV_ASSIGN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDIV_ASSIGN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MOD_ASSIGNContext extends Assignment_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public MOD_ASSIGNContext(Assignment_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterMOD_ASSIGN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitMOD_ASSIGN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitMOD_ASSIGN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MUL_ASSIGNContext extends Assignment_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public MUL_ASSIGNContext(Assignment_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterMUL_ASSIGN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitMUL_ASSIGN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitMUL_ASSIGN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ASSIGN_OPContext extends Assignment_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public ASSIGN_OPContext(Assignment_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterASSIGN_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitASSIGN_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitASSIGN_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUB_ASSIGNContext extends Assignment_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public SUB_ASSIGNContext(Assignment_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterSUB_ASSIGN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitSUB_ASSIGN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitSUB_ASSIGN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADD_ASSIGNContext extends Assignment_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public ADD_ASSIGNContext(Assignment_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterADD_ASSIGN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitADD_ASSIGN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitADD_ASSIGN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL3Context extends Assignment_expContext {
		public Logical_or_expContext logical_or_exp() {
			return getRuleContext(Logical_or_expContext.class,0);
		}
		public NULL3Context(Assignment_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expContext assignment_exp() throws RecognitionException {
		Assignment_expContext _localctx = new Assignment_expContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment_exp);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NULL3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				logical_or_exp(0);
				}
				break;
			case 2:
				_localctx = new ASSIGN_OPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				unary_exp();
				setState(269);
				match(T__9);
				setState(270);
				assignment_exp();
				}
				break;
			case 3:
				_localctx = new ADD_ASSIGNContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				unary_exp();
				setState(273);
				match(T__16);
				setState(274);
				assignment_exp();
				}
				break;
			case 4:
				_localctx = new SUB_ASSIGNContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				unary_exp();
				setState(277);
				match(T__17);
				setState(278);
				assignment_exp();
				}
				break;
			case 5:
				_localctx = new MUL_ASSIGNContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				unary_exp();
				setState(281);
				match(T__18);
				setState(282);
				assignment_exp();
				}
				break;
			case 6:
				_localctx = new DIV_ASSIGNContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				unary_exp();
				setState(285);
				match(T__19);
				setState(286);
				assignment_exp();
				}
				break;
			case 7:
				_localctx = new MOD_ASSIGNContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				unary_exp();
				setState(289);
				match(T__20);
				setState(290);
				assignment_exp();
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

	public static class Logical_or_expContext extends ParserRuleContext {
		public Logical_or_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_exp; }
	 
		public Logical_or_expContext() { }
		public void copyFrom(Logical_or_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LOGICAL_ORContext extends Logical_or_expContext {
		public Logical_or_expContext logical_or_exp() {
			return getRuleContext(Logical_or_expContext.class,0);
		}
		public Logical_and_expContext logical_and_exp() {
			return getRuleContext(Logical_and_expContext.class,0);
		}
		public LOGICAL_ORContext(Logical_or_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterLOGICAL_OR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitLOGICAL_OR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitLOGICAL_OR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL4Context extends Logical_or_expContext {
		public Logical_and_expContext logical_and_exp() {
			return getRuleContext(Logical_and_expContext.class,0);
		}
		public NULL4Context(Logical_or_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expContext logical_or_exp() throws RecognitionException {
		return logical_or_exp(0);
	}

	private Logical_or_expContext logical_or_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expContext _localctx = new Logical_or_expContext(_ctx, _parentState);
		Logical_or_expContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_logical_or_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NULL4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(295);
			logical_and_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LOGICAL_ORContext(new Logical_or_expContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_exp);
					setState(297);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(298);
					match(T__21);
					setState(299);
					logical_and_exp(0);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Logical_and_expContext extends ParserRuleContext {
		public Logical_and_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_exp; }
	 
		public Logical_and_expContext() { }
		public void copyFrom(Logical_and_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LOGICAL_ANDContext extends Logical_and_expContext {
		public Logical_and_expContext logical_and_exp() {
			return getRuleContext(Logical_and_expContext.class,0);
		}
		public Equality_expContext equality_exp() {
			return getRuleContext(Equality_expContext.class,0);
		}
		public LOGICAL_ANDContext(Logical_and_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterLOGICAL_AND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitLOGICAL_AND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitLOGICAL_AND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL5Context extends Logical_and_expContext {
		public Equality_expContext equality_exp() {
			return getRuleContext(Equality_expContext.class,0);
		}
		public NULL5Context(Logical_and_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expContext logical_and_exp() throws RecognitionException {
		return logical_and_exp(0);
	}

	private Logical_and_expContext logical_and_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expContext _localctx = new Logical_and_expContext(_ctx, _parentState);
		Logical_and_expContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_logical_and_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NULL5Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(306);
			equality_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LOGICAL_ANDContext(new Logical_and_expContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_exp);
					setState(308);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(309);
					match(T__22);
					setState(310);
					equality_exp(0);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Equality_expContext extends ParserRuleContext {
		public Equality_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_exp; }
	 
		public Equality_expContext() { }
		public void copyFrom(Equality_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NEContext extends Equality_expContext {
		public Equality_expContext equality_exp() {
			return getRuleContext(Equality_expContext.class,0);
		}
		public Relational_expContext relational_exp() {
			return getRuleContext(Relational_expContext.class,0);
		}
		public NEContext(Equality_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EQContext extends Equality_expContext {
		public Equality_expContext equality_exp() {
			return getRuleContext(Equality_expContext.class,0);
		}
		public Relational_expContext relational_exp() {
			return getRuleContext(Relational_expContext.class,0);
		}
		public EQContext(Equality_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL6Context extends Equality_expContext {
		public Relational_expContext relational_exp() {
			return getRuleContext(Relational_expContext.class,0);
		}
		public NULL6Context(Equality_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expContext equality_exp() throws RecognitionException {
		return equality_exp(0);
	}

	private Equality_expContext equality_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expContext _localctx = new Equality_expContext(_ctx, _parentState);
		Equality_expContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_equality_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NULL6Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(317);
			relational_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new EQContext(new Equality_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equality_exp);
						setState(319);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(320);
						match(T__23);
						setState(321);
						relational_exp(0);
						}
						break;
					case 2:
						{
						_localctx = new NEContext(new Equality_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equality_exp);
						setState(322);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(323);
						match(T__24);
						setState(324);
						relational_exp(0);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Relational_expContext extends ParserRuleContext {
		public Relational_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_exp; }
	 
		public Relational_expContext() { }
		public void copyFrom(Relational_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NULL7Context extends Relational_expContext {
		public Additive_expContext additive_exp() {
			return getRuleContext(Additive_expContext.class,0);
		}
		public NULL7Context(Relational_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LTContext extends Relational_expContext {
		public Relational_expContext relational_exp() {
			return getRuleContext(Relational_expContext.class,0);
		}
		public Additive_expContext additive_exp() {
			return getRuleContext(Additive_expContext.class,0);
		}
		public LTContext(Relational_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitLT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LEContext extends Relational_expContext {
		public Relational_expContext relational_exp() {
			return getRuleContext(Relational_expContext.class,0);
		}
		public Additive_expContext additive_exp() {
			return getRuleContext(Additive_expContext.class,0);
		}
		public LEContext(Relational_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GTContext extends Relational_expContext {
		public Relational_expContext relational_exp() {
			return getRuleContext(Relational_expContext.class,0);
		}
		public Additive_expContext additive_exp() {
			return getRuleContext(Additive_expContext.class,0);
		}
		public GTContext(Relational_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitGT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitGT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GEContext extends Relational_expContext {
		public Relational_expContext relational_exp() {
			return getRuleContext(Relational_expContext.class,0);
		}
		public Additive_expContext additive_exp() {
			return getRuleContext(Additive_expContext.class,0);
		}
		public GEContext(Relational_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitGE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expContext relational_exp() throws RecognitionException {
		return relational_exp(0);
	}

	private Relational_expContext relational_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expContext _localctx = new Relational_expContext(_ctx, _parentState);
		Relational_expContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_relational_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NULL7Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(331);
			additive_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new GTContext(new Relational_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relational_exp);
						setState(333);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(334);
						match(T__25);
						setState(335);
						additive_exp(0);
						}
						break;
					case 2:
						{
						_localctx = new LTContext(new Relational_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relational_exp);
						setState(336);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(337);
						match(T__26);
						setState(338);
						additive_exp(0);
						}
						break;
					case 3:
						{
						_localctx = new GEContext(new Relational_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relational_exp);
						setState(339);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(340);
						match(T__27);
						setState(341);
						additive_exp(0);
						}
						break;
					case 4:
						{
						_localctx = new LEContext(new Relational_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relational_exp);
						setState(342);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(343);
						match(T__28);
						setState(344);
						additive_exp(0);
						}
						break;
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Additive_expContext extends ParserRuleContext {
		public Additive_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_exp; }
	 
		public Additive_expContext() { }
		public void copyFrom(Additive_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDContext extends Additive_expContext {
		public Additive_expContext additive_exp() {
			return getRuleContext(Additive_expContext.class,0);
		}
		public Multiplicative_expContext multiplicative_exp() {
			return getRuleContext(Multiplicative_expContext.class,0);
		}
		public ADDContext(Additive_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitADD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUBContext extends Additive_expContext {
		public Additive_expContext additive_exp() {
			return getRuleContext(Additive_expContext.class,0);
		}
		public Multiplicative_expContext multiplicative_exp() {
			return getRuleContext(Multiplicative_expContext.class,0);
		}
		public SUBContext(Additive_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterSUB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitSUB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitSUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL8Context extends Additive_expContext {
		public Multiplicative_expContext multiplicative_exp() {
			return getRuleContext(Multiplicative_expContext.class,0);
		}
		public NULL8Context(Additive_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expContext additive_exp() throws RecognitionException {
		return additive_exp(0);
	}

	private Additive_expContext additive_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expContext _localctx = new Additive_expContext(_ctx, _parentState);
		Additive_expContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_additive_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NULL8Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(351);
			multiplicative_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(359);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ADDContext(new Additive_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additive_exp);
						setState(353);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(354);
						match(T__29);
						setState(355);
						multiplicative_exp(0);
						}
						break;
					case 2:
						{
						_localctx = new SUBContext(new Additive_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additive_exp);
						setState(356);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(357);
						match(T__30);
						setState(358);
						multiplicative_exp(0);
						}
						break;
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class Multiplicative_expContext extends ParserRuleContext {
		public Multiplicative_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_exp; }
	 
		public Multiplicative_expContext() { }
		public void copyFrom(Multiplicative_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NULL9Context extends Multiplicative_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public NULL9Context(Multiplicative_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL9(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DIVContext extends Multiplicative_expContext {
		public Multiplicative_expContext multiplicative_exp() {
			return getRuleContext(Multiplicative_expContext.class,0);
		}
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public DIVContext(Multiplicative_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterDIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitDIV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MODContext extends Multiplicative_expContext {
		public Multiplicative_expContext multiplicative_exp() {
			return getRuleContext(Multiplicative_expContext.class,0);
		}
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public MODContext(Multiplicative_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterMOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitMOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitMOD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULContext extends Multiplicative_expContext {
		public Multiplicative_expContext multiplicative_exp() {
			return getRuleContext(Multiplicative_expContext.class,0);
		}
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public MULContext(Multiplicative_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterMUL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitMUL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitMUL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expContext multiplicative_exp() throws RecognitionException {
		return multiplicative_exp(0);
	}

	private Multiplicative_expContext multiplicative_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expContext _localctx = new Multiplicative_expContext(_ctx, _parentState);
		Multiplicative_expContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_multiplicative_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NULL9Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(365);
			unary_exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MULContext(new Multiplicative_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_exp);
						setState(367);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(368);
						match(T__31);
						setState(369);
						unary_exp();
						}
						break;
					case 2:
						{
						_localctx = new DIVContext(new Multiplicative_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_exp);
						setState(370);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(371);
						match(T__32);
						setState(372);
						unary_exp();
						}
						break;
					case 3:
						{
						_localctx = new MODContext(new Multiplicative_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_exp);
						setState(373);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(374);
						match(T__33);
						setState(375);
						unary_exp();
						}
						break;
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Unary_expContext extends ParserRuleContext {
		public Unary_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_exp; }
	 
		public Unary_expContext() { }
		public void copyFrom(Unary_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UNARY_MINUSContext extends Unary_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public UNARY_MINUSContext(Unary_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterUNARY_MINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitUNARY_MINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitUNARY_MINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LOGICAL_NOTContext extends Unary_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public LOGICAL_NOTContext(Unary_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterLOGICAL_NOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitLOGICAL_NOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitLOGICAL_NOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PRE_INCContext extends Unary_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public PRE_INCContext(Unary_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPRE_INC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPRE_INC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitPRE_INC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL10Context extends Unary_expContext {
		public Postfix_expContext postfix_exp() {
			return getRuleContext(Postfix_expContext.class,0);
		}
		public NULL10Context(Unary_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL10(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PRE_DECContext extends Unary_expContext {
		public Unary_expContext unary_exp() {
			return getRuleContext(Unary_expContext.class,0);
		}
		public PRE_DECContext(Unary_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPRE_DEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPRE_DEC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitPRE_DEC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expContext unary_exp() throws RecognitionException {
		Unary_expContext _localctx = new Unary_expContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unary_exp);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case IDENT:
			case NUMBER:
				_localctx = new NULL10Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				postfix_exp(0);
				}
				break;
			case T__30:
				_localctx = new UNARY_MINUSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__30);
				setState(383);
				unary_exp();
				}
				break;
			case T__34:
				_localctx = new LOGICAL_NOTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(T__34);
				setState(385);
				unary_exp();
				}
				break;
			case T__35:
				_localctx = new PRE_INCContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(T__35);
				setState(387);
				unary_exp();
				}
				break;
			case T__36:
				_localctx = new PRE_DECContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(T__36);
				setState(389);
				unary_exp();
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

	public static class Postfix_expContext extends ParserRuleContext {
		public Postfix_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_exp; }
	 
		public Postfix_expContext() { }
		public void copyFrom(Postfix_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CALLContext extends Postfix_expContext {
		public Postfix_expContext postfix_exp() {
			return getRuleContext(Postfix_expContext.class,0);
		}
		public Opt_actual_paramContext opt_actual_param() {
			return getRuleContext(Opt_actual_paramContext.class,0);
		}
		public CALLContext(Postfix_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterCALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitCALL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitCALL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POST_INCContext extends Postfix_expContext {
		public Postfix_expContext postfix_exp() {
			return getRuleContext(Postfix_expContext.class,0);
		}
		public POST_INCContext(Postfix_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPOST_INC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPOST_INC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitPOST_INC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class INDEXContext extends Postfix_expContext {
		public Postfix_expContext postfix_exp() {
			return getRuleContext(Postfix_expContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public INDEXContext(Postfix_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterINDEX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitINDEX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitINDEX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POST_DECContext extends Postfix_expContext {
		public Postfix_expContext postfix_exp() {
			return getRuleContext(Postfix_expContext.class,0);
		}
		public POST_DECContext(Postfix_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPOST_DEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPOST_DEC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitPOST_DEC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL11Context extends Postfix_expContext {
		public Primary_expContext primary_exp() {
			return getRuleContext(Primary_expContext.class,0);
		}
		public NULL11Context(Postfix_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterNULL11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitNULL11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitNULL11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expContext postfix_exp() throws RecognitionException {
		return postfix_exp(0);
	}

	private Postfix_expContext postfix_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expContext _localctx = new Postfix_expContext(_ctx, _parentState);
		Postfix_expContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_postfix_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NULL11Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(393);
			primary_exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new INDEXContext(new Postfix_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_exp);
						setState(395);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(396);
						match(T__10);
						setState(397);
						expression();
						setState(398);
						match(T__11);
						}
						break;
					case 2:
						{
						_localctx = new CALLContext(new Postfix_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_exp);
						setState(400);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(401);
						match(T__3);
						setState(402);
						opt_actual_param();
						setState(403);
						match(T__4);
						}
						break;
					case 3:
						{
						_localctx = new POST_INCContext(new Postfix_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_exp);
						setState(405);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(406);
						match(T__35);
						}
						break;
					case 4:
						{
						_localctx = new POST_DECContext(new Postfix_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_exp);
						setState(407);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(408);
						match(T__36);
						}
						break;
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Opt_actual_paramContext extends ParserRuleContext {
		public Actual_paramContext actual_param() {
			return getRuleContext(Actual_paramContext.class,0);
		}
		public Opt_actual_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_actual_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterOpt_actual_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitOpt_actual_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitOpt_actual_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_actual_paramContext opt_actual_param() throws RecognitionException {
		Opt_actual_paramContext _localctx = new Opt_actual_paramContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opt_actual_param);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__30:
			case T__34:
			case T__35:
			case T__36:
			case IDENT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				actual_param();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Actual_paramContext extends ParserRuleContext {
		public Actual_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_param; }
	 
		public Actual_paramContext() { }
		public void copyFrom(Actual_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ACTUAL_PARAContext extends Actual_paramContext {
		public Actual_param_listContext actual_param_list() {
			return getRuleContext(Actual_param_listContext.class,0);
		}
		public ACTUAL_PARAContext(Actual_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterACTUAL_PARA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitACTUAL_PARA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitACTUAL_PARA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_paramContext actual_param() throws RecognitionException {
		Actual_paramContext _localctx = new Actual_paramContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_actual_param);
		try {
			_localctx = new ACTUAL_PARAContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			actual_param_list(0);
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

	public static class Actual_param_listContext extends ParserRuleContext {
		public Assignment_expContext assignment_exp() {
			return getRuleContext(Assignment_expContext.class,0);
		}
		public Actual_param_listContext actual_param_list() {
			return getRuleContext(Actual_param_listContext.class,0);
		}
		public Actual_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterActual_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitActual_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitActual_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_param_listContext actual_param_list() throws RecognitionException {
		return actual_param_list(0);
	}

	private Actual_param_listContext actual_param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Actual_param_listContext _localctx = new Actual_param_listContext(_ctx, _parentState);
		Actual_param_listContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_actual_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(421);
			assignment_exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Actual_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_actual_param_list);
					setState(423);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(424);
					match(T__5);
					setState(425);
					assignment_exp();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Primary_expContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(miniCParser.IDENT, 0); }
		public TerminalNode NUMBER() { return getToken(miniCParser.NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Primary_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPrimary_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPrimary_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCVisitor ) return ((miniCVisitor<? extends T>)visitor).visitPrimary_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expContext primary_exp() throws RecognitionException {
		Primary_expContext _localctx = new Primary_expContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primary_exp);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(NUMBER);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(T__3);
				setState(434);
				expression();
				setState(435);
				match(T__4);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return translation_unit_sempred((Translation_unitContext)_localctx, predIndex);
		case 6:
			return dcl_specifiers_sempred((Dcl_specifiersContext)_localctx, predIndex);
		case 13:
			return formal_param_list_sempred((Formal_param_listContext)_localctx, predIndex);
		case 17:
			return declaration_list_sempred((Declaration_listContext)_localctx, predIndex);
		case 19:
			return init_dcl_list_sempred((Init_dcl_listContext)_localctx, predIndex);
		case 24:
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		case 33:
			return logical_or_exp_sempred((Logical_or_expContext)_localctx, predIndex);
		case 34:
			return logical_and_exp_sempred((Logical_and_expContext)_localctx, predIndex);
		case 35:
			return equality_exp_sempred((Equality_expContext)_localctx, predIndex);
		case 36:
			return relational_exp_sempred((Relational_expContext)_localctx, predIndex);
		case 37:
			return additive_exp_sempred((Additive_expContext)_localctx, predIndex);
		case 38:
			return multiplicative_exp_sempred((Multiplicative_expContext)_localctx, predIndex);
		case 40:
			return postfix_exp_sempred((Postfix_expContext)_localctx, predIndex);
		case 43:
			return actual_param_list_sempred((Actual_param_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean translation_unit_sempred(Translation_unitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dcl_specifiers_sempred(Dcl_specifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean formal_param_list_sempred(Formal_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declaration_list_sempred(Declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean init_dcl_list_sempred(Init_dcl_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_or_exp_sempred(Logical_or_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_exp_sempred(Logical_and_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_exp_sempred(Equality_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_exp_sempred(Relational_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_exp_sempred(Additive_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_exp_sempred(Multiplicative_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfix_exp_sempred(Postfix_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean actual_param_list_sempred(Actual_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u01ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3d\n\3\f\3\16\3g\13\3\3"+
		"\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\13\3\13\5\13"+
		"\u0088\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0092\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d\13\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00a9\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00b0\n\23\f\23\16\23\u00b3\13\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00bf\n\25\f\25\16\25\u00c2\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00c9\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00d1\n\27\3\30\3\30\5\30\u00d5\n\30\3\31\3\31\5\31\u00d9\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\7\32\u00e0\n\32\f\32\16\32\u00e3\13\32\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u00ea\n\33\3\34\3\34\3\34\3\35\5\35\u00f0\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0100\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0127\n\"\3#\3#\3#\3#\3#\3#\7#\u012f\n#\f"+
		"#\16#\u0132\13#\3$\3$\3$\3$\3$\3$\7$\u013a\n$\f$\16$\u013d\13$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\7%\u0148\n%\f%\16%\u014b\13%\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\7&\u015c\n&\f&\16&\u015f\13&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u016a\n\'\f\'\16\'\u016d\13\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\7(\u017b\n(\f(\16(\u017e\13(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u0189\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\7*\u019c\n*\f*\16*\u019f\13*\3+\3+\5+\u01a3\n+\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\7-\u01ad\n-\f-\16-\u01b0\13-\3.\3.\3.\3.\3.\3.\5.\u01b8\n.\3.\2\20"+
		"\4\16\34$(\62DFHJLNRX/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\2\2\2\u01c0\2\\\3\2\2\2\4^\3\2\2\2\6j"+
		"\3\2\2\2\bl\3\2\2\2\no\3\2\2\2\fs\3\2\2\2\16u\3\2\2\2\20\u0081\3\2\2\2"+
		"\22\u0083\3\2\2\2\24\u0087\3\2\2\2\26\u0089\3\2\2\2\30\u008b\3\2\2\2\32"+
		"\u0091\3\2\2\2\34\u0093\3\2\2\2\36\u009e\3\2\2\2 \u00a1\3\2\2\2\"\u00a8"+
		"\3\2\2\2$\u00aa\3\2\2\2&\u00b4\3\2\2\2(\u00b8\3\2\2\2*\u00c8\3\2\2\2,"+
		"\u00d0\3\2\2\2.\u00d4\3\2\2\2\60\u00d8\3\2\2\2\62\u00da\3\2\2\2\64\u00e9"+
		"\3\2\2\2\66\u00eb\3\2\2\28\u00ef\3\2\2\2:\u00ff\3\2\2\2<\u0101\3\2\2\2"+
		">\u0107\3\2\2\2@\u010b\3\2\2\2B\u0126\3\2\2\2D\u0128\3\2\2\2F\u0133\3"+
		"\2\2\2H\u013e\3\2\2\2J\u014c\3\2\2\2L\u0160\3\2\2\2N\u016e\3\2\2\2P\u0188"+
		"\3\2\2\2R\u018a\3\2\2\2T\u01a2\3\2\2\2V\u01a4\3\2\2\2X\u01a6\3\2\2\2Z"+
		"\u01b7\3\2\2\2\\]\5\4\3\2]\3\3\2\2\2^_\b\3\1\2_`\5\6\4\2`e\3\2\2\2ab\f"+
		"\3\2\2bd\5\6\4\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\5\3\2\2\2ge"+
		"\3\2\2\2hk\5\b\5\2ik\5&\24\2jh\3\2\2\2ji\3\2\2\2k\7\3\2\2\2lm\5\n\6\2"+
		"mn\5 \21\2n\t\3\2\2\2op\5\f\7\2pq\5\26\f\2qr\5\30\r\2r\13\3\2\2\2st\5"+
		"\16\b\2t\r\3\2\2\2uv\b\b\1\2vw\5\20\t\2w|\3\2\2\2xy\f\3\2\2y{\5\20\t\2"+
		"zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0082"+
		"\5\22\n\2\u0080\u0082\5\24\13\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2"+
		"\u0082\21\3\2\2\2\u0083\u0084\7\3\2\2\u0084\23\3\2\2\2\u0085\u0088\7\4"+
		"\2\2\u0086\u0088\7\5\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\25\3\2\2\2\u0089\u008a\7)\2\2\u008a\27\3\2\2\2\u008b\u008c\7\6\2\2\u008c"+
		"\u008d\5\32\16\2\u008d\u008e\7\7\2\2\u008e\31\3\2\2\2\u008f\u0092\5\34"+
		"\17\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\33\3\2\2\2\u0093\u0094\b\17\1\2\u0094\u0095\5\36\20\2\u0095\u009b\3\2"+
		"\2\2\u0096\u0097\f\3\2\2\u0097\u0098\7\b\2\2\u0098\u009a\5\36\20\2\u0099"+
		"\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\35\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5\f\7\2\u009f\u00a0"+
		"\5,\27\2\u00a0\37\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\"\22\2\u00a3"+
		"\u00a4\5\60\31\2\u00a4\u00a5\7\n\2\2\u00a5!\3\2\2\2\u00a6\u00a9\5$\23"+
		"\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9#"+
		"\3\2\2\2\u00aa\u00ab\b\23\1\2\u00ab\u00ac\5&\24\2\u00ac\u00b1\3\2\2\2"+
		"\u00ad\u00ae\f\3\2\2\u00ae\u00b0\5&\24\2\u00af\u00ad\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2%\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\5(\25\2\u00b6\u00b7\7\13"+
		"\2\2\u00b7\'\3\2\2\2\u00b8\u00b9\b\25\1\2\u00b9\u00ba\5*\26\2\u00ba\u00c0"+
		"\3\2\2\2\u00bb\u00bc\f\3\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00bf\5*\26\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1)\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c9\5,\27\2\u00c4\u00c5"+
		"\5,\27\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9+\3\2\2\2\u00ca\u00d1\7)\2\2\u00cb"+
		"\u00cc\7)\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\5.\30\2\u00ce\u00cf\7\16"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d1"+
		"-\3\2\2\2\u00d2\u00d5\7*\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5/\3\2\2\2\u00d6\u00d9\5\62\32\2\u00d7\u00d9\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\61\3\2\2\2\u00da\u00db"+
		"\b\32\1\2\u00db\u00dc\5\64\33\2\u00dc\u00e1\3\2\2\2\u00dd\u00de\f\3\2"+
		"\2\u00de\u00e0\5\64\33\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\63\3\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e4\u00ea\5 \21\2\u00e5\u00ea\5\66\34\2\u00e6\u00ea\5:\36\2\u00e7"+
		"\u00ea\5<\37\2\u00e8\u00ea\5> \2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2"+
		"\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\65"+
		"\3\2\2\2\u00eb\u00ec\58\35\2\u00ec\u00ed\7\13\2\2\u00ed\67\3\2\2\2\u00ee"+
		"\u00f0\5@!\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f09\3\2\2\2\u00f1"+
		"\u00f2\7\17\2\2\u00f2\u00f3\7\6\2\2\u00f3\u00f4\5@!\2\u00f4\u00f5\7\7"+
		"\2\2\u00f5\u00f6\5\64\33\2\u00f6\u0100\3\2\2\2\u00f7\u00f8\7\17\2\2\u00f8"+
		"\u00f9\7\6\2\2\u00f9\u00fa\5@!\2\u00fa\u00fb\7\7\2\2\u00fb\u00fc\5\64"+
		"\33\2\u00fc\u00fd\7\20\2\2\u00fd\u00fe\5\64\33\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00f1\3\2\2\2\u00ff\u00f7\3\2\2\2\u0100;\3\2\2\2\u0101\u0102\7\21\2\2"+
		"\u0102\u0103\7\6\2\2\u0103\u0104\5@!\2\u0104\u0105\7\7\2\2\u0105\u0106"+
		"\5\64\33\2\u0106=\3\2\2\2\u0107\u0108\7\22\2\2\u0108\u0109\58\35\2\u0109"+
		"\u010a\7\13\2\2\u010a?\3\2\2\2\u010b\u010c\5B\"\2\u010cA\3\2\2\2\u010d"+
		"\u0127\5D#\2\u010e\u010f\5P)\2\u010f\u0110\7\f\2\2\u0110\u0111\5B\"\2"+
		"\u0111\u0127\3\2\2\2\u0112\u0113\5P)\2\u0113\u0114\7\23\2\2\u0114\u0115"+
		"\5B\"\2\u0115\u0127\3\2\2\2\u0116\u0117\5P)\2\u0117\u0118\7\24\2\2\u0118"+
		"\u0119\5B\"\2\u0119\u0127\3\2\2\2\u011a\u011b\5P)\2\u011b\u011c\7\25\2"+
		"\2\u011c\u011d\5B\"\2\u011d\u0127\3\2\2\2\u011e\u011f\5P)\2\u011f\u0120"+
		"\7\26\2\2\u0120\u0121\5B\"\2\u0121\u0127\3\2\2\2\u0122\u0123\5P)\2\u0123"+
		"\u0124\7\27\2\2\u0124\u0125\5B\"\2\u0125\u0127\3\2\2\2\u0126\u010d\3\2"+
		"\2\2\u0126\u010e\3\2\2\2\u0126\u0112\3\2\2\2\u0126\u0116\3\2\2\2\u0126"+
		"\u011a\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0122\3\2\2\2\u0127C\3\2\2\2"+
		"\u0128\u0129\b#\1\2\u0129\u012a\5F$\2\u012a\u0130\3\2\2\2\u012b\u012c"+
		"\f\3\2\2\u012c\u012d\7\30\2\2\u012d\u012f\5F$\2\u012e\u012b\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131E\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0133\u0134\b$\1\2\u0134\u0135\5H%\2\u0135\u013b"+
		"\3\2\2\2\u0136\u0137\f\3\2\2\u0137\u0138\7\31\2\2\u0138\u013a\5H%\2\u0139"+
		"\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013cG\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b%\1\2\u013f\u0140"+
		"\5J&\2\u0140\u0149\3\2\2\2\u0141\u0142\f\4\2\2\u0142\u0143\7\32\2\2\u0143"+
		"\u0148\5J&\2\u0144\u0145\f\3\2\2\u0145\u0146\7\33\2\2\u0146\u0148\5J&"+
		"\2\u0147\u0141\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014aI\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\b&\1\2\u014d\u014e\5L\'\2\u014e\u015d\3\2\2\2\u014f\u0150\f\6\2"+
		"\2\u0150\u0151\7\34\2\2\u0151\u015c\5L\'\2\u0152\u0153\f\5\2\2\u0153\u0154"+
		"\7\35\2\2\u0154\u015c\5L\'\2\u0155\u0156\f\4\2\2\u0156\u0157\7\36\2\2"+
		"\u0157\u015c\5L\'\2\u0158\u0159\f\3\2\2\u0159\u015a\7\37\2\2\u015a\u015c"+
		"\5L\'\2\u015b\u014f\3\2\2\2\u015b\u0152\3\2\2\2\u015b\u0155\3\2\2\2\u015b"+
		"\u0158\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015eK\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\b\'\1\2\u0161\u0162"+
		"\5N(\2\u0162\u016b\3\2\2\2\u0163\u0164\f\4\2\2\u0164\u0165\7 \2\2\u0165"+
		"\u016a\5N(\2\u0166\u0167\f\3\2\2\u0167\u0168\7!\2\2\u0168\u016a\5N(\2"+
		"\u0169\u0163\3\2\2\2\u0169\u0166\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016cM\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\b(\1\2\u016f\u0170\5P)\2\u0170\u017c\3\2\2\2\u0171\u0172\f\5\2"+
		"\2\u0172\u0173\7\"\2\2\u0173\u017b\5P)\2\u0174\u0175\f\4\2\2\u0175\u0176"+
		"\7#\2\2\u0176\u017b\5P)\2\u0177\u0178\f\3\2\2\u0178\u0179\7$\2\2\u0179"+
		"\u017b\5P)\2\u017a\u0171\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u0177\3\2\2"+
		"\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dO"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0189\5R*\2\u0180\u0181\7!\2\2\u0181"+
		"\u0189\5P)\2\u0182\u0183\7%\2\2\u0183\u0189\5P)\2\u0184\u0185\7&\2\2\u0185"+
		"\u0189\5P)\2\u0186\u0187\7\'\2\2\u0187\u0189\5P)\2\u0188\u017f\3\2\2\2"+
		"\u0188\u0180\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0189Q\3\2\2\2\u018a\u018b\b*\1\2\u018b\u018c\5Z.\2\u018c\u019d"+
		"\3\2\2\2\u018d\u018e\f\6\2\2\u018e\u018f\7\r\2\2\u018f\u0190\5@!\2\u0190"+
		"\u0191\7\16\2\2\u0191\u019c\3\2\2\2\u0192\u0193\f\5\2\2\u0193\u0194\7"+
		"\6\2\2\u0194\u0195\5T+\2\u0195\u0196\7\7\2\2\u0196\u019c\3\2\2\2\u0197"+
		"\u0198\f\4\2\2\u0198\u019c\7&\2\2\u0199\u019a\f\3\2\2\u019a\u019c\7\'"+
		"\2\2\u019b\u018d\3\2\2\2\u019b\u0192\3\2\2\2\u019b\u0197\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019eS\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a3\5V,\2\u01a1\u01a3"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3U\3\2\2\2\u01a4"+
		"\u01a5\5X-\2\u01a5W\3\2\2\2\u01a6\u01a7\b-\1\2\u01a7\u01a8\5B\"\2\u01a8"+
		"\u01ae\3\2\2\2\u01a9\u01aa\f\3\2\2\u01aa\u01ab\7\b\2\2\u01ab\u01ad\5B"+
		"\"\2\u01ac\u01a9\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01afY\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b8\7)\2\2\u01b2"+
		"\u01b8\7*\2\2\u01b3\u01b4\7\6\2\2\u01b4\u01b5\5@!\2\u01b5\u01b6\7\7\2"+
		"\2\u01b6\u01b8\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3"+
		"\3\2\2\2\u01b8[\3\2\2\2%ej|\u0081\u0087\u0091\u009b\u00a8\u00b1\u00c0"+
		"\u00c8\u00d0\u00d4\u00d8\u00e1\u00e9\u00ef\u00ff\u0126\u0130\u013b\u0147"+
		"\u0149\u015b\u015d\u0169\u016b\u017a\u017c\u0188\u019b\u019d\u01a2\u01ae"+
		"\u01b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}