# Documentação das Classes - v0.0.2

Este documento descreve as classes implementadas no Sistema de Controle de Despesas na versão 0.0.2 (POC e MVP).

## Classe: Despesa

**Descrição:** Classe modelo que representa uma despesa no sistema. Armazena informações básicas sobre cada despesa cadastrada.

### Atributos

| Atributo | Tipo | Modificador | Descrição |
|----------|------|-------------|-----------|
| `contadorId` | `int` | `static` | Contador global para gerar IDs únicos automaticamente |
| `id` | `int` | `private` | Identificador único da despesa |
| `descricao` | `String` | `private` | Descrição detalhada da despesa |
| `valor` | `double` | `private` | Valor monetário da despesa em reais |
| `categoria` | `String` | `private` | Categoria ou tipo da despesa (ex: Alimentação, Transporte) |
| `paga` | `boolean` | `private` | Indica se a despesa foi paga (true) ou está pendente (false) |

### Construtores

**Construtor Completo:**
```java
public Despesa(String descricao, double valor, String categoria)
```
Cria uma nova despesa com todos os parâmetros especificados. O ID é gerado automaticamente e o status inicial é "não paga".

**Construtor Sobrecarregado:**
```java
public Despesa(String descricao, double valor)
```
Cria uma nova despesa sem especificar categoria. A categoria padrão "Geral" é atribuída automaticamente. Demonstra o conceito de **sobrecarga de construtores**.

### Métodos

#### Getters e Setters

| Método | Retorno | Descrição |
|--------|---------|-----------|
| `getId()` | `int` | Retorna o ID da despesa |
| `getDescricao()` | `String` | Retorna a descrição da despesa |
| `setDescricao(String)` | `void` | Define uma nova descrição |
| `getValor()` | `double` | Retorna o valor da despesa |
| `setValor(double)` | `void` | Define um novo valor |
| `getCategoria()` | `String` | Retorna a categoria da despesa |
| `setCategoria(String)` | `void` | Define uma nova categoria |
| `isPaga()` | `boolean` | Verifica se a despesa foi paga |
| `setPaga(boolean)` | `void` | Define o status de pagamento |

#### Métodos Especiais

**`toString()`**
```java
public String toString()
```
Sobrescreve o método da classe Object para fornecer uma representação textual formatada da despesa, incluindo todos os seus atributos.

**`getTotalDespesas()` (estático)**
```java
public static int getTotalDespesas()
```
Método estático que retorna o número total de despesas criadas desde o início da execução do programa. Demonstra o uso de **métodos e atributos estáticos**.

### Conceitos de POO Aplicados

- **Encapsulamento:** Todos os atributos são privados, com acesso controlado por getters e setters
- **Sobrecarga de construtores:** Dois construtores diferentes para criar objetos com diferentes níveis de detalhe
- **Métodos estáticos:** Contador global compartilhado entre todas as instâncias
- **Sobrescrita de método:** O método `toString()` é sobrescrito da classe Object

---

## Classe: GerenciadorDespesas

**Descrição:** Classe de serviço responsável por gerenciar a coleção de despesas. Implementa a lógica de negócio para operações CRUD (Create, Read, Update, Delete) e relatórios. Esta classe representa a **Prova de Conceito (POC)** do sistema.

### Atributos

| Atributo | Tipo | Modificador | Descrição |
|----------|------|-------------|-----------|
| `despesas` | `List<Despesa>` | `private` | Lista que armazena todas as despesas em memória |

### Construtor

```java
public GerenciadorDespesas()
```
Inicializa o gerenciador criando uma nova ArrayList vazia para armazenar as despesas.

### Métodos

#### Operações CRUD

**`cadastrarDespesa()`**
```java
public void cadastrarDespesa(String descricao, double valor, String categoria)
```
Cria uma nova despesa com os parâmetros fornecidos e adiciona à lista de despesas. Exibe mensagem de confirmação com o ID gerado.

**`listarDespesas()`**
```java
public void listarDespesas()
```
Exibe todas as despesas cadastradas no sistema, independentemente do status de pagamento. Mostra também o total de despesas.

**`excluirDespesa()`**
```java
public void excluirDespesa(int id)
```
Remove uma despesa da lista com base no ID fornecido. Exibe mensagem de sucesso ou erro caso o ID não seja encontrado.

#### Operações de Consulta

**`listarDespesasPendentes()`**
```java
public void listarDespesasPendentes()
```
Filtra e exibe apenas as despesas que ainda não foram pagas (status `paga = false`).

**`listarDespesasPagas()`**
```java
public void listarDespesasPagas()
```
Filtra e exibe apenas as despesas que já foram pagas (status `paga = true`).

#### Operações de Pagamento

**`registrarPagamento()`**
```java
public void registrarPagamento(int id)
```
Marca uma despesa como paga, alterando seu status. Verifica se a despesa existe e se já não foi paga anteriormente.

#### Relatórios

**`relatorioPorCategoria()`**
```java
public void relatorioPorCategoria(String categoria)
```
Calcula e exibe o total de despesas de uma categoria específica, incluindo a quantidade de despesas e o valor total acumulado.

**`getTotalGeral()`**
```java
public double getTotalGeral()
```
Calcula e retorna o valor total de todas as despesas cadastradas no sistema.

### Conceitos de POO Aplicados

- **Encapsulamento:** A lista de despesas é privada e só pode ser manipulada através dos métodos públicos
- **Responsabilidade Única:** A classe tem apenas uma responsabilidade: gerenciar despesas
- **Uso de Collections:** Utiliza ArrayList para armazenamento dinâmico de objetos
- **Validações:** Implementa verificações antes de executar operações (ex: verificar se despesa existe)

---

## Diagrama de Classes Simplificado

```
┌─────────────────────────┐
│       Main              │
├─────────────────────────┤
│ - gerenciador: static   │
│ - scanner: static       │
├─────────────────────────┤
│ + main()                │
│ - exibirMenu()          │
│ - entrarDespesa()       │
│ - anotarPagamento()     │
│ ...                     │
└───────────┬─────────────┘
            │ usa
            ▼
┌─────────────────────────┐
│  GerenciadorDespesas    │
├─────────────────────────┤
│ - despesas: List        │
├─────────────────────────┤
│ + cadastrarDespesa()    │
│ + listarDespesas()      │
│ + excluirDespesa()      │
│ + registrarPagamento()  │
│ + relatorioPorCategoria()│
└───────────┬─────────────┘
            │ gerencia
            ▼
┌─────────────────────────┐
│       Despesa           │
├─────────────────────────┤
│ - id: int               │
│ - descricao: String     │
│ - valor: double         │
│ - categoria: String     │
│ - paga: boolean         │
│ - contadorId: static    │
├─────────────────────────┤
│ + Despesa(...)          │
│ + getId()               │
│ + getDescricao()        │
│ + toString()            │
│ + getTotalDespesas()    │
└─────────────────────────┘
```

## Fluxo de Dados

O fluxo de dados no sistema segue o padrão:

**Usuário → Main → GerenciadorDespesas → Despesa**

1. O usuário interage com o sistema através do menu na classe `Main`
2. A classe `Main` delega as operações para o `GerenciadorDespesas`
3. O `GerenciadorDespesas` cria, manipula e consulta objetos da classe `Despesa`
4. Os resultados são retornados e exibidos ao usuário através da classe `Main`

## Limitações da Versão Atual (v0.0.2)

Esta versão é um **MVP (Minimum Viable Product)** e possui as seguintes limitações:

- **Armazenamento em memória:** Todos os dados são perdidos ao encerrar o programa
- **Sem persistência:** Não há salvamento em arquivos de texto
- **Funcionalidades parciais:** Gerenciamento de tipos de despesa e usuários não implementados
- **Sem autenticação:** Não há sistema de login
- **Sem criptografia:** Senhas não são utilizadas nesta versão
- **Sem herança:** Classes específicas de despesa (Transporte, Eventual, etc.) não implementadas
- **Sem interfaces:** Interfaces como `Pagavel` não implementadas

Estas funcionalidades serão desenvolvidas em versões futuras conforme o projeto evolui.
