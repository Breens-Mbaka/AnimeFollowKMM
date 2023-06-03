package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StreamingLinks(
    @SerialName("links")
    val links: LinksX?,
)
