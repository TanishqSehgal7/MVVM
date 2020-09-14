package com.example.mvvm.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {

    var email:String?=null
    var password:String?=null
    var authListener:AuthListener?=null

    fun onLoginButtonClick(view: View){
        authListener?.onSuccess()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFaliure("Invalid email or password")
            return
        }
        authListener?.onSuccess()
        //success

    }

}