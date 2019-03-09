package br.com.stone.challenge.di

import br.com.stone.challenge.feature.facts.FactsViewModel
import br.com.stone.challenge.feature.search.SearchViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val presentationModule = module {

    viewModel { FactsViewModel(factsSource = get()) }
    viewModel { SearchViewModel(factsSource = get()) }

}