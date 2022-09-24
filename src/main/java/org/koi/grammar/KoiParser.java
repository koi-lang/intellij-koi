// Generated from java-escape by ANTLR 4.11.1
package org.koi.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KoiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, MULTICOMMENT=2, NATIVE=3, TRUE=4, FALSE=5, NONE=6, VAR=7, WHILE=8, 
		FOR=9, IN=10, BREAK=11, FUNCTION=12, PROCEDURE=13, CLASS=14, CONSTRUCTOR=15, 
		METH=16, THIS=17, NEW=18, INIT=19, CALL=20, RETURN=21, IF=22, ELF=23, 
		ELSE=24, WHEN=25, IS=26, IMPORT=27, CORE=28, STANDARD=29, LOCAL=30, ENUM=31, 
		STRUCT=32, OBJ=33, CHAR=34, STR=35, INT=36, FLO=37, BOOL=38, ARROW=39, 
		FAT_ARROW=40, SEMICOLON=41, COLON=42, DOUBLE_COLON=43, DOT=44, DOUBLE_DOT=45, 
		TRIPLE_DOT=46, OPEN_PARENTHESIS=47, CLOSE_PARENTHESIS=48, COMMA=49, UNDERSCORE=50, 
		QUESTION=51, EXCLAMATION=52, EQUALS=53, INFERRED=54, AND=55, OR=56, EQUALITY=57, 
		INEQUALITY=58, GREATER=59, LESSER=60, OPEN_BRACKET=61, CLOSE_BRACKET=62, 
		OPEN_BRACE=63, CLOSE_BRACE=64, GREQ=65, LEEQ=66, NOTEQ=67, ADD=68, SUB=69, 
		MUL=70, DIV=71, MOD=72, INCREASE=73, DECREASE=74, SAFE_CALL=75, NULL_CHECK=76, 
		NULL_CHECK_ACCESS=77, SINGLESTRING=78, LITSTRING=79, MULTISTRING=80, FLOAT=81, 
		DECIMAL=82, INTEGER=83, NUMBER=84, BOOLEAN=85, TEMP_ID=86, ID=87, SPACE=88, 
		WS=89;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_comment = 2, RULE_name = 3, RULE_keyword = 4, 
		RULE_accessor = 5, RULE_statement = 6, RULE_call_parameter_set = 7, RULE_method_call = 8, 
		RULE_function_call = 9, RULE_class_new = 10, RULE_local_asstmt = 11, RULE_expression = 12, 
		RULE_arith_expr = 13, RULE_compa_expr = 14, RULE_half_compa = 15, RULE_true_value = 16, 
		RULE_value = 17, RULE_value_change = 18, RULE_list_ = 19, RULE_type_ = 20, 
		RULE_block = 21, RULE_code_block = 22, RULE_return_block = 23, RULE_break_block = 24, 
		RULE_inner_class_block = 25, RULE_parameter_set = 26, RULE_parameter = 27, 
		RULE_function_block = 28, RULE_procedure_block = 29, RULE_return_stmt = 30, 
		RULE_while_block = 31, RULE_for_block = 32, RULE_range_ = 33, RULE_with_length = 34, 
		RULE_if_stream = 35, RULE_if_block = 36, RULE_elf_block = 37, RULE_else_block = 38, 
		RULE_compa_list = 39, RULE_package_name = 40, RULE_import_stmt = 41, RULE_class_block = 42, 
		RULE_method_block = 43, RULE_constructor_block = 44, RULE_init_block = 45, 
		RULE_when_block = 46, RULE_is_block = 47, RULE_when_else = 48, RULE_enum_block = 49, 
		RULE_struct_block = 50, RULE_struct_set = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "comment", "name", "keyword", "accessor", "statement", 
			"call_parameter_set", "method_call", "function_call", "class_new", "local_asstmt", 
			"expression", "arith_expr", "compa_expr", "half_compa", "true_value", 
			"value", "value_change", "list_", "type_", "block", "code_block", "return_block", 
			"break_block", "inner_class_block", "parameter_set", "parameter", "function_block", 
			"procedure_block", "return_stmt", "while_block", "for_block", "range_", 
			"with_length", "if_stream", "if_block", "elf_block", "else_block", "compa_list", 
			"package_name", "import_stmt", "class_block", "method_block", "constructor_block", 
			"init_block", "when_block", "is_block", "when_else", "enum_block", "struct_block", 
			"struct_set"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'native'", "'true'", "'false'", "'none'", "'var'", 
			"'while'", "'for'", "'in'", "'break'", "'fun'", "'pro'", "'class'", "'constructor'", 
			"'meth'", "'this'", "'new'", "'init'", "'call'", "'return'", "'if'", 
			"'elf'", "'else'", "'when'", "'is'", "'import'", "'core'", "'std'", "'local'", 
			"'enum'", "'struct'", "'obj'", "'char'", "'str'", "'int'", "'float'", 
			"'bool'", null, null, "';'", "':'", "'::'", "'.'", "'..'", "'...'", "'('", 
			"')'", "','", "'_'", "'?'", "'!'", "'='", "':='", "'&&'", "'||'", null, 
			null, "'>'", "'<'", "'['", "']'", "'{'", "'}'", null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "MULTICOMMENT", "NATIVE", "TRUE", "FALSE", "NONE", "VAR", 
			"WHILE", "FOR", "IN", "BREAK", "FUNCTION", "PROCEDURE", "CLASS", "CONSTRUCTOR", 
			"METH", "THIS", "NEW", "INIT", "CALL", "RETURN", "IF", "ELF", "ELSE", 
			"WHEN", "IS", "IMPORT", "CORE", "STANDARD", "LOCAL", "ENUM", "STRUCT", 
			"OBJ", "CHAR", "STR", "INT", "FLO", "BOOL", "ARROW", "FAT_ARROW", "SEMICOLON", 
			"COLON", "DOUBLE_COLON", "DOT", "DOUBLE_DOT", "TRIPLE_DOT", "OPEN_PARENTHESIS", 
			"CLOSE_PARENTHESIS", "COMMA", "UNDERSCORE", "QUESTION", "EXCLAMATION", 
			"EQUALS", "INFERRED", "AND", "OR", "EQUALITY", "INEQUALITY", "GREATER", 
			"LESSER", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", 
			"GREQ", "LEEQ", "NOTEQ", "ADD", "SUB", "MUL", "DIV", "MOD", "INCREASE", 
			"DECREASE", "SAFE_CALL", "NULL_CHECK", "NULL_CHECK_ACCESS", "SINGLESTRING", 
			"LITSTRING", "MULTISTRING", "FLOAT", "DECIMAL", "INTEGER", "NUMBER", 
			"BOOLEAN", "TEMP_ID", "ID", "SPACE", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KoiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KoiParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -5183643164487552002L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6807555L) != 0) {
				{
				{
				setState(104);
				line();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Procedure_blockContext procedure_block() {
			return getRuleContext(Procedure_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public If_streamContext if_stream() {
			return getRuleContext(If_streamContext.class,0);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public When_blockContext when_block() {
			return getRuleContext(When_blockContext.class,0);
		}
		public Enum_blockContext enum_block() {
			return getRuleContext(Enum_blockContext.class,0);
		}
		public Struct_blockContext struct_block() {
			return getRuleContext(Struct_blockContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(KoiParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(KoiParser.SEMICOLON, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(112);
				comment();
				}
				break;
			case 2:
				{
				setState(113);
				statement();
				}
				break;
			case 3:
				{
				setState(114);
				expression();
				}
				break;
			case 4:
				{
				setState(115);
				block();
				}
				break;
			case 5:
				{
				setState(116);
				function_block();
				}
				break;
			case 6:
				{
				setState(117);
				procedure_block();
				}
				break;
			case 7:
				{
				setState(118);
				while_block();
				}
				break;
			case 8:
				{
				setState(119);
				for_block();
				}
				break;
			case 9:
				{
				setState(120);
				if_stream();
				}
				break;
			case 10:
				{
				setState(121);
				class_block();
				}
				break;
			case 11:
				{
				setState(122);
				when_block();
				}
				break;
			case 12:
				{
				setState(123);
				enum_block();
				}
				break;
			case 13:
				{
				setState(124);
				struct_block();
				}
				break;
			}
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(SEMICOLON);
					setState(128);
					line();
					}
					} 
				}
				setState(133);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(KoiParser.COMMENT, 0); }
		public TerminalNode MULTICOMMENT() { return getToken(KoiParser.MULTICOMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==MULTICOMMENT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KoiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KoiParser.ID, i);
		}
		public List<TerminalNode> TEMP_ID() { return getTokens(KoiParser.TEMP_ID); }
		public TerminalNode TEMP_ID(int i) {
			return getToken(KoiParser.TEMP_ID, i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(KoiParser.EXCLAMATION); }
		public TerminalNode EXCLAMATION(int i) {
			return getToken(KoiParser.EXCLAMATION, i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public TerminalNode THIS() { return getToken(KoiParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(KoiParser.DOT, 0); }
		public List<AccessorContext> accessor() {
			return getRuleContexts(AccessorContext.class);
		}
		public AccessorContext accessor(int i) {
			return getRuleContext(AccessorContext.class,i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			int _alt;
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(136);
					match(THIS);
					setState(137);
					match(DOT);
					}
				}

				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(144);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(140);
							match(ID);
							}
							break;
						case TEMP_ID:
							{
							setState(141);
							match(TEMP_ID);
							}
							break;
						case EXCLAMATION:
							{
							setState(142);
							match(EXCLAMATION);
							setState(143);
							keyword();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(146);
						accessor();
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(152);
					match(ID);
					}
					break;
				case TEMP_ID:
					{
					setState(153);
					match(TEMP_ID);
					}
					break;
				case EXCLAMATION:
					{
					setState(154);
					match(EXCLAMATION);
					setState(155);
					keyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(THIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(KoiParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KoiParser.FALSE, 0); }
		public TerminalNode VAR() { return getToken(KoiParser.VAR, 0); }
		public TerminalNode CALL() { return getToken(KoiParser.CALL, 0); }
		public TerminalNode RETURN() { return getToken(KoiParser.RETURN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyword);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(FALSE);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(VAR);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(CALL);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(RETURN);
				}
				break;
			case NONE:
			case OBJ:
			case CHAR:
			case STR:
			case INT:
			case FLO:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(KoiParser.DOT, 0); }
		public TerminalNode SAFE_CALL() { return getToken(KoiParser.SAFE_CALL, 0); }
		public TerminalNode NULL_CHECK_ACCESS() { return getToken(KoiParser.NULL_CHECK_ACCESS, 0); }
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 10737418241L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Local_asstmtContext local_asstmt() {
			return getRuleContext(Local_asstmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Class_newContext class_new() {
			return getRuleContext(Class_newContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				function_call();
				}
				break;
			case VAR:
			case THIS:
			case EXCLAMATION:
			case TEMP_ID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				local_asstmt();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				import_stmt();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				class_new();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_parameter_setContext extends ParserRuleContext {
		public NameContext name;
		public List<NameContext> paramNames = new ArrayList<NameContext>();
		public True_valueContext true_value;
		public List<True_valueContext> paramValues = new ArrayList<True_valueContext>();
		public List<TerminalNode> COMMA() { return getTokens(KoiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KoiParser.COMMA, i);
		}
		public List<True_valueContext> true_value() {
			return getRuleContexts(True_valueContext.class);
		}
		public True_valueContext true_value(int i) {
			return getRuleContext(True_valueContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(KoiParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(KoiParser.EQUALS, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Call_parameter_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_parameter_set; }
	}

	public final Call_parameter_setContext call_parameter_set() throws RecognitionException {
		Call_parameter_setContext _localctx = new Call_parameter_setContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call_parameter_set);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(177);
						((Call_parameter_setContext)_localctx).name = name();
						((Call_parameter_setContext)_localctx).paramNames.add(((Call_parameter_setContext)_localctx).name);
						setState(178);
						match(EQUALS);
						}
						break;
					}
					setState(182);
					((Call_parameter_setContext)_localctx).true_value = true_value();
					((Call_parameter_setContext)_localctx).paramValues.add(((Call_parameter_setContext)_localctx).true_value);
					setState(183);
					match(COMMA);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4039728865752776816L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6807555L) != 0) {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(190);
					((Call_parameter_setContext)_localctx).name = name();
					((Call_parameter_setContext)_localctx).paramNames.add(((Call_parameter_setContext)_localctx).name);
					setState(191);
					match(EQUALS);
					}
					break;
				}
				setState(195);
				((Call_parameter_setContext)_localctx).true_value = true_value();
				((Call_parameter_setContext)_localctx).paramValues.add(((Call_parameter_setContext)_localctx).true_value);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public NameContext funcName;
		public TerminalNode OPEN_PARENTHESIS() { return getToken(KoiParser.OPEN_PARENTHESIS, 0); }
		public Call_parameter_setContext call_parameter_set() {
			return getRuleContext(Call_parameter_setContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(KoiParser.CLOSE_PARENTHESIS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((Method_callContext)_localctx).funcName = name();
			setState(199);
			match(OPEN_PARENTHESIS);
			setState(200);
			call_parameter_set();
			setState(201);
			match(CLOSE_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(KoiParser.CALL, 0); }
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<AccessorContext> accessor() {
			return getRuleContexts(AccessorContext.class);
		}
		public AccessorContext accessor(int i) {
			return getRuleContext(AccessorContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(CALL);
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(204);
				method_call();
				}
				break;
			case 2:
				{
				setState(205);
				name();
				}
				break;
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 10737418241L) != 0) {
				{
				{
				setState(208);
				accessor();
				setState(209);
				method_call();
				}
				}
				setState(215);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_newContext extends ParserRuleContext {
		public NameContext className;
		public TerminalNode NEW() { return getToken(KoiParser.NEW, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(KoiParser.OPEN_PARENTHESIS, 0); }
		public Call_parameter_setContext call_parameter_set() {
			return getRuleContext(Call_parameter_setContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(KoiParser.CLOSE_PARENTHESIS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<AccessorContext> accessor() {
			return getRuleContexts(AccessorContext.class);
		}
		public AccessorContext accessor(int i) {
			return getRuleContext(AccessorContext.class,i);
		}
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public Class_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_new; }
	}

	public final Class_newContext class_new() throws RecognitionException {
		Class_newContext _localctx = new Class_newContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_new);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(NEW);
			setState(217);
			((Class_newContext)_localctx).className = name();
			setState(218);
			match(OPEN_PARENTHESIS);
			setState(219);
			call_parameter_set();
			setState(220);
			match(CLOSE_PARENTHESIS);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 10737418241L) != 0) {
				{
				{
				setState(221);
				accessor();
				setState(222);
				method_call();
				}
				}
				setState(228);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Local_asstmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KoiParser.VAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KoiParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode EQUALS() { return getToken(KoiParser.EQUALS, 0); }
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public Local_asstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_asstmt; }
	}

	public final Local_asstmtContext local_asstmt() throws RecognitionException {
		Local_asstmtContext _localctx = new Local_asstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_local_asstmt);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(VAR);
				setState(230);
				name();
				setState(231);
				match(COLON);
				setState(232);
				type_();
				setState(233);
				match(EQUALS);
				setState(234);
				true_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				name();
				setState(237);
				match(EQUALS);
				setState(238);
				true_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(VAR);
				setState(241);
				name();
				setState(242);
				match(COLON);
				setState(243);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public Compa_exprContext compa_expr() {
			return getRuleContext(Compa_exprContext.class,0);
		}
		public Value_changeContext value_change() {
			return getRuleContext(Value_changeContext.class,0);
		}
		public Half_compaContext half_compa() {
			return getRuleContext(Half_compaContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				arith_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				compa_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				value_change();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				half_compa();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_exprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KoiParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KoiParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(KoiParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(KoiParser.DIV, 0); }
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			value();
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 15L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(255);
			true_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compa_exprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(KoiParser.EXCLAMATION, 0); }
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(KoiParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(KoiParser.LESSER, 0); }
		public TerminalNode GREQ() { return getToken(KoiParser.GREQ, 0); }
		public TerminalNode LEEQ() { return getToken(KoiParser.LEEQ, 0); }
		public TerminalNode EQUALITY() { return getToken(KoiParser.EQUALITY, 0); }
		public TerminalNode INEQUALITY() { return getToken(KoiParser.INEQUALITY, 0); }
		public Compa_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compa_expr; }
	}

	public final Compa_exprContext compa_expr() throws RecognitionException {
		Compa_exprContext _localctx = new Compa_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compa_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(257);
				match(EXCLAMATION);
				}
				break;
			}
			setState(260);
			value();
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(261);
				_la = _input.LA(1);
				if ( !((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 783L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				true_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Half_compaContext extends ParserRuleContext {
		public Token comp;
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(KoiParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(KoiParser.LESSER, 0); }
		public TerminalNode GREQ() { return getToken(KoiParser.GREQ, 0); }
		public TerminalNode LEEQ() { return getToken(KoiParser.LEEQ, 0); }
		public TerminalNode EXCLAMATION() { return getToken(KoiParser.EXCLAMATION, 0); }
		public Half_compaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_half_compa; }
	}

	public final Half_compaContext half_compa() throws RecognitionException {
		Half_compaContext _localctx = new Half_compaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_half_compa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(265);
				match(EXCLAMATION);
				}
			}

			setState(268);
			((Half_compaContext)_localctx).comp = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 195L) != 0) ) {
				((Half_compaContext)_localctx).comp = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(269);
			true_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class True_valueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NULL_CHECK() { return getToken(KoiParser.NULL_CHECK, 0); }
		public TerminalNode INCREASE() { return getToken(KoiParser.INCREASE, 0); }
		public TerminalNode DECREASE() { return getToken(KoiParser.DECREASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public True_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_value; }
	}

	public final True_valueContext true_value() throws RecognitionException {
		True_valueContext _localctx = new True_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_true_value);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				value();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCREASE || _la==DECREASE) {
					{
					setState(272);
					_la = _input.LA(1);
					if ( !(_la==INCREASE || _la==DECREASE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_CHECK) {
					{
					setState(275);
					match(NULL_CHECK);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode SINGLESTRING() { return getToken(KoiParser.SINGLESTRING, 0); }
		public TerminalNode LITSTRING() { return getToken(KoiParser.LITSTRING, 0); }
		public TerminalNode MULTISTRING() { return getToken(KoiParser.MULTISTRING, 0); }
		public TerminalNode INTEGER() { return getToken(KoiParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(KoiParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(KoiParser.DECIMAL, 0); }
		public TerminalNode TRUE() { return getToken(KoiParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KoiParser.FALSE, 0); }
		public TerminalNode EXCLAMATION() { return getToken(KoiParser.EXCLAMATION, 0); }
		public TerminalNode NONE() { return getToken(KoiParser.NONE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Class_newContext class_new() {
			return getRuleContext(Class_newContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(SINGLESTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(LITSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(MULTISTRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(INTEGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				match(DECIMAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLAMATION) {
					{
					setState(287);
					match(EXCLAMATION);
					}
				}

				setState(290);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(291);
				match(NONE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(292);
				name();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				list_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(294);
				function_call();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(295);
				class_new();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value_changeContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INCREASE() { return getToken(KoiParser.INCREASE, 0); }
		public TerminalNode DECREASE() { return getToken(KoiParser.DECREASE, 0); }
		public Value_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_change; }
	}

	public final Value_changeContext value_change() throws RecognitionException {
		Value_changeContext _localctx = new Value_changeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value_change);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			value();
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==INCREASE || _la==DECREASE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_Context extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(KoiParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(KoiParser.CLOSE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KoiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KoiParser.COMMA, i);
		}
		public List_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_; }
	}

	public final List_Context list_() throws RecognitionException {
		List_Context _localctx = new List_Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_list_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(OPEN_BRACKET);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					value();
					setState(303);
					match(COMMA);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2310346608842506352L) != 0 || (((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 831L) != 0) {
				{
				setState(310);
				value();
				}
			}

			setState(313);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public TerminalNode OBJ() { return getToken(KoiParser.OBJ, 0); }
		public TerminalNode CHAR() { return getToken(KoiParser.CHAR, 0); }
		public TerminalNode STR() { return getToken(KoiParser.STR, 0); }
		public TerminalNode INT() { return getToken(KoiParser.INT, 0); }
		public TerminalNode FLO() { return getToken(KoiParser.FLO, 0); }
		public TerminalNode BOOL() { return getToken(KoiParser.BOOL, 0); }
		public TerminalNode NONE() { return getToken(KoiParser.NONE, 0); }
		public TerminalNode ID() { return getToken(KoiParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(KoiParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(KoiParser.CLOSE_BRACKET, 0); }
		public TerminalNode QUESTION() { return getToken(KoiParser.QUESTION, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879360L) != 0 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(316);
				match(OPEN_BRACKET);
				setState(317);
				match(CLOSE_BRACKET);
				}
				break;
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(320);
				match(QUESTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Return_blockContext return_block() {
			return getRuleContext(Return_blockContext.class,0);
		}
		public Break_blockContext break_block() {
			return getRuleContext(Break_blockContext.class,0);
		}
		public Inner_class_blockContext inner_class_block() {
			return getRuleContext(Inner_class_blockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				return_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				break_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				inner_class_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OPEN_BRACE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -5183643164487552002L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6807555L) != 0) {
				{
				{
				setState(330);
				line();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Return_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_block; }
	}

	public final Return_blockContext return_block() throws RecognitionException {
		Return_blockContext _localctx = new Return_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(OPEN_BRACE);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -5183643164487552002L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6807555L) != 0) {
				{
				{
				setState(339);
				line();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			return_stmt();
			setState(346);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Break_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(KoiParser.BREAK, 0); }
		public Break_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_block; }
	}

	public final Break_blockContext break_block() throws RecognitionException {
		Break_blockContext _localctx = new Break_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_break_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(OPEN_BRACE);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -5183643164487552002L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6807555L) != 0) {
				{
				{
				setState(349);
				line();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(355);
				match(BREAK);
				}
			}

			setState(358);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inner_class_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public Init_blockContext init_block() {
			return getRuleContext(Init_blockContext.class,0);
		}
		public Constructor_blockContext constructor_block() {
			return getRuleContext(Constructor_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<Method_blockContext> method_block() {
			return getRuleContexts(Method_blockContext.class);
		}
		public Method_blockContext method_block(int i) {
			return getRuleContext(Method_blockContext.class,i);
		}
		public Inner_class_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_class_block; }
	}

	public final Inner_class_blockContext inner_class_block() throws RecognitionException {
		Inner_class_blockContext _localctx = new Inner_class_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inner_class_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(OPEN_BRACE);
			setState(361);
			init_block();
			setState(362);
			constructor_block();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METH) {
				{
				{
				setState(363);
				method_block();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_setContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(KoiParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(KoiParser.CLOSE_PARENTHESIS, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KoiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KoiParser.COMMA, i);
		}
		public Parameter_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_set; }
	}

	public final Parameter_setContext parameter_set() throws RecognitionException {
		Parameter_setContext _localctx = new Parameter_setContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter_set);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(OPEN_PARENTHESIS);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					parameter();
					setState(373);
					match(COMMA);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==EXCLAMATION || _la==TEMP_ID || _la==ID) {
				{
				setState(380);
				parameter();
				}
			}

			setState(383);
			match(CLOSE_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterNormContext extends ParameterContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KoiParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode EQUALS() { return getToken(KoiParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterNormContext(ParameterContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterVarArgContext extends ParameterContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KoiParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode TRIPLE_DOT() { return getToken(KoiParser.TRIPLE_DOT, 0); }
		public ParameterVarArgContext(ParameterContext ctx) { copyFrom(ctx); }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameter);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new ParameterNormContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				name();
				setState(386);
				match(COLON);
				setState(387);
				type_();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(388);
					match(EQUALS);
					setState(389);
					value();
					}
				}

				}
				break;
			case 2:
				_localctx = new ParameterVarArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				name();
				setState(393);
				match(COLON);
				setState(394);
				type_();
				setState(395);
				match(TRIPLE_DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blockContext extends ParserRuleContext {
		public Type_Context returnType;
		public TerminalNode FUNCTION() { return getToken(KoiParser.FUNCTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Parameter_setContext parameter_set() {
			return getRuleContext(Parameter_setContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KoiParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode NATIVE() { return getToken(KoiParser.NATIVE, 0); }
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_block);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(FUNCTION);
				setState(400);
				name();
				setState(401);
				parameter_set();
				{
				setState(402);
				match(ARROW);
				setState(403);
				((Function_blockContext)_localctx).returnType = type_();
				}
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
					{
					setState(405);
					block();
					}
					break;
				case FAT_ARROW:
					{
					setState(406);
					match(FAT_ARROW);
					setState(407);
					line();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(NATIVE);
				setState(411);
				match(FUNCTION);
				setState(412);
				name();
				setState(413);
				parameter_set();
				{
				setState(414);
				match(ARROW);
				setState(415);
				((Function_blockContext)_localctx).returnType = type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_blockContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(KoiParser.PROCEDURE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Parameter_setContext parameter_set() {
			return getRuleContext(Parameter_setContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(KoiParser.NATIVE, 0); }
		public Procedure_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_block; }
	}

	public final Procedure_blockContext procedure_block() throws RecognitionException {
		Procedure_blockContext _localctx = new Procedure_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_procedure_block);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(PROCEDURE);
				setState(420);
				name();
				setState(421);
				parameter_set();
				setState(422);
				block();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(NATIVE);
				setState(425);
				match(PROCEDURE);
				setState(426);
				name();
				setState(427);
				parameter_set();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KoiParser.RETURN, 0); }
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(RETURN);
			setState(432);
			true_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KoiParser.WHILE, 0); }
		public Compa_listContext compa_list() {
			return getRuleContext(Compa_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(WHILE);
			setState(435);
			compa_list();
			setState(436);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KoiParser.FOR, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(KoiParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IN() { return getToken(KoiParser.IN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public With_lengthContext with_length() {
			return getRuleContext(With_lengthContext.class,0);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(FOR);
			setState(439);
			name();
			setState(440);
			match(COLON);
			setState(441);
			type_();
			setState(442);
			match(IN);
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case INTEGER:
				{
				setState(443);
				with_length();
				}
				break;
			case THIS:
			case EXCLAMATION:
			case TEMP_ID:
			case ID:
				{
				setState(444);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(447);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Range_Context extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(KoiParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(KoiParser.INTEGER, i);
		}
		public TerminalNode DOUBLE_DOT() { return getToken(KoiParser.DOUBLE_DOT, 0); }
		public Range_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_; }
	}

	public final Range_Context range_() throws RecognitionException {
		Range_Context _localctx = new Range_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_range_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(INTEGER);
			setState(450);
			match(DOUBLE_DOT);
			setState(451);
			match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class With_lengthContext extends ParserRuleContext {
		public Range_Context range_() {
			return getRuleContext(Range_Context.class,0);
		}
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public With_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_length; }
	}

	public final With_lengthContext with_length() throws RecognitionException {
		With_lengthContext _localctx = new With_lengthContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_with_length);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				range_();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				list_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_streamContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public List<Elf_blockContext> elf_block() {
			return getRuleContexts(Elf_blockContext.class);
		}
		public Elf_blockContext elf_block(int i) {
			return getRuleContext(Elf_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stream; }
	}

	public final If_streamContext if_stream() throws RecognitionException {
		If_streamContext _localctx = new If_streamContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_if_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			if_block();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELF) {
				{
				{
				setState(458);
				elf_block();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(464);
				else_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KoiParser.IF, 0); }
		public Compa_listContext compa_list() {
			return getRuleContext(Compa_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(IF);
			setState(468);
			compa_list();
			setState(469);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elf_blockContext extends ParserRuleContext {
		public TerminalNode ELF() { return getToken(KoiParser.ELF, 0); }
		public Compa_listContext compa_list() {
			return getRuleContext(Compa_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elf_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elf_block; }
	}

	public final Elf_blockContext elf_block() throws RecognitionException {
		Elf_blockContext _localctx = new Elf_blockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elf_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(ELF);
			setState(472);
			compa_list();
			setState(473);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KoiParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(ELSE);
			setState(476);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compa_listContext extends ParserRuleContext {
		public Compa_exprContext compa_expr;
		public List<Compa_exprContext> comparisons = new ArrayList<Compa_exprContext>();
		public Token OR;
		public List<Token> settings = new ArrayList<Token>();
		public Token AND;
		public Token _tset908;
		public List<Compa_exprContext> compa_expr() {
			return getRuleContexts(Compa_exprContext.class);
		}
		public Compa_exprContext compa_expr(int i) {
			return getRuleContext(Compa_exprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(KoiParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(KoiParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(KoiParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KoiParser.AND, i);
		}
		public Compa_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compa_list; }
	}

	public final Compa_listContext compa_list() throws RecognitionException {
		Compa_listContext _localctx = new Compa_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compa_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			((Compa_listContext)_localctx).compa_expr = compa_expr();
			((Compa_listContext)_localctx).comparisons.add(((Compa_listContext)_localctx).compa_expr);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(479);
				((Compa_listContext)_localctx)._tset908 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((Compa_listContext)_localctx)._tset908 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Compa_listContext)_localctx).settings.add(((Compa_listContext)_localctx)._tset908);
				setState(480);
				((Compa_listContext)_localctx).compa_expr = compa_expr();
				((Compa_listContext)_localctx).comparisons.add(((Compa_listContext)_localctx).compa_expr);
				}
				}
				setState(485);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Package_nameContext extends ParserRuleContext {
		public Token ID;
		public List<Token> folders = new ArrayList<Token>();
		public Token last;
		public List<TerminalNode> ID() { return getTokens(KoiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KoiParser.ID, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(KoiParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(KoiParser.DOUBLE_COLON, i);
		}
		public Package_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_name; }
	}

	public final Package_nameContext package_name() throws RecognitionException {
		Package_nameContext _localctx = new Package_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_package_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					((Package_nameContext)_localctx).ID = match(ID);
					((Package_nameContext)_localctx).folders.add(((Package_nameContext)_localctx).ID);
					setState(487);
					match(DOUBLE_COLON);
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(493);
			((Package_nameContext)_localctx).last = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KoiParser.IMPORT, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(KoiParser.DOUBLE_COLON, 0); }
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public TerminalNode CORE() { return getToken(KoiParser.CORE, 0); }
		public TerminalNode STANDARD() { return getToken(KoiParser.STANDARD, 0); }
		public TerminalNode LOCAL() { return getToken(KoiParser.LOCAL, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(IMPORT);
			setState(496);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(497);
			match(DOUBLE_COLON);
			setState(498);
			package_name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_blockContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(KoiParser.CLASS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Class_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_block; }
	}

	public final Class_blockContext class_block() throws RecognitionException {
		Class_blockContext _localctx = new Class_blockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_class_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(CLASS);
			setState(501);
			name();
			setState(502);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_blockContext extends ParserRuleContext {
		public TerminalNode METH() { return getToken(KoiParser.METH, 0); }
		public Procedure_blockContext procedure_block() {
			return getRuleContext(Procedure_blockContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Method_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_block; }
	}

	public final Method_blockContext method_block() throws RecognitionException {
		Method_blockContext _localctx = new Method_blockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_method_block);
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(METH);
				setState(505);
				procedure_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(METH);
				setState(507);
				function_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_blockContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(KoiParser.CONSTRUCTOR, 0); }
		public Parameter_setContext parameter_set() {
			return getRuleContext(Parameter_setContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Constructor_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_block; }
	}

	public final Constructor_blockContext constructor_block() throws RecognitionException {
		Constructor_blockContext _localctx = new Constructor_blockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constructor_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(CONSTRUCTOR);
			setState(511);
			parameter_set();
			setState(512);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Init_blockContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(KoiParser.INIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Init_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_block; }
	}

	public final Init_blockContext init_block() throws RecognitionException {
		Init_blockContext _localctx = new Init_blockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_init_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(INIT);
			setState(515);
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

	@SuppressWarnings("CheckReturnValue")
	public static class When_blockContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(KoiParser.WHEN, 0); }
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<Is_blockContext> is_block() {
			return getRuleContexts(Is_blockContext.class);
		}
		public Is_blockContext is_block(int i) {
			return getRuleContext(Is_blockContext.class,i);
		}
		public When_elseContext when_else() {
			return getRuleContext(When_elseContext.class,0);
		}
		public When_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_block; }
	}

	public final When_blockContext when_block() throws RecognitionException {
		When_blockContext _localctx = new When_blockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_when_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(WHEN);
			setState(518);
			true_value();
			setState(519);
			match(OPEN_BRACE);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IS) {
				{
				{
				setState(520);
				is_block();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(526);
				when_else();
				}
			}

			setState(529);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Is_blockContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(KoiParser.IS, 0); }
		public Half_compaContext half_compa() {
			return getRuleContext(Half_compaContext.class,0);
		}
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Is_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_block; }
	}

	public final Is_blockContext is_block() throws RecognitionException {
		Is_blockContext _localctx = new Is_blockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_is_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(IS);
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(532);
				half_compa();
				}
				break;
			case 2:
				{
				setState(533);
				true_value();
				}
				break;
			}
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(536);
				match(OPEN_BRACE);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -5183643164487552002L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6807555L) != 0) {
					{
					{
					setState(537);
					line();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543);
				match(CLOSE_BRACE);
				}
				break;
			case FAT_ARROW:
				{
				setState(544);
				match(FAT_ARROW);
				setState(545);
				line();
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

	@SuppressWarnings("CheckReturnValue")
	public static class When_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KoiParser.ELSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public When_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_else; }
	}

	public final When_elseContext when_else() throws RecognitionException {
		When_elseContext _localctx = new When_elseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_when_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(ELSE);
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(549);
				match(OPEN_BRACE);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -5183643164487552002L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6807555L) != 0) {
					{
					{
					setState(550);
					line();
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(556);
				match(CLOSE_BRACE);
				}
				break;
			case FAT_ARROW:
				{
				setState(557);
				match(FAT_ARROW);
				setState(558);
				line();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_blockContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KoiParser.ENUM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(KoiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KoiParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KoiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KoiParser.COMMA, i);
		}
		public Enum_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_block; }
	}

	public final Enum_blockContext enum_block() throws RecognitionException {
		Enum_blockContext _localctx = new Enum_blockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enum_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ENUM);
			setState(562);
			name();
			setState(563);
			match(OPEN_BRACE);
			setState(568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(564);
					match(ID);
					setState(565);
					match(COMMA);
					}
					} 
				}
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(571);
				match(ID);
				}
			}

			setState(574);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_blockContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(KoiParser.STRUCT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<Struct_setContext> struct_set() {
			return getRuleContexts(Struct_setContext.class);
		}
		public Struct_setContext struct_set(int i) {
			return getRuleContext(Struct_setContext.class,i);
		}
		public Struct_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_block; }
	}

	public final Struct_blockContext struct_block() throws RecognitionException {
		Struct_blockContext _localctx = new Struct_blockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_struct_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(STRUCT);
			setState(577);
			name();
			setState(578);
			match(OPEN_BRACE);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THIS || _la==EXCLAMATION || _la==TEMP_ID || _la==ID) {
				{
				{
				setState(579);
				struct_set();
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_setContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KoiParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Struct_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_set; }
	}

	public final Struct_setContext struct_set() throws RecognitionException {
		Struct_setContext _localctx = new Struct_setContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_struct_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			name();
			setState(588);
			match(COLON);
			setState(589);
			type_();
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
		"\u0004\u0001Y\u0250\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0005\u0000j\b\u0000\n\u0000\f\u0000"+
		"m\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001~\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0082\b\u0001\n\u0001\f\u0001\u0085"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u008b"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0091"+
		"\b\u0003\u0001\u0003\u0005\u0003\u0094\b\u0003\n\u0003\f\u0003\u0097\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009d"+
		"\b\u0003\u0001\u0003\u0003\u0003\u00a0\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a8\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b0\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00b5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ba\b"+
		"\u0007\n\u0007\f\u0007\u00bd\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00c2\b\u0007\u0001\u0007\u0003\u0007\u00c5\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00cf"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d4\b\t\n\t\f\t\u00d7\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e1"+
		"\b\n\n\n\f\n\u00e4\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00f6\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fc"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u0103\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0108\b\u000e\u0001\u000f"+
		"\u0003\u000f\u010b\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0112\b\u0010\u0001\u0010\u0003\u0010\u0115\b"+
		"\u0010\u0001\u0010\u0003\u0010\u0118\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0121"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0129\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0132\b\u0013\n"+
		"\u0013\f\u0013\u0135\t\u0013\u0001\u0013\u0003\u0013\u0138\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u013f"+
		"\b\u0014\u0001\u0014\u0003\u0014\u0142\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0148\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u014c\b\u0016\n\u0016\f\u0016\u014f\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0155\b\u0017\n\u0017\f\u0017"+
		"\u0158\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u015f\b\u0018\n\u0018\f\u0018\u0162\t\u0018\u0001\u0018\u0003"+
		"\u0018\u0165\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u016d\b\u0019\n\u0019\f\u0019\u0170\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0178\b\u001a\n\u001a\f\u001a\u017b\t\u001a\u0001\u001a\u0003"+
		"\u001a\u017e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0187\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u018e\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0199\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01a2\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01ae\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u01be\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0003\"\u01c8\b\"\u0001#\u0001#\u0005#\u01cc\b#\n#\f#\u01cf"+
		"\t#\u0001#\u0003#\u01d2\b#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u01e2\b"+
		"\'\n\'\f\'\u01e5\t\'\u0001(\u0001(\u0005(\u01e9\b(\n(\f(\u01ec\t(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0003+\u01fd\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0005.\u020a\b.\n."+
		"\f.\u020d\t.\u0001.\u0003.\u0210\b.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0003/\u0217\b/\u0001/\u0001/\u0005/\u021b\b/\n/\f/\u021e\t/\u0001/"+
		"\u0001/\u0001/\u0003/\u0223\b/\u00010\u00010\u00010\u00050\u0228\b0\n"+
		"0\f0\u022b\t0\u00010\u00010\u00010\u00030\u0230\b0\u00011\u00011\u0001"+
		"1\u00011\u00011\u00051\u0237\b1\n1\f1\u023a\t1\u00011\u00031\u023d\b1"+
		"\u00011\u00011\u00012\u00012\u00012\u00012\u00052\u0245\b2\n2\f2\u0248"+
		"\t2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0000\u00004\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\n\u0001\u0000\u0001"+
		"\u0002\u0003\u0000,,KKMM\u0001\u0000DG\u0002\u00009<AB\u0002\u0000;<A"+
		"B\u0001\u0000IJ\u0001\u0000\u0004\u0005\u0003\u0000\u0006\u0006!&WW\u0001"+
		"\u000078\u0001\u0000\u001c\u001e\u027a\u0000k\u0001\u0000\u0000\u0000"+
		"\u0002}\u0001\u0000\u0000\u0000\u0004\u0086\u0001\u0000\u0000\u0000\u0006"+
		"\u009f\u0001\u0000\u0000\u0000\b\u00a7\u0001\u0000\u0000\u0000\n\u00a9"+
		"\u0001\u0000\u0000\u0000\f\u00af\u0001\u0000\u0000\u0000\u000e\u00bb\u0001"+
		"\u0000\u0000\u0000\u0010\u00c6\u0001\u0000\u0000\u0000\u0012\u00cb\u0001"+
		"\u0000\u0000\u0000\u0014\u00d8\u0001\u0000\u0000\u0000\u0016\u00f5\u0001"+
		"\u0000\u0000\u0000\u0018\u00fb\u0001\u0000\u0000\u0000\u001a\u00fd\u0001"+
		"\u0000\u0000\u0000\u001c\u0102\u0001\u0000\u0000\u0000\u001e\u010a\u0001"+
		"\u0000\u0000\u0000 \u0117\u0001\u0000\u0000\u0000\"\u0128\u0001\u0000"+
		"\u0000\u0000$\u012a\u0001\u0000\u0000\u0000&\u012d\u0001\u0000\u0000\u0000"+
		"(\u013b\u0001\u0000\u0000\u0000*\u0147\u0001\u0000\u0000\u0000,\u0149"+
		"\u0001\u0000\u0000\u0000.\u0152\u0001\u0000\u0000\u00000\u015c\u0001\u0000"+
		"\u0000\u00002\u0168\u0001\u0000\u0000\u00004\u0173\u0001\u0000\u0000\u0000"+
		"6\u018d\u0001\u0000\u0000\u00008\u01a1\u0001\u0000\u0000\u0000:\u01ad"+
		"\u0001\u0000\u0000\u0000<\u01af\u0001\u0000\u0000\u0000>\u01b2\u0001\u0000"+
		"\u0000\u0000@\u01b6\u0001\u0000\u0000\u0000B\u01c1\u0001\u0000\u0000\u0000"+
		"D\u01c7\u0001\u0000\u0000\u0000F\u01c9\u0001\u0000\u0000\u0000H\u01d3"+
		"\u0001\u0000\u0000\u0000J\u01d7\u0001\u0000\u0000\u0000L\u01db\u0001\u0000"+
		"\u0000\u0000N\u01de\u0001\u0000\u0000\u0000P\u01ea\u0001\u0000\u0000\u0000"+
		"R\u01ef\u0001\u0000\u0000\u0000T\u01f4\u0001\u0000\u0000\u0000V\u01fc"+
		"\u0001\u0000\u0000\u0000X\u01fe\u0001\u0000\u0000\u0000Z\u0202\u0001\u0000"+
		"\u0000\u0000\\\u0205\u0001\u0000\u0000\u0000^\u0213\u0001\u0000\u0000"+
		"\u0000`\u0224\u0001\u0000\u0000\u0000b\u0231\u0001\u0000\u0000\u0000d"+
		"\u0240\u0001\u0000\u0000\u0000f\u024b\u0001\u0000\u0000\u0000hj\u0003"+
		"\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0000\u0000\u0001o\u0001\u0001"+
		"\u0000\u0000\u0000p~\u0003\u0004\u0002\u0000q~\u0003\f\u0006\u0000r~\u0003"+
		"\u0018\f\u0000s~\u0003*\u0015\u0000t~\u00038\u001c\u0000u~\u0003:\u001d"+
		"\u0000v~\u0003>\u001f\u0000w~\u0003@ \u0000x~\u0003F#\u0000y~\u0003T*"+
		"\u0000z~\u0003\\.\u0000{~\u0003b1\u0000|~\u0003d2\u0000}p\u0001\u0000"+
		"\u0000\u0000}q\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000}s\u0001"+
		"\u0000\u0000\u0000}t\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000"+
		"}v\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000"+
		"\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0083\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005)\u0000\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0003\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0007\u0000\u0000\u0000\u0087\u0005\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\u0011\u0000\u0000\u0089\u008b\u0005,\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0095"+
		"\u0001\u0000\u0000\u0000\u008c\u0091\u0005W\u0000\u0000\u008d\u0091\u0005"+
		"V\u0000\u0000\u008e\u008f\u00054\u0000\u0000\u008f\u0091\u0003\b\u0004"+
		"\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0003\n\u0005\u0000\u0093\u0090\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009c\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009d\u0005W\u0000\u0000\u0099"+
		"\u009d\u0005V\u0000\u0000\u009a\u009b\u00054\u0000\u0000\u009b\u009d\u0003"+
		"\b\u0004\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0005\u0011\u0000\u0000\u009f\u008a\u0001\u0000"+
		"\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u0007\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a8\u0005\u0004\u0000\u0000\u00a2\u00a8\u0005\u0005"+
		"\u0000\u0000\u00a3\u00a8\u0005\u0007\u0000\u0000\u00a4\u00a8\u0005\u0014"+
		"\u0000\u0000\u00a5\u00a8\u0005\u0015\u0000\u0000\u00a6\u00a8\u0003(\u0014"+
		"\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\t\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0001\u0000\u0000"+
		"\u00aa\u000b\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003\u0012\t\u0000\u00ac"+
		"\u00b0\u0003\u0016\u000b\u0000\u00ad\u00b0\u0003R)\u0000\u00ae\u00b0\u0003"+
		"\u0014\n\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\r\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u0006\u0003"+
		"\u0000\u00b2\u00b3\u00055\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003 \u0010\u0000\u00b7"+
		"\u00b8\u00051\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b4"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00c4"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0003\u0006\u0003\u0000\u00bf\u00c0\u00055\u0000\u0000\u00c0\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003"+
		" \u0010\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u000f\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0006"+
		"\u0003\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8\u00c9\u0003\u000e\u0007"+
		"\u0000\u00c9\u00ca\u00050\u0000\u0000\u00ca\u0011\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0005\u0014\u0000\u0000\u00cc\u00cf\u0003\u0010\b\u0000\u00cd"+
		"\u00cf\u0003\u0006\u0003\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d5\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0003\n\u0005\u0000\u00d1\u00d2\u0003\u0010\b\u0000\u00d2\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u0013\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0012\u0000\u0000\u00d9\u00da"+
		"\u0003\u0006\u0003\u0000\u00da\u00db\u0005/\u0000\u0000\u00db\u00dc\u0003"+
		"\u000e\u0007\u0000\u00dc\u00e2\u00050\u0000\u0000\u00dd\u00de\u0003\n"+
		"\u0005\u0000\u00de\u00df\u0003\u0010\b\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u0015\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0007\u0000\u0000\u00e6\u00e7\u0003\u0006\u0003"+
		"\u0000\u00e7\u00e8\u0005*\u0000\u0000\u00e8\u00e9\u0003(\u0014\u0000\u00e9"+
		"\u00ea\u00055\u0000\u0000\u00ea\u00eb\u0003 \u0010\u0000\u00eb\u00f6\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0003\u0006\u0003\u0000\u00ed\u00ee\u0005"+
		"5\u0000\u0000\u00ee\u00ef\u0003 \u0010\u0000\u00ef\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005\u0007\u0000\u0000\u00f1\u00f2\u0003\u0006\u0003"+
		"\u0000\u00f2\u00f3\u0005*\u0000\u0000\u00f3\u00f4\u0003(\u0014\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00e5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f5\u00f0\u0001\u0000\u0000\u0000\u00f6"+
		"\u0017\u0001\u0000\u0000\u0000\u00f7\u00fc\u0003\u001a\r\u0000\u00f8\u00fc"+
		"\u0003\u001c\u000e\u0000\u00f9\u00fc\u0003$\u0012\u0000\u00fa\u00fc\u0003"+
		"\u001e\u000f\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u0019\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003"+
		"\"\u0011\u0000\u00fe\u00ff\u0007\u0002\u0000\u0000\u00ff\u0100\u0003 "+
		"\u0010\u0000\u0100\u001b\u0001\u0000\u0000\u0000\u0101\u0103\u00054\u0000"+
		"\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0107\u0003\"\u0011\u0000"+
		"\u0105\u0106\u0007\u0003\u0000\u0000\u0106\u0108\u0003 \u0010\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u001d\u0001\u0000\u0000\u0000\u0109\u010b\u00054\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0007\u0004\u0000\u0000\u010d\u010e"+
		"\u0003 \u0010\u0000\u010e\u001f\u0001\u0000\u0000\u0000\u010f\u0111\u0003"+
		"\"\u0011\u0000\u0110\u0112\u0007\u0005\u0000\u0000\u0111\u0110\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000"+
		"\u0000\u0000\u0113\u0115\u0005L\u0000\u0000\u0114\u0113\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0003\u0018\f\u0000\u0117\u010f\u0001\u0000\u0000\u0000"+
		"\u0117\u0116\u0001\u0000\u0000\u0000\u0118!\u0001\u0000\u0000\u0000\u0119"+
		"\u0129\u0005N\u0000\u0000\u011a\u0129\u0005O\u0000\u0000\u011b\u0129\u0005"+
		"P\u0000\u0000\u011c\u0129\u0005S\u0000\u0000\u011d\u0129\u0005Q\u0000"+
		"\u0000\u011e\u0129\u0005R\u0000\u0000\u011f\u0121\u00054\u0000\u0000\u0120"+
		"\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0129\u0007\u0006\u0000\u0000\u0123"+
		"\u0129\u0005\u0006\u0000\u0000\u0124\u0129\u0003\u0006\u0003\u0000\u0125"+
		"\u0129\u0003&\u0013\u0000\u0126\u0129\u0003\u0012\t\u0000\u0127\u0129"+
		"\u0003\u0014\n\u0000\u0128\u0119\u0001\u0000\u0000\u0000\u0128\u011a\u0001"+
		"\u0000\u0000\u0000\u0128\u011b\u0001\u0000\u0000\u0000\u0128\u011c\u0001"+
		"\u0000\u0000\u0000\u0128\u011d\u0001\u0000\u0000\u0000\u0128\u011e\u0001"+
		"\u0000\u0000\u0000\u0128\u0120\u0001\u0000\u0000\u0000\u0128\u0123\u0001"+
		"\u0000\u0000\u0000\u0128\u0124\u0001\u0000\u0000\u0000\u0128\u0125\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129#\u0001\u0000\u0000\u0000\u012a\u012b\u0003\""+
		"\u0011\u0000\u012b\u012c\u0007\u0005\u0000\u0000\u012c%\u0001\u0000\u0000"+
		"\u0000\u012d\u0133\u0005=\u0000\u0000\u012e\u012f\u0003\"\u0011\u0000"+
		"\u012f\u0130\u00051\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131"+
		"\u012e\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u0138\u0003\"\u0011\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005>\u0000\u0000\u013a\'\u0001\u0000\u0000\u0000\u013b\u013e\u0007"+
		"\u0007\u0000\u0000\u013c\u013d\u0005=\u0000\u0000\u013d\u013f\u0005>\u0000"+
		"\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u0142\u00053\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142)\u0001\u0000\u0000\u0000\u0143\u0148\u0003,\u0016\u0000\u0144\u0148"+
		"\u0003.\u0017\u0000\u0145\u0148\u00030\u0018\u0000\u0146\u0148\u00032"+
		"\u0019\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0147\u0144\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0146\u0001\u0000"+
		"\u0000\u0000\u0148+\u0001\u0000\u0000\u0000\u0149\u014d\u0005?\u0000\u0000"+
		"\u014a\u014c\u0003\u0002\u0001\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005@\u0000\u0000\u0151"+
		"-\u0001\u0000\u0000\u0000\u0152\u0156\u0005?\u0000\u0000\u0153\u0155\u0003"+
		"\u0002\u0001\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0003<\u001e\u0000\u015a\u015b\u0005@\u0000"+
		"\u0000\u015b/\u0001\u0000\u0000\u0000\u015c\u0160\u0005?\u0000\u0000\u015d"+
		"\u015f\u0003\u0002\u0001\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f"+
		"\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0163\u0165\u0005\u000b\u0000\u0000\u0164"+
		"\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0005@\u0000\u0000\u01671\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0005?\u0000\u0000\u0169\u016a\u0003Z-"+
		"\u0000\u016a\u016e\u0003X,\u0000\u016b\u016d\u0003V+\u0000\u016c\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171"+
		"\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0005@\u0000\u0000\u01723\u0001\u0000\u0000\u0000\u0173\u0179\u0005/"+
		"\u0000\u0000\u0174\u0175\u00036\u001b\u0000\u0175\u0176\u00051\u0000\u0000"+
		"\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0174\u0001\u0000\u0000\u0000"+
		"\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017e\u00036\u001b\u0000\u017d"+
		"\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u00050\u0000\u0000\u01805\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0003\u0006\u0003\u0000\u0182\u0183\u0005"+
		"*\u0000\u0000\u0183\u0186\u0003(\u0014\u0000\u0184\u0185\u00055\u0000"+
		"\u0000\u0185\u0187\u0003\"\u0011\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u018e\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0003\u0006\u0003\u0000\u0189\u018a\u0005*\u0000\u0000\u018a"+
		"\u018b\u0003(\u0014\u0000\u018b\u018c\u0005.\u0000\u0000\u018c\u018e\u0001"+
		"\u0000\u0000\u0000\u018d\u0181\u0001\u0000\u0000\u0000\u018d\u0188\u0001"+
		"\u0000\u0000\u0000\u018e7\u0001\u0000\u0000\u0000\u018f\u0190\u0005\f"+
		"\u0000\u0000\u0190\u0191\u0003\u0006\u0003\u0000\u0191\u0192\u00034\u001a"+
		"\u0000\u0192\u0193\u0005\'\u0000\u0000\u0193\u0194\u0003(\u0014\u0000"+
		"\u0194\u0198\u0001\u0000\u0000\u0000\u0195\u0199\u0003*\u0015\u0000\u0196"+
		"\u0197\u0005(\u0000\u0000\u0197\u0199\u0003\u0002\u0001\u0000\u0198\u0195"+
		"\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u01a2"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u0003\u0000\u0000\u019b\u019c"+
		"\u0005\f\u0000\u0000\u019c\u019d\u0003\u0006\u0003\u0000\u019d\u019e\u0003"+
		"4\u001a\u0000\u019e\u019f\u0005\'\u0000\u0000\u019f\u01a0\u0003(\u0014"+
		"\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u018f\u0001\u0000\u0000"+
		"\u0000\u01a1\u019a\u0001\u0000\u0000\u0000\u01a29\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0005\r\u0000\u0000\u01a4\u01a5\u0003\u0006\u0003\u0000\u01a5"+
		"\u01a6\u00034\u001a\u0000\u01a6\u01a7\u0003*\u0015\u0000\u01a7\u01ae\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0005\u0003\u0000\u0000\u01a9\u01aa\u0005"+
		"\r\u0000\u0000\u01aa\u01ab\u0003\u0006\u0003\u0000\u01ab\u01ac\u00034"+
		"\u001a\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01a3\u0001\u0000"+
		"\u0000\u0000\u01ad\u01a8\u0001\u0000\u0000\u0000\u01ae;\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0005\u0015\u0000\u0000\u01b0\u01b1\u0003 \u0010\u0000"+
		"\u01b1=\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\b\u0000\u0000\u01b3"+
		"\u01b4\u0003N\'\u0000\u01b4\u01b5\u0003*\u0015\u0000\u01b5?\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0005\t\u0000\u0000\u01b7\u01b8\u0003\u0006\u0003"+
		"\u0000\u01b8\u01b9\u0005*\u0000\u0000\u01b9\u01ba\u0003(\u0014\u0000\u01ba"+
		"\u01bd\u0005\n\u0000\u0000\u01bb\u01be\u0003D\"\u0000\u01bc\u01be\u0003"+
		"\u0006\u0003\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003"+
		"*\u0015\u0000\u01c0A\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005S\u0000"+
		"\u0000\u01c2\u01c3\u0005-\u0000\u0000\u01c3\u01c4\u0005S\u0000\u0000\u01c4"+
		"C\u0001\u0000\u0000\u0000\u01c5\u01c8\u0003B!\u0000\u01c6\u01c8\u0003"+
		"&\u0013\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8E\u0001\u0000\u0000\u0000\u01c9\u01cd\u0003H$\u0000"+
		"\u01ca\u01cc\u0003J%\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003L&\u0000\u01d1\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2G\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0005\u0016\u0000\u0000\u01d4\u01d5\u0003N\'\u0000"+
		"\u01d5\u01d6\u0003*\u0015\u0000\u01d6I\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0005\u0017\u0000\u0000\u01d8\u01d9\u0003N\'\u0000\u01d9\u01da\u0003"+
		"*\u0015\u0000\u01daK\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u0018\u0000"+
		"\u0000\u01dc\u01dd\u0003*\u0015\u0000\u01ddM\u0001\u0000\u0000\u0000\u01de"+
		"\u01e3\u0003\u001c\u000e\u0000\u01df\u01e0\u0007\b\u0000\u0000\u01e0\u01e2"+
		"\u0003\u001c\u000e\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e4O\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0005W\u0000\u0000\u01e7\u01e9\u0005+\u0000"+
		"\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0005W\u0000\u0000\u01eeQ\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\u0005\u001b\u0000\u0000\u01f0\u01f1\u0007\t\u0000\u0000\u01f1\u01f2"+
		"\u0005+\u0000\u0000\u01f2\u01f3\u0003P(\u0000\u01f3S\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u0005\u000e\u0000\u0000\u01f5\u01f6\u0003\u0006\u0003"+
		"\u0000\u01f6\u01f7\u0003*\u0015\u0000\u01f7U\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0005\u0010\u0000\u0000\u01f9\u01fd\u0003:\u001d\u0000\u01fa\u01fb"+
		"\u0005\u0010\u0000\u0000\u01fb\u01fd\u00038\u001c\u0000\u01fc\u01f8\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fdW\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0005\u000f\u0000\u0000\u01ff\u0200\u00034\u001a"+
		"\u0000\u0200\u0201\u0003*\u0015\u0000\u0201Y\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0005\u0013\u0000\u0000\u0203\u0204\u0003*\u0015\u0000\u0204[\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0005\u0019\u0000\u0000\u0206\u0207\u0003"+
		" \u0010\u0000\u0207\u020b\u0005?\u0000\u0000\u0208\u020a\u0003^/\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000"+
		"\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u0210\u0003`0\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212"+
		"\u0005@\u0000\u0000\u0212]\u0001\u0000\u0000\u0000\u0213\u0216\u0005\u001a"+
		"\u0000\u0000\u0214\u0217\u0003\u001e\u000f\u0000\u0215\u0217\u0003 \u0010"+
		"\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0222\u0001\u0000\u0000\u0000\u0218\u021c\u0005?\u0000\u0000"+
		"\u0219\u021b\u0003\u0002\u0001\u0000\u021a\u0219\u0001\u0000\u0000\u0000"+
		"\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021f\u0001\u0000\u0000\u0000"+
		"\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0223\u0005@\u0000\u0000\u0220"+
		"\u0221\u0005(\u0000\u0000\u0221\u0223\u0003\u0002\u0001\u0000\u0222\u0218"+
		"\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223_\u0001"+
		"\u0000\u0000\u0000\u0224\u022f\u0005\u0018\u0000\u0000\u0225\u0229\u0005"+
		"?\u0000\u0000\u0226\u0228\u0003\u0002\u0001\u0000\u0227\u0226\u0001\u0000"+
		"\u0000\u0000\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000"+
		"\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022c\u0230\u0005@\u0000"+
		"\u0000\u022d\u022e\u0005(\u0000\u0000\u022e\u0230\u0003\u0002\u0001\u0000"+
		"\u022f\u0225\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000"+
		"\u0230a\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u001f\u0000\u0000\u0232"+
		"\u0233\u0003\u0006\u0003\u0000\u0233\u0238\u0005?\u0000\u0000\u0234\u0235"+
		"\u0005W\u0000\u0000\u0235\u0237\u00051\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023d\u0005W\u0000"+
		"\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0005@\u0000\u0000"+
		"\u023fc\u0001\u0000\u0000\u0000\u0240\u0241\u0005 \u0000\u0000\u0241\u0242"+
		"\u0003\u0006\u0003\u0000\u0242\u0246\u0005?\u0000\u0000\u0243\u0245\u0003"+
		"f3\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000"+
		"\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000"+
		"\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0005@\u0000\u0000\u024ae\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0003\u0006\u0003\u0000\u024c\u024d\u0005*\u0000\u0000\u024d\u024e"+
		"\u0003(\u0014\u0000\u024eg\u0001\u0000\u0000\u0000=k}\u0083\u008a\u0090"+
		"\u0095\u009c\u009f\u00a7\u00af\u00b4\u00bb\u00c1\u00c4\u00ce\u00d5\u00e2"+
		"\u00f5\u00fb\u0102\u0107\u010a\u0111\u0114\u0117\u0120\u0128\u0133\u0137"+
		"\u013e\u0141\u0147\u014d\u0156\u0160\u0164\u016e\u0179\u017d\u0186\u018d"+
		"\u0198\u01a1\u01ad\u01bd\u01c7\u01cd\u01d1\u01e3\u01ea\u01fc\u020b\u020f"+
		"\u0216\u021c\u0222\u0229\u022f\u0238\u023c\u0246";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}