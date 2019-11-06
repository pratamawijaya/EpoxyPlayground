package com.tama.simplelist.viewholder

import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import coil.api.load
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.tama.simplelist.BaseEpoxyHolder
import com.tama.simplelist.R

@EpoxyModelClass(layout = R.layout.news_item)
abstract class NewsItemModel : EpoxyModelWithHolder<NewsItemModel.Holder>() {

    @EpoxyAttribute
    lateinit var title: String
    @EpoxyAttribute
    lateinit var url: String

    override fun bind(holder: Holder) {
        super.bind(holder)

        Log.d("tag","set data $title")
        Log.d("tag","set img thumb $url")

        holder.tvTitle.text = title
        holder.imgThumb.load(url)
    }

    class Holder : BaseEpoxyHolder() {
        val tvTitle: TextView by bind(R.id.tvTitle)
        val imgThumb: ImageView by bind(R.id.imgThumb)
    }
}