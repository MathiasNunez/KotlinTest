package test.kotlin.com.kotlinlibtest

import android.content.Context
import android.widget.Toast

/**
 * Created by mnunez on 3/19/18.
 */

class LibTest {

    companion object {
        fun testLib(context: Context, text: String) {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
        }
    }
}