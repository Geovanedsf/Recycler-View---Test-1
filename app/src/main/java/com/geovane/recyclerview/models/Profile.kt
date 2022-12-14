package com.geovane.recyclerview.models

data class Profile(
    var nome: String,
    var linguagem: String,
    var imagem: Int, // para passar a ID do drawble
    var url: String
)

