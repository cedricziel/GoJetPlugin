/*
 * Copyright 2013-2015 Sergey Ignatov, Alexander Zolotov, Florin Patan
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

package io.github.jhsx.flow.render;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.github.jhsx.flow.render.file.FlowRenderFileElementType;
import io.github.jhsx.flow.render.lexer.FlowRenderLexer;
import io.github.jhsx.flow.render.parser.FlowRenderParser;
import io.github.jhsx.flow.render.psi.FlowRenderFile;
import org.jetbrains.annotations.NotNull;

import static io.github.jhsx.flow.render.FlowRenderTypes.Factory;

public class FlowRenderParserDefinition implements ParserDefinition {

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FlowRenderLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new FlowRenderParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FlowRenderFileElementType.INSTANCE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return FlowRenderTokens.tsWHITESPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return FlowRenderTokens.tsCOMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return FlowRenderTokens.tsSTRINGS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider provider) {
        return new FlowRenderFile(provider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode node, ASTNode node1) {
        return SpaceRequirements.MAY;
    }
}
