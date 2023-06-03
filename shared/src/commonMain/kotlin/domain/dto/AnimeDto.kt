package domain.dto

data class AnimeDto(
    val data: List<DataDto> = emptyList(),
)

data class DataDto(
    val id: String? = null,
    val type: String? = null,
    val attributes: AttributesDto? = null,
)

data class AttributesDto(
    val createdAt: String? = null,
    val synopsis: String? = null,
    val abbreviatedTitles: List<String>?,
    val canonicalTitle: String? = null,
    val averageRating: String? = null,
    val tba: String? = null,
    val posterImage: PosterImageDto? = null,
    val coverImage: CoverImageDto? = null,
    val episodeCount: Int = 0,
    val episodeLength: Int = 0,
    val youtubeVideoId: String? = null,
    val showType: String? = null,
)

data class PosterImageDto(
    val small: String? = null,
    val medium: String? = null,
)

data class CoverImageDto(
    val small: String? = null,
    val tiny: String? = null,
    val original: String? = null
)
