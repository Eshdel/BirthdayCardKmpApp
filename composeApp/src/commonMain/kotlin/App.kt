import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun App(useDarkTheme: Boolean = isSystemInDarkTheme()) {
    HappyBirthdayTheme(
        useDarkTheme
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {Greeting().greet()
            GreetingImage(
                message = LocalStringResources.current.happyBirthdayText,
                from = LocalStringResources.current.fromText
            )
        }
    }
}