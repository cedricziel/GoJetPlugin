// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FlowRenderBlockStatement extends FlowRenderStatement {

  @Nullable
  FlowRenderEndStatement getEndStatement();

  @NotNull
  List<FlowRenderExpression> getExpressionList();

  @NotNull
  List<FlowRenderPipeline> getPipelineList();

  @Nullable
  FlowRenderStatementList getStatementList();

}
