package com.example.mvpdemo.activity2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpdemo.R
import com.google.android.material.snackbar.Snackbar

class SecondActivity : AppCompatActivity(), SecondView {
    private val presenter = SecondPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        presenter.init()
    }

    override fun showToast(text: String) {
        Snackbar.make(findViewById(R.id.root), text, 3000).show()
    }

    override fun setText(text: String) {
        findViewById<TextView>(R.id.mainTV).text = text
    }
}