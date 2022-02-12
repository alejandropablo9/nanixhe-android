package mx.com.tejate.domain.repository

import mx.com.tejate.domain.model.Categories
import mx.com.tejate.domain.model.MealDetailList
import mx.com.tejate.domain.model.Meals
import mx.com.tejate.domain.util.Result

interface MealRepository {

    suspend fun getCategories(): Result<Categories>

    suspend fun getMealsByCategory(categoryName: String): Result<Meals>

    suspend fun getMealsByFilter(filter: String): Result<Meals>

    suspend fun getMealDetail(id: String): Result<MealDetailList>

    suspend fun getRandomMeals(): Result<Meals>
}