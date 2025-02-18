package com.example.login

import android.content.Context
import android.content.Intent
import com.example.navigation.NavigationLogin

class NavigationLoginImpl: NavigationLogin {
    override fun navigateToLogin(context: Context): Intent = LoginActivity.getIntent(context)
}