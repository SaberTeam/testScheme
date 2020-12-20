package com.daimler.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         button_tips.setOnClickListener {
             val url = "app://com.clover/tips?total_amount=100&currency=CAD"
                val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse(url))
                startActivity(intent)
         }
         button_refund.setOnClickListener {
             val url = "app://com.clover/refund"
                val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse(url))
                startActivity(intent)
         }
         button_transaction_detail.setOnClickListener {
             val url = "app://com.clover/transaction/detail?total_amount=100&currency=CAD&description=test&note=test"
                val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse(url))
                startActivity(intent)
         }
         button_transaction_refund.setOnClickListener {
             val url = "app://com.clover/transaction/refund?order_id=1&refund_mount=100&tip_amount=1&channel=Wechat&transaction_time=2020/12/20 12:00:00&total_amount=100&currency=CAD&description=test&note=test"
                val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse(url))
                startActivity(intent)
         }
    }
}