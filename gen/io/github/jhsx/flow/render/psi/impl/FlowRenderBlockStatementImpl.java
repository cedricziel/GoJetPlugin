// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.jhsx.flow.render.FlowRenderTypes.*;
import io.github.jhsx.flow.render.psi.*;

public class FlowRenderBlockStatementImpl extends FlowRenderStatementImpl implements FlowRenderBlockStatement {

  public FlowRenderBlockStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FlowRenderVisitor) ((FlowRenderVisitor)visitor).visitBlockStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FlowRenderEndStatement getEndStatement() {
    return findChildByClass(FlowRenderEndStatement.class);
  }

  @Override
  @Nullable
  public FlowRenderIdentifierLiteral getIdentifierLiteral() {
    return findChildByClass(FlowRenderIdentifierLiteral.class);
  }

  @Override
  @Nullable
  public FlowRenderPipeline getPipeline() {
    return findChildByClass(FlowRenderPipeline.class);
  }

  @Override
  @Nullable
  public FlowRenderStatementList getStatementList() {
    return findChildByClass(FlowRenderStatementList.class);
  }

}
