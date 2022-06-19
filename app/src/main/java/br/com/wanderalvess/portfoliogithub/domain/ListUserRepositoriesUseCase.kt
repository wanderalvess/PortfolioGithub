package br.com.wanderalvess.portfoliogithub.domain

import br.com.wanderalvess.portfoliogithub.core.UseCase
import br.com.wanderalvess.portfoliogithub.data.model.Repo
import br.com.wanderalvess.portfoliogithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}