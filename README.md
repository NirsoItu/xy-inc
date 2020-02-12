# xy-inc
Teste Desenvolvedor 2 - Zup Innovation

**API de serviços de localização de ponto de interesse (POIs).

- Desenvolvido em linguagem Java no framework Spring Boot 2 versão 2.2.4, JDK versão 13, Gradle 6.1.1, utilizando as dependências Spring Web, Spring JPA e MySQL Driver para utilizar o banco de dados MySQL;

- Antes de iniciar a aplicação, crie um banco de dados MySQL com o nome: db_poi;

- Caso ocorra problema de conexão, verifique o arquivo no "application.properies" se as propriedades correspondem as configurações de seu banco de dados como localhost, username e password;

**- Serviço para cadastrar pontos de interesse, com 3 atributos: através de um client HTTP, inserir a url localhost:8080/pois/addPoi, através do método Post, os parâmetros: name, cooX1, cooY1, com seus respectivos valores.

**- Serviço para listar todos os POIs cadastrado: através de um client HTTP, fazer a requisição utilizando o método Get com a url localhost:8080/pois/allPois.

**- Serviço para listar POIs por proximidade: através de um client HTTP, fazer a requisição utilizando o método Get com a url localhost:8080/pois/underTen.

- Os testes não foram realizados devido a um problema em meu ambiente de testes, mas estão todos no arquivo PoisControllerIntegrationTest.
**error: No tests found for given includes: [com.xyinc.gps.PoisControllerIntegrationTest](filter.includeTestsMatching)

Muito obrigado pela oportunidade!

Rogério Ferreira da Silva



