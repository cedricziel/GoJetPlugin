// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class FlowRenderVisitor extends PsiElementVisitor {

  public void visitAndExpr(@NotNull FlowRenderAndExpr o) {
    visitExpression(o);
  }

  public void visitBlockStatement(@NotNull FlowRenderBlockStatement o) {
    visitStatement(o);
  }

  public void visitConditionalExpr(@NotNull FlowRenderConditionalExpr o) {
    visitExpression(o);
  }

  public void visitElseIfStatement(@NotNull FlowRenderElseIfStatement o) {
    visitStatement(o);
  }

  public void visitElseStatement(@NotNull FlowRenderElseStatement o) {
    visitStatement(o);
  }

  public void visitEndStatement(@NotNull FlowRenderEndStatement o) {
    visitStatement(o);
  }

  public void visitExpression(@NotNull FlowRenderExpression o) {
    visitPsiElement(o);
  }

  public void visitExtendsStatement(@NotNull FlowRenderExtendsStatement o) {
    visitStatement(o);
  }

  public void visitFieldChain(@NotNull FlowRenderFieldChain o) {
    visitPsiElement(o);
  }

  public void visitFieldChainExpr(@NotNull FlowRenderFieldChainExpr o) {
    visitExpression(o);
  }

  public void visitFromStatement(@NotNull FlowRenderFromStatement o) {
    visitStatement(o);
  }

  public void visitFromStatementList(@NotNull FlowRenderFromStatementList o) {
    visitPsiElement(o);
  }

  public void visitIdentifierLiteral(@NotNull FlowRenderIdentifierLiteral o) {
    visitPsiElement(o);
  }

  public void visitIfStatement(@NotNull FlowRenderIfStatement o) {
    visitStatement(o);
  }

  public void visitIncludeStatement(@NotNull FlowRenderIncludeStatement o) {
    visitStatement(o);
  }

  public void visitLiteral(@NotNull FlowRenderLiteral o) {
    visitPsiElement(o);
  }

  public void visitLiteralExpr(@NotNull FlowRenderLiteralExpr o) {
    visitExpression(o);
  }

  public void visitNumberLiteral(@NotNull FlowRenderNumberLiteral o) {
    visitPsiElement(o);
  }

  public void visitOrExpr(@NotNull FlowRenderOrExpr o) {
    visitExpression(o);
  }

  public void visitParenthesesExpr(@NotNull FlowRenderParenthesesExpr o) {
    visitExpression(o);
  }

  public void visitPipe(@NotNull FlowRenderPipe o) {
    visitPsiElement(o);
  }

  public void visitPipeline(@NotNull FlowRenderPipeline o) {
    visitPsiElement(o);
  }

  public void visitPipelineStatement(@NotNull FlowRenderPipelineStatement o) {
    visitStatement(o);
  }

  public void visitRangeAssign(@NotNull FlowRenderRangeAssign o) {
    visitPsiElement(o);
  }

  public void visitRangeStatement(@NotNull FlowRenderRangeStatement o) {
    visitStatement(o);
  }

  public void visitSetStatement(@NotNull FlowRenderSetStatement o) {
    visitStatement(o);
  }

  public void visitStatement(@NotNull FlowRenderStatement o) {
    visitPsiElement(o);
  }

  public void visitStatementList(@NotNull FlowRenderStatementList o) {
    visitPsiElement(o);
  }

  public void visitStringLiteral(@NotNull FlowRenderStringLiteral o) {
    visitPsiElement(o);
  }

  public void visitUnsetStatement(@NotNull FlowRenderUnsetStatement o) {
    visitStatement(o);
  }

  public void visitYieldStatement(@NotNull FlowRenderYieldStatement o) {
    visitStatement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
