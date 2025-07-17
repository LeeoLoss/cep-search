package com.leonardoloss.cepsearch; // Define o pacote onde o record está localizado

// Define um "record" chamado Endereco, que é uma forma concisa de criar uma classe imutável com apenas dados.
// Essa estrutura representa os dados retornados por uma API de CEP.
public record Endereco(
    String cep,         // Código de Endereçamento Postal
    String logradouro,  // Nome da rua ou avenida
    String bairro,      // Bairro onde o endereço está localizado
    String localidade,  // Cidade
    String uf           // Unidade Federativa (estado, como SP, RJ, etc.)
) {
    // O corpo do record está vazio porque o Java gera automaticamente:
    // - Construtor
    // - Métodos getters
    // - equals(), hashCode() e toString()
}
