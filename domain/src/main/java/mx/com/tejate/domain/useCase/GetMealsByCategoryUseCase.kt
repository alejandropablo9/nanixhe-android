package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetMealsByCategoryUseCase(
    private val categoryName: String,
    private val repository: MealRepository
) {
    suspend operator fun invoke() = repository.getMealsByCategory(categoryName)
}