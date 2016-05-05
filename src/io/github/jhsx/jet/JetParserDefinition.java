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
import io.github.jhsx.jet.lang.file.JetFileElementType;
import io.github.jhsx.jet.lang.lexer.JetLexer;
import io.github.jhsx.jet.lang.parser.JetParser;
import io.github.jhsx.jet.lang.psi.JetFile;
import org.jetbrains.annotations.NotNull;

import static io.github.jhsx.jet.lang.JetTypes.Factory;

public class JetParserDefinition implements ParserDefinition {

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new JetLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new JetParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return JetFileElementType.INSTANCE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return JetTokens.tsWHITESPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return JetTokens.tsCOMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return JetTokens.tsSTRINGS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider provider) {
        return new JetFile(provider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode node, ASTNode node1) {
        return SpaceRequirements.MAY;
    }
}
