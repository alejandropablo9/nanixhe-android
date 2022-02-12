package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetRandomMealsUseCase(private val repository: MealRepository) {
    suspend operator fun invoke() = repository.getRandomMeals()
}