package io.github.jhsx.flow.render.lang;

import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.LanguageSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 22/04/16.
 */
public class FlowSubstitutor extends LanguageSubstitutor {
    @Nullable
    @Override
    public Language getLanguage(@NotNull VirtualFile virtualFile, @NotNull Project project) {
        return null;
    }
}
