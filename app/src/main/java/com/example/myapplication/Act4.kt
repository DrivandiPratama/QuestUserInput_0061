package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variable-variable unutk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "")}
    var textAlamat by remember { mutableStateOf(value = "")}
    var textJK by remember { mutableStateOf(value = "")}
    val gender: List<String> = listOf("Laki-laki","Perempuan")

    //variable-variable untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf(value = "")}
}