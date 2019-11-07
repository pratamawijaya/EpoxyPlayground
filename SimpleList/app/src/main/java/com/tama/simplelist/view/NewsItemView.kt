package com.tama.simplelist.view

import android.content.Context
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import coil.api.load
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.tama.simplelist.KotlinEpoxyHolder
import com.tama.simplelist.R
import com.tama.simplelist.models.ListItemModel

@EpoxyModelClass(layout = R.layout.news_item)
abstract class NewsItemView(private val ctx:Context) : EpoxyModelWithHolder<NewsItemView.Holder>() {

    @EpoxyAttribute
    lateinit var model:Model

    override fun bind(holder: Holder) {
        super.bind(holder)

        Log.d("tag", "set data ${model.title}")
        Log.d("tag", "set img thumb ${model.imgUrl}")

        holder.tvTitle.text = model.title
        holder.imgThumb.load(model.imgUrl)
    }

    inner class Holder : KotlinEpoxyHolder() {
        val tvTitle: TextView by bind(R.id.tvTitle)
        val imgThumb: ImageView by bind(R.id.imgThumb)
    }

    data class Model(
        override val id: String,
        val title:String,
        val imgUrl:String
    ) : ListItemModel
}