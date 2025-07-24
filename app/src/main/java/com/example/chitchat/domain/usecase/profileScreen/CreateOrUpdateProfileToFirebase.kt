package com.example.chitchat.domain.usecase.profileScreen

import com.example.chitchat.domain.model.User
import com.example.chitchat.domain.repository.ProfileScreenRepository

class CreateOrUpdateProfileToFirebase(
    private val profileScreenRepository: ProfileScreenRepository
) {
    suspend operator fun invoke(user: User) =
        profileScreenRepository.createOrUpdateProfileToFirebase(user)
}