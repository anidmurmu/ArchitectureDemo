package com.example.architecturedemo.data.entity.university

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UniversityNetworkModel(
    @SerializedName("country")
    @Expose
    val country: String,

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("web_pages")
    @Expose
    val webPages: List<String>,

    @SerializedName("domains")
    @Expose
    val domains: List<String>,

    @SerializedName("alpha_two_code")
    @Expose
    val alphaTwoCode: String
    )