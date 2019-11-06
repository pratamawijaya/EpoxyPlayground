package com.tama.simplelist

import com.airbnb.epoxy.TypedEpoxyController
import com.tama.simplelist.models.News
import com.tama.simplelist.viewholder.NewsItemModel_

class ListNewsController : TypedEpoxyController<List<News>>() {

    override fun buildModels(news: List<News>) {

        news.forEach {
            NewsItemModel_()
                .title(it.title)
                .url(it.imgUrl)
        }
    }

}