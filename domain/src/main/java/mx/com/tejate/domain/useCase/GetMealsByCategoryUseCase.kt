package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetMealsByCategoryUseCase(
    private val repository: MealRepository
) {
    suspend operator fun invoke(categoryName: String) =
        repository.getMealsByCategory(categoryName)
}