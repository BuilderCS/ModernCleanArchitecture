package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.data

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Either
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.data.data_source.RepoDataSource
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.RepoRepository
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposFailure
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposResponse
import javax.inject.Inject
import javax.inject.Singleton

/** */
@Singleton
class RepoRepositoryImpl @Inject constructor(
    private val dataSource: RepoDataSource,
) : RepoRepository {

    /** */
    override suspend fun getMyRepos(
        username: String
    ): Either<GetMyReposFailure, GetMyReposResponse> =
        dataSource.getMyRepos(username)

}