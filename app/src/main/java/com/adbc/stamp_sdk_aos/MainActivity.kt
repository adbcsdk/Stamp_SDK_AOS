package com.adbc.stamp_sdk_aos

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.adbc.stampsdk.StampSDK

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.init).setOnClickListener {

            StampSDK.init(this@MainActivity, "1132", "10414", "qtbt_aos", object: StampSDK.InitListener {
                override fun onResult(result: Boolean, msg: String) {
                    if (result) {
                        StampSDK.showStampActivity(this@MainActivity)
                    }
                }
            })
        }
    }
}
