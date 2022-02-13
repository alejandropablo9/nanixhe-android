package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetMealsByFilterUseCase(val repository: MealRepository) {
    suspend operator fun invoke(filter: String) = repository.getMealsByFilter(filter)
}