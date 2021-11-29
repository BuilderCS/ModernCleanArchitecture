package cs.builder.app.example.moderncleanarchitecture.app.feature.main.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import cs.builder.app.example.moderncleanarchitecture.R
import cs.builder.app.example.moderncleanarchitecture.app.pool.clean.Status
import cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.use_case.get_my_repos.GetMyReposStatus
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/** */
@AndroidEntryPoint
class SearchFragment : Fragment() {

    /* */
    private val searchViewModel: SearchViewModel by viewModels()

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_search, container, false)

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModel()
        execute()
    }

    /** */
    private fun execute() {
        val username: String = "BuilderCS"
        searchViewModel.launchGetMyReposIfRequired(username)
    }

    /** */
    private fun observeViewModel() {
        observeForMyRepos()
    }

    /** */
    private fun observeForMyRepos() = lifecycleScope.launch {
        searchViewModel.getMyReposStateFlow
            .flowWithLifecycle(lifecycle, Lifecycle.State.CREATED)
            .collectLatest(::getMyReposCollector)
    }

    /** */
    private fun getMyReposCollector(status: GetMyReposStatus) {
        when (status) {
            is Status.Loading ->
                Toast.makeText(requireContext(), "Loading...", Toast.LENGTH_SHORT).show()
            is Status.Failed ->
                Toast.makeText(requireContext(), "Failed: ${status.failure}", Toast.LENGTH_SHORT).show()
            is Status.Done -> {
                Toast.makeText(requireContext(), "Done", Toast.LENGTH_SHORT).show()
                val tvLabel = view?.findViewById<TextView>(R.id.tv_label)
                val label: String = "Done: ${status.value.repos}"
                tvLabel?.text = label
            }
        }
    }

}