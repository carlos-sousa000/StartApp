package br.gov.sp.etec.startapp2.model

data class Vaga(
    val numero : Int,
    val status : Boolean,
    val placa  : String,
    val tipoVaga: TipoVaga
    )
