package presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import domain.dto.DataDto
import utils.AsyncImage

@Composable
fun AnimeComponent(
    dataDto: DataDto,
    navigateToAnimeDetailsScreen: (DataDto) -> Unit,
) {
    Column(verticalArrangement = Arrangement.Center) {
        if (dataDto.attributes?.posterImage?.medium != null) {
            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(150.dp)
                    .clickable {
                        navigateToAnimeDetailsScreen(dataDto)
                    },
                shape = RoundedCornerShape(15.dp),
            ) {
                AsyncImage(
                    imageUrl = dataDto.attributes.posterImage.medium ?: "",
                    contentDescription = "Anime",
                    contentScale = ContentScale.Crop,
                    loadingPlaceHolder = {},
                    modifier = Modifier,
                    errorPlaceHolder = {},
                    alignment = Alignment.Center,
                    alpha = DefaultAlpha,
                    coloFilter = null,
                    filterQuality = DrawScope.DefaultFilterQuality,
                )
            }
        } else {
            Card(
                modifier = Modifier.height(200.dp).width(120.dp),
                shape = RoundedCornerShape(15.dp),
                backgroundColor = Color.LightGray,
            ) {
            }
        }

        Text(
            text = dataDto.attributes?.canonicalTitle ?: "",
            textAlign = TextAlign.Start,
            softWrap = true,
            modifier = Modifier.width(100.dp),
            fontWeight = FontWeight.Medium,
        )
    }
}
