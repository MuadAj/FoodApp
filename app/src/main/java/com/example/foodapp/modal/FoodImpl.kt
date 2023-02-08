package com.example.foodapp.modal

import com.example.foodapp.R

class FoodImpl: FoodIntrface {


    val nameList = mutableListOf(
        ListF("سمك مشوي - 55$", R.drawable.images),
        ListF("أرز - 35$", R.drawable.rice),
        ListF("بيتزا - 25$", R.drawable.pizza),
        ListF("برجر لحم - 15$", R.drawable.birger),
        ListF("برجر دجاج - 10$", R.drawable.chekin),
        ListF("دجاج مشوي - 25$", R.drawable.chek2),
        ListF("دجاج محمر - 25$", R.drawable.chek),
        ListF("شاورما دجاج - 10$", R.drawable.fb_img_1675773444227),
        ListF("شاورما لحم - 15$", R.drawable.fb_img_1675773474081_edit_153938328478072),
        ListF("سكالوب دجاج - 15$", R.drawable.scalob),
        ListF("ساندوتش مفروم - 5$", R.drawable.fb_img_1675773601684_edit_153963050064006),
        ListF("ساندوتش تن - 5$", R.drawable.fb_img_1675773583328),
        ListF("ساندوتش كبدة - 10$", R.drawable.fb_img_1675773335953),
    )


    override fun getFoodList(): List<ListF> {
    return nameList
    }

}