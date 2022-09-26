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
		STRUCT=32, OBJ=33, CHAR=34, STR=35, INT=36, FLO=37, DOU=38, BOOL=39, ARROW=40, 
		FAT_ARROW=41, SEMICOLON=42, COLON=43, DOUBLE_COLON=44, DOT=45, DOUBLE_DOT=46, 
		TRIPLE_DOT=47, OPEN_PARENTHESIS=48, CLOSE_PARENTHESIS=49, COMMA=50, UNDERSCORE=51, 
		QUESTION=52, EXCLAMATION=53, EQUALS=54, INFERRED=55, AND=56, OR=57, EQUALITY=58, 
		INEQUALITY=59, GREATER=60, LESSER=61, OPEN_BRACKET=62, CLOSE_BRACKET=63, 
		OPEN_BRACE=64, CLOSE_BRACE=65, GREQ=66, LEEQ=67, NOTEQ=68, ADD=69, SUB=70, 
		MUL=71, DIV=72, MOD=73, INCREASE=74, DECREASE=75, SAFE_CALL=76, NULL_CHECK=77, 
		NULL_CHECK_ACCESS=78, SINGLESTRING=79, LITSTRING=80, MULTISTRING=81, FLOAT=82, 
		DECIMAL=83, INTEGER=84, NUMBER=85, BOOLEAN=86, TEMP_ID=87, ID=88, SPACE=89, 
		WS=90;
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
		RULE_when_block = 46, RULE_when = 47, RULE_is_block = 48, RULE_is = 49, 
		RULE_when_else_block = 50, RULE_when_else = 51, RULE_enum_block = 52, 
		RULE_enum = 53, RULE_struct_block = 54, RULE_struct = 55, RULE_struct_set = 56;
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
			"init_block", "when_block", "when", "is_block", "is", "when_else_block", 
			"when_else", "enum_block", "enum", "struct_block", "struct", "struct_set"
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
			"'double'", "'bool'", null, null, "';'", "':'", "'::'", "'.'", "'..'", 
			"'...'", "'('", "')'", "','", "'_'", "'?'", "'!'", "'='", "':='", "'&&'", 
			"'||'", null, null, "'>'", "'<'", "'['", "']'", "'{'", "'}'", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "MULTICOMMENT", "NATIVE", "TRUE", "FALSE", "NONE", "VAR", 
			"WHILE", "FOR", "IN", "BREAK", "FUNCTION", "PROCEDURE", "CLASS", "CONSTRUCTOR", 
			"METH", "THIS", "NEW", "INIT", "CALL", "RETURN", "IF", "ELF", "ELSE", 
			"WHEN", "IS", "IMPORT", "CORE", "STANDARD", "LOCAL", "ENUM", "STRUCT", 
			"OBJ", "CHAR", "STR", "INT", "FLO", "DOU", "BOOL", "ARROW", "FAT_ARROW", 
			"SEMICOLON", "COLON", "DOUBLE_COLON", "DOT", "DOUBLE_DOT", "TRIPLE_DOT", 
			"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "COMMA", "UNDERSCORE", "QUESTION", 
			"EXCLAMATION", "EQUALS", "INFERRED", "AND", "OR", "EQUALITY", "INEQUALITY", 
			"GREATER", "LESSER", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", 
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8079457738118558718L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27230221L) != 0) {
				{
				{
				setState(114);
				line();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(122);
				comment();
				}
				break;
			case 2:
				{
				setState(123);
				statement();
				}
				break;
			case 3:
				{
				setState(124);
				expression();
				}
				break;
			case 4:
				{
				setState(125);
				block();
				}
				break;
			case 5:
				{
				setState(126);
				function_block();
				}
				break;
			case 6:
				{
				setState(127);
				procedure_block();
				}
				break;
			case 7:
				{
				setState(128);
				while_block();
				}
				break;
			case 8:
				{
				setState(129);
				for_block();
				}
				break;
			case 9:
				{
				setState(130);
				if_stream();
				}
				break;
			case 10:
				{
				setState(131);
				class_block();
				}
				break;
			case 11:
				{
				setState(132);
				when();
				}
				break;
			case 12:
				{
				setState(133);
				enum_();
				}
				break;
			case 13:
				{
				setState(134);
				struct();
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					match(SEMICOLON);
					setState(138);
					line();
					}
					} 
				}
				setState(143);
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
			setState(144);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(146);
					match(THIS);
					setState(147);
					match(DOT);
					}
				}

				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(150);
							match(ID);
							}
							break;
						case TEMP_ID:
							{
							setState(151);
							match(TEMP_ID);
							}
							break;
						case EXCLAMATION:
							{
							setState(152);
							match(EXCLAMATION);
							setState(153);
							keyword();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(156);
						accessor();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(162);
					match(ID);
					}
					break;
				case TEMP_ID:
					{
					setState(163);
					match(TEMP_ID);
					}
					break;
				case EXCLAMATION:
					{
					setState(164);
					match(EXCLAMATION);
					setState(165);
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
				setState(168);
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(FALSE);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(VAR);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(CALL);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(RETURN);
				}
				break;
			case NONE:
			case OBJ:
			case CHAR:
			case STR:
			case INT:
			case FLO:
			case DOU:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
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
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 10737418241L) != 0) ) {
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
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
				setState(182);
				local_asstmt();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				import_stmt();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
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
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(187);
						((Call_parameter_setContext)_localctx).name = name();
						((Call_parameter_setContext)_localctx).paramNames.add(((Call_parameter_setContext)_localctx).name);
						setState(188);
						match(EQUALS);
						}
						break;
					}
					setState(192);
					((Call_parameter_setContext)_localctx).true_value = true_value();
					((Call_parameter_setContext)_localctx).paramValues.add(((Call_parameter_setContext)_localctx).true_value);
					setState(193);
					match(COMMA);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8079457731504111728L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 6807555L) != 0) {
				{
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(200);
					((Call_parameter_setContext)_localctx).name = name();
					((Call_parameter_setContext)_localctx).paramNames.add(((Call_parameter_setContext)_localctx).name);
					setState(201);
					match(EQUALS);
					}
					break;
				}
				setState(205);
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
			setState(208);
			((Method_callContext)_localctx).funcName = name();
			setState(209);
			match(OPEN_PARENTHESIS);
			setState(210);
			call_parameter_set();
			setState(211);
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
			setState(213);
			match(CALL);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(214);
				method_call();
				}
				break;
			case 2:
				{
				setState(215);
				name();
				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 10737418241L) != 0) {
				{
				{
				setState(218);
				accessor();
				setState(219);
				method_call();
				}
				}
				setState(225);
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
			setState(226);
			match(NEW);
			setState(227);
			((Class_newContext)_localctx).className = name();
			setState(228);
			match(OPEN_PARENTHESIS);
			setState(229);
			call_parameter_set();
			setState(230);
			match(CLOSE_PARENTHESIS);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 10737418241L) != 0) {
				{
				{
				setState(231);
				accessor();
				setState(232);
				method_call();
				}
				}
				setState(238);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(VAR);
				setState(240);
				name();
				setState(241);
				match(COLON);
				setState(242);
				type_();
				setState(243);
				match(EQUALS);
				setState(244);
				true_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				name();
				setState(247);
				match(EQUALS);
				setState(248);
				true_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(VAR);
				setState(251);
				name();
				setState(252);
				match(COLON);
				setState(253);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				arith_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				compa_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				value_change();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
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
			setState(263);
			value();
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(265);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(267);
				match(EXCLAMATION);
				}
				break;
			}
			setState(270);
			value();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(271);
				_la = _input.LA(1);
				if ( !((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 783L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
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
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(275);
				match(EXCLAMATION);
				}
			}

			setState(278);
			((Half_compaContext)_localctx).comp = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 195L) != 0) ) {
				((Half_compaContext)_localctx).comp = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				value();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCREASE || _la==DECREASE) {
					{
					setState(282);
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

				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_CHECK) {
					{
					setState(285);
					match(NULL_CHECK);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(SINGLESTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(LITSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(MULTISTRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(INTEGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(DECIMAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLAMATION) {
					{
					setState(297);
					match(EXCLAMATION);
					}
				}

				setState(300);
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
				setState(301);
				match(NONE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(302);
				name();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(303);
				list_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(304);
				function_call();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(305);
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
			setState(308);
			value();
			setState(309);
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
			setState(311);
			match(OPEN_BRACKET);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					value();
					setState(313);
					match(COMMA);
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4620693217683570800L) != 0 || (((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 831L) != 0) {
				{
				setState(320);
				value();
				}
			}

			setState(323);
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
		public TerminalNode DOU() { return getToken(KoiParser.DOU, 0); }
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
			setState(325);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1090921693248L) != 0 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(326);
				match(OPEN_BRACKET);
				setState(327);
				match(CLOSE_BRACKET);
				}
				break;
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(330);
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
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				return_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				break_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
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
			setState(339);
			match(OPEN_BRACE);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8079457738118558718L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27230221L) != 0) {
				{
				{
				setState(340);
				line();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(348);
			match(OPEN_BRACE);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8079457738118558718L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27230221L) != 0) {
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
			setState(355);
			return_stmt();
			setState(356);
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
			setState(358);
			match(OPEN_BRACE);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8079457738118558718L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27230221L) != 0) {
				{
				{
				setState(359);
				line();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(365);
				match(BREAK);
				}
			}

			setState(368);
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
			setState(370);
			match(OPEN_BRACE);
			setState(371);
			init_block();
			setState(372);
			constructor_block();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METH) {
				{
				{
				setState(373);
				method_block();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
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
			setState(381);
			match(OPEN_PARENTHESIS);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					parameter();
					setState(383);
					match(COMMA);
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==EXCLAMATION || _la==TEMP_ID || _la==ID) {
				{
				setState(390);
				parameter();
				}
			}

			setState(393);
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
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new ParameterNormContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				name();
				setState(396);
				match(COLON);
				setState(397);
				type_();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(398);
					match(EQUALS);
					setState(399);
					value();
					}
				}

				}
				break;
			case 2:
				_localctx = new ParameterVarArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				name();
				setState(403);
				match(COLON);
				setState(404);
				type_();
				setState(405);
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
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(FUNCTION);
				setState(410);
				name();
				setState(411);
				parameter_set();
				{
				setState(412);
				match(ARROW);
				setState(413);
				((Function_blockContext)_localctx).returnType = type_();
				}
				setState(418);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
					{
					setState(415);
					block();
					}
					break;
				case FAT_ARROW:
					{
					setState(416);
					match(FAT_ARROW);
					setState(417);
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
				setState(420);
				match(NATIVE);
				setState(421);
				match(FUNCTION);
				setState(422);
				name();
				setState(423);
				parameter_set();
				{
				setState(424);
				match(ARROW);
				setState(425);
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
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(PROCEDURE);
				setState(430);
				name();
				setState(431);
				parameter_set();
				setState(432);
				block();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(NATIVE);
				setState(435);
				match(PROCEDURE);
				setState(436);
				name();
				setState(437);
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
			setState(441);
			match(RETURN);
			setState(442);
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
			setState(444);
			match(WHILE);
			setState(445);
			compa_list();
			setState(446);
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
			setState(448);
			match(FOR);
			setState(449);
			name();
			setState(450);
			match(COLON);
			setState(451);
			type_();
			setState(452);
			match(IN);
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case INTEGER:
				{
				setState(453);
				with_length();
				}
				break;
			case THIS:
			case EXCLAMATION:
			case TEMP_ID:
			case ID:
				{
				setState(454);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(457);
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
			setState(459);
			match(INTEGER);
			setState(460);
			match(DOUBLE_DOT);
			setState(461);
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
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				range_();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			if_block();
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					elf_block();
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(474);
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
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
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
			setState(477);
			match(IF);
			setState(478);
			compa_list();
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(479);
				block();
				}
				break;
			case FAT_ARROW:
				{
				setState(480);
				match(FAT_ARROW);
				setState(481);
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
	public static class Elf_blockContext extends ParserRuleContext {
		public TerminalNode ELF() { return getToken(KoiParser.ELF, 0); }
		public Compa_listContext compa_list() {
			return getRuleContext(Compa_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
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
			setState(484);
			match(ELF);
			setState(485);
			compa_list();
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(486);
				block();
				}
				break;
			case FAT_ARROW:
				{
				setState(487);
				match(FAT_ARROW);
				setState(488);
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
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KoiParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
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
			setState(491);
			match(ELSE);
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(492);
				block();
				}
				break;
			case FAT_ARROW:
				{
				setState(493);
				match(FAT_ARROW);
				setState(494);
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
	public static class Compa_listContext extends ParserRuleContext {
		public Compa_exprContext compa_expr;
		public List<Compa_exprContext> comparisons = new ArrayList<Compa_exprContext>();
		public Token OR;
		public List<Token> settings = new ArrayList<Token>();
		public Token AND;
		public Token _tset936;
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
			setState(497);
			((Compa_listContext)_localctx).compa_expr = compa_expr();
			((Compa_listContext)_localctx).comparisons.add(((Compa_listContext)_localctx).compa_expr);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(498);
				((Compa_listContext)_localctx)._tset936 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((Compa_listContext)_localctx)._tset936 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Compa_listContext)_localctx).settings.add(((Compa_listContext)_localctx)._tset936);
				setState(499);
				((Compa_listContext)_localctx).compa_expr = compa_expr();
				((Compa_listContext)_localctx).comparisons.add(((Compa_listContext)_localctx).compa_expr);
				}
				}
				setState(504);
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
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(505);
					((Package_nameContext)_localctx).ID = match(ID);
					((Package_nameContext)_localctx).folders.add(((Package_nameContext)_localctx).ID);
					setState(506);
					match(DOUBLE_COLON);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(512);
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
			setState(514);
			match(IMPORT);
			setState(515);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(516);
			match(DOUBLE_COLON);
			setState(517);
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
			setState(519);
			match(CLASS);
			setState(520);
			name();
			setState(521);
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
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(METH);
				setState(524);
				procedure_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(METH);
				setState(526);
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
			setState(529);
			match(CONSTRUCTOR);
			setState(530);
			parameter_set();
			setState(531);
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
			setState(533);
			match(INIT);
			setState(534);
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
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<IsContext> is() {
			return getRuleContexts(IsContext.class);
		}
		public IsContext is(int i) {
			return getRuleContext(IsContext.class,i);
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
			setState(536);
			match(OPEN_BRACE);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IS) {
				{
				{
				setState(537);
				is();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(543);
				when_else();
				}
			}

			setState(546);
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
	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(KoiParser.WHEN, 0); }
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public When_blockContext when_block() {
			return getRuleContext(When_blockContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_when);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(WHEN);
			setState(549);
			true_value();
			setState(550);
			when_block();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
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
		enterRule(_localctx, 96, RULE_is_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(OPEN_BRACE);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8079457738118558718L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27230221L) != 0) {
				{
				{
				setState(553);
				line();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
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
	public static class IsContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(KoiParser.IS, 0); }
		public Half_compaContext half_compa() {
			return getRuleContext(Half_compaContext.class,0);
		}
		public True_valueContext true_value() {
			return getRuleContext(True_valueContext.class,0);
		}
		public Is_blockContext is_block() {
			return getRuleContext(Is_blockContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public IsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is; }
	}

	public final IsContext is() throws RecognitionException {
		IsContext _localctx = new IsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_is);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(IS);
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(562);
				half_compa();
				}
				break;
			case 2:
				{
				setState(563);
				true_value();
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(566);
				is_block();
				}
				break;
			case FAT_ARROW:
				{
				setState(567);
				match(FAT_ARROW);
				setState(568);
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
	public static class When_else_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(KoiParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(KoiParser.CLOSE_BRACE, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public When_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_else_block; }
	}

	public final When_else_blockContext when_else_block() throws RecognitionException {
		When_else_blockContext _localctx = new When_else_blockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_when_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(OPEN_BRACE);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8079457738118558718L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27230221L) != 0) {
				{
				{
				setState(572);
				line();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
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
	public static class When_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KoiParser.ELSE, 0); }
		public When_else_blockContext when_else_block() {
			return getRuleContext(When_else_blockContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(KoiParser.FAT_ARROW, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public When_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_else; }
	}

	public final When_elseContext when_else() throws RecognitionException {
		When_elseContext _localctx = new When_elseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_when_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(ELSE);
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(581);
				when_else_block();
				}
				break;
			case FAT_ARROW:
				{
				setState(582);
				match(FAT_ARROW);
				setState(583);
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
		enterRule(_localctx, 104, RULE_enum_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(OPEN_BRACE);
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587);
					match(ID);
					setState(588);
					match(COMMA);
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(594);
				match(ID);
				}
			}

			setState(597);
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
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KoiParser.ENUM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Enum_blockContext enum_block() {
			return getRuleContext(Enum_blockContext.class,0);
		}
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(ENUM);
			setState(600);
			name();
			setState(601);
			enum_block();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_struct_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(OPEN_BRACE);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THIS || _la==EXCLAMATION || _la==TEMP_ID || _la==ID) {
				{
				{
				setState(604);
				struct_set();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
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
	public static class StructContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(KoiParser.STRUCT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Struct_blockContext struct_block() {
			return getRuleContext(Struct_blockContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(STRUCT);
			setState(613);
			name();
			setState(614);
			struct_block();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 112, RULE_struct_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			name();
			setState(617);
			match(COLON);
			setState(618);
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
		"\u0004\u0001Z\u026d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u0001\u0000\u0005\u0000t\b\u0000\n\u0000\f\u0000"+
		"w\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0088\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u008c\b\u0001\n\u0001\f\u0001\u008f"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u0095"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009b"+
		"\b\u0003\u0001\u0003\u0005\u0003\u009e\b\u0003\n\u0003\f\u0003\u00a1\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a7"+
		"\b\u0003\u0001\u0003\u0003\u0003\u00aa\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b2\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00ba\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00bf\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c4\b"+
		"\u0007\n\u0007\f\u0007\u00c7\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00cc\b\u0007\u0001\u0007\u0003\u0007\u00cf\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00d9"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0005\t\u00de\b\t\n\t\f\t\u00e1\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00eb"+
		"\b\n\n\n\f\n\u00ee\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0100\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0106"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u010d\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0112\b\u000e\u0001\u000f"+
		"\u0003\u000f\u0115\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u011c\b\u0010\u0001\u0010\u0003\u0010\u011f\b"+
		"\u0010\u0001\u0010\u0003\u0010\u0122\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012b"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0133\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u013c\b\u0013\n"+
		"\u0013\f\u0013\u013f\t\u0013\u0001\u0013\u0003\u0013\u0142\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0149"+
		"\b\u0014\u0001\u0014\u0003\u0014\u014c\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0152\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0156\b\u0016\n\u0016\f\u0016\u0159\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u015f\b\u0017\n\u0017\f\u0017"+
		"\u0162\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0169\b\u0018\n\u0018\f\u0018\u016c\t\u0018\u0001\u0018\u0003"+
		"\u0018\u016f\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0177\b\u0019\n\u0019\f\u0019\u017a\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0182\b\u001a\n\u001a\f\u001a\u0185\t\u001a\u0001\u001a\u0003"+
		"\u001a\u0188\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0191\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0198\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01a3\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01ac\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01b8\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u01c8\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0003\"\u01d2\b\"\u0001#\u0001#\u0005#\u01d6\b#\n#\f#\u01d9"+
		"\t#\u0001#\u0003#\u01dc\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01e3"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01ea\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u01f0\b&\u0001\'\u0001\'\u0001\'\u0005\'\u01f5\b\'\n\'"+
		"\f\'\u01f8\t\'\u0001(\u0001(\u0005(\u01fc\b(\n(\f(\u01ff\t(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u0210\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0005.\u021b\b.\n.\f.\u021e\t.\u0001.\u0003"+
		".\u0221\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u0005"+
		"0\u022b\b0\n0\f0\u022e\t0\u00010\u00010\u00011\u00011\u00011\u00031\u0235"+
		"\b1\u00011\u00011\u00011\u00031\u023a\b1\u00012\u00012\u00052\u023e\b"+
		"2\n2\f2\u0241\t2\u00012\u00012\u00013\u00013\u00013\u00013\u00033\u0249"+
		"\b3\u00014\u00014\u00014\u00054\u024e\b4\n4\f4\u0251\t4\u00014\u00034"+
		"\u0254\b4\u00014\u00014\u00015\u00015\u00015\u00015\u00016\u00016\u0005"+
		"6\u025e\b6\n6\f6\u0261\t6\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u0000\u00009\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\u0000\n\u0001\u0000\u0001\u0002\u0003\u0000"+
		"--LLNN\u0001\u0000EH\u0002\u0000:=BC\u0002\u0000<=BC\u0001\u0000JK\u0001"+
		"\u0000\u0004\u0005\u0003\u0000\u0006\u0006!\'XX\u0001\u000089\u0001\u0000"+
		"\u001c\u001e\u0295\u0000u\u0001\u0000\u0000\u0000\u0002\u0087\u0001\u0000"+
		"\u0000\u0000\u0004\u0090\u0001\u0000\u0000\u0000\u0006\u00a9\u0001\u0000"+
		"\u0000\u0000\b\u00b1\u0001\u0000\u0000\u0000\n\u00b3\u0001\u0000\u0000"+
		"\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e\u00c5\u0001\u0000\u0000\u0000"+
		"\u0010\u00d0\u0001\u0000\u0000\u0000\u0012\u00d5\u0001\u0000\u0000\u0000"+
		"\u0014\u00e2\u0001\u0000\u0000\u0000\u0016\u00ff\u0001\u0000\u0000\u0000"+
		"\u0018\u0105\u0001\u0000\u0000\u0000\u001a\u0107\u0001\u0000\u0000\u0000"+
		"\u001c\u010c\u0001\u0000\u0000\u0000\u001e\u0114\u0001\u0000\u0000\u0000"+
		" \u0121\u0001\u0000\u0000\u0000\"\u0132\u0001\u0000\u0000\u0000$\u0134"+
		"\u0001\u0000\u0000\u0000&\u0137\u0001\u0000\u0000\u0000(\u0145\u0001\u0000"+
		"\u0000\u0000*\u0151\u0001\u0000\u0000\u0000,\u0153\u0001\u0000\u0000\u0000"+
		".\u015c\u0001\u0000\u0000\u00000\u0166\u0001\u0000\u0000\u00002\u0172"+
		"\u0001\u0000\u0000\u00004\u017d\u0001\u0000\u0000\u00006\u0197\u0001\u0000"+
		"\u0000\u00008\u01ab\u0001\u0000\u0000\u0000:\u01b7\u0001\u0000\u0000\u0000"+
		"<\u01b9\u0001\u0000\u0000\u0000>\u01bc\u0001\u0000\u0000\u0000@\u01c0"+
		"\u0001\u0000\u0000\u0000B\u01cb\u0001\u0000\u0000\u0000D\u01d1\u0001\u0000"+
		"\u0000\u0000F\u01d3\u0001\u0000\u0000\u0000H\u01dd\u0001\u0000\u0000\u0000"+
		"J\u01e4\u0001\u0000\u0000\u0000L\u01eb\u0001\u0000\u0000\u0000N\u01f1"+
		"\u0001\u0000\u0000\u0000P\u01fd\u0001\u0000\u0000\u0000R\u0202\u0001\u0000"+
		"\u0000\u0000T\u0207\u0001\u0000\u0000\u0000V\u020f\u0001\u0000\u0000\u0000"+
		"X\u0211\u0001\u0000\u0000\u0000Z\u0215\u0001\u0000\u0000\u0000\\\u0218"+
		"\u0001\u0000\u0000\u0000^\u0224\u0001\u0000\u0000\u0000`\u0228\u0001\u0000"+
		"\u0000\u0000b\u0231\u0001\u0000\u0000\u0000d\u023b\u0001\u0000\u0000\u0000"+
		"f\u0244\u0001\u0000\u0000\u0000h\u024a\u0001\u0000\u0000\u0000j\u0257"+
		"\u0001\u0000\u0000\u0000l\u025b\u0001\u0000\u0000\u0000n\u0264\u0001\u0000"+
		"\u0000\u0000p\u0268\u0001\u0000\u0000\u0000rt\u0003\u0002\u0001\u0000"+
		"sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0000\u0000\u0001y\u0001\u0001\u0000\u0000\u0000"+
		"z\u0088\u0003\u0004\u0002\u0000{\u0088\u0003\f\u0006\u0000|\u0088\u0003"+
		"\u0018\f\u0000}\u0088\u0003*\u0015\u0000~\u0088\u00038\u001c\u0000\u007f"+
		"\u0088\u0003:\u001d\u0000\u0080\u0088\u0003>\u001f\u0000\u0081\u0088\u0003"+
		"@ \u0000\u0082\u0088\u0003F#\u0000\u0083\u0088\u0003T*\u0000\u0084\u0088"+
		"\u0003^/\u0000\u0085\u0088\u0003j5\u0000\u0086\u0088\u0003n7\u0000\u0087"+
		"z\u0001\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000\u0087|\u0001"+
		"\u0000\u0000\u0000\u0087}\u0001\u0000\u0000\u0000\u0087~\u0001\u0000\u0000"+
		"\u0000\u0087\u007f\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000"+
		"\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000"+
		"\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u008d\u0001\u0000\u0000\u0000\u0089\u008a\u0005*\u0000\u0000"+
		"\u008a\u008c\u0003\u0002\u0001\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0003\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0007\u0000\u0000\u0000"+
		"\u0091\u0005\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0011\u0000\u0000"+
		"\u0093\u0095\u0005-\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u009f\u0001\u0000\u0000\u0000\u0096"+
		"\u009b\u0005X\u0000\u0000\u0097\u009b\u0005W\u0000\u0000\u0098\u0099\u0005"+
		"5\u0000\u0000\u0099\u009b\u0003\b\u0004\u0000\u009a\u0096\u0001\u0000"+
		"\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0003\n\u0005"+
		"\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a6\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a7\u0005X\u0000\u0000\u00a3\u00a7\u0005W\u0000\u0000\u00a4"+
		"\u00a5\u00055\u0000\u0000\u00a5\u00a7\u0003\b\u0004\u0000\u00a6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0005\u0011\u0000\u0000\u00a9\u0094\u0001\u0000\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u0007\u0001\u0000\u0000\u0000\u00ab\u00b2"+
		"\u0005\u0004\u0000\u0000\u00ac\u00b2\u0005\u0005\u0000\u0000\u00ad\u00b2"+
		"\u0005\u0007\u0000\u0000\u00ae\u00b2\u0005\u0014\u0000\u0000\u00af\u00b2"+
		"\u0005\u0015\u0000\u0000\u00b0\u00b2\u0003(\u0014\u0000\u00b1\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\t\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0007\u0001\u0000\u0000\u00b4\u000b\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ba\u0003\u0012\t\u0000\u00b6\u00ba\u0003\u0016\u000b"+
		"\u0000\u00b7\u00ba\u0003R)\u0000\u00b8\u00ba\u0003\u0014\n\u0000\u00b9"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\r\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u0006\u0003\u0000\u00bc\u00bd"+
		"\u00056\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0003 \u0010\u0000\u00c1\u00c2\u00052\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00be\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00ce\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0006\u0003"+
		"\u0000\u00c9\u00ca\u00056\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003 \u0010\u0000\u00ce"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u000f\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u0006\u0003\u0000\u00d1"+
		"\u00d2\u00050\u0000\u0000\u00d2\u00d3\u0003\u000e\u0007\u0000\u00d3\u00d4"+
		"\u00051\u0000\u0000\u00d4\u0011\u0001\u0000\u0000\u0000\u00d5\u00d8\u0005"+
		"\u0014\u0000\u0000\u00d6\u00d9\u0003\u0010\b\u0000\u00d7\u00d9\u0003\u0006"+
		"\u0003\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00df\u0001\u0000\u0000\u0000\u00da\u00db\u0003\n\u0005"+
		"\u0000\u00db\u00dc\u0003\u0010\b\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u0013\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0012\u0000\u0000\u00e3\u00e4\u0003\u0006\u0003\u0000"+
		"\u00e4\u00e5\u00050\u0000\u0000\u00e5\u00e6\u0003\u000e\u0007\u0000\u00e6"+
		"\u00ec\u00051\u0000\u0000\u00e7\u00e8\u0003\n\u0005\u0000\u00e8\u00e9"+
		"\u0003\u0010\b\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u0015\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"\u0007\u0000\u0000\u00f0\u00f1\u0003\u0006\u0003\u0000\u00f1\u00f2\u0005"+
		"+\u0000\u0000\u00f2\u00f3\u0003(\u0014\u0000\u00f3\u00f4\u00056\u0000"+
		"\u0000\u00f4\u00f5\u0003 \u0010\u0000\u00f5\u0100\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0003\u0006\u0003\u0000\u00f7\u00f8\u00056\u0000\u0000\u00f8"+
		"\u00f9\u0003 \u0010\u0000\u00f9\u0100\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0007\u0000\u0000\u00fb\u00fc\u0003\u0006\u0003\u0000\u00fc\u00fd"+
		"\u0005+\u0000\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe\u0100\u0001\u0000"+
		"\u0000\u0000\u00ff\u00ef\u0001\u0000\u0000\u0000\u00ff\u00f6\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fa\u0001\u0000\u0000\u0000\u0100\u0017\u0001\u0000"+
		"\u0000\u0000\u0101\u0106\u0003\u001a\r\u0000\u0102\u0106\u0003\u001c\u000e"+
		"\u0000\u0103\u0106\u0003$\u0012\u0000\u0104\u0106\u0003\u001e\u000f\u0000"+
		"\u0105\u0101\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0019\u0001\u0000\u0000\u0000\u0107\u0108\u0003\"\u0011\u0000\u0108"+
		"\u0109\u0007\u0002\u0000\u0000\u0109\u010a\u0003 \u0010\u0000\u010a\u001b"+
		"\u0001\u0000\u0000\u0000\u010b\u010d\u00055\u0000\u0000\u010c\u010b\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0003\"\u0011\u0000\u010f\u0110\u0007\u0003"+
		"\u0000\u0000\u0110\u0112\u0003 \u0010\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u001d\u0001\u0000\u0000"+
		"\u0000\u0113\u0115\u00055\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0007\u0004\u0000\u0000\u0117\u0118\u0003 \u0010\u0000\u0118"+
		"\u001f\u0001\u0000\u0000\u0000\u0119\u011b\u0003\"\u0011\u0000\u011a\u011c"+
		"\u0007\u0005\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f"+
		"\u0005M\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u0122\u0003"+
		"\u0018\f\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u0122!\u0001\u0000\u0000\u0000\u0123\u0133\u0005O\u0000\u0000"+
		"\u0124\u0133\u0005P\u0000\u0000\u0125\u0133\u0005Q\u0000\u0000\u0126\u0133"+
		"\u0005T\u0000\u0000\u0127\u0133\u0005R\u0000\u0000\u0128\u0133\u0005S"+
		"\u0000\u0000\u0129\u012b\u00055\u0000\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000"+
		"\u0000\u012c\u0133\u0007\u0006\u0000\u0000\u012d\u0133\u0005\u0006\u0000"+
		"\u0000\u012e\u0133\u0003\u0006\u0003\u0000\u012f\u0133\u0003&\u0013\u0000"+
		"\u0130\u0133\u0003\u0012\t\u0000\u0131\u0133\u0003\u0014\n\u0000\u0132"+
		"\u0123\u0001\u0000\u0000\u0000\u0132\u0124\u0001\u0000\u0000\u0000\u0132"+
		"\u0125\u0001\u0000\u0000\u0000\u0132\u0126\u0001\u0000\u0000\u0000\u0132"+
		"\u0127\u0001\u0000\u0000\u0000\u0132\u0128\u0001\u0000\u0000\u0000\u0132"+
		"\u012a\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000\u0000\u0000\u0132"+
		"\u012e\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133"+
		"#\u0001\u0000\u0000\u0000\u0134\u0135\u0003\"\u0011\u0000\u0135\u0136"+
		"\u0007\u0005\u0000\u0000\u0136%\u0001\u0000\u0000\u0000\u0137\u013d\u0005"+
		">\u0000\u0000\u0138\u0139\u0003\"\u0011\u0000\u0139\u013a\u00052\u0000"+
		"\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0138\u0001\u0000\u0000"+
		"\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000"+
		"\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0142\u0003\"\u0011\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0005?\u0000\u0000\u0144"+
		"\'\u0001\u0000\u0000\u0000\u0145\u0148\u0007\u0007\u0000\u0000\u0146\u0147"+
		"\u0005>\u0000\u0000\u0147\u0149\u0005?\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000"+
		"\u0000\u0000\u014a\u014c\u00054\u0000\u0000\u014b\u014a\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c)\u0001\u0000\u0000\u0000"+
		"\u014d\u0152\u0003,\u0016\u0000\u014e\u0152\u0003.\u0017\u0000\u014f\u0152"+
		"\u00030\u0018\u0000\u0150\u0152\u00032\u0019\u0000\u0151\u014d\u0001\u0000"+
		"\u0000\u0000\u0151\u014e\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152+\u0001\u0000\u0000"+
		"\u0000\u0153\u0157\u0005@\u0000\u0000\u0154\u0156\u0003\u0002\u0001\u0000"+
		"\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005A\u0000\u0000\u015b-\u0001\u0000\u0000\u0000\u015c\u0160"+
		"\u0005@\u0000\u0000\u015d\u015f\u0003\u0002\u0001\u0000\u015e\u015d\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0003"+
		"<\u001e\u0000\u0164\u0165\u0005A\u0000\u0000\u0165/\u0001\u0000\u0000"+
		"\u0000\u0166\u016a\u0005@\u0000\u0000\u0167\u0169\u0003\u0002\u0001\u0000"+
		"\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u016f\u0005\u000b\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005A\u0000\u0000\u01711\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0005@\u0000\u0000\u0173\u0174\u0003Z-\u0000\u0174\u0178\u0003X,\u0000"+
		"\u0175\u0177\u0003V+\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017a"+
		"\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0005A\u0000\u0000\u017c3\u0001\u0000"+
		"\u0000\u0000\u017d\u0183\u00050\u0000\u0000\u017e\u017f\u00036\u001b\u0000"+
		"\u017f\u0180\u00052\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181"+
		"\u017e\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186"+
		"\u0188\u00036\u001b\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u00051\u0000\u0000\u018a5\u0001\u0000\u0000\u0000\u018b\u018c\u0003\u0006"+
		"\u0003\u0000\u018c\u018d\u0005+\u0000\u0000\u018d\u0190\u0003(\u0014\u0000"+
		"\u018e\u018f\u00056\u0000\u0000\u018f\u0191\u0003\"\u0011\u0000\u0190"+
		"\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191"+
		"\u0198\u0001\u0000\u0000\u0000\u0192\u0193\u0003\u0006\u0003\u0000\u0193"+
		"\u0194\u0005+\u0000\u0000\u0194\u0195\u0003(\u0014\u0000\u0195\u0196\u0005"+
		"/\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u018b\u0001\u0000"+
		"\u0000\u0000\u0197\u0192\u0001\u0000\u0000\u0000\u01987\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0005\f\u0000\u0000\u019a\u019b\u0003\u0006\u0003\u0000"+
		"\u019b\u019c\u00034\u001a\u0000\u019c\u019d\u0005(\u0000\u0000\u019d\u019e"+
		"\u0003(\u0014\u0000\u019e\u01a2\u0001\u0000\u0000\u0000\u019f\u01a3\u0003"+
		"*\u0015\u0000\u01a0\u01a1\u0005)\u0000\u0000\u01a1\u01a3\u0003\u0002\u0001"+
		"\u0000\u01a2\u019f\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a3\u01ac\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0003\u0000"+
		"\u0000\u01a5\u01a6\u0005\f\u0000\u0000\u01a6\u01a7\u0003\u0006\u0003\u0000"+
		"\u01a7\u01a8\u00034\u001a\u0000\u01a8\u01a9\u0005(\u0000\u0000\u01a9\u01aa"+
		"\u0003(\u0014\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u0199\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a4\u0001\u0000\u0000\u0000\u01ac9\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005\r\u0000\u0000\u01ae\u01af\u0003\u0006\u0003"+
		"\u0000\u01af\u01b0\u00034\u001a\u0000\u01b0\u01b1\u0003*\u0015\u0000\u01b1"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0003\u0000\u0000\u01b3"+
		"\u01b4\u0005\r\u0000\u0000\u01b4\u01b5\u0003\u0006\u0003\u0000\u01b5\u01b6"+
		"\u00034\u001a\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000\u0000\u01b8;\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0005\u0015\u0000\u0000\u01ba\u01bb\u0003 \u0010"+
		"\u0000\u01bb=\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\b\u0000\u0000"+
		"\u01bd\u01be\u0003N\'\u0000\u01be\u01bf\u0003*\u0015\u0000\u01bf?\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0005\t\u0000\u0000\u01c1\u01c2\u0003\u0006"+
		"\u0003\u0000\u01c2\u01c3\u0005+\u0000\u0000\u01c3\u01c4\u0003(\u0014\u0000"+
		"\u01c4\u01c7\u0005\n\u0000\u0000\u01c5\u01c8\u0003D\"\u0000\u01c6\u01c8"+
		"\u0003\u0006\u0003\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0003*\u0015\u0000\u01caA\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005T"+
		"\u0000\u0000\u01cc\u01cd\u0005.\u0000\u0000\u01cd\u01ce\u0005T\u0000\u0000"+
		"\u01ceC\u0001\u0000\u0000\u0000\u01cf\u01d2\u0003B!\u0000\u01d0\u01d2"+
		"\u0003&\u0013\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d2E\u0001\u0000\u0000\u0000\u01d3\u01d7\u0003H$"+
		"\u0000\u01d4\u01d6\u0003J%\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01da\u01dc\u0003L&\u0000\u01db\u01da\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dcG\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0005\u0016\u0000\u0000\u01de\u01e2\u0003N\'"+
		"\u0000\u01df\u01e3\u0003*\u0015\u0000\u01e0\u01e1\u0005)\u0000\u0000\u01e1"+
		"\u01e3\u0003\u0002\u0001\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3I\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0005\u0017\u0000\u0000\u01e5\u01e9\u0003N\'\u0000\u01e6\u01ea\u0003"+
		"*\u0015\u0000\u01e7\u01e8\u0005)\u0000\u0000\u01e8\u01ea\u0003\u0002\u0001"+
		"\u0000\u01e9\u01e6\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000"+
		"\u0000\u01eaK\u0001\u0000\u0000\u0000\u01eb\u01ef\u0005\u0018\u0000\u0000"+
		"\u01ec\u01f0\u0003*\u0015\u0000\u01ed\u01ee\u0005)\u0000\u0000\u01ee\u01f0"+
		"\u0003\u0002\u0001\u0000\u01ef\u01ec\u0001\u0000\u0000\u0000\u01ef\u01ed"+
		"\u0001\u0000\u0000\u0000\u01f0M\u0001\u0000\u0000\u0000\u01f1\u01f6\u0003"+
		"\u001c\u000e\u0000\u01f2\u01f3\u0007\b\u0000\u0000\u01f3\u01f5\u0003\u001c"+
		"\u000e\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7O\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0005X\u0000\u0000\u01fa\u01fc\u0005,\u0000\u0000\u01fb"+
		"\u01f9\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe"+
		"\u0200\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200"+
		"\u0201\u0005X\u0000\u0000\u0201Q\u0001\u0000\u0000\u0000\u0202\u0203\u0005"+
		"\u001b\u0000\u0000\u0203\u0204\u0007\t\u0000\u0000\u0204\u0205\u0005,"+
		"\u0000\u0000\u0205\u0206\u0003P(\u0000\u0206S\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0005\u000e\u0000\u0000\u0208\u0209\u0003\u0006\u0003\u0000"+
		"\u0209\u020a\u0003*\u0015\u0000\u020aU\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0005\u0010\u0000\u0000\u020c\u0210\u0003:\u001d\u0000\u020d\u020e\u0005"+
		"\u0010\u0000\u0000\u020e\u0210\u00038\u001c\u0000\u020f\u020b\u0001\u0000"+
		"\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210W\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0005\u000f\u0000\u0000\u0212\u0213\u00034\u001a\u0000"+
		"\u0213\u0214\u0003*\u0015\u0000\u0214Y\u0001\u0000\u0000\u0000\u0215\u0216"+
		"\u0005\u0013\u0000\u0000\u0216\u0217\u0003*\u0015\u0000\u0217[\u0001\u0000"+
		"\u0000\u0000\u0218\u021c\u0005@\u0000\u0000\u0219\u021b\u0003b1\u0000"+
		"\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000"+
		"\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000"+
		"\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021f\u0221\u0003f3\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0005A\u0000\u0000\u0223]\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u0019"+
		"\u0000\u0000\u0225\u0226\u0003 \u0010\u0000\u0226\u0227\u0003\\.\u0000"+
		"\u0227_\u0001\u0000\u0000\u0000\u0228\u022c\u0005@\u0000\u0000\u0229\u022b"+
		"\u0003\u0002\u0001\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e"+
		"\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0001\u0000\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022c"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0005A\u0000\u0000\u0230a\u0001\u0000"+
		"\u0000\u0000\u0231\u0234\u0005\u001a\u0000\u0000\u0232\u0235\u0003\u001e"+
		"\u000f\u0000\u0233\u0235\u0003 \u0010\u0000\u0234\u0232\u0001\u0000\u0000"+
		"\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0239\u0001\u0000\u0000"+
		"\u0000\u0236\u023a\u0003`0\u0000\u0237\u0238\u0005)\u0000\u0000\u0238"+
		"\u023a\u0003\u0002\u0001\u0000\u0239\u0236\u0001\u0000\u0000\u0000\u0239"+
		"\u0237\u0001\u0000\u0000\u0000\u023ac\u0001\u0000\u0000\u0000\u023b\u023f"+
		"\u0005@\u0000\u0000\u023c\u023e\u0003\u0002\u0001\u0000\u023d\u023c\u0001"+
		"\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u023d\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001"+
		"\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242\u0243\u0005"+
		"A\u0000\u0000\u0243e\u0001\u0000\u0000\u0000\u0244\u0248\u0005\u0018\u0000"+
		"\u0000\u0245\u0249\u0003d2\u0000\u0246\u0247\u0005)\u0000\u0000\u0247"+
		"\u0249\u0003\u0002\u0001\u0000\u0248\u0245\u0001\u0000\u0000\u0000\u0248"+
		"\u0246\u0001\u0000\u0000\u0000\u0249g\u0001\u0000\u0000\u0000\u024a\u024f"+
		"\u0005@\u0000\u0000\u024b\u024c\u0005X\u0000\u0000\u024c\u024e\u00052"+
		"\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u0251\u0001\u0000"+
		"\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000"+
		"\u0000\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0252\u0254\u0005X\u0000\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000"+
		"\u0000\u0255\u0256\u0005A\u0000\u0000\u0256i\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0005\u001f\u0000\u0000\u0258\u0259\u0003\u0006\u0003\u0000\u0259"+
		"\u025a\u0003h4\u0000\u025ak\u0001\u0000\u0000\u0000\u025b\u025f\u0005"+
		"@\u0000\u0000\u025c\u025e\u0003p8\u0000\u025d\u025c\u0001\u0000\u0000"+
		"\u0000\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0001\u0000\u0000"+
		"\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0263\u0005A\u0000\u0000"+
		"\u0263m\u0001\u0000\u0000\u0000\u0264\u0265\u0005 \u0000\u0000\u0265\u0266"+
		"\u0003\u0006\u0003\u0000\u0266\u0267\u0003l6\u0000\u0267o\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0003\u0006\u0003\u0000\u0269\u026a\u0005+\u0000"+
		"\u0000\u026a\u026b\u0003(\u0014\u0000\u026bq\u0001\u0000\u0000\u0000@"+
		"u\u0087\u008d\u0094\u009a\u009f\u00a6\u00a9\u00b1\u00b9\u00be\u00c5\u00cb"+
		"\u00ce\u00d8\u00df\u00ec\u00ff\u0105\u010c\u0111\u0114\u011b\u011e\u0121"+
		"\u012a\u0132\u013d\u0141\u0148\u014b\u0151\u0157\u0160\u016a\u016e\u0178"+
		"\u0183\u0187\u0190\u0197\u01a2\u01ab\u01b7\u01c7\u01d1\u01d7\u01db\u01e2"+
		"\u01e9\u01ef\u01f6\u01fd\u020f\u021c\u0220\u022c\u0234\u0239\u023f\u0248"+
		"\u024f\u0253\u025f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}