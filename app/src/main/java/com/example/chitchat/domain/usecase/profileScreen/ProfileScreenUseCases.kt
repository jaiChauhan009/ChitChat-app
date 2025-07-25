package com.example.chitchat.domain.usecase.profileScreen

data class ProfileScreenUseCases(
    val createOrUpdateProfileToFirebase: CreateOrUpdateProfileToFirebase,
    val loadProfileFromFirebase: LoadProfileFromFirebase,
    val setUserStatusToFirebase: SetUserStatusToFirebase,
    val signOut: SignOut,
    val uploadPictureToFirebase: UploadPictureToFirebase
)