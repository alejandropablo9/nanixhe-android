package mx.com.tejate.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MealDetail(
    @SerializedName("idMeal")
    val id: String,
    @SerializedName("strMeal")
    val name: String,
    @SerializedName("strDrinkAlternate")
    val drinkAlternate: String?,
    @SerializedName("strCategory")
    val categoryName: String?,
    @SerializedName("strArea")
    val area: String,
    @SerializedName("strInstructions")
    val instructions: String,
    @SerializedName("strMealThumb")
    val poster: String,
    @SerializedName("strTags")
    val tags: String,
    @SerializedName("strYoutube")
    val youtubeLink: String,
    @SerializedName("strIngredient1")
    val ingredientOne: String,
    @SerializedName("strIngredient2")
    val ingredientTwo: String,
    @SerializedName("strIngredient3")
    val ingredientThree: String,
    @SerializedName("strIngredient4")
    val ingredientFour: String,
    @SerializedName("strIngredient5")
    val ingredientFive: String,
    @SerializedName("strIngredient6")
    val ingredientSix: String,
    @SerializedName("strIngredient7")
    val ingredientSeven: String,
    @SerializedName("strIngredient8")
    val ingredientEight: String,
    @SerializedName("strIngredient9")
    val ingredientNine: String,
    @SerializedName("strIngredient10")
    val ingredientTen: String,
    @SerializedName("strIngredient11")
    val ingredientEleven: String,
    @SerializedName("strIngredient12")
    val ingredientTwelve: String,
    @SerializedName("strIngredient13")
    val ingredientThirteen: String,
    @SerializedName("strIngredient14")
    val ingredientFourteen: String,
    @SerializedName("strIngredient15")
    val ingredientFifteen: String,
    @SerializedName("strIngredient16")
    val ingredientSixteen: String,
    @SerializedName("strIngredient17")
    val ingredientSevenTeen: String,
    @SerializedName("strIngredient18")
    val ingredientEighteen: String,
    @SerializedName("strIngredient19")
    val ingredientNineteen: String,
    @SerializedName("strIngredient20")
    val ingredientTwenty: String,
    @SerializedName("strMeasure1")
    val measureOne: String,
    @SerializedName("strMeasure2")
    val measureTwo: String,
    @SerializedName("strMeasure3")
    val measureThree: String,
    @SerializedName("strMeasure4")
    val measureFour: String,
    @SerializedName("strMeasure5")
    val measureFive: String,
    @SerializedName("strMeasure6")
    val measureSix: String,
    @SerializedName("strMeasure7")
    val measureSeven: String,
    @SerializedName("strMeasure8")
    val measureEight: String,
    @SerializedName("strMeasure9")
    val measureNine: String,
    @SerializedName("strMeasure10")
    val measureTen: String,
    @SerializedName("strMeasure11")
    val measureEleven: String,
    @SerializedName("strMeasure12")
    val measureTwelve: String,
    @SerializedName("strMeasure13")
    val measureThirteen: String,
    @SerializedName("strMeasure14")
    val measureFourteen: String,
    @SerializedName("strMeasure15")
    val measureFifteen: String,
    @SerializedName("strMeasure16")
    val measureSixteen: String,
    @SerializedName("strMeasure17")
    val measureSeventeen: String,
    @SerializedName("strMeasure18")
    val measureEighteen: String,
    @SerializedName("strMeasure19")
    val measureNineteen: String,
    @SerializedName("strMeasure20")
    val measureTwenty: String,
): Serializable