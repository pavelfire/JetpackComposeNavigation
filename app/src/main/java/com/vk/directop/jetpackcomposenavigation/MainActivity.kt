package com.vk.directop.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vk.directop.jetpackcomposenavigation.ui.theme.JetpackComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationTheme {
                Navigation()
            }
        }
    }
}
