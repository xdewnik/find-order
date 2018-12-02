package com.kulya.dev.findorder.adapter

import android.view.View
import com.bumptech.glide.Glide
import com.kulya.dev.findorder.R
import com.kulya.dev.findorder.data.Good
import kotlinx.android.synthetic.main.item_good.view.*


class DetailFragmentAdapter constructor(
            goodList:MutableList<Good>
):AbstractAdapter<Good>(goodList, R.layout.item_good) {

    override fun View.bind(item: Good, position: Int, holder: Holder) {
        good_name.text = item.name
        good_price.text = item.price
        good_quantity.text = item.quantity
        Glide.with(itemView.context).load(item.image).into(good_image)
    }
}