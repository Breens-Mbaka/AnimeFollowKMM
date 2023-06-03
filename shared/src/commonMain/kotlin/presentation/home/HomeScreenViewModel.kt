package presentation.home

import cafe.adriel.voyager.core.model.StateScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import data.remote.trendinganime.AnimeRepository
import domain.dto.DataDto
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import utils.NetworkResult

class HomeScreenViewModel(
    private val animeRepository: AnimeRepository,
) : StateScreenModel<HomeScreenUiState>(HomeScreenUiState()) {

    init {
        getTrendingAnime()

        getUpcomingAnime()
    }

    private fun getTrendingAnime() {
        coroutineScope.launch {
            mutableState.update {
                it.copy(
                    loadingTrendingAnime = true,
                )
            }

            animeRepository.getTrendingAnime().collect { result ->
                when (result) {
                    is NetworkResult.Error -> {
                        mutableState.update {
                            it.copy(
                                loadingTrendingAnime = false,
                                errorMessageTrendingAnime = result.errorMessage
                                    ?: "Something wrong happened!",
                            )
                        }
                    }

                    is NetworkResult.Success -> {
                        mutableState.update {
                            it.copy(
                                loadingTrendingAnime = false,
                                trendingAnime = result.data ?: emptyList(),
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getUpcomingAnime() {
        coroutineScope.launch {
            mutableState.update {
                it.copy(
                    loadingUpcomingAnime = true,
                )
            }

            animeRepository.getUpcomingAnime().collect { result ->
                when (result) {
                    is NetworkResult.Error -> {
                        mutableState.update {
                            it.copy(
                                loadingUpcomingAnime = false,
                                errorMessageUpcomingAnime = result.errorMessage
                                    ?: "Something wrong happened!",
                            )
                        }
                    }

                    is NetworkResult.Success -> {
                        mutableState.update {
                            it.copy(
                                loadingUpcomingAnime = false,
                                upcomingAnime = result.data ?: emptyList(),
                            )
                        }
                    }
                }
            }
        }
    }
}

data class HomeScreenUiState(
    val loadingTrendingAnime: Boolean = false,
    val trendingAnime: List<DataDto> = emptyList(),
    val errorMessageTrendingAnime: String? = null,
    val loadingUpcomingAnime: Boolean = false,
    val upcomingAnime: List<DataDto> = emptyList(),
    val errorMessageUpcomingAnime: String? = null,
)
