package com.example.githubuserapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String?,
    val username: String?,
    val profilePicture: Int?,
    val repo: Int?,
    val follower: Int?,
    val following: Int?,
    val company: String?,
    val location: String?
) : Parcelable
