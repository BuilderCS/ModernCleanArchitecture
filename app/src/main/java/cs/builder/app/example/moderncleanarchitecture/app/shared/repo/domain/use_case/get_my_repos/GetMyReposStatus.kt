package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Status

/** */
typealias GetMyReposStatus = Status<GetMyReposFailure, GetMyReposResponse>