package com.geektech.android3_hw1_mvp.presenter

import com.geektech.android3_hw1_mvp.Injector
import com.geektech.android3_hw1_mvp.model.CounterModel
import com.geektech.android3_hw1_mvp.view.CounterView

class Presenter {

    lateinit var view: CounterView
    val model=Injector.getModel()

    fun increment(){
        model.increment()
        view.updateCount(model.count)
        if(model.getCount()==10){
            view.showToast()
            }
        if(model.getCount()==15){
            view.showGreen()
        }
    }
    fun decrement(){
        model.deccrement()
        view.updateCount(model.count)
    }
    fun attachView(counterView: CounterView){
        view=counterView
    }
}