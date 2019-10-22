package dev.olog.fortnightly.data

import dev.olog.fortnightly.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ArticleService {

    @GET("/svc/topstories/v2/{section}.json?api-key=${BuildConfig.NY_TIMES_KEY}")
    suspend fun fetchTopStories(@Path("section") section: String = "home"): Response<TopArticlesRemote>

}