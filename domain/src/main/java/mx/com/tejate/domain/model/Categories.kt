package mx.com.tejate.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Categories(
    @SerializedName("categories")
    val list: List<Category>
) : Serializable