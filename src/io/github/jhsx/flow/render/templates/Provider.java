package io.github.jhsx.flow.render.templates;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 04/03/16.
 */
public class Provider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{"liveTemplates/flowRender"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }
}
