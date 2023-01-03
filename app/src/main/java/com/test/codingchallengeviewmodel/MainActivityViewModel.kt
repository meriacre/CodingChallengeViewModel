package com.test.codingchallengeviewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private var result: Int = 0

    fun getResult(): Int{
        return result
    }
    fun addToResult(number: Int){
        result += number
    }
}