// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.jhsx.flow.render.psi.FlowRenderCompositeElementType;
import io.github.jhsx.flow.render.psi.FlowRenderTokenType;
import io.github.jhsx.flow.render.psi.impl.*;

public interface FlowRenderTypes {

  IElementType AND_EXPR = new FlowRenderCompositeElementType("AND_EXPR");
  IElementType BLOCK_STATEMENT = new FlowRenderCompositeElementType("BLOCK_STATEMENT");
  IElementType CONDITIONAL_EXPR = new FlowRenderCompositeElementType("CONDITIONAL_EXPR");
  IElementType ELSE_IF_STATEMENT = new FlowRenderCompositeElementType("ELSE_IF_STATEMENT");
  IElementType ELSE_STATEMENT = new FlowRenderCompositeElementType("ELSE_STATEMENT");
  IElementType END_STATEMENT = new FlowRenderCompositeElementType("END_STATEMENT");
  IElementType EXPRESSION = new FlowRenderCompositeElementType("EXPRESSION");
  IElementType EXTENDS_STATEMENT = new FlowRenderCompositeElementType("EXTENDS_STATEMENT");
  IElementType FIELD_CHAIN = new FlowRenderCompositeElementType("FIELD_CHAIN");
  IElementType FIELD_CHAIN_EXPR = new FlowRenderCompositeElementType("FIELD_CHAIN_EXPR");
  IElementType FROM_STATEMENT = new FlowRenderCompositeElementType("FROM_STATEMENT");
  IElementType FROM_STATEMENT_LIST = new FlowRenderCompositeElementType("FROM_STATEMENT_LIST");
  IElementType IDENTIFIER_LITERAL = new FlowRenderCompositeElementType("IDENTIFIER_LITERAL");
  IElementType IF_STATEMENT = new FlowRenderCompositeElementType("IF_STATEMENT");
  IElementType INCLUDE_STATEMENT = new FlowRenderCompositeElementType("INCLUDE_STATEMENT");
  IElementType LITERAL = new FlowRenderCompositeElementType("LITERAL");
  IElementType LITERAL_EXPR = new FlowRenderCompositeElementType("LITERAL_EXPR");
  IElementType NUMBER_LITERAL = new FlowRenderCompositeElementType("NUMBER_LITERAL");
  IElementType OR_EXPR = new FlowRenderCompositeElementType("OR_EXPR");
  IElementType PARENTHESES_EXPR = new FlowRenderCompositeElementType("PARENTHESES_EXPR");
  IElementType PIPE = new FlowRenderCompositeElementType("PIPE");
  IElementType PIPELINE = new FlowRenderCompositeElementType("PIPELINE");
  IElementType PIPELINE_STATEMENT = new FlowRenderCompositeElementType("PIPELINE_STATEMENT");
  IElementType RANGE_ASSIGN = new FlowRenderCompositeElementType("RANGE_ASSIGN");
  IElementType RANGE_STATEMENT = new FlowRenderCompositeElementType("RANGE_STATEMENT");
  IElementType SET_STATEMENT = new FlowRenderCompositeElementType("SET_STATEMENT");
  IElementType STATEMENT_LIST = new FlowRenderCompositeElementType("STATEMENT_LIST");
  IElementType STRING_LITERAL = new FlowRenderCompositeElementType("STRING_LITERAL");
  IElementType UNSET_STATEMENT = new FlowRenderCompositeElementType("UNSET_STATEMENT");
  IElementType YIELD_STATEMENT = new FlowRenderCompositeElementType("YIELD_STATEMENT");

  IElementType ASSIGN = new FlowRenderTokenType("=");
  IElementType BIT_OR = new FlowRenderTokenType("|");
  IElementType BLOCK = new FlowRenderTokenType("block");
  IElementType COMMA = new FlowRenderTokenType(",");
  IElementType COMMENT = new FlowRenderTokenType("");
  IElementType COND_AND = new FlowRenderTokenType("&&");
  IElementType COND_OR = new FlowRenderTokenType("||");
  IElementType DOT = new FlowRenderTokenType(".");
  IElementType ELSE = new FlowRenderTokenType("else");
  IElementType END = new FlowRenderTokenType("end");
  IElementType EQ = new FlowRenderTokenType("==");
  IElementType EXTENDS = new FlowRenderTokenType("extends");
  IElementType FROM = new FlowRenderTokenType("from");
  IElementType GREATER = new FlowRenderTokenType(">");
  IElementType GREATER_OR_EQUAL = new FlowRenderTokenType(">=");
  IElementType IDENT = new FlowRenderTokenType("IDENT");
  IElementType IF = new FlowRenderTokenType("if");
  IElementType INCLUDE = new FlowRenderTokenType("include");
  IElementType LBRACE = new FlowRenderTokenType("{");
  IElementType LDOUBLE_BRACE = new FlowRenderTokenType("{%");
  IElementType LESS = new FlowRenderTokenType("<");
  IElementType LESS_OR_EQUAL = new FlowRenderTokenType("<=");
  IElementType LPAREN = new FlowRenderTokenType("(");
  IElementType NOT = new FlowRenderTokenType("!");
  IElementType NOT_EQ = new FlowRenderTokenType("!=");
  IElementType NUMBER = new FlowRenderTokenType("NUMBER");
  IElementType RANGE = new FlowRenderTokenType("range");
  IElementType RAW_STRING = new FlowRenderTokenType("RAW_STRING");
  IElementType RBRACE = new FlowRenderTokenType("}");
  IElementType RDOUBLE_BRACE = new FlowRenderTokenType("%}");
  IElementType RPAREN = new FlowRenderTokenType(")");
  IElementType SET = new FlowRenderTokenType("set");
  IElementType STRING = new FlowRenderTokenType("STRING");
  IElementType TEXT = new FlowRenderTokenType("TEXT");
  IElementType UNSET = new FlowRenderTokenType("unset");
  IElementType YIELD = new FlowRenderTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AND_EXPR) {
        return new FlowRenderAndExprImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new FlowRenderBlockStatementImpl(node);
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
      else if (type == FROM_STATEMENT) {
        return new FlowRenderFromStatementImpl(node);
      }
      else if (type == FROM_STATEMENT_LIST) {
        return new FlowRenderFromStatementListImpl(node);
      }
      else if (type == IDENTIFIER_LITERAL) {
        return new FlowRenderIdentifierLiteralImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new FlowRenderIfStatementImpl(node);
      }
      else if (type == INCLUDE_STATEMENT) {
        return new FlowRenderIncludeStatementImpl(node);
      }
      else if (type == LITERAL) {
        return new FlowRenderLiteralImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new FlowRenderLiteralExprImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new FlowRenderNumberLiteralImpl(node);
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
      else if (type == RANGE_ASSIGN) {
        return new FlowRenderRangeAssignImpl(node);
      }
      else if (type == RANGE_STATEMENT) {
        return new FlowRenderRangeStatementImpl(node);
      }
      else if (type == SET_STATEMENT) {
        return new FlowRenderSetStatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new FlowRenderStatementListImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new FlowRenderStringLiteralImpl(node);
      }
      else if (type == UNSET_STATEMENT) {
        return new FlowRenderUnsetStatementImpl(node);
      }
      else if (type == YIELD_STATEMENT) {
        return new FlowRenderYieldStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
