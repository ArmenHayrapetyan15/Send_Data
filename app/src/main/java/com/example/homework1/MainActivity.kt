package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity(),Communicator {


    override fun passData(text: String) {
        val bundle = Bundle()
        bundle.putString("message",text)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment2 = SecondFragment()
        fragment2.arguments = bundle

        transaction.replace(R.id.frameLayout, fragment2).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, FirstFragment())
            .commit()



    }
}