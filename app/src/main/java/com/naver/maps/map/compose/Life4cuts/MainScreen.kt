package com.naver.maps.map.compose.Life4cuts

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import com.naver.maps.map.compose.Life4cuts.navigation.BottomNavigationBar
import com.naver.maps.map.compose.Life4cuts.navigation.NagivationHost

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(auth: FirebaseAuth) {
    var auth = FirebaseAuth.getInstance()
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            NagivationHost(navController = navController,auth)
        }
    }
}