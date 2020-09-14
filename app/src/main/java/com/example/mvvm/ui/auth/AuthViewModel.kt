package com.example.mvvm.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvm.contentpack.repository.UserRepository

class AuthViewModel: ViewModel() {

    var email:String?=null
    var password:String?=null
    var authListener:AuthListener?=null

    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFaliure("Invalid email or password")
            return
        }

        //success
        val loginResponse=UserRepository().UserLogin(email!!, password!!)
        authListener?.onSuccess(loginResponse)

    }

}