package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetaX(
    @SerialName("dimensions")
    val dimensions: DimensionsX?,
)
