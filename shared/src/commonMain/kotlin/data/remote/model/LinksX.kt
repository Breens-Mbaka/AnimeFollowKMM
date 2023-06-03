package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LinksX(
    @SerialName("related")
    val related: String?,
    @SerialName("self")
    val self: String?,
)
