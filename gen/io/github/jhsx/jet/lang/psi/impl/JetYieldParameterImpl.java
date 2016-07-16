// This is a generated file. Not intended for manual editing.
package io.github.jhsx.jet.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.jhsx.jet.lang.JetTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.jhsx.jet.lang.psi.*;

public class JetYieldParameterImpl extends ASTWrapperPsiElement implements JetYieldParameter {

  public JetYieldParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JetVisitor visitor) {
    visitor.visitYieldParameter(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JetVisitor) accept((JetVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JetBlockParameter getBlockParameter() {
    return findChildByClass(JetBlockParameter.class);
  }

  @Override
  @Nullable
  public JetExpression getExpression() {
    return findChildByClass(JetExpression.class);
  }

}
