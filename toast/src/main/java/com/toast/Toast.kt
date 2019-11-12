package com.toast

import android.content.Context
import android.util.TimeUtils
import android.widget.Toast
import java.util.concurrent.TimeUnit

class Toast {
    fun shortToast(context: Context , message: String){
        Toast.makeText(context , message , Toast.LENGTH_SHORT).show()
    }
    fun longToast(context: Context , message: String){
        Toast.makeText(context , message , Toast.LENGTH_LONG).show()
    }
    
}