package io.github.dot166.recorder;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;

import org.lineageos.recorder.R;

import io.github.dot166.jlib.themeengine.values;

public class themes implements values {
    @Override
    public int jLibTheme() {
        return R.style.jAppTheme;
    }

    @Override
    public int jLibClassicTheme() {
        return R.style.jAppClassicTheme;
    }

    @Override
    public int M3() {
        return R.style.AppTheme;
    }

    @Nullable
    @Override
    public Typography composeTypography(@Nullable Context context, @Nullable Composer composer, int i) {
        return null;
    }

    @Nullable
    @Override
    public Shapes composeShapes(@Nullable Context context, @Nullable Composer composer, int i) {
        return null;
    }
}
