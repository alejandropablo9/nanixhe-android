package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetMealDetailUseCase(
    private val mealId: String,
    private val repository: MealRepository
) {
    suspend operator fun invoke() = repository.getMealDetail(mealId)
}