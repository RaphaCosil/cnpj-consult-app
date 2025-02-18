package com.example.signup

import android.content.Context
import android.content.Intent
import com.example.navigation.NavigationSignUp

class NavigationSignUpImpl: NavigationSignUp {
    override fun navigateToSignUp(context: Context): Intent = SignUpActivity.getIntent(context)
}