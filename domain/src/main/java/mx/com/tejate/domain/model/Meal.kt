package mx.com.tejate.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Meal(
    @SerializedName("idMeal")
    val id: String,
    @SerializedName("strMeal")
    val name: String,
    @SerializedName("strMealThumb")
    val poster: String
) : Serializable