package com.tama.simplelist

import android.content.Context
import com.airbnb.epoxy.TypedEpoxyController
import com.tama.simplelist.domain.News
import com.tama.simplelist.view.NewsItemView
import com.tama.simplelist.view.newsItemView

class ListNewsController(val ctx: Context) : TypedEpoxyController<List<News>>() {

    override fun buildModels(news: List<News>) {
        news.map { newsData ->
            newsItemView(ctx) {
                id("")
                model(
                    NewsItemView.Model(id = "", title = newsData.title, imgUrl = newsData.imgUrl)
                )
            }
        }
    }

}