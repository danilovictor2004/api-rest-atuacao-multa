# Autuação de Multas Veiculares - Spring REST API

Este projeto consiste em uma aplicação de autuação de multas veiculares desenvolvida utilizando o framework Spring para construção de uma API REST. A finalidade desta API é permitir que autoridades de trânsito registrem e gerenciem multas aplicadas a veículos, oferecendo funcionalidades para consulta, criação, atualização e exclusão de multas.

## Funcionalidades

- **Registro de Multas:** Permite o registro de novas multas, incluindo informações como placa do veículo, descrição da infração, valor da multa, entre outros.

- **Consulta de Multas:** Possibilita a consulta de multas por diversos critérios, como placa do veículo, número da infração, data de aplicação, entre outros.

- **Atualização de Multas:** Permite a atualização de informações de multas existentes, como status de pagamento, valor da multa, entre outros.

- **Exclusão de Multas:** Permite a exclusão de multas do sistema, caso necessário.

## Tecnologias Utilizadas

- **Spring Framework:** Utilizado para construção da aplicação backend, incluindo o uso de Spring Boot para inicialização rápida do projeto e configuração simplificada.

- **Spring Data JPA:** Utilizado para integração com o banco de dados, facilitando o acesso e manipulação dos dados.

- **Spring MVC:** Utilizado para implementação da arquitetura MVC (Model-View-Controller) na API REST.

- **Hibernate:** Utilizado como ORM (Object-Relational Mapping) para mapeamento objeto-relacional e interação com o banco de dados.

- **MySQL:** Banco de dados relacional utilizado para armazenamento persistente dos dados das multas.

## Como Executar o Projeto

1. **Clonar o Repositório:**

2. **Configurar o Banco de Dados:**
- Crie um banco de dados MySQL.
- Configure as credenciais do banco de dados no arquivo `application.properties`.

3. **Executar a Aplicação:**
- Execute a classe principal `Application.java` para iniciar a aplicação Spring Boot.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
