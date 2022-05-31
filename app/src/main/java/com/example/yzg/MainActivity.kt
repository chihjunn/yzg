package com.example.yzg

import android.content.pm.ActivityInfo
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.yzg.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding

    var check:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var job: Job
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        //設定螢幕水平顯示
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

    }


}