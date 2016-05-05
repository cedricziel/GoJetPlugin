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

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.TokenSet;

import static io.github.jhsx.jet.lang.JetTypes.*;

public interface JetTokens {
    TokenSet tsSTRINGS = TokenSet.create(STRING, RAW_STRING);
    TokenSet tsCOMMENTS = TokenSet.create(COMMENT);
    TokenSet tsWHITESPACE = TokenSet.create(TokenType.WHITE_SPACE);
    TokenSet tsKEYWORDS = TokenSet.create(
            RANGE,
            IF,
            END,
            ELSE,
            YIELD,
            INCLUDE,
            BLOCK,
            EXTENDS,
            IMPORT,
            ISSET
    );
}
