package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DimensionsX(
    @SerialName("large")
    val large: Large?,
    @SerialName("medium")
    val medium: Medium?,
    @SerialName("small")
    val small: Small?,
    @SerialName("tiny")
    val tiny: Tiny?,
)
