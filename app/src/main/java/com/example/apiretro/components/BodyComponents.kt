package com.example.apiretro.components

import android.service.autofill.OnClickAction
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(title:String, showBackButton:Boolean=false, onClickBackButton:()-> Unit,
               onClickAction: OnClickAction:()-> Unit){
    TopAppBar(
        title = { Text(text = title,color = Color.White, fontWeight = FontWeight.Bold)},
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor =
        )

    )
}