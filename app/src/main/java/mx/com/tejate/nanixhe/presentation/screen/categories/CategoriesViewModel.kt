package mx.com.tejate.nanixhe.presentation.screen.categories

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import mx.com.tejate.domain.model.Categories
import mx.com.tejate.domain.model.Meals
import mx.com.tejate.domain.useCase.GetCategoriesUseCase
import mx.com.tejate.domain.useCase.GetMealsByCategoryUseCase
import mx.com.tejate.domain.util.Result
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    private val getCategoriesUseCase: GetCategoriesUseCase,
    private val getMealsByCategoryUseCase: GetMealsByCategoryUseCase
) : ViewModel() {
    /// Categorias
    private val _categories = mutableStateOf<Result<Categories>>(Result.Loading())
    val categoriesState: State<Result<Categories>> = _categories

    init {
        getCategories()
    }

    private fun getCategories() {
        viewModelScope.launch {
            _categories.value = getCategoriesUseCase()
        }
    }

}