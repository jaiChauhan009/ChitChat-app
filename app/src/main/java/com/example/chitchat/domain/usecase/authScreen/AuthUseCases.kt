package com.example.chitchat.domain.usecase.authScreen

import com.example.chitchat.domain.usecase.authScreen.SignIn
import com.example.chitchat.domain.usecase.authScreen.SignUp

data class AuthUseCases(
    val isUserAuthenticated: IsUserAuthenticatedInFirebase,
    val signIn: SignIn,
    val signUp: SignUp,
)