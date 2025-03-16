/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.recorder

import io.github.dot166.jlib.themeengine.ThemeEngine.setCustomThemeClass
import io.github.dot166.jlib.app.jLIBCoreApp
import io.github.dot166.recorder.themes

class RecorderApplication : jLIBCoreApp() {
    override fun onCreate() {
        super.onCreate()
        setCustomThemeClass(themes())
    }
}
