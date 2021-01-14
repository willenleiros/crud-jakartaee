# Crud JakartaEE8 - Eclipse Fundation

# Objetivo

Desenvolver um esqueleto de projeto corporativo utilizando a plataforma Java com
ecossistema Jakartaee8.

# Caracteristicas

- CDI - Utilização de injeção de dependencia;
- JPA - Utilização da especificação [JPA](https://) e implementação do EclipseLink;
- Teste -  Utilização de testes na camada de serviços com a ferramenta [Junit5](https://junit.org/junit5/);
- Servidor de Aplicação - Glassfish web server;

# Primeiros Passos: configurando o projeto para desenvolvimento

Esta sessão especifica os passos necessários para que o desenvolvedor possa executar o projeto em seu ambiente
de desenvolvimento.

- Instalar o [Java](https://www.java.com/pt-BR/) versão 8 mais estável;
- Definir variáveis de ambiente JAVA_HOME de acordo com o sistema operacional;
- Utilizar a IDE de sua escolha;
- Instalar o banco de dados Postgres (pode ser com o docker com o seguinte comando
  ```docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres```)