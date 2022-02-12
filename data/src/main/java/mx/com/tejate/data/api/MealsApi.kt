package mx.com.tejate.data.api

import mx.com.tejate.domain.model.Categories
import mx.com.tejate.domain.model.MealDetailList
import mx.com.tejate.domain.model.Meals
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsApi {

    @GET("categories.php")
    suspend fun getCategories(): Response<Categories>

    @GET("filter.php")
    suspend fun getMealsByCategory(@Query("c") categoryName: String): Response<Meals>

    @GET("search.php")
    suspend fun getMealsByFilter(@Query("f") filter: String): Response<Meals>

    @GET("lookup.php")
    suspend fun getMealDetail(@Query("i") id: String): Response<MealDetailList>

    @GET("random.php")
    suspend fun getRandomMeals(): Response<Meals>

}