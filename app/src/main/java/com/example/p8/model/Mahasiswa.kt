package com.example.p8.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,

    @SerialName("jenis_kelamin")
    val jenisKelamin: String,
    val angkatan: String
)
