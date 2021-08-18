package com.steve.myhealth

import android.media.Image

class OnBoardingItem(val title:Int,val text:Int,val image:Int) {

    companion object{
        fun get():List<OnBoardingItem>{
            return listOf(
               OnBoardingItem(R.string.onBoardingTitle1,R.string.onBoardingText1,R.drawable.meru),
               OnBoardingItem(R.string.onBoardingTitle2,R.string.onBoardingText2,R.drawable.meru),
               OnBoardingItem(R.string.onBoardingTitle3,R.string.onBoardingText3,R.drawable.meru))
        }
    }
}

