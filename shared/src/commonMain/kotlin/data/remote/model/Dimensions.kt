package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Dimensions(
    @SerialName("large")
    val large: Large?,
    @SerialName("small")
    val small: Small?,
    @SerialName("tiny")
    val tiny: Tiny?,
)
