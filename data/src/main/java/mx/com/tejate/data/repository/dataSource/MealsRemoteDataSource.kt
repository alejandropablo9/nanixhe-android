package mx.com.tejate.data.repository.dataSource

import mx.com.tejate.domain.model.Categories
import mx.com.tejate.domain.model.MealDetailList
import mx.com.tejate.domain.model.Meals
import retrofit2.Response

interface MealsRemoteDataSource {
    suspend fun getCategories(): Response<Categories>

    suspend fun getMealsByCategory(categoryName: String): Response<Meals>

    suspend fun getMealsByFilter(filter: String): Response<Meals>

    suspend fun getMealDetail(id: String): Response<MealDetailList>

    suspend fun getRandomMeals(): Response<Meals>
}