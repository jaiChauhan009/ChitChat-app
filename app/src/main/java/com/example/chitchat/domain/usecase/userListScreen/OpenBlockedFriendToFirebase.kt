package com.example.chitchat.domain.usecase.userListScreen

import com.example.chitchat.domain.repository.UserListScreenRepository

class OpenBlockedFriendToFirebase(
    private val userListScreenRepository: UserListScreenRepository
) {
    suspend operator fun invoke(registerUUID: String) =
        userListScreenRepository.openBlockedFriendToFirebase(registerUUID)
}