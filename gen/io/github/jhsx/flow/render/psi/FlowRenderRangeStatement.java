// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FlowRenderRangeStatement extends FlowRenderStatement {

  @Nullable
  FlowRenderPipeline getPipeline();

  @Nullable
  FlowRenderRangeAssign getRangeAssign();

  @Nullable
  FlowRenderStatement getStatement();

  @Nullable
  FlowRenderStatementList getStatementList();

}
