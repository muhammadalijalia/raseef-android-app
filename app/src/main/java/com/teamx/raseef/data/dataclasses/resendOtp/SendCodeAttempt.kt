package com.teamx.raseef.data.models.resendOtp

import androidx.annotation.Keep


@Keep
data class SendCodeAttempt(
    val attempt_sid: String,
    val channel: String,
    val time: String
)