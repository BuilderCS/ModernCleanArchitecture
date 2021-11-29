package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.presentation.get_my_repos

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Status
import cs.builder.app.example.moderncleanarchitecture.app.pool.consumer.launchAndAssociateUseCase
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposParams
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposStatus
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

/**
 * Presentation model for manage the "Get my repos" data flow.
 */
class GetMyReposImpl @Inject constructor(
    private val getMyReposUseCase: GetMyReposUseCase,
) : GetMyRepos {

    /* */
    private val _getMyReposStateFlow = MutableStateFlow<GetMyReposStatus>(Status.None())
    override val getMyReposStateFlow = _getMyReposStateFlow.asStateFlow()

    /** */
    override fun launchGetMyRepos(username: String) {
        val params = GetMyReposParams(username)
        getMyReposUseCase.launchAndAssociateUseCase(params, _getMyReposStateFlow)
    }

    /** */
    override fun launchGetMyReposIfRequired(username: String) {
        if (getMyReposStateFlow.value is Status.None)
            launchGetMyRepos(username)
    }

}