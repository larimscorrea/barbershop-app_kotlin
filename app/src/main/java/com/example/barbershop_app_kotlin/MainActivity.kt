package com.example.barbershop_app_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.barbershop_app_kotlin.ui.theme.Barbershopapp_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Barbershopapp_kotlinTheme {
                MainActivityContent()
            }
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Barbershopapp_kotlinTheme {
        Greeting("Android")
    }
}

@Composable
fun MainActivityContent() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        // Carrega a imagem drawable
        val drawableResId = R.drawable.activity_main
        Image(
            painter = painterResource(id = drawableResId),
            contentDescription = null // Descrição do conteúdo, opcional
        )
    }
}