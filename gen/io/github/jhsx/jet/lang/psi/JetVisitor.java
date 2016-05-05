// This is a generated file. Not intended for manual editing.
package io.github.jhsx.jet.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class JetVisitor extends PsiElementVisitor {

  public void visitAdditiveExpr(@NotNull JetAdditiveExpr o) {
    visitExpression(o);
  }

  public void visitAndExpr(@NotNull JetAndExpr o) {
    visitExpression(o);
  }

  public void visitBlockStatement(@NotNull JetBlockStatement o) {
    visitStatement(o);
  }

  public void visitCallExpr(@NotNull JetCallExpr o) {
    visitExpression(o);
  }

  public void visitConditionalExpr(@NotNull JetConditionalExpr o) {
    visitExpression(o);
  }

  public void visitElseIfStatement(@NotNull JetElseIfStatement o) {
    visitStatement(o);
  }

  public void visitElseStatement(@NotNull JetElseStatement o) {
    visitStatement(o);
  }

  public void visitEndStatement(@NotNull JetEndStatement o) {
    visitStatement(o);
  }

  public void visitExpression(@NotNull JetExpression o) {
    visitPsiElement(o);
  }

  public void visitExtendsStatement(@NotNull JetExtendsStatement o) {
    visitStatement(o);
  }

  public void visitFieldChain(@NotNull JetFieldChain o) {
    visitPsiElement(o);
  }

  public void visitFieldChainExpr(@NotNull JetFieldChainExpr o) {
    visitExpression(o);
  }

  public void visitFieldExpr(@NotNull JetFieldExpr o) {
    visitExpression(o);
  }

  public void visitIdentifierExpr(@NotNull JetIdentifierExpr o) {
    visitExpression(o);
  }

  public void visitIfStatement(@NotNull JetIfStatement o) {
    visitStatement(o);
  }

  public void visitImportStatement(@NotNull JetImportStatement o) {
    visitStatement(o);
  }

  public void visitIncludeStatement(@NotNull JetIncludeStatement o) {
    visitStatement(o);
  }

  public void visitIssetExpr(@NotNull JetIssetExpr o) {
    visitExpression(o);
  }

  public void visitMultiplicativeExpr(@NotNull JetMultiplicativeExpr o) {
    visitExpression(o);
  }

  public void visitNotExpr(@NotNull JetNotExpr o) {
    visitExpression(o);
  }

  public void visitNumberExpr(@NotNull JetNumberExpr o) {
    visitExpression(o);
  }

  public void visitOrExpr(@NotNull JetOrExpr o) {
    visitExpression(o);
  }

  public void visitParenthesesExpr(@NotNull JetParenthesesExpr o) {
    visitExpression(o);
  }

  public void visitPipe(@NotNull JetPipe o) {
    visitPsiElement(o);
  }

  public void visitPipeline(@NotNull JetPipeline o) {
    visitPsiElement(o);
  }

  public void visitPipelineStatement(@NotNull JetPipelineStatement o) {
    visitStatement(o);
  }

  public void visitRangeStatement(@NotNull JetRangeStatement o) {
    visitStatement(o);
  }

  public void visitStatement(@NotNull JetStatement o) {
    visitPsiElement(o);
  }

  public void visitStatementList(@NotNull JetStatementList o) {
    visitPsiElement(o);
  }

  public void visitStringExpr(@NotNull JetStringExpr o) {
    visitExpression(o);
  }

  public void visitTernaryExpr(@NotNull JetTernaryExpr o) {
    visitExpression(o);
  }

  public void visitYieldStatement(@NotNull JetYieldStatement o) {
    visitStatement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
