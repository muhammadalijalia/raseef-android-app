package com.teamx.raseef.data.models.forgotPass

import androidx.annotation.Keep


@Keep
data class ForgotData(
    val email: String,
    val message: String,
    val success: Boolean,
    val token: String
)