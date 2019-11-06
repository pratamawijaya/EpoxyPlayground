package com.tama.sampleepoxycarousel.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class ViewPagerData(var items: Array<String> = emptyArray(), var visibleItemIdx: Int = -1) :
    Parcelable