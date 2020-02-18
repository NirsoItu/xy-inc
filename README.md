# xy-inc
Teste Desenvolvedor 2 - Zup Innovation

API de serviços de localização de ponto de interesse (POIs).

- Desenvolvido em linguagem Java no framework Spring Boot 2 versão 2.2.4, JDK versão 13, ferramenta de build Gradle 6.1.1, utilizando as dependências Spring Web, Spring JPA e MySQL Driver para utilizar o banco de dados MySQL;

- Antes de iniciar a aplicação, crie um banco de dados MySQL com o nome: db_poi;

- Caso ocorra problema de conexão, verifique o arquivo no "application.properties" as configurações de seu banco de dados como localhost, username, password e altere de acordo com sua necessidade;

- Serviço para cadastrar pontos de interesse, com 3 atributos: através de um client HTTP, inserir a url localhost:8080/pois/addPoi, fazer a requisição utilizando o método Post, com os parâmetros: name, cooX1, cooY1, com seus respectivos valores.

- Serviço para listar todos os POIs cadastrados: através de um client HTTP, fazer a requisição utilizando o método Get com a url localhost:8080/pois/allPois.

- Serviço para listar POIs por proximidade: através de um client HTTP, inserir a url localhost:8080/pois/underTen, fazer a requisição utilizando o método Get, com os parâmetros: cooX2, cooY2, com seus respectivos valores.

- Para rodar os testes utilize o arquivo TestRepository

Muito obrigado pela oportunidade!

Rogério Ferreira da Silva



