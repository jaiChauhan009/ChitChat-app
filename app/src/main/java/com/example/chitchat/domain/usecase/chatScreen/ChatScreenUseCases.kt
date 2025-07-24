package com.example.chitchat.domain.usecase.chatScreen

data class ChatScreenUseCases(
    val blockFriendToFirebase: BlockFriendToFirebase,
    val insertMessageToFirebase: InsertMessageToFirebase,
    val loadMessageFromFirebase: LoadMessageFromFirebase,
    val opponentProfileFromFirebase: LoadOpponentProfileFromFirebase
)