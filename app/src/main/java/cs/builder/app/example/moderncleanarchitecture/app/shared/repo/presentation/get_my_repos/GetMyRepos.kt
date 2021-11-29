package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.presentation.get_my_repos

import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposStatus
import kotlinx.coroutines.flow.StateFlow

/** */
interface GetMyRepos {

    /* */
    val getMyReposStateFlow: StateFlow<GetMyReposStatus>

    /** */
    fun launchGetMyRepos(username: String)

    /** */
    fun launchGetMyReposIfRequired(username: String)

}