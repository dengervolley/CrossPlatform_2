package com.example.mvpdemo.activity2

import com.example.mvpdemo.Repository

class SecondPresenter(private val view: SecondView) {

    private val repository = Repository()
    fun init() {
        val action = repository.getSecondAction()
        when {
            action.first == 1 -> {
                view.showToast(action.second)
            }
            action.first == 2 -> {
                view.setText(action.second)
            }
        }
    }
}