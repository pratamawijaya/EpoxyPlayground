package com.tama.simplelist

import android.content.Context
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.TypedEpoxyController
import com.tama.simplelist.domain.News
import com.tama.simplelist.models.ListItemModel
import com.tama.simplelist.view.NewsItemView
import com.tama.simplelist.view.newsItemView

class ListNewsController(private val ctx: Context) : EpoxyController() {

    private val data: MutableList<ListItemModel> = mutableListOf()

    fun addData(data: MutableList<ListItemModel>) {
        this.data.addAll(data)
        requestModelBuild()
    }

    fun setData(data: MutableList<ListItemModel>) {
        this.data.clear()
        this.data.addAll(data)
        requestModelBuild()
    }

    override fun buildModels() {
        this.data.forEach {
            when (it) {
                is NewsItemView.Model -> {
                    newsItemView(ctx) {
                        id("")
                        model(it)
                    }
                }
            }
        }
    }
}