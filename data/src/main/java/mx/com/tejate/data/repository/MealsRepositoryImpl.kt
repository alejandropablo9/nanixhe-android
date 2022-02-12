package mx.com.tejate.data.repository

import mx.com.tejate.data.repository.dataSource.MealsRemoteDataSource
import mx.com.tejate.domain.repository.MealRepository
import mx.com.tejate.domain.util.Result
import retrofit2.Response
import java.io.Serializable

class MealsRepositoryImpl(private val mealsRemoteDataSource: MealsRemoteDataSource) :
    MealRepository {

    override suspend fun getCategories() = responseToRequest(mealsRemoteDataSource.getCategories())

    override suspend fun getMealsByCategory(categoryName: String) =
        responseToRequest(mealsRemoteDataSource.getMealsByCategory(categoryName))

    override suspend fun getMealsByFilter(filter: String) =
        responseToRequest(mealsRemoteDataSource.getMealsByFilter(filter))

    override suspend fun getMealDetail(id: String) =
        responseToRequest(mealsRemoteDataSource.getMealDetail(id))

    override suspend fun getRandomMeals() =
        responseToRequest(mealsRemoteDataSource.getRandomMeals())

    private fun <T : Serializable> responseToRequest(response: Response<T>): Result<T> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Result.Success(result)
            }
        }
        return Result.Error(response.message())
    }
}