package mx.com.tejate.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MealDetailList(
    @SerializedName("meals")
    val list: List<MealDetail>
) : Serializable