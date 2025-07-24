package com.example.chitchat.domain.usecase.userListScreen

import com.example.chitchat.domain.repository.UserListScreenRepository

class LoadPendingFriendRequestListFromFirebase(
    private val userListScreenRepository: UserListScreenRepository
) {
    suspend operator fun invoke() =
        userListScreenRepository.loadPendingFriendRequestListFromFirebase()
}