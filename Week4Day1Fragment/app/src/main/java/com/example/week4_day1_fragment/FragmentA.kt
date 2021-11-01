package com.example.week4_day1_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_blank, container, false)

/*
        var a = v.findViewById<Button>(R.id.buttonA)
        a.setOnClickListener {

        }

 */     println("Hello from Fragment B"+arguments?.getString("username"))

        return  v
    }

}