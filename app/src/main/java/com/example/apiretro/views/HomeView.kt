package com.example.apiretro.views

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.apiretro.components.MainTopBar
import com.example.apiretro.viewModel.GamesViewModel

@Composable
fun HomeView(viewModel: GamesViewModel){
    Scaffold(
        topBar={
            MainTopBar(title="API GAMES",onClickBackButton={}){
                //Nav
            }
        }
    ){
        ContentHomeView(viewModel,it)
    }
}
@Composable
fun ContentHomeView(viewModel: GamesViewModel,
                    pad: PaddingValues
){
    val games by viewModel.games.collectAsState()
}