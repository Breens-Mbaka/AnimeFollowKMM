package di

import data.remote.KitsuApi
import data.remote.trendinganime.AnimeRepository
import data.remote.trendinganime.AnimeRepositoryImpl
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.headers
import io.ktor.http.HttpHeaders
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module
import presentation.home.HomeScreenViewModel
import utils.Constants.BASE_URL
import utils.Constants.HEADER_TYPE

fun commonModule() = module {
    single {
        HttpClient(get()) {
            defaultRequest {
                url {
                    host = BASE_URL
                    protocol = URLProtocol.HTTPS
                }
                headers {
                    append(HttpHeaders.ContentType, HEADER_TYPE)
                    append(HttpHeaders.Accept, HEADER_TYPE)
                }
            }

            install(Logging) {
                level = LogLevel.HEADERS
            }

            install(ContentNegotiation) {
                json(
                    Json {
                        ignoreUnknownKeys = true
                        prettyPrint = true
                    },
                )
            }

            install(HttpTimeout) {
                requestTimeoutMillis = 20000L
                connectTimeoutMillis = 20000L
                socketTimeoutMillis = 20000L
            }
        }
    }

    single {
        KitsuApi(httpClient = get())
    }

    single<AnimeRepository> { AnimeRepositoryImpl(kitsuApi = get()) }

    single {
        HomeScreenViewModel(animeRepository = get())
    }
}
