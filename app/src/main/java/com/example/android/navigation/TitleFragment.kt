package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding


/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment() {

   

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)

        // The two ways to lambda an anonymous function. 1st is without KTX, 2nd is with KTX
//        binding.playButton.setOnClickListener {
////            view -> Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment) // the old way
////            view -> view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment) // The KTX way
//        }

        // Another way is to use the OnClickListener object created by Navigation class
        // Notice that we're using parentheses, not braces since the 1st and 2nd way both use anonymous functions
        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )
        return binding.root
    }


}