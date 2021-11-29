package cs.builder.app.example.moderncleanarchitecture.app.feature.main.search

import androidx.lifecycle.ViewModel
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.presentation.get_my_repos.GetMyRepos
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    getMyRepos: GetMyRepos,
) : ViewModel(), GetMyRepos by getMyRepos