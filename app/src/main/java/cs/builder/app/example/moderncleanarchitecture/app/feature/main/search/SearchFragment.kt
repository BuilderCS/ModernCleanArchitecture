package cs.builder.app.example.moderncleanarchitecture.app.feature.main.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import cs.builder.app.example.moderncleanarchitecture.R

/** */
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
        setupViews()
    }

    /** */
    private fun setupViews() {
        val requiredLabel: String = searchViewModel.testItem
        view?.findViewById<TextView>(R.id.tv_label)?.text = requiredLabel
    }

}