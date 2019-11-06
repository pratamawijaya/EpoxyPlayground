package com.tama.simplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tama.simplelist.models.News
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listNews = listOf(
            News(
                title = "Risa Santoso, Perempuan 27 Tahun yang Jadi Rektor Termuda di Indonesia",
                imgUrl = "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1573004873/qtzurkz0q2sajkem8y7v.jpg"
            ),
            News(
                title = "Risa Santoso, Perempuan 27 Tahun yang Jadi Rektor Termuda di Indonesia",
                imgUrl = "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1573004873/qtzurkz0q2sajkem8y7v.jpg"
            ),
            News(
                title = "Risa Santoso, Perempuan 27 Tahun yang Jadi Rektor Termuda di Indonesia",
                imgUrl = "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1573004873/qtzurkz0q2sajkem8y7v.jpg"
            ),
            News(
                title = "Risa Santoso, Perempuan 27 Tahun yang Jadi Rektor Termuda di Indonesia",
                imgUrl = "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1573004873/qtzurkz0q2sajkem8y7v.jpg"
            )
        )

        val controller = ListNewsController()
        rvList.adapter = controller.adapter
        rvList.layoutManager = LinearLayoutManager(this)

        controller.setData(listNews)

    }
}
