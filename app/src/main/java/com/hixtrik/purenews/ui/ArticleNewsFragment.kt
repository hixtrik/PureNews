package com.hixtrik.purenews.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hixtrik.purenews.databinding.FragmentArticleNewsBinding

private const val ARG_newsTitle = "newsTitle"
private const val ARG_newsArticle = "newsArticle"

class ArticleNewsFragment : Fragment() {
    private lateinit var binding: FragmentArticleNewsBinding
    private var newsTitle: String? = null
    private var newsArticle: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            newsTitle = it.getString(ARG_newsTitle)
            newsArticle = it.getString(ARG_newsArticle)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentArticleNewsBinding.inflate(inflater)
        binding.tvArticleNewsTitle.text = newsTitle
        binding.tvArticleNewsArticle.text = newsArticle
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param_newsTitle: String, param_newsArticle: String) =
            ArticleNewsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_newsTitle, param_newsTitle)
                    putString(ARG_newsArticle, param_newsArticle)
                }
            }
    }
}