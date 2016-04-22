// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FlowRenderElseIfStatement extends FlowRenderStatement {

  @NotNull
  List<FlowRenderExpression> getExpressionList();

  @NotNull
  List<FlowRenderPipeline> getPipelineList();

  @Nullable
  FlowRenderStatement getStatement();

  @Nullable
  FlowRenderStatementList getStatementList();

}
