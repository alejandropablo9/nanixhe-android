package mx.com.tejate.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Category(
    @SerializedName("idCategory")
    val id: String,
    @SerializedName("strCategory")
    val name: String,
    @SerializedName("strCategoryThumb")
    val poster: String,
    @SerializedName("strCategoryDescription")
    val description: String
): Serializable