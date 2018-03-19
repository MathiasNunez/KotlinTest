package com.kotlin.test.fragments

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.test.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_kotlin_example.*

/**
 * Created by mnunez on 2/6/18.
 */

class FirstFragment : Fragment() {

    var activityCallback: FirstFragment.FragmentListener? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_kotlin_example,
                container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentButton.setOnClickListener{
            activityCallback?.onFragmentButtonClick()
        }

        text.text = "Changed in code using Kotlin Extensions"


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