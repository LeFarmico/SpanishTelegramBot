package entity

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("id") val id: Long,
    @SerializedName("categoryName") val categoryName: String,
    @SerializedName("language_id") val languageId: Long,
    @SerializedName("immutable") val immutable: Boolean = true,
)
