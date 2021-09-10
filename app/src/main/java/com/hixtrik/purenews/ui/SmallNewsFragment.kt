package com.hixtrik.purenews.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hixtrik.purenews.databinding.FragmentSmallNewsBinding

private const val ARG_newsTitle = "newsTitle"
private const val ARG_newsImage = "newsImage"

class SmallNewsFragment : Fragment() {
    private lateinit var binding: FragmentSmallNewsBinding
    private var newsTitle: String? = null
    private var newsImage: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            newsTitle = it.getString(ARG_newsTitle)
            newsImage = it.getInt(ARG_newsImage)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSmallNewsBinding.inflate(inflater)

        binding.tvBigNews.text = newsTitle
        newsImage?.let { binding.ivBigNews.setImageResource(it) }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param_newsTitle: String, param_newsImage: Int) =
            SmallNewsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_newsTitle, param_newsTitle)
                    putInt(ARG_newsImage, param_newsImage)
                }
            }
    }
}