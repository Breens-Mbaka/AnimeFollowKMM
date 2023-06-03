package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("attributes")
    val attributes: Attributes?,
    @SerialName("id")
    val id: String?,
    @SerialName("links")
    val links: Links?,
    @SerialName("relationships")
    val relationships: Relationships?,
    @SerialName("type")
    val type: String?,
)
