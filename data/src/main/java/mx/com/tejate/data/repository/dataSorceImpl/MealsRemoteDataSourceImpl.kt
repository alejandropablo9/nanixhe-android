package mx.com.tejate.data.repository.dataSorceImpl

import mx.com.tejate.data.api.MealsApi
import mx.com.tejate.data.repository.dataSource.MealsRemoteDataSource

class MealsRemoteDataSourceImpl(private val api: MealsApi) : MealsRemoteDataSource {
    override suspend fun getCategories() = api.getCategories()

    override suspend fun getMealsByCategory(categoryName: String) =
        api.getMealsByCategory(categoryName)

    override suspend fun getMealsByFilter(filter: String) = api.getMealsByFilter(filter)

    override suspend fun getMealDetail(id: String) = api.getMealDetail(id)

    override suspend fun getRandomMeals() = api.getRandomMeals()
}