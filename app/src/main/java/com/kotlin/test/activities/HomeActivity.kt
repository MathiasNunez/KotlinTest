package com.kotlin.test.activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin.test.R
import com.kotlin.test.fragments.FirstFragment

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
        Toast.makeText(context, this.toString(), Toast.LENGTH_LONG).show()
    }
}
