package presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import presentation.utlis.shimmer

@Composable
fun DetailImageLoadingComponent() {
    Box(
        modifier = Modifier.height(350.dp).fillMaxWidth().clip(RoundedCornerShape(6.dp))
            .shimmer(),
    )
}
