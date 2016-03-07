package io.github.jhsx.flow.render.templates;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import io.github.jhsx.flow.render.FlowRenderLanguage;
import io.github.jhsx.flow.render.FlowRenderTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by josesantos on 04/03/16.
 */
public class Context extends TemplateContextType {
    protected Context() {
        super("FLOWRENDER", "flowRender");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile psiFile, int i) {
        PsiElement elementAt = psiFile.findElementAt(i);
        return elementAt != null && psiFile.getLanguage().is(FlowRenderLanguage.INSTANCE) && elementAt.getNode().getElementType().equals(FlowRenderTypes.TEXT);
    }
}
