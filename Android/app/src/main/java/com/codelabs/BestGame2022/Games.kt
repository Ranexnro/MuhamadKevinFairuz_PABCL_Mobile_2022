package com.codelabs.BestGame2022

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Games (
    var name : String = "",
    var genre : String = "",
    var requirement : String = "",
    var detail : String = "",
    var photo : Int = 0,
): Parcelable
