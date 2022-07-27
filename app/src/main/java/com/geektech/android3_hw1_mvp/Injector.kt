package com.geektech.android3_hw1_mvp

import com.geektech.android3_hw1_mvp.model.CounterModel
import com.geektech.android3_hw1_mvp.presenter.Presenter

class Injector {

    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): CounterModel {
            return CounterModel()
        }
    }
}