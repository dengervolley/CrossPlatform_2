package com.example.mvpdemo.activity1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpdemo.R
import com.example.mvpdemo.activity2.SecondActivity
import com.google.android.material.snackbar.Snackbar

class FirstActivity : AppCompatActivity(), FirstView {
    
    private val presenter = FirstPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.action1Btn).setOnClickListener {
            presenter.action1()
        }
        findViewById<Button>(R.id.action2Btn).setOnClickListener {
            presenter.action2()
        }
        presenter.init()
    }

    override fun showToast(text: String) {
        Snackbar.make(findViewById(R.id.root), text, 3000).show()
    }

    override fun setText(text: String) {
        findViewById<TextView>(R.id.mainTV).text = text
    }

    override fun navigateToSecondaryActivity() {
        startActivity(Intent(this, SecondActivity::class.java).apply {
            setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        })
    }
}