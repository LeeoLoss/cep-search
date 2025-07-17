# 📍 CEP Search

Aplicação Java simples para busca de endereços a partir de um CEP, utilizando a API pública [ViaCEP](https://viacep.com.br/). A aplicação consulta os dados do CEP fornecido, exibe o endereço e salva as informações em um arquivo `.json`.

---

## ✨ Funcionalidades

- Consulta de endereço a partir de um CEP.
- Exibição dos dados formatados no terminal.
- Geração automática de um arquivo JSON com os dados da consulta.

---

## 🧪 Tecnologias Utilizadas

- Java 17+
- API HTTP Client (`java.net.http`)
- Gson (`com.google.gson`)
- Scanner (`java.util.Scanner`)
- Exception (`java.io.IOException`)
- API ViaCEP (https://viacep.com.br/)

---

## 📁 Estrutura do Projeto

- `main/`  
  Contém as classes:  
  - `principal.java`  
  - `consulta-cep.java`  
  - `endereco.java`  
  - `gerador-arquivo.java`

  Module-info: 
  - `module-info.java`
 
## 📦 Exemplo de Saída JSON
```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP"
}

