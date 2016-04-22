package io.github.jhsx.flow.render.lang;

import com.intellij.codeInsight.editorActions.smartEnter.SmartEnterProcessor;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import io.github.jhsx.flow.render.FlowRenderTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by josesantos on 04/03/16.
 */
public class FlowEnterHandler extends SmartEnterProcessor {
    @Override
    public boolean process(@NotNull Project project, @NotNull Editor editor, @NotNull PsiFile psiFile) {
        PsiElement statementAtCaret = getStatementAtCaret(editor, psiFile);
        if (statementAtCaret != null && statementAtCaret.getNode().getElementType() == FlowRenderTypes.LDOUBLE_BRACE) {
            editor.getDocument().insertString(statementAtCaret.getTextRange().getEndOffset(), "}}");
            return false;
        }
        return false;
    }
}
