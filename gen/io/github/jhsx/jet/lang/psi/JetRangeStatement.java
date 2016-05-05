// This is a generated file. Not intended for manual editing.
package io.github.jhsx.jet.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JetRangeStatement extends JetStatement {

  @NotNull
  List<JetExpression> getExpressionList();

  @Nullable
  JetPipeline getPipeline();

  @Nullable
  JetStatement getStatement();

  @Nullable
  JetStatementList getStatementList();

}
