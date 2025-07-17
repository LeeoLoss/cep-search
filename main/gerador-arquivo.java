package com.leonardoloss.cepsearch;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorArquivo {

    // Método responsável por gerar um arquivo JSON a partir de um objeto Endereco
    public void arquivoJson(Endereco endereco) throws IOException {
        // Cria um objeto Gson com a opção de "pretty printing", que gera um JSON formatado (indentado)
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Cria um FileWriter com o nome do arquivo baseado no CEP do endereço (ex: 01001000.json)
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");

        // Converte o objeto 'endereco' em JSON e escreve no arquivo
        escrita.write(gson.toJson(endereco));

        // Fecha o FileWriter para liberar o recurso do sistema
        escrita.close();
    }
}
