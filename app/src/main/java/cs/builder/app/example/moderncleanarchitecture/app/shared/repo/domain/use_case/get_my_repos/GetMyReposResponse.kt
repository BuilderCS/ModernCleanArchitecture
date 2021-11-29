package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos

import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.entity.Repo

/** Obtained success response for "Get my repos" execution flow. */
data class GetMyReposResponse(
    val repos: List<Repo>
)
