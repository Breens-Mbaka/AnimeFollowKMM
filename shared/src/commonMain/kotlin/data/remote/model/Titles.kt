package data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Titles(
    @SerialName("en")
    val en: String? = null,
    @SerialName("en_jp")
    val enJp: String? = null,
    @SerialName("en_us")
    val enUs: String? = null,
    @SerialName("ja_jp")
    val jaJp: String? = null,
    @SerialName("zh_cn")
    val zh_cn: String? = null
)
