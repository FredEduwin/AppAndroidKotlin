package com.example.calculadora.domain

import com.example.calculadora.data.model.QuoteModel
import com.example.calculadora.data.model.QuoteProvider
import com.example.calculadora.data.repositories.QuoteRepository

class GetRandomQuoteUseCase {

    private val repository = QuoteRepository()

    operator fun  invoke():QuoteModel?{
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val  randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}