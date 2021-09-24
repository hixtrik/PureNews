package com.hixtrik.purenews.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.hixtrik.purenews.R
import com.hixtrik.purenews.databinding.FragmentMainBinding
import kotlin.random.Random

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var newsTitle: String
    private lateinit var newsArticle: String
    private var newsImage: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        val fragmentTransaction = parentFragmentManager.beginTransaction()
        repeat(25) {
            val frameLayout = FrameLayout(requireContext())
            frameLayout.id = View.generateViewId()
            frameLayout.background = resources.getDrawable(R.color.cardview_light_background, null)
            frameLayout.setPadding(15, 15, 15, 15)
            val params = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(10, 10, 10, 10)
            frameLayout.layoutParams = params
            binding.mainFragment.addView(frameLayout)
            when (Random.nextInt(1, 15)) {
                1 -> {
                    newsTitle = resources.getString(R.string.google_title)
                    newsArticle = resources.getString(R.string.google_article)
                    newsImage = R.drawable.googledoodle
                    createBigNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                2 -> {
                    newsTitle = resources.getString(R.string.google_title)
                    newsArticle = resources.getString(R.string.google_article)
                    newsImage = R.drawable.googledoodle
                    createSmallNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                3 -> {
                    newsTitle = resources.getString(R.string.kanada_title)
                    newsArticle = resources.getString(R.string.kanada_article)
                    newsImage = R.drawable.kanada
                    createBigNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                4 -> {
                    newsTitle = resources.getString(R.string.kanada_title)
                    newsArticle = resources.getString(R.string.kanada_article)
                    newsImage = R.drawable.kanada
                    createSmallNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                5 -> {
                    newsTitle = resources.getString(R.string.rusya_title)
                    newsArticle = resources.getString(R.string.rusya_article)
                    newsImage = R.drawable.rusya
                    createBigNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                6 -> {
                    newsTitle = resources.getString(R.string.rusya_title)
                    newsArticle = resources.getString(R.string.rusya_article)
                    newsImage = R.drawable.rusya
                    createSmallNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                7 -> {
                    newsTitle = resources.getString(R.string.android_title)
                    newsArticle = resources.getString(R.string.android_article)
                    newsImage = R.drawable.android
                    createBigNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                8 -> {
                    newsTitle = resources.getString(R.string.android_title)
                    newsArticle = resources.getString(R.string.android_article)
                    newsImage = R.drawable.android
                    createSmallNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                9 -> {
                    newsTitle = resources.getString(R.string.android_title)
                    newsArticle = resources.getString(R.string.android_article)
                    newsImage = R.drawable.android
                    createArticleNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                10 -> {
                    newsTitle = resources.getString(R.string.rusya_title)
                    newsArticle = resources.getString(R.string.rusya_article)
                    newsImage = R.drawable.rusya
                    createArticleNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                11 -> {
                    newsTitle = resources.getString(R.string.google_title)
                    newsArticle = resources.getString(R.string.google_article)
                    newsImage = R.drawable.googledoodle
                    createArticleNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                12 -> {
                    newsTitle = resources.getString(R.string.marvel_title)
                    newsArticle = resources.getString(R.string.marvel_article)
                    newsImage = R.drawable.marvel
                    createArticleNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                13 -> {
                    newsTitle = resources.getString(R.string.marvel_title)
                    newsArticle = resources.getString(R.string.marvel_article)
                    newsImage = R.drawable.marvel
                    createBigNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
                14 -> {
                    newsTitle = resources.getString(R.string.marvel_title)
                    newsArticle = resources.getString(R.string.marvel_article)
                    newsImage = R.drawable.marvel
                    createSmallNews(
                        newsTitle,
                        newsImage,
                        frameLayout,
                        newsArticle,
                        fragmentTransaction,
                        it
                    )
                }
            }
        }
        fragmentTransaction.commit()
        return binding.root
    }

    private fun createSmallNews(
        newsTitle: String,
        newsImage: Int,
        frameLayout: FrameLayout,
        newsArticle: String,
        fragmentTransaction: FragmentTransaction,
        it: Int
    ) {
        val smallNewsFragment =
            SmallNewsFragment.newInstance(
                newsTitle,
                newsImage
            )
        frameLayout.setOnClickListener {
            val fragmentTransaction2 = parentFragmentManager.beginTransaction()
            val newsDetailFragment = NewsDetailFragment.newInstance(
                newsTitle,
                newsArticle,
                newsImage
            )
            binding.mainFragment.removeAllViews()
            fragmentTransaction2.replace(binding.mainFragment.id, newsDetailFragment)
            fragmentTransaction2.addToBackStack("newsDetail")
            fragmentTransaction2.commit()
        }
        fragmentTransaction.add(binding.mainFragment[it + 2].id, smallNewsFragment)
    }

    private fun createBigNews(
        newsTitle: String,
        newsImage: Int,
        frameLayout: FrameLayout,
        newsArticle: String,
        fragmentTransaction: FragmentTransaction,
        it: Int
    ) {
        val bigNewsFragment =
            BigNewsFragment.newInstance(
                newsTitle,
                newsImage
            )
        frameLayout.setOnClickListener {
            val fragmentTransaction2 = parentFragmentManager.beginTransaction()
            val newsDetailFragment = NewsDetailFragment.newInstance(
                newsTitle,
                newsArticle,
                newsImage
            )
            binding.mainFragment.removeAllViews()
            fragmentTransaction2.replace(binding.mainFragment.id, newsDetailFragment)
            fragmentTransaction2.addToBackStack("newsDetail")
            fragmentTransaction2.commit()
        }
        fragmentTransaction.add(binding.mainFragment[it + 2].id, bigNewsFragment)
    }

    private fun createArticleNews(
        newsTitle: String,
        newsImage: Int,
        frameLayout: FrameLayout,
        newsArticle: String,
        fragmentTransaction: FragmentTransaction,
        it: Int
    ) {
        val articleNewsFragment =
            ArticleNewsFragment.newInstance(
                newsTitle,
                newsArticle
            )
        frameLayout.setOnClickListener {
            val fragmentTransaction2 = parentFragmentManager.beginTransaction()
            val newsDetailFragment = NewsDetailFragment.newInstance(
                newsTitle,
                newsArticle,
                newsImage
            )

            binding.mainFragment.removeAllViews()
            fragmentTransaction2.replace(binding.mainFragment.id, newsDetailFragment)
            fragmentTransaction2.addToBackStack("newsDetail")
            fragmentTransaction2.commit()
        }
        fragmentTransaction.add(binding.mainFragment[it + 2].id, articleNewsFragment)
    }
}