import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf


@Immutable
data class StringResources(
    val happyBirthdayText: String = "",
    val fromText: String = ""
)

fun stringResourcesEn() = StringResources(
    happyBirthdayText = "Happy Birthday Sam!",
    fromText = "From Emma"
)

fun stringResourcesRu() = StringResources(
    happyBirthdayText = "C днем рождения Сэм!",
    fromText = "От Эмми"
)

val LocalStringResources = staticCompositionLocalOf { stringResourcesEn() }