package com.example.chitchat.domain.usecase.profileScreen

import com.example.chitchat.domain.model.UserStatus
import com.example.chitchat.domain.repository.ProfileScreenRepository

class SetUserStatusToFirebase(
    private val profileScreenRepository: ProfileScreenRepository
) {
    suspend operator fun invoke(userStatus: UserStatus) =
        profileScreenRepository.setUserStatusToFirebase(userStatus)
}