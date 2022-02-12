package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetMealsByFilterUseCase(private val filter: String, private val repository: MealRepository) {
    suspend operator fun invoke() = repository.getMealsByFilter(filter)
}