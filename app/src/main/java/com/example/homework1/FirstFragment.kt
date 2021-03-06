package com.example.homework1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class FirstFragment : Fragment() {


    lateinit var  communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)

        val btn      = view.findViewById<Button>(R.id.sendDate_btn)
        val editText = view.findViewById<EditText>(R.id.editText)

        communicator = activity as Communicator

        btn.setOnClickListener{ communicator.passData(editText.text.toString()) }
        return view
    }

}