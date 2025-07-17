package com.leonardoloss.cepsearch;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário via console
        Scanner leitura = new Scanner(System.in);

        // Instancia a classe responsável pela consulta de CEPs
        ConsultaCep consultaCep = new ConsultaCep();

        // Solicita ao usuário a digitação do CEP
        System.out.println("Informe o seu CEP para realizar a consulta.");
        var cep = leitura.nextLine();

        try {
            // Realiza a consulta e recebe o objeto Endereco correspondente ao CEP informado
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);

            // Exibe no console o resultado da consulta (toString() do record Endereco)
            System.out.println(novoEndereco);

            // Instancia a classe responsável por gerar o arquivo JSON com os dados do endereço
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.arquivoJson(novoEndereco);  // Gera o arquivo com nome baseado no CEP

        } catch (RuntimeException | IOException e) {
            // Em caso de erro (ex: CEP inválido ou falha na conexão), exibe mensagem e encerra
            System.out.println(e.getMessage());
            System.out.println("Aplicação encerrada.");
        }
    }
}
