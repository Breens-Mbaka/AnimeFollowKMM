package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Relationships(
    @SerialName("animeCharacters")
    val animeCharacters: AnimeCharacters?,
    @SerialName("animeProductions")
    val animeProductions: AnimeProductions?,
    @SerialName("animeStaff")
    val animeStaff: AnimeStaff?,
    @SerialName("castings")
    val castings: Castings?,
    @SerialName("categories")
    val categories: Categories?,
    @SerialName("characters")
    val characters: Characters?,
    @SerialName("episodes")
    val episodes: Episodes?,
    @SerialName("genres")
    val genres: Genres?,
    @SerialName("installments")
    val installments: Installments?,
    @SerialName("mappings")
    val mappings: Mappings?,
    @SerialName("mediaRelationships")
    val mediaRelationships: MediaRelationships?,
    @SerialName("productions")
    val productions: Productions?,
    @SerialName("quotes")
    val quotes: Quotes?,
    @SerialName("reviews")
    val reviews: Reviews?,
    @SerialName("staff")
    val staff: Staff?,
    @SerialName("streamingLinks")
    val streamingLinks: StreamingLinks?,
)
