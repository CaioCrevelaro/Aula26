package com.br.aula26

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        transaction.add(R.id.container_1, FragmentExample())
        transaction.add(R.id.container_2, FragmentExample_2())
        transaction.add(R.id.container_3,FragmentExample_3())
        transaction.commit()

//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            val fragmentManager = supportFragmentManager
//            val transaction = fragmentManager.beginTransaction()
//
//            transaction.replace(R.id.container_2, FragmentExample())
//            transaction.replace(R.id.container_1, FragmentExample_2())
//            transaction.add(R.id.container_3,FragmentExample_3())
//
//            transaction.commit()
//        }
    }
}