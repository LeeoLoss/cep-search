package com.leonardoloss.cepsearch; // Define o pacote onde a classe está localizada

// Importa classes necessárias para fazer requisições HTTP
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Importa a biblioteca Gson para converter JSON em objeto Java
import com.google.gson.Gson;

public class ConsultaCep {

    // Método que faz a busca de um endereço a partir de um CEP
    public Endereco buscaEndereco(String cep) {

        // Monta a URI para fazer a requisição à API do ViaCEP com o CEP informado
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        // Cria um objeto de requisição HTTP usando a URI definida acima
        HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .build();

        try {
            // Envia a requisição HTTP e obtém a resposta como String (JSON)
            HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

            // Converte o JSON da resposta para um objeto da classe Endereco
            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            // Lança uma exceção caso ocorra qualquer erro durante a requisição
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.", e);
        }
    }
}
