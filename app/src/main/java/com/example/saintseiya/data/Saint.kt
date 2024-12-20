package com.example.saintseiya.data

data class Saint (
    val name : String ,
    val constellation : String,
    val armorType : String,
    val miniLogoPhoto : String,
    val presentationPhoto : String,
    val theme : Int,
    val attack : List<Attack>

)