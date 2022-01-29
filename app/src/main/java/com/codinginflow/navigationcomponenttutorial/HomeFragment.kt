package com.codinginflow.navigationcomponenttutorial

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        login_btn.setOnClickListener{
            // use this ..bcoz it runs on compile time
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            // We can use this too..but it can crash on runtime
            // findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
            findNavController().navigate(action)
        }
    }
}