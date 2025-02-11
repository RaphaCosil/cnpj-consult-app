package com.example.cnpj_consult_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.navigation.NavigationLogin

class MainActivity : ComponentActivity() {
    private val navigationLogin: NavigationLogin? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(
            navigationLogin?.navigateToLogin(this)
        )
    }
}
