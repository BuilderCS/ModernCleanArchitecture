package cs.builder.app.example.moderncleanarchitecture.app.feature.main.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cs.builder.app.example.moderncleanarchitecture.R

/** */
class AboutFragment : Fragment() {

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_about, container, false)

}