package io.github.jhsx.flow.render.lang;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import io.github.jhsx.flow.render.FlowRenderTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 04/03/16.
 */
public class BraceMatcher implements PairedBraceMatcher {
    @Override
    public BracePair[] getPairs() {
        return new BracePair[]{new BracePair(FlowRenderTypes.LDOUBLE_BRACE, FlowRenderTypes.RDOUBLE_BRACE, false)};
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType1) {
        return false;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return 0;
    }

}
