package com.sangeetha.recyclerview

import android.view.View
import kotlinx.android.synthetic.main.layout_item.view.*

class MainActivityAdapter(
    layoutId: Int,
    data: List<String>
): WrapperRecyclerAdapter<String>(layoutId, data) {

    override fun setDataToView(itemView: View, item: String) {
        itemView.textview.text = item
    }
}