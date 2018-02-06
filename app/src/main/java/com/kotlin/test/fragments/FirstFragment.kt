package com.kotlin.test.fragments

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.kotlin.test.R

/**
 * Created by mnunez on 2/6/18.
 */

class FirstFragment : Fragment() {

    var activityCallback: FirstFragment.FragmentListener? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_kotlin_example,
                container, false)

        val fragmentCallbackButton = view?.findViewById<Button>(R.id.fragmentButton)
        fragmentCallbackButton?.setOnClickListener {
            activityCallback?.onFragmentButtonClick()
        }

        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try {
            activityCallback = context as FragmentListener
        } catch (e: ClassCastException) {
            throw ClassCastException(context?.toString()
                    + " must implement FragmentListener")
        }
    }

    interface FragmentListener {
        fun onFragmentButtonClick()
    }

}