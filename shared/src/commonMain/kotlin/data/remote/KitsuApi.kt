package data.remote

import data.remote.model.AnimeResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import utils.Constants.TRENDING_ANIME
import utils.Constants.UPCOMING_ANIME

class KitsuApi(
    private val httpClient: HttpClient,
) {

    suspend fun getTrendingAnime(): AnimeResponse {
        return httpClient.get(urlString = TRENDING_ANIME).bodyAsText().let { json ->
            Json.decodeFromString(json)
        }
    }

    suspend fun getUpcomingAnime(): HttpResponse {
        return httpClient.get {
            url(UPCOMING_ANIME)
            parameter("status", "upcoming")
        }
    }
}
