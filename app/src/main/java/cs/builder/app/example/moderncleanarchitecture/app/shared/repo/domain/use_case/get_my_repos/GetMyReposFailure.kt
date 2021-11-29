package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Failure

/** Possible failures to "Get my repos" execution flow. */
sealed class GetMyReposFailure : Failure() {

    /** Emitted when the user don't have Internet Connection. */
    object NetworkConnectionFailure: GetMyReposFailure()

    /** Emitted when the flow fails with the [details] message. */
    data class DetailsFailure(
        val details: String,
    ): GetMyReposFailure()

}
