package com.tama.sampleepoxycarousel

import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.VisibilityState.FOCUSED_VISIBLE
import com.airbnb.epoxy.carousel
import com.tama.sampleepoxycarousel.data.ViewPagerData
import com.tama.sampleepoxycarousel.models.TabLayoutModel_
import com.tama.sampleepoxycarousel.models.ViewPagerItem_

class ViewPagerController : TypedEpoxyController<ViewPagerData>() {

    override fun buildModels(data: ViewPagerData) {
        carousel {
            id("This is a ViewPager.")
            hasFixedSize(true)
            models(data.items.mapIndexed { index, item ->
                ViewPagerItem_()
                    .id(item)
                    .title(item)
                    .onVisibilityStateChanged { _, _, visibilityState ->
                        if (visibilityState == FOCUSED_VISIBLE) {
                            data.visibleItemIdx = index
                            setData(data)
                        }
                    }
            })
        }

        TabLayoutModel_()
            .id("This is a tablayout")
            .count(data.items.size)
            .checked(data.visibleItemIdx)
            .addTo(this)
    }
}