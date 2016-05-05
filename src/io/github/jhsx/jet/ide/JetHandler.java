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

package io.github.jhsx.jet.ide;

import com.intellij.codeInsight.editorActions.smartEnter.SmartEnterProcessor;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import io.github.jhsx.jet.lang.JetTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by josesantos on 04/03/16.
 */
public class JetHandler extends SmartEnterProcessor {
    @Override
    public boolean process(@NotNull Project project, @NotNull Editor editor, @NotNull PsiFile psiFile) {
        PsiElement statementAtCaret = getStatementAtCaret(editor, psiFile);
        if (statementAtCaret != null && statementAtCaret.getNode().getElementType() == JetTypes.LDOUBLE_BRACE) {
            editor.getDocument().insertString(statementAtCaret.getTextRange().getEndOffset(), "}}");
            return false;
        }
        return false;
    }
}
