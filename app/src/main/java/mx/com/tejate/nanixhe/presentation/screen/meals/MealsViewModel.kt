package mx.com.tejate.nanixhe.presentation.screen.meals

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import mx.com.tejate.domain.model.Meals
import mx.com.tejate.domain.useCase.GetMealsByCategoryUseCase
import mx.com.tejate.domain.util.Result
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsByCategoryUseCase: GetMealsByCategoryUseCase
) : ViewModel() {
    /// Platillos
    private val _meals = mutableStateOf<Result<Meals>>(Result.Loading())
    val mealsState: State<Result<Meals>> = _meals

    fun getMeals(categoryName: String) {
        viewModelScope.launch {
            _meals.value = getMealsByCategoryUseCase(categoryName)
        }
    }
}