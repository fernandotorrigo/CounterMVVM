package com.ftorrigo.countermvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ftorrigo.countermvvm.ui.screens.CounterScreen
import com.ftorrigo.countermvvm.ui.theme.CounterMVVMTheme
import com.ftorrigo.countermvvm.ui.viewmodel.CounterScreenViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: CounterScreenViewModel = viewModel()
            CounterMVVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CounterScreen(viewModel)
                }
            }
        }
    }
}
