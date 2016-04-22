// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.jhsx.flow.render.psi.FlowRenderCompositeElementType;
import io.github.jhsx.flow.render.psi.FlowRenderTokenType;
import io.github.jhsx.flow.render.psi.impl.*;

public interface FlowRenderTypes {

  IElementType ADDITIVE_EXPR = new FlowRenderCompositeElementType("ADDITIVE_EXPR");
  IElementType AND_EXPR = new FlowRenderCompositeElementType("AND_EXPR");
  IElementType BLOCK_STATEMENT = new FlowRenderCompositeElementType("BLOCK_STATEMENT");
  IElementType CALL_EXPR = new FlowRenderCompositeElementType("CALL_EXPR");
  IElementType CONDITIONAL_EXPR = new FlowRenderCompositeElementType("CONDITIONAL_EXPR");
  IElementType ELSE_IF_STATEMENT = new FlowRenderCompositeElementType("ELSE_IF_STATEMENT");
  IElementType ELSE_STATEMENT = new FlowRenderCompositeElementType("ELSE_STATEMENT");
  IElementType END_STATEMENT = new FlowRenderCompositeElementType("END_STATEMENT");
  IElementType EXPRESSION = new FlowRenderCompositeElementType("EXPRESSION");
  IElementType EXTENDS_STATEMENT = new FlowRenderCompositeElementType("EXTENDS_STATEMENT");
  IElementType FIELD_CHAIN = new FlowRenderCompositeElementType("FIELD_CHAIN");
  IElementType FIELD_CHAIN_EXPR = new FlowRenderCompositeElementType("FIELD_CHAIN_EXPR");
  IElementType FIELD_EXPR = new FlowRenderCompositeElementType("FIELD_EXPR");
  IElementType IDENTIFIER_EXPR = new FlowRenderCompositeElementType("IDENTIFIER_EXPR");
  IElementType IF_STATEMENT = new FlowRenderCompositeElementType("IF_STATEMENT");
  IElementType IMPORT_STATEMENT = new FlowRenderCompositeElementType("IMPORT_STATEMENT");
  IElementType INCLUDE_STATEMENT = new FlowRenderCompositeElementType("INCLUDE_STATEMENT");
  IElementType MULTIPLICATIVE_EXPR = new FlowRenderCompositeElementType("MULTIPLICATIVE_EXPR");
  IElementType NOT_EXPR = new FlowRenderCompositeElementType("NOT_EXPR");
  IElementType NUMBER_EXPR = new FlowRenderCompositeElementType("NUMBER_EXPR");
  IElementType OR_EXPR = new FlowRenderCompositeElementType("OR_EXPR");
  IElementType PARENTHESES_EXPR = new FlowRenderCompositeElementType("PARENTHESES_EXPR");
  IElementType PIPE = new FlowRenderCompositeElementType("PIPE");
  IElementType PIPELINE = new FlowRenderCompositeElementType("PIPELINE");
  IElementType PIPELINE_STATEMENT = new FlowRenderCompositeElementType("PIPELINE_STATEMENT");
  IElementType RANGE_STATEMENT = new FlowRenderCompositeElementType("RANGE_STATEMENT");
  IElementType STATEMENT_LIST = new FlowRenderCompositeElementType("STATEMENT_LIST");
  IElementType STRING_EXPR = new FlowRenderCompositeElementType("STRING_EXPR");
  IElementType TERNARY_EXPR = new FlowRenderCompositeElementType("TERNARY_EXPR");
  IElementType YIELD_STATEMENT = new FlowRenderCompositeElementType("YIELD_STATEMENT");

  IElementType ASSIGN = new FlowRenderTokenType("=");
  IElementType BIT_OR = new FlowRenderTokenType("|");
  IElementType BLOCK = new FlowRenderTokenType("block");
  IElementType COLON = new FlowRenderTokenType(":");
  IElementType COLONCOMMA = new FlowRenderTokenType(";");
  IElementType COMMA = new FlowRenderTokenType(",");
  IElementType COMMENT = new FlowRenderTokenType("");
  IElementType COND_AND = new FlowRenderTokenType("&&");
  IElementType COND_OR = new FlowRenderTokenType("||");
  IElementType DIV = new FlowRenderTokenType("/");
  IElementType DOT = new FlowRenderTokenType(".");
  IElementType ELSE = new FlowRenderTokenType("else");
  IElementType END = new FlowRenderTokenType("end");
  IElementType EQ = new FlowRenderTokenType("==");
  IElementType EXTENDS = new FlowRenderTokenType("extends");
  IElementType GREATER = new FlowRenderTokenType(">");
  IElementType GREATER_OR_EQUAL = new FlowRenderTokenType(">=");
  IElementType IDENT = new FlowRenderTokenType("IDENT");
  IElementType IF = new FlowRenderTokenType("if");
  IElementType IMPORT = new FlowRenderTokenType("import");
  IElementType INCLUDE = new FlowRenderTokenType("include");
  IElementType LBRACE = new FlowRenderTokenType("{");
  IElementType LDOUBLE_BRACE = new FlowRenderTokenType("{{");
  IElementType LESS = new FlowRenderTokenType("<");
  IElementType LESS_OR_EQUAL = new FlowRenderTokenType("<=");
  IElementType LPAREN = new FlowRenderTokenType("(");
  IElementType MINUS = new FlowRenderTokenType("-");
  IElementType MOD = new FlowRenderTokenType("%");
  IElementType MUL = new FlowRenderTokenType("*");
  IElementType NOT = new FlowRenderTokenType("!");
  IElementType NOT_EQ = new FlowRenderTokenType("!=");
  IElementType NUMBER = new FlowRenderTokenType("NUMBER");
  IElementType PLUS = new FlowRenderTokenType("+");
  IElementType RANGE = new FlowRenderTokenType("range");
  IElementType RAW_STRING = new FlowRenderTokenType("RAW_STRING");
  IElementType RBRACE = new FlowRenderTokenType("}");
  IElementType RDOUBLE_BRACE = new FlowRenderTokenType("}}");
  IElementType RPAREN = new FlowRenderTokenType(")");
  IElementType SCOPE_ASSIGN = new FlowRenderTokenType(":=");
  IElementType STRING = new FlowRenderTokenType("STRING");
  IElementType TERNARY = new FlowRenderTokenType("?");
  IElementType TEXT = new FlowRenderTokenType("TEXT");
  IElementType YIELD = new FlowRenderTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADDITIVE_EXPR) {
        return new FlowRenderAdditiveExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new FlowRenderAndExprImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new FlowRenderBlockStatementImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new FlowRenderCallExprImpl(node);
      }
      else if (type == CONDITIONAL_EXPR) {
        return new FlowRenderConditionalExprImpl(node);
      }
      else if (type == ELSE_IF_STATEMENT) {
        return new FlowRenderElseIfStatementImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new FlowRenderElseStatementImpl(node);
      }
      else if (type == END_STATEMENT) {
        return new FlowRenderEndStatementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new FlowRenderExpressionImpl(node);
      }
      else if (type == EXTENDS_STATEMENT) {
        return new FlowRenderExtendsStatementImpl(node);
      }
      else if (type == FIELD_CHAIN) {
        return new FlowRenderFieldChainImpl(node);
      }
      else if (type == FIELD_CHAIN_EXPR) {
        return new FlowRenderFieldChainExprImpl(node);
      }
      else if (type == FIELD_EXPR) {
        return new FlowRenderFieldExprImpl(node);
      }
      else if (type == IDENTIFIER_EXPR) {
        return new FlowRenderIdentifierExprImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new FlowRenderIfStatementImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new FlowRenderImportStatementImpl(node);
      }
      else if (type == INCLUDE_STATEMENT) {
        return new FlowRenderIncludeStatementImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPR) {
        return new FlowRenderMultiplicativeExprImpl(node);
      }
      else if (type == NOT_EXPR) {
        return new FlowRenderNotExprImpl(node);
      }
      else if (type == NUMBER_EXPR) {
        return new FlowRenderNumberExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new FlowRenderOrExprImpl(node);
      }
      else if (type == PARENTHESES_EXPR) {
        return new FlowRenderParenthesesExprImpl(node);
      }
      else if (type == PIPE) {
        return new FlowRenderPipeImpl(node);
      }
      else if (type == PIPELINE) {
        return new FlowRenderPipelineImpl(node);
      }
      else if (type == PIPELINE_STATEMENT) {
        return new FlowRenderPipelineStatementImpl(node);
      }
      else if (type == RANGE_STATEMENT) {
        return new FlowRenderRangeStatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new FlowRenderStatementListImpl(node);
      }
      else if (type == STRING_EXPR) {
        return new FlowRenderStringExprImpl(node);
      }
      else if (type == TERNARY_EXPR) {
        return new FlowRenderTernaryExprImpl(node);
      }
      else if (type == YIELD_STATEMENT) {
        return new FlowRenderYieldStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
