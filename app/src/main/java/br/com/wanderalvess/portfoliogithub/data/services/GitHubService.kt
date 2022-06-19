package br.com.wanderalvess.portfoliogithub.data.services

import br.com.wanderalvess.portfoliogithub.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>
}