package io.github.jhsx.flow.render.lang;

import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 04/03/16.
 */
public class Commenter implements com.intellij.lang.Commenter {
    @Nullable
    @Override
    public String getLineCommentPrefix() {
        return null;
    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return "{*";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return "*}";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return "{*";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return "*}";
    }
}
