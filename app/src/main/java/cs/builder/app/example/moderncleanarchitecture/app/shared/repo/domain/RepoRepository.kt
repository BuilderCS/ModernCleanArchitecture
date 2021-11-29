package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Either
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposFailure
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposResponse

/** */
interface RepoRepository {

    /** */
    suspend fun getMyRepos(
        username: String
    ): Either<GetMyReposFailure, GetMyReposResponse>

}