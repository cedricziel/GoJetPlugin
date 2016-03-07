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

package io.github.jhsx.flow.render.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import io.github.jhsx.flow.render.FlowRenderTypes;
import io.github.jhsx.flow.render.lexer.FlowRenderLexer;
import org.jetbrains.annotations.NotNull;

import static io.github.jhsx.flow.render.FlowRenderTokens.tsKEYWORDS;
import static io.github.jhsx.flow.render.FlowRenderTokens.tsSTRINGS;

public class FlowRenderSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey OPENCLOSETAG = TextAttributesKey.createTextAttributesKey("OPEN_CLOSE_TEMPLATE",
            DefaultLanguageHighlighterColors.METADATA);

    public static final TextAttributesKey[] OPENCLOSETAG_KEYS = new TextAttributesKey[]{OPENCLOSETAG};

    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("STRING",
            DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};


    public static final TextAttributesKey KEYWORDS = TextAttributesKey.createTextAttributesKey("KEYWORDS",
            DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey[] KEYWORDS_KEYS = new TextAttributesKey[]{KEYWORDS};


    public static final TextAttributesKey IDENT = TextAttributesKey.createTextAttributesKey("IDENT",
            DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey[] IDENT_KEYS = new TextAttributesKey[]{IDENT, DefaultLanguageHighlighterColors.GLOBAL_VARIABLE};

    public static final TextAttributesKey COMMENTS = TextAttributesKey.createTextAttributesKey("COMMENTS",
            DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey[] COMMENTS_KEYS = new TextAttributesKey[]{COMMENTS};


    private static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlowRenderLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType type) {
        if (type == FlowRenderTypes.RDOUBLE_BRACE || type == FlowRenderTypes.LDOUBLE_BRACE) {
            return OPENCLOSETAG_KEYS;
        }
        if (tsSTRINGS.contains(type)) {
            return STRING_KEYS;
        }
        if (tsKEYWORDS.contains(type)) {
            return KEYWORDS_KEYS;
        }

        if (type == FlowRenderTypes.IDENT) {
            return IDENT_KEYS;
        }

        if (type == FlowRenderTypes.COMMENT) {
            return COMMENTS_KEYS;
        }
        return EMPTY;
    }
}
