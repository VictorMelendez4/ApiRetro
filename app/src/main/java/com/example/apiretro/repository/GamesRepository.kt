package com.example.apiretro.repository

import com.example.apiretro.data.APIGames
import com.example.apiretro.model.GameList
import javax.inject.Inject

class GamesRepository @Inject constructor(private val apiGames: APIGames){
    suspend fun getGame():List<GameList>?{
        val response=apiGames.getGames()
        if(response.isSuccessful){
            return response.body() as List<GameList>?
        }
        return null
    }
}