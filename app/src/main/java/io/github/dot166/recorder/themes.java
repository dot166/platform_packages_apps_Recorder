package io.github.dot166.recorder;

import android.content.Context;

import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;

import org.lineageos.recorder.R;

import io.github.dot166.jLib.ThemeEngine.values;

public class themes implements values {
    @Override
    public int jLibTheme() {
        return R.style.jAppTheme;
    }

    @Override
    public int M3() {
        return R.style.AppTheme;
    }

    @Override
    public Typography ComposeTypography(Context context) {
        return null;
    }

    @Override
    public Shapes ComposeShapes(Context context) {
        return null;
    }
}
