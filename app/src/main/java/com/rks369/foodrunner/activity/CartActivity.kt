package com.rks369.foodrunner.activity

import androidx.appcompat.app.AppCompatActivity
import com.rks369.foodrunner.util.setEdgeToEdgeContentView
import android.os.Bundle
import com.rks369.foodrunner.R

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setEdgeToEdgeContentView(R.layout.activity_cart)
    }
}