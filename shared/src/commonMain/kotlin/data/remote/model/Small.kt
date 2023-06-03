package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Small(
    @SerialName("height")
    val height: Int?,
    @SerialName("width")
    val width: Int?,
)
