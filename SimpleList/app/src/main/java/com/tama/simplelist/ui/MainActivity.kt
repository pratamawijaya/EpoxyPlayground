package com.tama.simplelist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tama.simplelist.ListNewsController
import com.tama.simplelist.R
import com.tama.simplelist.domain.News
import com.tama.simplelist.models.ListItemModel
import com.tama.simplelist.view.NewsItemView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val listController: ListNewsController by lazy { ListNewsController(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val news = News(
            title = "Risa Santoso, Perempuan 27 Tahun yang Jadi Rektor Termuda di Indonesia",
            imgUrl = "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1573004873/qtzurkz0q2sajkem8y7v.jpg"
        )

        val listItem = mutableListOf<ListItemModel>()

        for (i in 0..2) {
            listItem.add(
                NewsItemView.Model(
                    "",
                    title = news.title,
                    imgUrl = news.imgUrl
                )
            )
        }

        rvList.setController(listController)
        rvList.setItemSpacingDp(16)

        listController.addData(listItem)


        btnTambah.setOnClickListener {
            listItem.add(
                NewsItemView.Model(
                    "",
                    title = news.title,
                    imgUrl = news.imgUrl
                )
            )
            listController.setData(listItem)
        }

    }
}
