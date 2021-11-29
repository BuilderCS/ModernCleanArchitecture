package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos

/** Required params for "Get my repos" execution flow. */
data class GetMyReposParams(
    val username: String,
)