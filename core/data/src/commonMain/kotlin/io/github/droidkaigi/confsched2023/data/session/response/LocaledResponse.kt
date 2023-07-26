package io.github.droidkaigi.confsched2023.data.sessions.response

import kotlinx.serialization.Serializable

@Serializable
internal data class LocaledResponse(
    val ja: String,
    val en: String,
)
