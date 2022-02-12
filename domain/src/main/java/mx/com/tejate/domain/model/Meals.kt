package mx.com.tejate.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Meals(
    @SerializedName("meals")
    val list: List<Meal>
) : Serializable