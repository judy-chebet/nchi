package com.example.nchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (Kenyacheckbox.isChecked)textresult.text="Kenya : Yes we talk English"
        if (Ugandacheckbox.isChecked)textresult.text="Uganda : Yes but we prefer Uganda"
        if (Tanzaniacheckbox.isChecked)textresult.text="Tanzania :Yes but we love swahili"
    }
    fun onclicked(view:View){
        if (yes.isChecked)textresult1.text="Yes : Is a certified Developer"
        if (no.isChecked)textresult1.text="No : I snot a certified Developer"
    }
}