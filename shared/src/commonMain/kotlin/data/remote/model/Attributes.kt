package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attributes(
    @SerialName("abbreviatedTitles")
    val abbreviatedTitles: List<String>?,
    @SerialName("ageRating")
    val ageRating: String?,
    @SerialName("ageRatingGuide")
    val ageRatingGuide: String?,
    @SerialName("averageRating")
    val averageRating: String?,
    @SerialName("canonicalTitle")
    val canonicalTitle: String?,
    @SerialName("coverImage")
    val coverImage: CoverImage?,
    @SerialName("coverImageTopOffset")
    val coverImageTopOffset: Int?,
    @SerialName("createdAt")
    val createdAt: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("endDate")
    val endDate: String?,
    @SerialName("episodeCount")
    val episodeCount: Int?,
    @SerialName("episodeLength")
    val episodeLength: Int?,
    @SerialName("favoritesCount")
    val favoritesCount: Int?,
    @SerialName("nextRelease")
    val nextRelease: String?,
    @SerialName("nsfw")
    val nsfw: Boolean?,
    @SerialName("popularityRank")
    val popularityRank: Int?,
    @SerialName("posterImage")
    val posterImage: PosterImage?,
    @SerialName("ratingFrequencies")
    val ratingFrequencies: RatingFrequencies?,
    @SerialName("ratingRank")
    val ratingRank: Int?,
    @SerialName("showType")
    val showType: String?,
    @SerialName("slug")
    val slug: String?,
    @SerialName("startDate")
    val startDate: String?,
    @SerialName("status")
    val status: String?,
    @SerialName("subtype")
    val subtype: String?,
    @SerialName("synopsis")
    val synopsis: String?,
    @SerialName("tba")
    val tba: String?,
    @SerialName("titles")
    val titles: Titles?,
    @SerialName("totalLength")
    val totalLength: Int?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("userCount")
    val userCount: Int?,
    @SerialName("youtubeVideoId")
    val youtubeVideoId: String?,
)
