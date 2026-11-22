package com.rks369.foodrunner.util

import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

// targetSdk 35+ always draws behind the system bars, so pad the content to keep it clear of them.
fun AppCompatActivity.setEdgeToEdgeContentView(@LayoutRes layoutResId: Int) {
    enableEdgeToEdge()
    setContentView(layoutResId)
    val content = findViewById<View>(android.R.id.content)
    ViewCompat.setOnApplyWindowInsetsListener(content) { view, insets ->
        val bars = insets.getInsets(
            WindowInsetsCompat.Type.systemBars() or
                WindowInsetsCompat.Type.displayCutout() or
                WindowInsetsCompat.Type.ime()
        )
        view.updatePadding(bars.left, bars.top, bars.right, bars.bottom)
        WindowInsetsCompat.CONSUMED
    }
}
