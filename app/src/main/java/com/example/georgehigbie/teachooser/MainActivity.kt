package com.example.georgehigbie.teachooser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val teaList = arrayListOf("Oolong", "Matcha", "Sencha", "Hojicha", "Mugicha", "Irish Breakfast", "English Breakfast", "Darjeeling")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomTea = random.nextInt(teaList.count())
            displayText.text = teaList[randomTea]
        }

        addBtn.setOnClickListener {
            val newTea = addTeaText.text.toString()
            if(newTea.isNotEmpty()) {
                teaList.add(newTea)
                addTeaText.text.clear()
                println(teaList)
            }
        }
    }
}
