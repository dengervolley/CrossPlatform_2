package com.example.mvpdemo.activity1

interface FirstView {
    fun showToast(text: String)
    fun setText(text: String)
    fun navigateToSecondaryActivity()
}