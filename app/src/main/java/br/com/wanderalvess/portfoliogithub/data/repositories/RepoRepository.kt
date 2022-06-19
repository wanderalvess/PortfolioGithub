package br.com.wanderalvess.portfoliogithub.data.repositories

import br.com.wanderalvess.portfoliogithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}