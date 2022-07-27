package com.geektech.android3_hw1_mvp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.android3_hw1_mvp.databinding.ActivityMainBinding
import com.geektech.android3_hw1_mvp.presenter.Presenter
import com.geektech.android3_hw1_mvp.view.CounterView

class MainActivity : AppCompatActivity(),CounterView {
    lateinit var binding:ActivityMainBinding
    val presenter=Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnIncrement.setOnClickListener {
                presenter.increment()
            }

        }
    }


    override fun updateCount(count: Int) {
        binding.CounterTv.text=count.toString()
    }

    override fun showToast() {
        showToast("Congrate")

    }

    override fun showGreen() {
        binding.CounterTv.setBackgroundColor(Color.GREEN)

    }
}