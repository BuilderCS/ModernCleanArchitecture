package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Either
import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.UseCase
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.RepoRepository
import javax.inject.Inject

/** Launch the "Get my repos" flow. */
class GetMyReposUseCase @Inject constructor(
    private val repository: RepoRepository,
) : UseCase<GetMyReposResponse, GetMyReposParams, GetMyReposFailure>() {

    /** */
    override suspend fun run(
        params: GetMyReposParams
    ): Either<GetMyReposFailure, GetMyReposResponse> =
        repository.getMyRepos(params.username)

}