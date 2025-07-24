package com.example.chitchat.domain.model

data class ChatMessage(
    val profileUUID: String = "",
    var message: String = "",
    var date: Long = 0,
    var status: String = ""
)
