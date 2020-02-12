# xy-inc
Teste Desenvolvedor 2 - Zup Innovation

API de serviços de localização de ponto de interesse (POIs).

- Desenvolvido em linguagem Java no framework Spring Boot 2 versão 2.2.4, JDK versão 13, utilizando as dependências Spring Web, Spring JPA e MySQL Driver para utilizar o banco de dados MySQL;

- Antes de iniciar a aplicação, crie um banco de dados MySQL com o nome: db_poi;

- Caso ocorra problema de conexão, verifique o arquivo no "application.properies" se as propriedades correspondem as configurações de seu banco de dados como localhost, username e password;

- Serviço de cadastro de POI: através de um client HTTP utilizando o método Post na seguinte url: localhost:8080/pois/addPoi, inserir os valores nos parametros Key: name, cooX1 e cooY1.

- Serviço para listar todos os POIs cadastrados: através de um client HTTP utilizando o método Get na seguinte url: localhost:8080/pois/allPois.

- Serviço para listar POIs por proximidade: através de um client HTTP utilizando o método Get na seguinte url: localhost:8080/pois/underTen.

- Não foi possível completar os testes devido a problemas de configuração do Gradle em minha maquina, mas os métodos estão no arquivo PoisControllerIntegrationTest.java



