package com.example.mvpdemo.activity1

import com.example.mvpdemo.Repository

class FirstPresenter(private val view: FirstView) {
    private val repository = Repository()

    fun init() {
        val action = repository.requestAction()
        when {
            action.first == 1 -> {
                view.showToast(action.second)
            }
            action.first == 2 -> {
                view.setText(action.second)
            }
            else -> {
                view.navigateToSecondaryActivity()
            }
        }
    }

    fun action1() {
        view.showToast("action 1")
    }

    fun action2() {
        view.setText("action 2")
    }
}