package com.example.navigation

import android.content.Context
import android.content.Intent

interface NavigationLogin {
    fun navigateToLogin(context: Context): Intent
}