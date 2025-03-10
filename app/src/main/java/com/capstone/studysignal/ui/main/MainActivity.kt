package com.capstone.studysignal.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import com.capstone.studysignal.R
import com.capstone.studysignal.databinding.ActivityMainBinding

// 생명주기 = lifeCycle
class MainActivity : AppCompatActivity() {
    /**
     *
     * 1. 뷰바인딩으로 xml의 id를 연결해서 쓸 수 있게 만든다.
     * 2. 바텀뷰의 id 값을 얻어서, 클릭 리스너를 만든다.
     * 3. 클릭 리스너에서 콜백(함수)에서 포지션에 맞게 해당하는 프레그먼트를 실행시킨다.
     *
     */
    lateinit var binding : ActivityMainBinding

    enum class MENU(val value: Int) {
        TODO(0),
        CALENDER(1),
        STATISTICS(2),
        STUDY(3),
        SETTING(4)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bvMain.setOnItemSelectedListener { position ->
            Log.d("happy","position : $position")
            if(position == MENU.TODO.value) {
                Log.d("happy","create todo fragment ")
            } else if(position == MENU.CALENDER.value) {
                Log.d("happy","create calendar fragment ")
            } else if(position == MENU.STATISTICS.value) {
                Log.d("happy","create statistics fragment ")
            } else if(position == MENU.STUDY.value) {
                Log.d("happy","create study fragment ")
            } else if(position == MENU.SETTING.value) {
                Log.d("happy","create setting fragment ")
            }
        }
    }




}