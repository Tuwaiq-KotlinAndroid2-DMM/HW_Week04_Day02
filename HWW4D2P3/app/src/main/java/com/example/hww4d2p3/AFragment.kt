package com.example.hww4d2p3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class AFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_a, container, false)


       var b= v.findViewById<Button>(R.id.button)
        b.setOnClickListener {

            println("Hello From Fragment" + arguments?.getString("username")
            )
        }
        return v
    }


}