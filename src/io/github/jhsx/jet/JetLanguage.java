/*
 *
 *  * Copyright 2016 José Santos
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package io.github.jhsx.jet;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.psi.templateLanguages.TemplateLanguage;
import io.github.jhsx.jet.lang.file.JetFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JetLanguage extends Language implements TemplateLanguage {
    public static final Language INSTANCE = new JetLanguage();

    private JetLanguage() {
        super("JetTemplateLanguage");
    }

    public static LanguageFileType getDefaultTemplateLang() {
        return StdFileTypes.HTML;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Jet template engine";
    }

    @Nullable
    @Override
    public LanguageFileType getAssociatedFileType() {
        return JetFileType.INSTANCE;
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
