package com.tama.sampleepoxycarousel.models

import android.widget.TextView
import com.airbnb.epoxy.*
import com.tama.sampleepoxycarousel.R

@EpoxyModelClass(layout = R.layout.card_layout_item)
abstract class ViewPagerItem : EpoxyModelWithHolder<ViewPagerItem.Holder>() {

    @EpoxyAttribute
    lateinit var title: String

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.textTitle.text = title
    }

    class Holder : BaseEpoxyHolder() {
        val textTitle: TextView by bind(R.id.textTitle)
    }
}