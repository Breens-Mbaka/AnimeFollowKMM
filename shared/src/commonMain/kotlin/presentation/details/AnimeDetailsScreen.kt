package presentation.details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import domain.dto.DataDto
import org.koin.core.component.KoinComponent
import utils.AsyncImage

internal class AnimeDetailsScreen(
    private val dataDto: DataDto,
) : Screen, KoinComponent {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Scaffold(
            topBar = {
                TopAppBar(
                    backgroundColor = Color.Black,
                    content = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start,
                        ) {
                            IconButton(
                                onClick = { navigator.pop() },
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.ArrowBack,
                                    contentDescription = "Back",
                                    tint = Color.White,
                                )
                            }
                            Text(
                                text = "${dataDto.attributes?.canonicalTitle}",
                                color = Color.White,
                                fontSize = 18.sp,
                                softWrap = true,
                            )
                        }
                    },
                )
            },
        ) {
            LazyColumn {
                item {
                    AsyncImage(
                        imageUrl = dataDto.attributes?.coverImage?.original ?: "",
                        contentDescription = "Anime",
                        contentScale = ContentScale.Crop,
                        loadingPlaceHolder = {},
                        modifier = Modifier.fillParentMaxWidth().height(250.dp),
                        errorPlaceHolder = {},
                        alignment = Alignment.Center,
                        alpha = DefaultAlpha,
                        coloFilter = null,
                        filterQuality = DrawScope.DefaultFilterQuality,
                    )

                    Spacer(modifier = Modifier.height(12.dp))
                }

                item {
                    Text(
                        "Synopsis",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 14.dp, bottom = 12.dp),
                        textDecoration = TextDecoration.Underline,
                    )
                }

                item {
                    Text(
                        text = dataDto.attributes?.synopsis ?: "",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(14.dp),
                    )
                }
            }
        }
    }
}
