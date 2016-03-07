/*
 * Copyright 2013-2015 José Santos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jhsx.flow.render.file;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.TemplateLanguageFileType;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import io.github.jhsx.flow.render.FlowRenderLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FlowRenderFileType extends LanguageFileType implements TemplateLanguageFileType {
    public static final LanguageFileType INSTANCE = new FlowRenderFileType();

    protected FlowRenderFileType() {
        super(FlowRenderLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "flowRender";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Flow template engine files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "flowRender";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AllIcons.Icons.Ide.NextStep;
    }

    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] content) {
        return CharsetToolkit.UTF8;
    }
}
