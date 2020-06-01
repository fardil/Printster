package com.dilla.printster.api.request

data class registerRequest (
    val email: String?,
    val phone_number: String?,
    val password: String,
    val confirm_password: String
)