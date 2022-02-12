package mx.com.tejate.domain.useCase

import mx.com.tejate.domain.repository.MealRepository

class GetCategoriesUseCase(private val repository: MealRepository) {
    suspend operator fun invoke() = repository.getCategories()
}