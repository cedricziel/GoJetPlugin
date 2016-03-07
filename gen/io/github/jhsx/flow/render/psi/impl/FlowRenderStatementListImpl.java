// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.jhsx.flow.render.FlowRenderTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.jhsx.flow.render.psi.*;

public class FlowRenderStatementListImpl extends ASTWrapperPsiElement implements FlowRenderStatementList {

  public FlowRenderStatementListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FlowRenderVisitor) ((FlowRenderVisitor)visitor).visitStatementList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FlowRenderStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FlowRenderStatement.class);
  }

}
