package com.example.signup

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
    var name: MutableState<String> = mutableStateOf("")
    var email: MutableState<String> = mutableStateOf("")
    var password: MutableState<String> = mutableStateOf("")
    var confirmPassword: MutableState<String> = mutableStateOf("")
    var isRegistered: MutableState<Boolean> = mutableStateOf(false)

    fun register() {
        if (password.value == confirmPassword.value && email.value.isNotEmpty() && name.value.isNotEmpty()) {
            isRegistered.value = true
        }
    }
}
