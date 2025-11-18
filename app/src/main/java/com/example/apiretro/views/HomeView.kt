package com.example.apiretro.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.apiretro.components.CardGame
import com.example.apiretro.components.MainTopBar
import com.example.apiretro.utils.Constants.Companion.CUSTOM_BLACK
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
                    pad: PaddingValues){
    val games by viewModel.games.collectAsState()
    LazyColumn(
        modifier= Modifier
            .padding(pad)
            .background(Color(CUSTOM_BLACK))
    ){
        items(games){item->
            CardGame(item){
                //Agregar navController
            }
            Text(
                text=item.name,
                fontWeight = FontWeight.ExtraBold,
                color=Color.White,
                modifier=Modifier.padding(10.dp)
            )
        }
    }
}