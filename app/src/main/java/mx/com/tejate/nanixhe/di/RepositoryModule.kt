package mx.com.tejate.nanixhe.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mx.com.tejate.data.repository.MealsRepositoryImpl
import mx.com.tejate.data.repository.dataSource.MealsRemoteDataSource
import mx.com.tejate.domain.repository.MealRepository

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideMealsRepository(mealsRemoteDataSource: MealsRemoteDataSource): MealRepository =
        MealsRepositoryImpl(mealsRemoteDataSource)

}