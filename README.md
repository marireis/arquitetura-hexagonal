# Arquitetura Hexagonal em Microsserviços

Este repositório demonstra a implementação de uma arquitetura hexagonal em microsserviços, que se comunicam com outros clients, banco de dados e mensageria. O foco principal está na construção detalhada de um CRUD, abordando a criação de domains, usecases, adapters e controllers, bem como a implementação de consumidores e produtores de mensageria.

## Tecnologias Utilizadas

- **Linguagem de Programação**: Java
- **Framework**: Spring Boot
- **Produtor/Consumidor de Mensageria**: Apache Kafka
- **Banco de Dados NoSQL**: MongoDB
- **Imagens do Kafka e MongoDB**: Docker

## Estrutura do Projeto

### Application (Regra de Negócio - Isolado, sem Frameworks)

#### Core
- **domain**: Pacote de domínio contendo as entidades e objetos de valor.
- **usecase**: Contém as regras de negócio da aplicação.

#### Ports
- **in (interfaces)**: Portas de entrada para acessar o core.
- **out (interfaces)**: Portas de saída para sair do core.

### Adapters (Implementações das Portas de Entrada e Saída)

#### In (Adaptadores de Entrada)
- **controller**: Controladores REST que expõem as APIs.
- **consumer**: Consumidores de fila do Kafka.

#### Out (Adaptadores de Saída)
- **client**: Clientes para acessar outros microsserviços.
- **repository**: Repositórios para acessar o banco de dados.

## Fluxo

![Arquitetura Hexagonal - Visão Geral](https://github.com/user-attachments/assets/0d4a94ca-a153-4f9f-8575-78ca6663a3ea)
![Fluxo de Comunicação](https://github.com/user-attachments/assets/8285b65a-ecee-4215-9c6e-ded8dbdda81d)

## Como Executar

1. **Clonar o Repositório**:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
