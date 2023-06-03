package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tiny(
    @SerialName("height")
    val height: Int?,
    @SerialName("width")
    val width: Int?,
)
