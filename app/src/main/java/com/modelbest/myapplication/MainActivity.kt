package com.modelbest.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun funx() {
        print("1")
        print("11")
        print("hello,world")
    }

    fun funxx() {
        print("2")
        print("22")
        print("222")

    }

    fun mytest1() {
        // main 分支上的修改
        print("main branch - mytest1")
        print("main branch - 新增功能")
        print("main branch - 重要更新")
    }

    fun funxxx() {
        print("3")
        print("33")
        print("3333")
    }

    fun mytest2() {
        print("mytest2")
        print("mytest22")
        print("mytest223")
    }
    
    // 添加此函数来演示 Android Studio Git 功能
    fun gitDemoFunction() {
        print("这是一个用于演示 Git 功能的函数")
        print("Android Studio Git 工具很强大")
    }
}