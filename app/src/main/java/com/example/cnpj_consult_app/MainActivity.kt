package com.example.cnpj_consult_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.navigation.NavigationLogin
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {
    private val navigationLogin: NavigationLogin by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(
            navigationLogin.navigateToLogin(this)
        )
    }
}
