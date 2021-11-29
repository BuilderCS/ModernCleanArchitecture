package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.data.data_source.dummy

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Either
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.data.data_source.RepoDataSource
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.entity.Repo
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposFailure
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposResponse
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

/** */
@Singleton
class RepoDataSourceDummy @Inject constructor() : RepoDataSource {

    /** */
    override suspend fun getMyRepos(
        username: String
    ): Either<GetMyReposFailure, GetMyReposResponse> {
        delay(5_000)
        val repo = Repo(
            id = 431684427,
            name = "ModernCleanArchitecture",
            description = "Simple android application that makes use of Clean Architecture guidelines with modern Android libraries.",
            url = "https://api.github.com/repos/BuilderCS/ModernCleanArchitecture",
            language = "Kotlin",
            createdAtUnix = 1637827334L,
            updatedAtUnix = 1638057098L,
        )
        val repos: List<Repo> = listOf(repo)
        val response = GetMyReposResponse(repos)
        return Either.Right(response)
    }

}