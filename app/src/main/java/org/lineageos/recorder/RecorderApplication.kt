/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.recorder

import com.google.android.material.color.DynamicColors
import io.github.dot166.jLib.ThemeEngine.ThemeEngine.setCustomThemeClass
import io.github.dot166.jLib.app.jLIBCoreApp
import io.github.dot166.recorder.themes

class RecorderApplication : jLIBCoreApp() {
    override fun onCreate() {
        super.onCreate()
        setCustomThemeClass(themes())

        // Observe dynamic colors changes
        //DynamicColors.applyToActivitiesIfAvailable(this)
    }
}
