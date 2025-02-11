package com.example.login

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var email: MutableState<String> =  mutableStateOf("")
    var password: MutableState<String> = mutableStateOf("")
    var isLoggedIn: MutableState<Boolean> = mutableStateOf(false)

    fun login() {
        if (email.value == "teste@email.com" && password.value == "123456") {
            isLoggedIn.value = true
        }
    }

}