# 📚 Sistema CRUD de Produtos com Testes Automatizados (Mockito + JMeter)

## 1. 📝 Descrição do Projeto

[cite_start]Este projeto implementa uma **API RESTful** completa com operações CRUD (Create, Read, Update, Delete) para a entidade **Produto**[cite: 3]. [cite_start]A aplicação foi desenvolvida em **Java** utilizando o framework **Spring Boot**[cite: 3].

[cite_start]A arquitetura do sistema é dividida nas seguintes camadas[cite: 5]:
* [cite_start]**Controller**: Responsável por expor os endpoints HTTP[cite: 6].
* [cite_start]**Service**: Contém a lógica de negócio principal[cite: 7].
* [cite_start]**Repository**: Interface de comunicação com o banco de dados[cite: 8].

[cite_start]O banco de dados utilizado é o **[H2/PostgreSQL]**[cite: 9].

### Requisitos Funcionais (Endpoints Implementados):

[cite_start]O projeto expõe os seguintes endpoints[cite: 9]:
* [cite_start]**Criar** registro [cite: 10]
* [cite_start]**Listar todos** os registros [cite: 11]
* [cite_start]**Buscar por ID** [cite: 12]
* [cite_start]**Atualizar** registro [cite: 13]
* [cite_start]**Excluir** registro [cite: 14]

[cite_start]A entidade Produto contém no mínimo 4 atributos, incluindo o identificador único (`id`)[cite: 15].

---

## 2. ⚙️ Pré-requisitos

Para executar e testar a aplicação, você precisará ter instalado:

* **Java Development Kit (JDK) 17+**
* **Apache Maven** (ou Gradle)
* **Apache JMeter** (Para rodar os testes de desempenho)

---

## 3. ▶️ Instruções de Execução da Aplicação

Siga os passos abaixo para iniciar a API localmente.

### 3.1. Compilação
Abra o terminal na raiz do projeto e execute o comando Maven para compilar, baixar dependências e gerar o arquivo JAR:

```bash
mvn clean install
