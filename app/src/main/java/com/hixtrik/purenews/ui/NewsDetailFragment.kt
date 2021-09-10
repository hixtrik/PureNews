package com.hixtrik.purenews.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hixtrik.purenews.databinding.FragmentNewsDetailBinding

private const val ARG_newsTitle = "newsTitle"
private const val ARG_newsArticle = "newsArticle"
private const val ARG_newsImage = "newsImage"

class NewsDetailFragment : Fragment() {
    private lateinit var binding: FragmentNewsDetailBinding
    private var newsTitle: String? = null
    private var newsArticle: String? = null
    private var newsImage: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            newsTitle = it.getString(ARG_newsTitle)
            newsArticle = it.getString(ARG_newsArticle)
            newsImage = it.getInt(ARG_newsImage)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsDetailBinding.inflate(inflater)
        binding.tvNewsTitle.text = newsTitle
        binding.tvNewsArticle.text = newsArticle
        newsImage?.let { binding.ivNewsImage.setImageResource(it) }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param_newsTitle: String, param_newsArticle: String, param_newsImage: Int) =
            NewsDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_newsTitle, param_newsTitle)
                    putString(ARG_newsArticle, param_newsArticle)
                    putInt(ARG_newsImage, param_newsImage)
                }
            }
    }
}