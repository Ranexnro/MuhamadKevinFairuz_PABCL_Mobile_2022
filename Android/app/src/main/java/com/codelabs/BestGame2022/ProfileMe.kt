package com.codelabs.BestGame2022

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProfileMe (
    var image : Int = 0,
    var name : String = "",
    var about : String = "",

): Parcelable
