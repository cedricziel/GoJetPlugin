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

package io.github.jhsx.flow.render.lexer;

import io.github.jhsx.flow.render.FlowRenderTypes;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.MergingLexerAdapter;
import com.intellij.psi.tree.TokenSet;

public class FlowRenderLexer extends MergingLexerAdapter {
  public FlowRenderLexer() {
    super(new FlexAdapter(new _FlowRenderLexer()), TokenSet.create(FlowRenderTypes.COMMENT));
  }
}