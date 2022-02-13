package mx.com.tejate.nanixhe.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mx.com.tejate.domain.repository.MealRepository
import mx.com.tejate.domain.useCase.*

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetCategoriesUseCase(repository: MealRepository) =
        GetCategoriesUseCase(repository)

    @Provides
    fun provideGetMealsByCategoryUseCase(repository: MealRepository) =
        GetMealsByCategoryUseCase(repository)

    @Provides
    fun provideGetMealsByFilterUseCase(repository: MealRepository) =
        GetMealsByFilterUseCase(repository)

    @Provides
    fun getMealDetailUseCase(repository: MealRepository) =
        GetMealDetailUseCase(repository)

    @Provides
    fun getRandomMeals(repository: MealRepository) =
        GetRandomMealsUseCase(repository)
}