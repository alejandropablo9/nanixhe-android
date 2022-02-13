package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetMealDetailUseCase(
    private val repository: MealRepository
) {
    suspend operator fun invoke(mealId: String,) = repository.getMealDetail(mealId)
}