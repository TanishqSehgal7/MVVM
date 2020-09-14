package com.example.mvvm.ui.auth

interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun onFaliure(message:String)

}