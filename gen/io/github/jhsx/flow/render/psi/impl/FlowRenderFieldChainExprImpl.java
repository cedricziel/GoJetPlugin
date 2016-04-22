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

public class FlowRenderFieldChainExprImpl extends FlowRenderExpressionImpl implements FlowRenderFieldChainExpr {

  public FlowRenderFieldChainExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FlowRenderVisitor visitor) {
    visitor.visitFieldChainExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FlowRenderVisitor) accept((FlowRenderVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FlowRenderExpression getExpression() {
    return findNotNullChildByClass(FlowRenderExpression.class);
  }

  @Override
  @NotNull
  public FlowRenderFieldChain getFieldChain() {
    return findNotNullChildByClass(FlowRenderFieldChain.class);
  }

}
