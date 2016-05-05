// This is a generated file. Not intended for manual editing.
package io.github.jhsx.jet.lang;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.jhsx.jet.lang.psi.JetCompositeElementType;
import io.github.jhsx.jet.lang.psi.JetTokenType;
import io.github.jhsx.jet.lang.psi.impl.*;

public interface JetTypes {

  IElementType ADDITIVE_EXPR = new JetCompositeElementType("ADDITIVE_EXPR");
  IElementType AND_EXPR = new JetCompositeElementType("AND_EXPR");
  IElementType BLOCK_STATEMENT = new JetCompositeElementType("BLOCK_STATEMENT");
  IElementType CALL_EXPR = new JetCompositeElementType("CALL_EXPR");
  IElementType CONDITIONAL_EXPR = new JetCompositeElementType("CONDITIONAL_EXPR");
  IElementType ELSE_IF_STATEMENT = new JetCompositeElementType("ELSE_IF_STATEMENT");
  IElementType ELSE_STATEMENT = new JetCompositeElementType("ELSE_STATEMENT");
  IElementType END_STATEMENT = new JetCompositeElementType("END_STATEMENT");
  IElementType EXPRESSION = new JetCompositeElementType("EXPRESSION");
  IElementType EXTENDS_STATEMENT = new JetCompositeElementType("EXTENDS_STATEMENT");
  IElementType FIELD_CHAIN = new JetCompositeElementType("FIELD_CHAIN");
  IElementType FIELD_CHAIN_EXPR = new JetCompositeElementType("FIELD_CHAIN_EXPR");
  IElementType FIELD_EXPR = new JetCompositeElementType("FIELD_EXPR");
  IElementType IDENTIFIER_EXPR = new JetCompositeElementType("IDENTIFIER_EXPR");
  IElementType IF_STATEMENT = new JetCompositeElementType("IF_STATEMENT");
  IElementType IMPORT_STATEMENT = new JetCompositeElementType("IMPORT_STATEMENT");
  IElementType INCLUDE_STATEMENT = new JetCompositeElementType("INCLUDE_STATEMENT");
  IElementType ISSET_EXPR = new JetCompositeElementType("ISSET_EXPR");
  IElementType MULTIPLICATIVE_EXPR = new JetCompositeElementType("MULTIPLICATIVE_EXPR");
  IElementType NOT_EXPR = new JetCompositeElementType("NOT_EXPR");
  IElementType NUMBER_EXPR = new JetCompositeElementType("NUMBER_EXPR");
  IElementType OR_EXPR = new JetCompositeElementType("OR_EXPR");
  IElementType PARENTHESES_EXPR = new JetCompositeElementType("PARENTHESES_EXPR");
  IElementType PIPE = new JetCompositeElementType("PIPE");
  IElementType PIPELINE = new JetCompositeElementType("PIPELINE");
  IElementType PIPELINE_STATEMENT = new JetCompositeElementType("PIPELINE_STATEMENT");
  IElementType RANGE_STATEMENT = new JetCompositeElementType("RANGE_STATEMENT");
  IElementType STATEMENT_LIST = new JetCompositeElementType("STATEMENT_LIST");
  IElementType STRING_EXPR = new JetCompositeElementType("STRING_EXPR");
  IElementType TERNARY_EXPR = new JetCompositeElementType("TERNARY_EXPR");
  IElementType YIELD_STATEMENT = new JetCompositeElementType("YIELD_STATEMENT");

  IElementType ASSIGN = new JetTokenType("=");
  IElementType BIT_OR = new JetTokenType("|");
  IElementType BLOCK = new JetTokenType("block");
  IElementType COLON = new JetTokenType(":");
  IElementType COLONCOMMA = new JetTokenType(";");
  IElementType COMMA = new JetTokenType(",");
  IElementType COMMENT = new JetTokenType("");
  IElementType COND_AND = new JetTokenType("&&");
  IElementType COND_OR = new JetTokenType("||");
  IElementType DIV = new JetTokenType("/");
  IElementType DOT = new JetTokenType(".");
  IElementType ELSE = new JetTokenType("else");
  IElementType END = new JetTokenType("end");
  IElementType EQ = new JetTokenType("==");
  IElementType EXTENDS = new JetTokenType("extends");
  IElementType GREATER = new JetTokenType(">");
  IElementType GREATER_OR_EQUAL = new JetTokenType(">=");
  IElementType IDENT = new JetTokenType("IDENT");
  IElementType IF = new JetTokenType("if");
  IElementType IMPORT = new JetTokenType("import");
  IElementType INCLUDE = new JetTokenType("include");
  IElementType ISSET = new JetTokenType("isset");
  IElementType LBRACE = new JetTokenType("{");
  IElementType LDOUBLE_BRACE = new JetTokenType("{{");
  IElementType LESS = new JetTokenType("<");
  IElementType LESS_OR_EQUAL = new JetTokenType("<=");
  IElementType LPAREN = new JetTokenType("(");
  IElementType MINUS = new JetTokenType("-");
  IElementType MOD = new JetTokenType("%");
  IElementType MUL = new JetTokenType("*");
  IElementType NOT = new JetTokenType("!");
  IElementType NOT_EQ = new JetTokenType("!=");
  IElementType NUMBER = new JetTokenType("NUMBER");
  IElementType PLUS = new JetTokenType("+");
  IElementType RANGE = new JetTokenType("range");
  IElementType RAW_STRING = new JetTokenType("RAW_STRING");
  IElementType RBRACE = new JetTokenType("}");
  IElementType RDOUBLE_BRACE = new JetTokenType("}}");
  IElementType RPAREN = new JetTokenType(")");
  IElementType SCOPE_ASSIGN = new JetTokenType(":=");
  IElementType STRING = new JetTokenType("STRING");
  IElementType TERNARY = new JetTokenType("?");
  IElementType TEXT = new JetTokenType("TEXT");
  IElementType YIELD = new JetTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADDITIVE_EXPR) {
        return new JetAdditiveExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new JetAndExprImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new JetBlockStatementImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new JetCallExprImpl(node);
      }
      else if (type == CONDITIONAL_EXPR) {
        return new JetConditionalExprImpl(node);
      }
      else if (type == ELSE_IF_STATEMENT) {
        return new JetElseIfStatementImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new JetElseStatementImpl(node);
      }
      else if (type == END_STATEMENT) {
        return new JetEndStatementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new JetExpressionImpl(node);
      }
      else if (type == EXTENDS_STATEMENT) {
        return new JetExtendsStatementImpl(node);
      }
      else if (type == FIELD_CHAIN) {
        return new JetFieldChainImpl(node);
      }
      else if (type == FIELD_CHAIN_EXPR) {
        return new JetFieldChainExprImpl(node);
      }
      else if (type == FIELD_EXPR) {
        return new JetFieldExprImpl(node);
      }
      else if (type == IDENTIFIER_EXPR) {
        return new JetIdentifierExprImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new JetIfStatementImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new JetImportStatementImpl(node);
      }
      else if (type == INCLUDE_STATEMENT) {
        return new JetIncludeStatementImpl(node);
      }
      else if (type == ISSET_EXPR) {
        return new JetIssetExprImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPR) {
        return new JetMultiplicativeExprImpl(node);
      }
      else if (type == NOT_EXPR) {
        return new JetNotExprImpl(node);
      }
      else if (type == NUMBER_EXPR) {
        return new JetNumberExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new JetOrExprImpl(node);
      }
      else if (type == PARENTHESES_EXPR) {
        return new JetParenthesesExprImpl(node);
      }
      else if (type == PIPE) {
        return new JetPipeImpl(node);
      }
      else if (type == PIPELINE) {
        return new JetPipelineImpl(node);
      }
      else if (type == PIPELINE_STATEMENT) {
        return new JetPipelineStatementImpl(node);
      }
      else if (type == RANGE_STATEMENT) {
        return new JetRangeStatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new JetStatementListImpl(node);
      }
      else if (type == STRING_EXPR) {
        return new JetStringExprImpl(node);
      }
      else if (type == TERNARY_EXPR) {
        return new JetTernaryExprImpl(node);
      }
      else if (type == YIELD_STATEMENT) {
        return new JetYieldStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
