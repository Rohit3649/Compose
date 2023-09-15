package com.example.composeprogrammingsimplefied.PS_viewPager

import androidx.annotation.DrawableRes
import com.example.composeprogrammingsimplefied.R

data class PageItem(
    @DrawableRes val image:Int,
    val des:String
)

val pageItemList = listOf(
    PageItem(R.drawable.page_one,"PAGE ONE"),
    PageItem(R.drawable.page_two,"PAGE TWO"),
    PageItem(R.drawable.page_one,"PAGE THREE")
)