package com.example.chitchat.domain.model

data class User(
    var profileUUID: String = "",
    var userEmail: String = "",
    var oneSignalUserId: String = "",
    var userName: String = "",
    var userProfilePictureUrl: String = "",
    var userSurName: String = "",
    var userBio: String = "",
    var userPhoneNumber: String = "",
    var status: String = ""
)