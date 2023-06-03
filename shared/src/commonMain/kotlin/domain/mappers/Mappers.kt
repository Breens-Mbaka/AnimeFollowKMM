package domain.mappers

import data.remote.model.AnimeResponse
import data.remote.model.Attributes
import data.remote.model.CoverImage
import data.remote.model.Data
import data.remote.model.PosterImage
import domain.dto.AnimeDto
import domain.dto.AttributesDto
import domain.dto.CoverImageDto
import domain.dto.DataDto
import domain.dto.PosterImageDto

fun AnimeResponse.toDomain() =
    data?.map { it.toDomain() }?.let {
        AnimeDto(
            data = it,
        )
    }

fun Data.toDomain() =
    DataDto(
        id = id,
        type = type,
        attributes = attributes?.toDomain(),
    )

fun Attributes.toDomain() =
    AttributesDto(
        createdAt = createdAt,
        synopsis = synopsis,
        canonicalTitle = canonicalTitle,
        abbreviatedTitles = abbreviatedTitles,
        averageRating = averageRating,
        tba = tba,
        posterImage = posterImage?.toDomain(),
        coverImage = coverImage?.toDomain(),
        episodeCount = episodeCount ?: 0,
        episodeLength = episodeLength ?: 0,
        youtubeVideoId = youtubeVideoId,
        showType = showType,
    )

fun PosterImage.toDomain() =
    PosterImageDto(
        small = small,
        medium = medium,
    )

fun CoverImage.toDomain() =
    CoverImageDto(
        small = small,
        tiny = tiny,
        original = original,
    )
