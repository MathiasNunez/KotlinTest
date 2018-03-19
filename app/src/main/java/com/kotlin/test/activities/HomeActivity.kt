package com.kotlin.test.activities

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.test.R
import com.kotlin.test.fragments.FirstFragment
import test.kotlin.com.kotlinlibtest.LibTest

class HomeActivity : AppCompatActivity(), FirstFragment.FragmentListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val firstFragment = FirstFragment()
        firstFragment.arguments = intent.extras
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, firstFragment)
        transaction.commit()
    }

    override fun onFragmentButtonClick() {
        "Activity Callback executed".showToast(this)
    }

    fun Any.showToast(context: Context) {
        LibTest.testLib(context, "it works!")
    }
}
