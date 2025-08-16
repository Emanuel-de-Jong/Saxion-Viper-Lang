// Generated from E:/Coding/Saxion/2021-2022/Code-S3/Compilers/78/src/nl/saxion/cos\Viper.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ViperParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_vStatement = 1, RULE_vMethodCall = 2, RULE_vClass = 3, 
		RULE_vSwitch = 4, RULE_vCase = 5, RULE_vIf = 6, RULE_vWhile = 7, RULE_vBreak = 8, 
		RULE_vContinue = 9, RULE_vReturn = 10, RULE_vBlock = 11, RULE_vAssignment = 12, 
		RULE_vDeclaration = 13, RULE_vMethod = 14, RULE_vNewObject = 15, RULE_vExpression = 16, 
		RULE_vUnaryOperation = 17, RULE_vType = 18, RULE_vAccess = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "vStatement", "vMethodCall", "vClass", "vSwitch", "vCase", 
			"vIf", "vWhile", "vBreak", "vContinue", "vReturn", "vBlock", "vAssignment", 
			"vDeclaration", "vMethod", "vNewObject", "vExpression", "vUnaryOperation", 
			"vType", "vAccess"
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

	@Override
	public String getGrammarFileName() { return "Viper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ViperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ViperParser.EOF, 0); }
		public List<VStatementContext> vStatement() {
			return getRuleContexts(VStatementContext.class);
		}
		public VStatementContext vStatement(int i) {
			return getRuleContext(VStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__29) | (1L << T__30) | (1L << V_CLASS_KW) | (1L << V_SWITCH_KW) | (1L << V_IF_KW) | (1L << V_BREAK_KW) | (1L << V_CONTINUE_KW) | (1L << V_RETURN_KW) | (1L << V_NEW_KW) | (1L << V_STATIC_KW) | (1L << V_PUBLIC_KW) | (1L << V_PRIVATE_KW) | (1L << V_WHILE_KW) | (1L << V_THIS_KW) | (1L << V_STRING_KW) | (1L << V_BOOL_KW) | (1L << V_FLOAT_KW) | (1L << V_INT_KW) | (1L << V_STRING) | (1L << V_BOOL) | (1L << V_FLOAT) | (1L << V_INT) | (1L << V_IDENTIFIER))) != 0)) {
				{
				{
				setState(40);
				vStatement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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

	public static class VStatementContext extends ParserRuleContext {
		public VDeclarationContext vDeclaration() {
			return getRuleContext(VDeclarationContext.class,0);
		}
		public VAssignmentContext vAssignment() {
			return getRuleContext(VAssignmentContext.class,0);
		}
		public VBlockContext vBlock() {
			return getRuleContext(VBlockContext.class,0);
		}
		public VMethodContext vMethod() {
			return getRuleContext(VMethodContext.class,0);
		}
		public VReturnContext vReturn() {
			return getRuleContext(VReturnContext.class,0);
		}
		public VContinueContext vContinue() {
			return getRuleContext(VContinueContext.class,0);
		}
		public VBreakContext vBreak() {
			return getRuleContext(VBreakContext.class,0);
		}
		public VWhileContext vWhile() {
			return getRuleContext(VWhileContext.class,0);
		}
		public VIfContext vIf() {
			return getRuleContext(VIfContext.class,0);
		}
		public VSwitchContext vSwitch() {
			return getRuleContext(VSwitchContext.class,0);
		}
		public VClassContext vClass() {
			return getRuleContext(VClassContext.class,0);
		}
		public VUnaryOperationContext vUnaryOperation() {
			return getRuleContext(VUnaryOperationContext.class,0);
		}
		public VMethodCallContext vMethodCall() {
			return getRuleContext(VMethodCallContext.class,0);
		}
		public VNewObjectContext vNewObject() {
			return getRuleContext(VNewObjectContext.class,0);
		}
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public VStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VStatementContext vStatement() throws RecognitionException {
		VStatementContext _localctx = new VStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vStatement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				vDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				vAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				vBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				vMethod();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				vReturn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				vContinue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				vBreak();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				vWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(56);
				vIf();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(57);
				vSwitch();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(58);
				vClass();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(59);
				vUnaryOperation();
				setState(60);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(62);
				vMethodCall();
				setState(63);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(65);
				vNewObject();
				setState(66);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(68);
				vExpression(0);
				setState(69);
				match(T__0);
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

	public static class VMethodCallContext extends ParserRuleContext {
		public List<TerminalNode> V_IDENTIFIER() { return getTokens(ViperParser.V_IDENTIFIER); }
		public TerminalNode V_IDENTIFIER(int i) {
			return getToken(ViperParser.V_IDENTIFIER, i);
		}
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public VMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vMethodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VMethodCallContext vMethodCall() throws RecognitionException {
		VMethodCallContext _localctx = new VMethodCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vMethodCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(V_IDENTIFIER);
					setState(74);
					match(T__1);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(80);
			match(V_IDENTIFIER);
			setState(81);
			match(T__2);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__29) | (1L << T__30) | (1L << V_NEW_KW) | (1L << V_THIS_KW) | (1L << V_STRING) | (1L << V_BOOL) | (1L << V_FLOAT) | (1L << V_INT) | (1L << V_IDENTIFIER))) != 0)) {
				{
				setState(82);
				vExpression(0);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(83);
					match(T__3);
					setState(84);
					vExpression(0);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
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

	public static class VClassContext extends ParserRuleContext {
		public TerminalNode V_CLASS_KW() { return getToken(ViperParser.V_CLASS_KW, 0); }
		public TerminalNode V_IDENTIFIER() { return getToken(ViperParser.V_IDENTIFIER, 0); }
		public VAccessContext vAccess() {
			return getRuleContext(VAccessContext.class,0);
		}
		public List<VDeclarationContext> vDeclaration() {
			return getRuleContexts(VDeclarationContext.class);
		}
		public VDeclarationContext vDeclaration(int i) {
			return getRuleContext(VDeclarationContext.class,i);
		}
		public List<VMethodContext> vMethod() {
			return getRuleContexts(VMethodContext.class);
		}
		public VMethodContext vMethod(int i) {
			return getRuleContext(VMethodContext.class,i);
		}
		public VClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vClass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VClassContext vClass() throws RecognitionException {
		VClassContext _localctx = new VClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==V_PUBLIC_KW || _la==V_PRIVATE_KW) {
				{
				setState(94);
				vAccess();
				}
			}

			setState(97);
			match(V_CLASS_KW);
			setState(98);
			match(V_IDENTIFIER);
			setState(99);
			match(T__5);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << V_STATIC_KW) | (1L << V_PUBLIC_KW) | (1L << V_PRIVATE_KW) | (1L << V_STRING_KW) | (1L << V_BOOL_KW) | (1L << V_FLOAT_KW) | (1L << V_INT_KW) | (1L << V_IDENTIFIER))) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(100);
					vDeclaration();
					}
					break;
				case 2:
					{
					setState(101);
					vMethod();
					}
					break;
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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

	public static class VSwitchContext extends ParserRuleContext {
		public TerminalNode V_SWITCH_KW() { return getToken(ViperParser.V_SWITCH_KW, 0); }
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public List<VCaseContext> vCase() {
			return getRuleContexts(VCaseContext.class);
		}
		public VCaseContext vCase(int i) {
			return getRuleContext(VCaseContext.class,i);
		}
		public VSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vSwitch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VSwitchContext vSwitch() throws RecognitionException {
		VSwitchContext _localctx = new VSwitchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(V_SWITCH_KW);
			setState(110);
			match(T__2);
			setState(111);
			vExpression(0);
			setState(112);
			match(T__4);
			setState(113);
			match(T__5);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				vCase();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==V_CASE_KW );
			setState(119);
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

	public static class VCaseContext extends ParserRuleContext {
		public TerminalNode V_CASE_KW() { return getToken(ViperParser.V_CASE_KW, 0); }
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public VStatementContext vStatement() {
			return getRuleContext(VStatementContext.class,0);
		}
		public VBlockContext vBlock() {
			return getRuleContext(VBlockContext.class,0);
		}
		public VCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vCase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VCaseContext vCase() throws RecognitionException {
		VCaseContext _localctx = new VCaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(V_CASE_KW);
			setState(122);
			vExpression(0);
			setState(123);
			match(T__7);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(124);
				vStatement();
				setState(125);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(127);
				vBlock();
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

	public static class VIfContext extends ParserRuleContext {
		public VExpressionContext vCondition;
		public TerminalNode V_IF_KW() { return getToken(ViperParser.V_IF_KW, 0); }
		public List<VBlockContext> vBlock() {
			return getRuleContexts(VBlockContext.class);
		}
		public VBlockContext vBlock(int i) {
			return getRuleContext(VBlockContext.class,i);
		}
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public List<TerminalNode> V_ELSEIF_KW() { return getTokens(ViperParser.V_ELSEIF_KW); }
		public TerminalNode V_ELSEIF_KW(int i) {
			return getToken(ViperParser.V_ELSEIF_KW, i);
		}
		public TerminalNode V_ELSE_KW() { return getToken(ViperParser.V_ELSE_KW, 0); }
		public VIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VIfContext vIf() throws RecognitionException {
		VIfContext _localctx = new VIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(V_IF_KW);
			setState(131);
			match(T__2);
			setState(132);
			((VIfContext)_localctx).vCondition = vExpression(0);
			setState(133);
			match(T__4);
			setState(134);
			vBlock();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V_ELSEIF_KW) {
				{
				{
				setState(135);
				match(V_ELSEIF_KW);
				setState(136);
				match(T__2);
				setState(137);
				vExpression(0);
				setState(138);
				match(T__4);
				setState(139);
				vBlock();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==V_ELSE_KW) {
				{
				setState(146);
				match(V_ELSE_KW);
				setState(147);
				vBlock();
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

	public static class VWhileContext extends ParserRuleContext {
		public TerminalNode V_WHILE_KW() { return getToken(ViperParser.V_WHILE_KW, 0); }
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public VBlockContext vBlock() {
			return getRuleContext(VBlockContext.class,0);
		}
		public VWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vWhile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VWhileContext vWhile() throws RecognitionException {
		VWhileContext _localctx = new VWhileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(V_WHILE_KW);
			setState(151);
			match(T__2);
			setState(152);
			vExpression(0);
			setState(153);
			match(T__4);
			setState(154);
			vBlock();
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

	public static class VBreakContext extends ParserRuleContext {
		public TerminalNode V_BREAK_KW() { return getToken(ViperParser.V_BREAK_KW, 0); }
		public VBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vBreak; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VBreakContext vBreak() throws RecognitionException {
		VBreakContext _localctx = new VBreakContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(V_BREAK_KW);
			setState(157);
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

	public static class VContinueContext extends ParserRuleContext {
		public TerminalNode V_CONTINUE_KW() { return getToken(ViperParser.V_CONTINUE_KW, 0); }
		public VContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vContinue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VContinueContext vContinue() throws RecognitionException {
		VContinueContext _localctx = new VContinueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(V_CONTINUE_KW);
			setState(160);
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

	public static class VReturnContext extends ParserRuleContext {
		public TerminalNode V_RETURN_KW() { return getToken(ViperParser.V_RETURN_KW, 0); }
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public VReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VReturnContext vReturn() throws RecognitionException {
		VReturnContext _localctx = new VReturnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(V_RETURN_KW);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__29) | (1L << T__30) | (1L << V_NEW_KW) | (1L << V_THIS_KW) | (1L << V_STRING) | (1L << V_BOOL) | (1L << V_FLOAT) | (1L << V_INT) | (1L << V_IDENTIFIER))) != 0)) {
				{
				setState(163);
				vExpression(0);
				}
			}

			setState(166);
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

	public static class VBlockContext extends ParserRuleContext {
		public List<VStatementContext> vStatement() {
			return getRuleContexts(VStatementContext.class);
		}
		public VStatementContext vStatement(int i) {
			return getRuleContext(VStatementContext.class,i);
		}
		public VBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VBlockContext vBlock() throws RecognitionException {
		VBlockContext _localctx = new VBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__5);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__29) | (1L << T__30) | (1L << V_CLASS_KW) | (1L << V_SWITCH_KW) | (1L << V_IF_KW) | (1L << V_BREAK_KW) | (1L << V_CONTINUE_KW) | (1L << V_RETURN_KW) | (1L << V_NEW_KW) | (1L << V_STATIC_KW) | (1L << V_PUBLIC_KW) | (1L << V_PRIVATE_KW) | (1L << V_WHILE_KW) | (1L << V_THIS_KW) | (1L << V_STRING_KW) | (1L << V_BOOL_KW) | (1L << V_FLOAT_KW) | (1L << V_INT_KW) | (1L << V_STRING) | (1L << V_BOOL) | (1L << V_FLOAT) | (1L << V_INT) | (1L << V_IDENTIFIER))) != 0)) {
				{
				{
				setState(169);
				vStatement();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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

	public static class VAssignmentContext extends ParserRuleContext {
		public Token vName;
		public VExpressionContext vValue;
		public TerminalNode V_IDENTIFIER() { return getToken(ViperParser.V_IDENTIFIER, 0); }
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public VAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VAssignmentContext vAssignment() throws RecognitionException {
		VAssignmentContext _localctx = new VAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					vExpression(0);
					setState(178);
					match(T__1);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(185);
			((VAssignmentContext)_localctx).vName = match(V_IDENTIFIER);
			setState(186);
			match(T__8);
			setState(187);
			((VAssignmentContext)_localctx).vValue = vExpression(0);
			setState(188);
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

	public static class VDeclarationContext extends ParserRuleContext {
		public VDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vDeclaration; }
	 
		public VDeclarationContext() { }
		public void copyFrom(VDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecNullContext extends VDeclarationContext {
		public Token vName;
		public VTypeContext vType() {
			return getRuleContext(VTypeContext.class,0);
		}
		public TerminalNode V_IDENTIFIER() { return getToken(ViperParser.V_IDENTIFIER, 0); }
		public VAccessContext vAccess() {
			return getRuleContext(VAccessContext.class,0);
		}
		public TerminalNode V_STATIC_KW() { return getToken(ViperParser.V_STATIC_KW, 0); }
		public DecNullContext(VDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitDecNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecAssignContext extends VDeclarationContext {
		public Token vName;
		public VTypeContext vType() {
			return getRuleContext(VTypeContext.class,0);
		}
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public TerminalNode V_IDENTIFIER() { return getToken(ViperParser.V_IDENTIFIER, 0); }
		public VAccessContext vAccess() {
			return getRuleContext(VAccessContext.class,0);
		}
		public TerminalNode V_STATIC_KW() { return getToken(ViperParser.V_STATIC_KW, 0); }
		public DecAssignContext(VDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitDecAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VDeclarationContext vDeclaration() throws RecognitionException {
		VDeclarationContext _localctx = new VDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vDeclaration);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new DecNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==V_PUBLIC_KW || _la==V_PRIVATE_KW) {
					{
					setState(190);
					vAccess();
					}
				}

				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==V_STATIC_KW) {
					{
					setState(193);
					match(V_STATIC_KW);
					}
				}

				setState(196);
				vType();
				setState(197);
				((DecNullContext)_localctx).vName = match(V_IDENTIFIER);
				setState(198);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new DecAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==V_PUBLIC_KW || _la==V_PRIVATE_KW) {
					{
					setState(200);
					vAccess();
					}
				}

				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==V_STATIC_KW) {
					{
					setState(203);
					match(V_STATIC_KW);
					}
				}

				setState(206);
				vType();
				setState(207);
				((DecAssignContext)_localctx).vName = match(V_IDENTIFIER);
				setState(208);
				match(T__8);
				setState(209);
				vExpression(0);
				setState(210);
				match(T__0);
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

	public static class VMethodContext extends ParserRuleContext {
		public Token vStatic;
		public VTypeContext vReturnType;
		public Token vName;
		public VBlockContext vBlock() {
			return getRuleContext(VBlockContext.class,0);
		}
		public List<VTypeContext> vType() {
			return getRuleContexts(VTypeContext.class);
		}
		public VTypeContext vType(int i) {
			return getRuleContext(VTypeContext.class,i);
		}
		public List<TerminalNode> V_IDENTIFIER() { return getTokens(ViperParser.V_IDENTIFIER); }
		public TerminalNode V_IDENTIFIER(int i) {
			return getToken(ViperParser.V_IDENTIFIER, i);
		}
		public VAccessContext vAccess() {
			return getRuleContext(VAccessContext.class,0);
		}
		public TerminalNode V_STATIC_KW() { return getToken(ViperParser.V_STATIC_KW, 0); }
		public VMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VMethodContext vMethod() throws RecognitionException {
		VMethodContext _localctx = new VMethodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==V_PUBLIC_KW || _la==V_PRIVATE_KW) {
				{
				setState(214);
				vAccess();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==V_STATIC_KW) {
				{
				setState(217);
				((VMethodContext)_localctx).vStatic = match(V_STATIC_KW);
				}
			}

			setState(220);
			((VMethodContext)_localctx).vReturnType = vType();
			setState(221);
			((VMethodContext)_localctx).vName = match(V_IDENTIFIER);
			setState(222);
			match(T__2);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << V_STRING_KW) | (1L << V_BOOL_KW) | (1L << V_FLOAT_KW) | (1L << V_INT_KW) | (1L << V_IDENTIFIER))) != 0)) {
				{
				setState(223);
				vType();
				setState(224);
				match(V_IDENTIFIER);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(225);
					match(T__3);
					setState(226);
					vType();
					setState(227);
					match(V_IDENTIFIER);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236);
			match(T__4);
			setState(237);
			vBlock();
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

	public static class VNewObjectContext extends ParserRuleContext {
		public TerminalNode V_NEW_KW() { return getToken(ViperParser.V_NEW_KW, 0); }
		public VTypeContext vType() {
			return getRuleContext(VTypeContext.class,0);
		}
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public VNewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vNewObject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VNewObjectContext vNewObject() throws RecognitionException {
		VNewObjectContext _localctx = new VNewObjectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vNewObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(V_NEW_KW);
			setState(240);
			vType();
			setState(241);
			match(T__2);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__29) | (1L << T__30) | (1L << V_NEW_KW) | (1L << V_THIS_KW) | (1L << V_STRING) | (1L << V_BOOL) | (1L << V_FLOAT) | (1L << V_INT) | (1L << V_IDENTIFIER))) != 0)) {
				{
				setState(242);
				vExpression(0);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(243);
					match(T__3);
					setState(244);
					vExpression(0);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(252);
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

	public static class VExpressionContext extends ParserRuleContext {
		public VExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vExpression; }
	 
		public VExpressionContext() { }
		public void copyFrom(VExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExNewObjectContext extends VExpressionContext {
		public VNewObjectContext vNewObject() {
			return getRuleContext(VNewObjectContext.class,0);
		}
		public ExNewObjectContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExNewObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExLogOrOpContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExLogOrOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExLogOrOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExCmprEqContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExCmprEqContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExCmprEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExFloatLiteralContext extends VExpressionContext {
		public TerminalNode V_FLOAT() { return getToken(ViperParser.V_FLOAT, 0); }
		public ExFloatLiteralContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExUnaryOpContext extends VExpressionContext {
		public VUnaryOperationContext vUnaryOperation() {
			return getRuleContext(VUnaryOperationContext.class,0);
		}
		public ExUnaryOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExStringLiteralContext extends VExpressionContext {
		public TerminalNode V_STRING() { return getToken(ViperParser.V_STRING, 0); }
		public ExStringLiteralContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExNegOpContext extends VExpressionContext {
		public Token vOp;
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public ExNegOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExNegOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExLogAndOpContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExLogAndOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExLogAndOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIdentifierContext extends VExpressionContext {
		public List<TerminalNode> V_IDENTIFIER() { return getTokens(ViperParser.V_IDENTIFIER); }
		public TerminalNode V_IDENTIFIER(int i) {
			return getToken(ViperParser.V_IDENTIFIER, i);
		}
		public TerminalNode V_THIS_KW() { return getToken(ViperParser.V_THIS_KW, 0); }
		public ExIdentifierContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMethodCallContext extends VExpressionContext {
		public VMethodCallContext vMethodCall() {
			return getRuleContext(VMethodCallContext.class,0);
		}
		public ExMethodCallContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMulOpContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExMulOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExMulOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExTernaryContext extends VExpressionContext {
		public VExpressionContext condition;
		public VExpressionContext vThen;
		public VExpressionContext vElse;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExTernaryContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExThisLiteralContext extends VExpressionContext {
		public TerminalNode V_THIS_KW() { return getToken(ViperParser.V_THIS_KW, 0); }
		public ExThisLiteralContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExThisLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAddOpContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExAddOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExBoolLiteralContext extends VExpressionContext {
		public TerminalNode V_BOOL() { return getToken(ViperParser.V_BOOL, 0); }
		public ExBoolLiteralContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExBitShiftOpContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExBitShiftOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExBitShiftOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExNegBoolOpContext extends VExpressionContext {
		public Token vOp;
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public ExNegBoolOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExNegBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntLiteralContext extends VExpressionContext {
		public TerminalNode V_INT() { return getToken(ViperParser.V_INT, 0); }
		public ExIntLiteralContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExBitOpContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExBitOpContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExBitOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParenthesesContext extends VExpressionContext {
		public VExpressionContext vExpression() {
			return getRuleContext(VExpressionContext.class,0);
		}
		public ExParenthesesContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExCmprLeContext extends VExpressionContext {
		public VExpressionContext vLeft;
		public Token vOp;
		public VExpressionContext vRight;
		public List<VExpressionContext> vExpression() {
			return getRuleContexts(VExpressionContext.class);
		}
		public VExpressionContext vExpression(int i) {
			return getRuleContext(VExpressionContext.class,i);
		}
		public ExCmprLeContext(VExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitExCmprLe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VExpressionContext vExpression() throws RecognitionException {
		return vExpression(0);
	}

	private VExpressionContext vExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VExpressionContext _localctx = new VExpressionContext(_ctx, _parentState);
		VExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_vExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(255);
				match(T__2);
				setState(256);
				vExpression(0);
				setState(257);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new ExNewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				vNewObject();
				}
				break;
			case 3:
				{
				_localctx = new ExMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				vMethodCall();
				}
				break;
			case 4:
				{
				_localctx = new ExUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				vUnaryOperation();
				}
				break;
			case 5:
				{
				_localctx = new ExNegOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				((ExNegOpContext)_localctx).vOp = match(T__9);
				setState(263);
				vExpression(17);
				}
				break;
			case 6:
				{
				_localctx = new ExNegBoolOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				((ExNegBoolOpContext)_localctx).vOp = match(T__10);
				setState(265);
				vExpression(16);
				}
				break;
			case 7:
				{
				_localctx = new ExThisLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(V_THIS_KW);
				}
				break;
			case 8:
				{
				_localctx = new ExFloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(V_FLOAT);
				}
				break;
			case 9:
				{
				_localctx = new ExIntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(V_INT);
				}
				break;
			case 10:
				{
				_localctx = new ExBoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(V_BOOL);
				}
				break;
			case 11:
				{
				_localctx = new ExStringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(V_STRING);
				}
				break;
			case 12:
				{
				_localctx = new ExIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==V_THIS_KW) {
					{
					setState(271);
					match(V_THIS_KW);
					setState(272);
					match(T__1);
					}
				}

				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						match(V_IDENTIFIER);
						setState(276);
						match(T__1);
						}
						} 
					}
					setState(281);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(282);
				match(V_IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulOpContext(new VExpressionContext(_parentctx, _parentState));
						((ExMulOpContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(285);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(286);
						((ExMulOpContext)_localctx).vOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
							((ExMulOpContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						((ExMulOpContext)_localctx).vRight = vExpression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExBitOpContext(new VExpressionContext(_parentctx, _parentState));
						((ExBitOpContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(288);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(289);
						((ExBitOpContext)_localctx).vOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((ExBitOpContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						((ExBitOpContext)_localctx).vRight = vExpression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExAddOpContext(new VExpressionContext(_parentctx, _parentState));
						((ExAddOpContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(291);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(292);
						((ExAddOpContext)_localctx).vOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__17) ) {
							((ExAddOpContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						((ExAddOpContext)_localctx).vRight = vExpression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExBitShiftOpContext(new VExpressionContext(_parentctx, _parentState));
						((ExBitShiftOpContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(294);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(295);
						((ExBitShiftOpContext)_localctx).vOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExBitShiftOpContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						((ExBitShiftOpContext)_localctx).vRight = vExpression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExCmprLeContext(new VExpressionContext(_parentctx, _parentState));
						((ExCmprLeContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(297);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(298);
						((ExCmprLeContext)_localctx).vOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExCmprLeContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						((ExCmprLeContext)_localctx).vRight = vExpression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExCmprEqContext(new VExpressionContext(_parentctx, _parentState));
						((ExCmprEqContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(300);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(301);
						((ExCmprEqContext)_localctx).vOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((ExCmprEqContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						((ExCmprEqContext)_localctx).vRight = vExpression(11);
						}
						break;
					case 7:
						{
						_localctx = new ExLogAndOpContext(new VExpressionContext(_parentctx, _parentState));
						((ExLogAndOpContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(303);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(304);
						((ExLogAndOpContext)_localctx).vOp = match(T__26);
						setState(305);
						((ExLogAndOpContext)_localctx).vRight = vExpression(10);
						}
						break;
					case 8:
						{
						_localctx = new ExLogOrOpContext(new VExpressionContext(_parentctx, _parentState));
						((ExLogOrOpContext)_localctx).vLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(306);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(307);
						((ExLogOrOpContext)_localctx).vOp = match(T__27);
						setState(308);
						((ExLogOrOpContext)_localctx).vRight = vExpression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExTernaryContext(new VExpressionContext(_parentctx, _parentState));
						((ExTernaryContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vExpression);
						setState(309);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(310);
						match(T__28);
						setState(311);
						((ExTernaryContext)_localctx).vThen = vExpression(0);
						setState(312);
						match(T__7);
						setState(313);
						((ExTernaryContext)_localctx).vElse = vExpression(8);
						}
						break;
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class VUnaryOperationContext extends ParserRuleContext {
		public Token vOp;
		public TerminalNode V_IDENTIFIER() { return getToken(ViperParser.V_IDENTIFIER, 0); }
		public VUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vUnaryOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitVUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VUnaryOperationContext vUnaryOperation() throws RecognitionException {
		VUnaryOperationContext _localctx = new VUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vUnaryOperation);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case V_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(320);
				match(V_IDENTIFIER);
				setState(321);
				((VUnaryOperationContext)_localctx).vOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((VUnaryOperationContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(322);
				((VUnaryOperationContext)_localctx).vOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((VUnaryOperationContext)_localctx).vOp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				match(V_IDENTIFIER);
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

	public static class VTypeContext extends ParserRuleContext {
		public VTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vType; }
	 
		public VTypeContext() { }
		public void copyFrom(VTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeFloatContext extends VTypeContext {
		public TerminalNode V_FLOAT_KW() { return getToken(ViperParser.V_FLOAT_KW, 0); }
		public TypeFloatContext(VTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitTypeFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBoolContext extends VTypeContext {
		public TerminalNode V_BOOL_KW() { return getToken(ViperParser.V_BOOL_KW, 0); }
		public TypeBoolContext(VTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeObjectContext extends VTypeContext {
		public TerminalNode V_IDENTIFIER() { return getToken(ViperParser.V_IDENTIFIER, 0); }
		public TypeObjectContext(VTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitTypeObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIntContext extends VTypeContext {
		public TerminalNode V_INT_KW() { return getToken(ViperParser.V_INT_KW, 0); }
		public TypeIntContext(VTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeStringContext extends VTypeContext {
		public TerminalNode V_STRING_KW() { return getToken(ViperParser.V_STRING_KW, 0); }
		public TypeStringContext(VTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitTypeString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VTypeContext vType() throws RecognitionException {
		VTypeContext _localctx = new VTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_vType);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case V_STRING_KW:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(V_STRING_KW);
				}
				break;
			case V_BOOL_KW:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(V_BOOL_KW);
				}
				break;
			case V_FLOAT_KW:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(V_FLOAT_KW);
				}
				break;
			case V_INT_KW:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				match(V_INT_KW);
				}
				break;
			case V_IDENTIFIER:
				_localctx = new TypeObjectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(V_IDENTIFIER);
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

	public static class VAccessContext extends ParserRuleContext {
		public VAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vAccess; }
	 
		public VAccessContext() { }
		public void copyFrom(VAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AccessPublicContext extends VAccessContext {
		public TerminalNode V_PUBLIC_KW() { return getToken(ViperParser.V_PUBLIC_KW, 0); }
		public AccessPublicContext(VAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitAccessPublic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccessPrivateContext extends VAccessContext {
		public TerminalNode V_PRIVATE_KW() { return getToken(ViperParser.V_PRIVATE_KW, 0); }
		public AccessPrivateContext(VAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ViperVisitor ) return ((ViperVisitor<? extends T>)visitor).visitAccessPrivate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VAccessContext vAccess() throws RecognitionException {
		VAccessContext _localctx = new VAccessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vAccess);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case V_PUBLIC_KW:
				_localctx = new AccessPublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(V_PUBLIC_KW);
				}
				break;
			case V_PRIVATE_KW:
				_localctx = new AccessPrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(V_PRIVATE_KW);
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
		case 16:
			return vExpression_sempred((VExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean vExpression_sempred(VExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\5\4]\n\4\3\4\3\4\3\5\5\5b\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\6\6v\n\6\r\6\16\6w\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093"+
		"\13\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\5\f\u00a7\n\f\3\f\3\f\3\r\3\r\7\r\u00ad\n\r\f\r\16\r"+
		"\u00b0\13\r\3\r\3\r\3\16\3\16\3\16\7\16\u00b7\n\16\f\16\16\16\u00ba\13"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\5\17\u00c2\n\17\3\17\5\17\u00c5\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n\17\3\17\5\17\u00cf\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00d7\n\17\3\20\5\20\u00da\n\20\3\20\5\20"+
		"\u00dd\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00e8\n"+
		"\20\f\20\16\20\u00eb\13\20\5\20\u00ed\n\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00f8\n\21\f\21\16\21\u00fb\13\21\5\21\u00fd\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0114\n\22\3\22\3\22\7\22"+
		"\u0118\n\22\f\22\16\22\u011b\13\22\3\22\5\22\u011e\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u013e\n\22\f\22\16\22\u0141\13\22\3\23\3\23\3\23\3\23\5\23\u0147\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u014e\n\24\3\25\3\25\5\25\u0152\n\25\3"+
		"\25\2\3\"\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\t\3\2\16\20"+
		"\3\2\21\23\4\2\f\f\24\24\3\2\25\26\3\2\27\32\3\2\33\34\3\2 !\2\u0182\2"+
		"-\3\2\2\2\4I\3\2\2\2\6O\3\2\2\2\ba\3\2\2\2\no\3\2\2\2\f{\3\2\2\2\16\u0084"+
		"\3\2\2\2\20\u0098\3\2\2\2\22\u009e\3\2\2\2\24\u00a1\3\2\2\2\26\u00a4\3"+
		"\2\2\2\30\u00aa\3\2\2\2\32\u00b8\3\2\2\2\34\u00d6\3\2\2\2\36\u00d9\3\2"+
		"\2\2 \u00f1\3\2\2\2\"\u011d\3\2\2\2$\u0146\3\2\2\2&\u014d\3\2\2\2(\u0151"+
		"\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2"+
		"/-\3\2\2\2\60\61\7\2\2\3\61\3\3\2\2\2\62J\5\34\17\2\63J\5\32\16\2\64J"+
		"\5\30\r\2\65J\5\36\20\2\66J\5\26\f\2\67J\5\24\13\28J\5\22\n\29J\5\20\t"+
		"\2:J\5\16\b\2;J\5\n\6\2<J\5\b\5\2=>\5$\23\2>?\7\3\2\2?J\3\2\2\2@A\5\6"+
		"\4\2AB\7\3\2\2BJ\3\2\2\2CD\5 \21\2DE\7\3\2\2EJ\3\2\2\2FG\5\"\22\2GH\7"+
		"\3\2\2HJ\3\2\2\2I\62\3\2\2\2I\63\3\2\2\2I\64\3\2\2\2I\65\3\2\2\2I\66\3"+
		"\2\2\2I\67\3\2\2\2I8\3\2\2\2I9\3\2\2\2I:\3\2\2\2I;\3\2\2\2I<\3\2\2\2I"+
		"=\3\2\2\2I@\3\2\2\2IC\3\2\2\2IF\3\2\2\2J\5\3\2\2\2KL\79\2\2LN\7\4\2\2"+
		"MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\79\2\2"+
		"S\\\7\5\2\2TY\5\"\22\2UV\7\6\2\2VX\5\"\22\2WU\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\T\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7"+
		"\7\2\2_\7\3\2\2\2`b\5(\25\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\"\2\2de"+
		"\79\2\2ej\7\b\2\2fi\5\34\17\2gi\5\36\20\2hf\3\2\2\2hg\3\2\2\2il\3\2\2"+
		"\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\t\2\2n\t\3\2\2\2op\7$\2"+
		"\2pq\7\5\2\2qr\5\"\22\2rs\7\7\2\2su\7\b\2\2tv\5\f\7\2ut\3\2\2\2vw\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\t\2\2z\13\3\2\2\2{|\7#\2\2|}\5"+
		"\"\22\2}\u0082\7\n\2\2~\177\5\4\3\2\177\u0080\7\3\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\u0083\5\30\r\2\u0082~\3\2\2\2\u0082\u0081\3\2\2\2\u0083\r\3"+
		"\2\2\2\u0084\u0085\7\'\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5\"\22\2\u0087"+
		"\u0088\7\7\2\2\u0088\u0091\5\30\r\2\u0089\u008a\7&\2\2\u008a\u008b\7\5"+
		"\2\2\u008b\u008c\5\"\22\2\u008c\u008d\7\7\2\2\u008d\u008e\5\30\r\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7%\2\2\u0095\u0097\5\30\r\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\17\3\2\2\2\u0098\u0099\7/\2\2\u0099\u009a\7\5\2\2\u009a\u009b"+
		"\5\"\22\2\u009b\u009c\7\7\2\2\u009c\u009d\5\30\r\2\u009d\21\3\2\2\2\u009e"+
		"\u009f\7(\2\2\u009f\u00a0\7\3\2\2\u00a0\23\3\2\2\2\u00a1\u00a2\7)\2\2"+
		"\u00a2\u00a3\7\3\2\2\u00a3\25\3\2\2\2\u00a4\u00a6\7*\2\2\u00a5\u00a7\5"+
		"\"\22\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\3\2\2\u00a9\27\3\2\2\2\u00aa\u00ae\7\b\2\2\u00ab\u00ad\5\4\3"+
		"\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\t\2\2\u00b2"+
		"\31\3\2\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\7\4\2\2\u00b5\u00b7\3\2\2"+
		"\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\79\2\2\u00bc"+
		"\u00bd\7\13\2\2\u00bd\u00be\5\"\22\2\u00be\u00bf\7\3\2\2\u00bf\33\3\2"+
		"\2\2\u00c0\u00c2\5(\25\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c5\7,\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\79\2\2\u00c8"+
		"\u00c9\7\3\2\2\u00c9\u00d7\3\2\2\2\u00ca\u00cc\5(\25\2\u00cb\u00ca\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\7,\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5&"+
		"\24\2\u00d1\u00d2\79\2\2\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5\"\22\2\u00d4"+
		"\u00d5\7\3\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c1\3\2\2\2\u00d6\u00cb\3\2"+
		"\2\2\u00d7\35\3\2\2\2\u00d8\u00da\5(\25\2\u00d9\u00d8\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\7,\2\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5&\24\2\u00df\u00e0\79"+
		"\2\2\u00e0\u00ec\7\5\2\2\u00e1\u00e2\5&\24\2\u00e2\u00e9\79\2\2\u00e3"+
		"\u00e4\7\6\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\79\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e3\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e1\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\7\2\2\u00ef"+
		"\u00f0\5\30\r\2\u00f0\37\3\2\2\2\u00f1\u00f2\7+\2\2\u00f2\u00f3\5&\24"+
		"\2\u00f3\u00fc\7\5\2\2\u00f4\u00f9\5\"\22\2\u00f5\u00f6\7\6\2\2\u00f6"+
		"\u00f8\5\"\22\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00f4\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\7"+
		"\2\2\u00ff!\3\2\2\2\u0100\u0101\b\22\1\2\u0101\u0102\7\5\2\2\u0102\u0103"+
		"\5\"\22\2\u0103\u0104\7\7\2\2\u0104\u011e\3\2\2\2\u0105\u011e\5 \21\2"+
		"\u0106\u011e\5\6\4\2\u0107\u011e\5$\23\2\u0108\u0109\7\f\2\2\u0109\u011e"+
		"\5\"\22\23\u010a\u010b\7\r\2\2\u010b\u011e\5\"\22\22\u010c\u011e\7\60"+
		"\2\2\u010d\u011e\7\67\2\2\u010e\u011e\78\2\2\u010f\u011e\7\66\2\2\u0110"+
		"\u011e\7\65\2\2\u0111\u0112\7\60\2\2\u0112\u0114\7\4\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\u0119\3\2\2\2\u0115\u0116\79\2\2\u0116"+
		"\u0118\7\4\2\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011e\79\2\2\u011d\u0100\3\2\2\2\u011d\u0105\3\2\2\2\u011d\u0106\3\2"+
		"\2\2\u011d\u0107\3\2\2\2\u011d\u0108\3\2\2\2\u011d\u010a\3\2\2\2\u011d"+
		"\u010c\3\2\2\2\u011d\u010d\3\2\2\2\u011d\u010e\3\2\2\2\u011d\u010f\3\2"+
		"\2\2\u011d\u0110\3\2\2\2\u011d\u0113\3\2\2\2\u011e\u013f\3\2\2\2\u011f"+
		"\u0120\f\21\2\2\u0120\u0121\t\2\2\2\u0121\u013e\5\"\22\22\u0122\u0123"+
		"\f\20\2\2\u0123\u0124\t\3\2\2\u0124\u013e\5\"\22\21\u0125\u0126\f\17\2"+
		"\2\u0126\u0127\t\4\2\2\u0127\u013e\5\"\22\20\u0128\u0129\f\16\2\2\u0129"+
		"\u012a\t\5\2\2\u012a\u013e\5\"\22\17\u012b\u012c\f\r\2\2\u012c\u012d\t"+
		"\6\2\2\u012d\u013e\5\"\22\16\u012e\u012f\f\f\2\2\u012f\u0130\t\7\2\2\u0130"+
		"\u013e\5\"\22\r\u0131\u0132\f\13\2\2\u0132\u0133\7\35\2\2\u0133\u013e"+
		"\5\"\22\f\u0134\u0135\f\n\2\2\u0135\u0136\7\36\2\2\u0136\u013e\5\"\22"+
		"\13\u0137\u0138\f\t\2\2\u0138\u0139\7\37\2\2\u0139\u013a\5\"\22\2\u013a"+
		"\u013b\7\n\2\2\u013b\u013c\5\"\22\n\u013c\u013e\3\2\2\2\u013d\u011f\3"+
		"\2\2\2\u013d\u0122\3\2\2\2\u013d\u0125\3\2\2\2\u013d\u0128\3\2\2\2\u013d"+
		"\u012b\3\2\2\2\u013d\u012e\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0134\3\2"+
		"\2\2\u013d\u0137\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140#\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\79\2\2\u0143"+
		"\u0147\t\b\2\2\u0144\u0145\t\b\2\2\u0145\u0147\79\2\2\u0146\u0142\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147%\3\2\2\2\u0148\u014e\7\61\2\2\u0149\u014e"+
		"\7\62\2\2\u014a\u014e\7\63\2\2\u014b\u014e\7\64\2\2\u014c\u014e\79\2\2"+
		"\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014c\3\2\2\2\u014e\'\3\2\2\2\u014f\u0152\7-\2\2\u0150"+
		"\u0152\7.\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152)\3\2\2\2$"+
		"-IOY\\ahjw\u0082\u0091\u0096\u00a6\u00ae\u00b8\u00c1\u00c4\u00cb\u00ce"+
		"\u00d6\u00d9\u00dc\u00e9\u00ec\u00f9\u00fc\u0113\u0119\u011d\u013d\u013f"+
		"\u0146\u014d\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}