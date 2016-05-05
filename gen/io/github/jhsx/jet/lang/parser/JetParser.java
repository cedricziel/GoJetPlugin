// This is a generated file. Not intended for manual editing.
package io.github.jhsx.jet.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.github.jhsx.jet.lang.JetTypes.*;
import static io.github.jhsx.jet.lang.parser.JetParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JetParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADDITIVE_EXPR) {
      r = Expression(b, 0, 3);
    }
    else if (t == AND_EXPR) {
      r = Expression(b, 0, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = BlockStatement(b, 0);
    }
    else if (t == CALL_EXPR) {
      r = Expression(b, 0, 4);
    }
    else if (t == CONDITIONAL_EXPR) {
      r = Expression(b, 0, 1);
    }
    else if (t == ELSE_IF_STATEMENT) {
      r = ElseIfStatement(b, 0);
    }
    else if (t == ELSE_STATEMENT) {
      r = ElseStatement(b, 0);
    }
    else if (t == END_STATEMENT) {
      r = EndStatement(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0, -1);
    }
    else if (t == EXTENDS_STATEMENT) {
      r = ExtendsStatement(b, 0);
    }
    else if (t == FIELD_CHAIN) {
      r = FieldChain(b, 0);
    }
    else if (t == FIELD_CHAIN_EXPR) {
      r = Expression(b, 0, 8);
    }
    else if (t == FIELD_EXPR) {
      r = FieldExpr(b, 0);
    }
    else if (t == IDENTIFIER_EXPR) {
      r = IdentifierExpr(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == IMPORT_STATEMENT) {
      r = ImportStatement(b, 0);
    }
    else if (t == INCLUDE_STATEMENT) {
      r = IncludeStatement(b, 0);
    }
    else if (t == ISSET_EXPR) {
      r = IssetExpr(b, 0);
    }
    else if (t == MULTIPLICATIVE_EXPR) {
      r = Expression(b, 0, 2);
    }
    else if (t == NOT_EXPR) {
      r = NotExpr(b, 0);
    }
    else if (t == NUMBER_EXPR) {
      r = NumberExpr(b, 0);
    }
    else if (t == OR_EXPR) {
      r = Expression(b, 0, -1);
    }
    else if (t == PARENTHESES_EXPR) {
      r = ParenthesesExpr(b, 0);
    }
    else if (t == PIPE) {
      r = Pipe(b, 0);
    }
    else if (t == PIPELINE) {
      r = Pipeline(b, 0);
    }
    else if (t == PIPELINE_STATEMENT) {
      r = PipelineStatement(b, 0);
    }
    else if (t == RANGE_STATEMENT) {
      r = RangeStatement(b, 0);
    }
    else if (t == STATEMENT_LIST) {
      r = StatementList(b, 0);
    }
    else if (t == STRING_EXPR) {
      r = StringExpr(b, 0);
    }
    else if (t == TERNARY_EXPR) {
      r = Expression(b, 0, 6);
    }
    else if (t == YIELD_STATEMENT) {
      r = YieldStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(BLOCK_STATEMENT, ELSE_IF_STATEMENT, ELSE_STATEMENT, END_STATEMENT,
      EXTENDS_STATEMENT, IF_STATEMENT, IMPORT_STATEMENT, INCLUDE_STATEMENT,
      PIPELINE_STATEMENT, RANGE_STATEMENT, YIELD_STATEMENT),
    create_token_set_(ADDITIVE_EXPR, AND_EXPR, CALL_EXPR, CONDITIONAL_EXPR,
      EXPRESSION, FIELD_CHAIN_EXPR, FIELD_EXPR, IDENTIFIER_EXPR,
      ISSET_EXPR, MULTIPLICATIVE_EXPR, NOT_EXPR, NUMBER_EXPR,
      OR_EXPR, PARENTHESES_EXPR, STRING_EXPR, TERNARY_EXPR),
  };

  /* ********************************************************** */
  // '{{' 'block' IdentifierExpr  (set_declaration ';')? Pipeline? '}}' StatementList EndStatement
  public static boolean BlockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, BLOCK);
    p = r; // pin = 2
    r = r && report_error_(b, IdentifierExpr(b, l + 1));
    r = p && report_error_(b, BlockStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, BlockStatement_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RDOUBLE_BRACE)) && r;
    r = p && report_error_(b, StatementList(b, l + 1)) && r;
    r = p && EndStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (set_declaration ';')?
  private static boolean BlockStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_3")) return false;
    BlockStatement_3_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean BlockStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, COLONCOMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pipeline?
  private static boolean BlockStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_4")) return false;
    Pipeline(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{{' 'else' 'if' (set_declaration ';')? Pipeline '}}' StatementList (EndStatement|ElseIfStatement|ElseStatement)
  public static boolean ElseIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_IF_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, ELSE);
    r = r && consumeToken(b, IF);
    p = r; // pin = 3
    r = r && report_error_(b, ElseIfStatement_3(b, l + 1));
    r = p && report_error_(b, Pipeline(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RDOUBLE_BRACE)) && r;
    r = p && report_error_(b, StatementList(b, l + 1)) && r;
    r = p && ElseIfStatement_7(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (set_declaration ';')?
  private static boolean ElseIfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_3")) return false;
    ElseIfStatement_3_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean ElseIfStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, COLONCOMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // EndStatement|ElseIfStatement|ElseStatement
  private static boolean ElseIfStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EndStatement(b, l + 1);
    if (!r) r = ElseIfStatement(b, l + 1);
    if (!r) r = ElseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{{' 'else' '}}' StatementList EndStatement
  public static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, ELSE);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, RDOUBLE_BRACE));
    r = p && report_error_(b, StatementList(b, l + 1)) && r;
    r = p && EndStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{{' 'end' '}}'
  public static boolean EndStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, END_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, END);
    p = r; // pin = 2
    r = r && consumeToken(b, RDOUBLE_BRACE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{{' 'extends' StringExpr '}}'
  public static boolean ExtendsStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendsStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTENDS_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, EXTENDS);
    p = r; // pin = 2
    r = r && report_error_(b, StringExpr(b, l + 1));
    r = p && consumeToken(b, RDOUBLE_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '.' IDENT FieldChain?
  public static boolean FieldChain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldChain")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && consumeToken(b, IDENT);
    r = r && FieldChain_2(b, l + 1);
    exit_section_(b, m, FIELD_CHAIN, r);
    return r;
  }

  // FieldChain?
  private static boolean FieldChain_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldChain_2")) return false;
    FieldChain(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ExtendsStatement? ImportStatement*  StatementList
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = File_0(b, l + 1);
    r = r && File_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExtendsStatement?
  private static boolean File_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_0")) return false;
    ExtendsStatement(b, l + 1);
    return true;
  }

  // ImportStatement*
  private static boolean File_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ImportStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '{{' 'if' (set_declaration ';')? Pipeline '}}' StatementList (EndStatement|ElseIfStatement|ElseStatement)
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, IF);
    p = r; // pin = 2
    r = r && report_error_(b, IfStatement_2(b, l + 1));
    r = p && report_error_(b, Pipeline(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RDOUBLE_BRACE)) && r;
    r = p && report_error_(b, StatementList(b, l + 1)) && r;
    r = p && IfStatement_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (set_declaration ';')?
  private static boolean IfStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_2")) return false;
    IfStatement_2_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean IfStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, COLONCOMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // EndStatement|ElseIfStatement|ElseStatement
  private static boolean IfStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EndStatement(b, l + 1);
    if (!r) r = ElseIfStatement(b, l + 1);
    if (!r) r = ElseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{{' 'import' StringExpr '}}'
  public static boolean ImportStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, IMPORT);
    p = r; // pin = 2
    r = r && report_error_(b, StringExpr(b, l + 1));
    r = p && consumeToken(b, RDOUBLE_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{{' 'include' StringExpr  (set_declaration ';')? Pipeline? '}}'
  public static boolean IncludeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, INCLUDE);
    p = r; // pin = 2
    r = r && report_error_(b, StringExpr(b, l + 1));
    r = p && report_error_(b, IncludeStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, IncludeStatement_4(b, l + 1)) && r;
    r = p && consumeToken(b, RDOUBLE_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (set_declaration ';')?
  private static boolean IncludeStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeStatement_3")) return false;
    IncludeStatement_3_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean IncludeStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, COLONCOMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pipeline?
  private static boolean IncludeStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeStatement_4")) return false;
    Pipeline(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '|' Expression (':' expression_list)? Pipe?
  public static boolean Pipe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe")) return false;
    if (!nextTokenIs(b, BIT_OR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PIPE, null);
    r = consumeToken(b, BIT_OR);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, Pipe_2(b, l + 1)) && r;
    r = p && Pipe_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (':' expression_list)?
  private static boolean Pipe_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe_2")) return false;
    Pipe_2_0(b, l + 1);
    return true;
  }

  // ':' expression_list
  private static boolean Pipe_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expression_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pipe?
  private static boolean Pipe_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe_3")) return false;
    Pipe(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression (':' expression_list)?  Pipe?
  public static boolean Pipeline(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PIPELINE, "<pipeline>");
    r = Expression(b, l + 1, -1);
    p = r; // pin = 1
    r = r && report_error_(b, Pipeline_1(b, l + 1));
    r = p && Pipeline_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (':' expression_list)?
  private static boolean Pipeline_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline_1")) return false;
    Pipeline_1_0(b, l + 1);
    return true;
  }

  // ':' expression_list
  private static boolean Pipeline_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expression_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pipe?
  private static boolean Pipeline_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline_2")) return false;
    Pipe(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{{' (set_declaration ';')? Pipeline '}}'
  public static boolean PipelineStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PipelineStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PIPELINE_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && PipelineStatement_1(b, l + 1);
    r = r && Pipeline(b, l + 1);
    p = r; // pin = 3
    r = r && consumeToken(b, RDOUBLE_BRACE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (set_declaration ';')?
  private static boolean PipelineStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PipelineStatement_1")) return false;
    PipelineStatement_1_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean PipelineStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PipelineStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, COLONCOMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{{' 'range' (fieldOrID (',' fieldOrID)? assign_op)? Pipeline '}}' StatementList (EndStatement|ElseStatement)
  public static boolean RangeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RANGE_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, RANGE);
    p = r; // pin = 2
    r = r && report_error_(b, RangeStatement_2(b, l + 1));
    r = p && report_error_(b, Pipeline(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RDOUBLE_BRACE)) && r;
    r = p && report_error_(b, StatementList(b, l + 1)) && r;
    r = p && RangeStatement_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (fieldOrID (',' fieldOrID)? assign_op)?
  private static boolean RangeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeStatement_2")) return false;
    RangeStatement_2_0(b, l + 1);
    return true;
  }

  // fieldOrID (',' fieldOrID)? assign_op
  private static boolean RangeStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fieldOrID(b, l + 1);
    r = r && RangeStatement_2_0_1(b, l + 1);
    r = r && assign_op(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' fieldOrID)?
  private static boolean RangeStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeStatement_2_0_1")) return false;
    RangeStatement_2_0_1_0(b, l + 1);
    return true;
  }

  // ',' fieldOrID
  private static boolean RangeStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && fieldOrID(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EndStatement|ElseStatement
  private static boolean RangeStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeStatement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EndStatement(b, l + 1);
    if (!r) r = ElseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( TEXT+ | IncludeStatement | IfStatement | BlockStatement | RangeStatement | YieldStatement | PipelineStatement )*
  public static boolean StatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST, "<statement list>");
    int c = current_position_(b);
    while (true) {
      if (!StatementList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // TEXT+ | IncludeStatement | IfStatement | BlockStatement | RangeStatement | YieldStatement | PipelineStatement
  private static boolean StatementList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StatementList_0_0(b, l + 1);
    if (!r) r = IncludeStatement(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    if (!r) r = RangeStatement(b, l + 1);
    if (!r) r = YieldStatement(b, l + 1);
    if (!r) r = PipelineStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEXT+
  private static boolean StatementList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "StatementList_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{{' 'yield' IdentifierExpr (set_declaration ';')? Pipeline? '}}'
  public static boolean YieldStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldStatement")) return false;
    if (!nextTokenIs(b, LDOUBLE_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, YIELD_STATEMENT, null);
    r = consumeToken(b, LDOUBLE_BRACE);
    r = r && consumeToken(b, YIELD);
    p = r; // pin = 2
    r = r && report_error_(b, IdentifierExpr(b, l + 1));
    r = p && report_error_(b, YieldStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, YieldStatement_4(b, l + 1)) && r;
    r = p && consumeToken(b, RDOUBLE_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (set_declaration ';')?
  private static boolean YieldStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldStatement_3")) return false;
    YieldStatement_3_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean YieldStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, COLONCOMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pipeline?
  private static boolean YieldStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldStatement_4")) return false;
    Pipeline(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '+' | '-'
  static boolean add_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_op")) return false;
    if (!nextTokenIs(b, "", PLUS, MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' | ':='
  static boolean assign_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_op")) return false;
    if (!nextTokenIs(b, "", SCOPE_ASSIGN, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, SCOPE_ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Expression (',' Expression)*)?
  static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    expression_list_0(b, l + 1);
    return true;
  }

  // Expression (',' Expression)*
  private static boolean expression_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && expression_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Expression)*
  private static boolean expression_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Expression
  private static boolean expression_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FieldChainExpr|IdentifierExpr
  static boolean fieldOrID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldOrID")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, 8);
    if (!r) r = IdentifierExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '*' | '%' | '/'
  static boolean mul_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_op")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, DIV);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '==' | '!=' | '<' | '<=' | '>' | '>='
  static boolean rel_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rel_op")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NOT_EQ);
    if (!r) r = consumeToken(b, LESS);
    if (!r) r = consumeToken(b, LESS_OR_EQUAL);
    if (!r) r = consumeToken(b, GREATER);
    if (!r) r = consumeToken(b, GREATER_OR_EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (fieldOrID (',' fieldOrID)*)  assign_op Pipeline (',' Pipeline)*
  static boolean set_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration_0(b, l + 1);
    r = r && assign_op(b, l + 1);
    r = r && Pipeline(b, l + 1);
    r = r && set_declaration_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fieldOrID (',' fieldOrID)*
  private static boolean set_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fieldOrID(b, l + 1);
    r = r && set_declaration_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' fieldOrID)*
  private static boolean set_declaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!set_declaration_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "set_declaration_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' fieldOrID
  private static boolean set_declaration_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && fieldOrID(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Pipeline)*
  private static boolean set_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!set_declaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "set_declaration_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Pipeline
  private static boolean set_declaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Pipeline(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: BINARY(OrExpr)
  // 1: BINARY(AndExpr)
  // 2: BINARY(ConditionalExpr)
  // 3: BINARY(MultiplicativeExpr)
  // 4: BINARY(AdditiveExpr)
  // 5: POSTFIX(CallExpr)
  // 6: ATOM(NotExpr)
  // 7: BINARY(TernaryExpr)
  // 8: ATOM(IssetExpr)
  // 9: ATOM(FieldExpr) POSTFIX(FieldChainExpr)
  // 10: ATOM(NumberExpr) ATOM(IdentifierExpr) ATOM(StringExpr) ATOM(ParenthesesExpr)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = NotExpr(b, l + 1);
    if (!r) r = IssetExpr(b, l + 1);
    if (!r) r = FieldExpr(b, l + 1);
    if (!r) r = NumberExpr(b, l + 1);
    if (!r) r = IdentifierExpr(b, l + 1);
    if (!r) r = StringExpr(b, l + 1);
    if (!r) r = ParenthesesExpr(b, l + 1);
    p = r;
    r = r && Expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, COND_OR)) {
        r = Expression(b, l, 0);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, COND_AND)) {
        r = Expression(b, l, 1);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 2 && rel_op(b, l + 1)) {
        r = Expression(b, l, 2);
        exit_section_(b, l, m, CONDITIONAL_EXPR, r, true, null);
      }
      else if (g < 3 && mul_op(b, l + 1)) {
        r = Expression(b, l, 3);
        exit_section_(b, l, m, MULTIPLICATIVE_EXPR, r, true, null);
      }
      else if (g < 4 && add_op(b, l + 1)) {
        r = Expression(b, l, 4);
        exit_section_(b, l, m, ADDITIVE_EXPR, r, true, null);
      }
      else if (g < 5 && CallExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPR, r, true, null);
      }
      else if (g < 7 && TernaryExpr_0(b, l + 1)) {
        r = Expression(b, l, 7);
        exit_section_(b, l, m, TERNARY_EXPR, r, true, null);
      }
      else if (g < 9 && FieldChain(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, FIELD_CHAIN_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // '(' expression_list ')'
  private static boolean CallExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && expression_list(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' Expression
  public static boolean NotExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NotExpr")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NOT_EXPR, null);
    r = consumeTokenSmart(b, NOT);
    p = r; // pin = 1
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '?' (Expression) ':'
  private static boolean TernaryExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TERNARY);
    r = r && TernaryExpr_0_1(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression)
  private static boolean TernaryExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'isset' '(' expression_list ')'
  public static boolean IssetExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IssetExpr")) return false;
    if (!nextTokenIsSmart(b, ISSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ISSET_EXPR, null);
    r = consumeTokenSmart(b, ISSET);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LPAREN));
    r = p && report_error_(b, expression_list(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // FieldChain
  public static boolean FieldExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldExpr")) return false;
    if (!nextTokenIsSmart(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldChain(b, l + 1);
    exit_section_(b, m, FIELD_EXPR, r);
    return r;
  }

  // NUMBER
  public static boolean NumberExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberExpr")) return false;
    if (!nextTokenIsSmart(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NUMBER);
    exit_section_(b, m, NUMBER_EXPR, r);
    return r;
  }

  // IDENT | '.'
  public static boolean IdentifierExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierExpr")) return false;
    if (!nextTokenIsSmart(b, DOT, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_EXPR, "<identifier expr>");
    r = consumeTokenSmart(b, IDENT);
    if (!r) r = consumeTokenSmart(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RAW_STRING|STRING
  public static boolean StringExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringExpr")) return false;
    if (!nextTokenIsSmart(b, RAW_STRING, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_EXPR, "<string expr>");
    r = consumeTokenSmart(b, RAW_STRING);
    if (!r) r = consumeTokenSmart(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' Pipeline ')'
  public static boolean ParenthesesExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesesExpr")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARENTHESES_EXPR, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, Pipeline(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

}
