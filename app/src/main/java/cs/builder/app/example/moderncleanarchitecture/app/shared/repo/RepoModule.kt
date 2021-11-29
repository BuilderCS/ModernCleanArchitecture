package cs.builder.app.example.moderncleanarchitecture.app.shared.repo

import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.data.RepoRepositoryImpl
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.data.data_source.RepoDataSource
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.data.data_source.dummy.RepoDataSourceDummy
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.RepoRepository
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.presentation.get_my_repos.GetMyRepos
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.presentation.get_my_repos.GetMyReposImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    @Binds
    abstract fun providesGetMyRepos(
        getMyReposImpl: GetMyReposImpl,
    ): GetMyRepos

    @Binds
    abstract fun providesRepoRepository(
        repoRepositoryImpl: RepoRepositoryImpl,
    ): RepoRepository

    @Binds
    abstract fun providesRepoDataSource(
        repoDataSourceDummy: RepoDataSourceDummy,
    ): RepoDataSource

}