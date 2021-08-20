package com.steve.myhealth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.ExperimentalPagerApi
import com.steve.myhealth.ui.theme.MyHealthTheme

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                window.statusBarColor=MaterialTheme.colors.background.toArgb()
                window.navigationBarColor=MaterialTheme.colors.background.toArgb()
                // A surface container using the 'background' color from the theme
            MyHealthTheme() {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    OnBoarding()
                }
            }


        }
    }
}

@ExperimentalPagerApi
@Composable
@Preview(showBackground = true)

fun PreviewOnBoarding(){
    MyHealthTheme {
        OnBoarding()
    }
}