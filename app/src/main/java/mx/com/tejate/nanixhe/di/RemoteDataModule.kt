package mx.com.tejate.nanixhe.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mx.com.tejate.data.api.MealsApi
import mx.com.tejate.data.repository.dataSorceImpl.MealsRemoteDataSourceImpl
import mx.com.tejate.data.repository.dataSource.MealsRemoteDataSource

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun providesMealsRemoteDataSource(api: MealsApi): MealsRemoteDataSource = MealsRemoteDataSourceImpl(api)

}