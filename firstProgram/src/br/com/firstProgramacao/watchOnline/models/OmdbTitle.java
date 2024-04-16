package br.com.firstProgramacao.watchOnline.models;

// UMA "CLASSE" IMUTÁVEL
// ESSA CLASSE SERVE PARA A SABER COMO OS DADOS ESTÃO SENDO RECEBIDOS, EM VEZ DE FAZER UM @SERIALIZED
public record OmdbTitle(String title, String year, String duration) {
}
