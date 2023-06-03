import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import presentation.home.HomeScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(HomeScreen())
    }
}

expect fun getPlatformName(): String
