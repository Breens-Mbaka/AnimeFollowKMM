package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeCharacters(
    @SerialName("links")
    val links: LinksX?,
)
