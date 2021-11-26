package cs.builder.app.example.moderncleanarchitecture.app.feature.main.search

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(): ViewModel() {

    /* */
    val testItem: String = "Hello world!"

}