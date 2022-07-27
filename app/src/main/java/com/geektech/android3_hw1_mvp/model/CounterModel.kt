package com.geektech.android3_hw1_mvp.model

class CounterModel {
    var count=0
    fun increment(){
        ++count
    }
    fun deccrement(){
        --count
    }
    @JvmName("getCount1")
    fun getCount(): Int{
        return count
    }


}