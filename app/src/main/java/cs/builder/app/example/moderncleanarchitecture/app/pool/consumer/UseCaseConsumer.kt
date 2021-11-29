package cs.builder.app.example.moderncleanarchitecture.app.pool.consumer

import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

/** */
fun <Response, Params, F: Failure> UseCase<Response, Params, F>.launchAndAssociateUseCase(
    params: Params,
    mutableStateFlow: MutableStateFlow<Status<F, Response>>,
) = CoroutineScope(Dispatchers.IO).launch {
    mutableStateFlow.value = Status.Loading()
    run(params)
        .onLeft { mutableStateFlow.value = Status.Failed(it) }
        .onRight { mutableStateFlow.value = Status.Done(it) }
}