# Sistema de Controle de Despesas

## Descrição do Projeto

Este projeto consiste no desenvolvimento de um **Sistema de Controle de Despesas** em Java, com o objetivo de permitir ao usuário gerenciar suas despesas e pagamentos de forma organizada e eficiente. O sistema será desenvolvido utilizando conceitos de **Programação Orientada a Objetos (POO)**, incluindo classes abstratas, herança, interfaces, polimorfismo e encapsulamento.

## Objetivo Geral

O sistema final deverá permitir ao usuário realizar as seguintes operações:

- **Cadastrar despesas** com informações detalhadas (descrição, valor, data de vencimento, categoria)
- **Registrar pagamentos** de despesas específicas
- **Listar despesas** filtradas por status (pagas ou pendentes) e por período
- **Gerenciar tipos de despesa** (criar, editar, listar e excluir categorias)
- **Gerenciar usuários** com autenticação e senhas criptografadas
- **Persistir dados** em arquivos de texto separados

## Estratégia de Construção

O desenvolvimento do sistema seguirá uma abordagem incremental e iterativa, dividida em três fases principais:

### Fase 1 - B4T01.1 (v0.0.1): Estrutura Inicial e Menu

Nesta primeira fase, o foco está em estabelecer a estrutura básica do projeto e criar o menu principal de navegação. As atividades incluem:

- Criação do repositório no GitHub
- Implementação do menu principal com todas as opções do sistema
- Exibição de mensagens (`println`) para cada funcionalidade ao ser selecionada
- Documentação inicial no arquivo `README.md` e `CHANGELOG.md` na pasta `/docs`

**Entregáveis:**
- Repositório criado e clonado
- Menu funcional com navegação básica
- Documentação inicial

### Fase 2 - B4T01.2 (v0.0.2): Separação de Prioridades, POC e Projeto do MVP

Na segunda fase, o desenvolvimento avança para a criação das classes fundamentais e a implementação de uma Prova de Conceito (POC). As atividades incluem:

- Definição e priorização das funcionalidades essenciais
- Criação das classes principais: `Despesa`, `TipoDespesa`, `Usuario`, `Pagamento`
- Implementação de classes de serviço para gerenciar as operações
- Desenvolvimento de um MVP (Minimum Viable Product) funcional em memória
- Aplicação de conceitos de POO: classes, atributos, métodos, construtores

**Entregáveis:**
- Classes de modelo implementadas
- POC funcional com operações básicas
- MVP operacional (armazenamento em memória)

### Fase 3 - B4T01.3 (v0.0.3): MVP Final Documentado com Tags

Na fase final, o MVP será consolidado, documentado e preparado para entrega. As atividades incluem:

- Refinamento das funcionalidades implementadas
- Documentação completa de todas as classes, métodos e atributos
- Atualização do `README.md` com instruções de uso e arquitetura
- Atualização do `CHANGELOG.md` com histórico detalhado de versões
- Criação de tags Git para versionamento adequado (`v0.0.1`, `v0.0.2`, `v0.0.3`)
- Testes e validação do sistema

**Entregáveis:**
- MVP completo e funcional
- Documentação técnica detalhada
- Tags Git aplicadas corretamente
- Sistema pronto para evolução futura

## Arquitetura do Sistema (Planejamento)

O sistema será organizado utilizando os seguintes componentes principais:

### Classes de Modelo (Model)

- **Despesa**: Classe abstrata que representa uma despesa genérica
  - Atributos: id, descrição, valor, dataVencimento, dataPagamento, status, tipoDespesa
  - Métodos: getters, setters, calcularJuros(), validarDespesa()

- **DespesaTransporte**, **DespesaEventual**, **DespesaSuperfulo**: Classes concretas que herdam de Despesa
  - Implementam comportamentos específicos de cada categoria

- **TipoDespesa**: Classe para categorização de despesas
  - Atributos: id, nome, descrição
  - Métodos: getters, setters

- **Usuario**: Classe para gerenciamento de usuários
  - Atributos: id, nome, login, senhaCriptografada
  - Métodos: autenticar(), criptografarSenha()

- **Pagamento**: Classe para registro de pagamentos
  - Atributos: id, despesaId, valor, dataPagamento
  - Métodos: getters, setters, validarPagamento()

### Interfaces

- **Pagavel**: Interface que define o contrato para objetos que podem ser pagos
  - Métodos: registrarPagamento(), verificarStatusPagamento()

- **Auditavel**: Interface para rastreamento de alterações
  - Métodos: registrarAlteracao(), obterHistorico()

### Classes de Serviço (Service)

- **GerenciadorDespesas**: Gerencia operações relacionadas a despesas
  - Métodos: cadastrarDespesa(), listarDespesas(), editarDespesa(), excluirDespesa()

- **GerenciadorPagamentos**: Gerencia operações de pagamento
  - Métodos: registrarPagamento(), listarPagamentos()

- **GerenciadorTipos**: Gerencia tipos de despesa
  - Métodos: criarTipo(), editarTipo(), listarTipos(), excluirTipo()

- **GerenciadorUsuarios**: Gerencia usuários do sistema
  - Métodos: cadastrarUsuario(), autenticarUsuario(), listarUsuarios()

### Persistência de Dados

- **ArquivoTexto**: Classe utilitária para leitura e escrita em arquivos
  - Métodos: ler(), escrever(), atualizar(), excluir()

- Arquivos separados:
  - `despesas.txt`: Armazena todas as despesas
  - `tipos_despesa.txt`: Armazena os tipos de despesa
  - `usuarios.txt`: Armazena usuários com senhas criptografadas
  - `pagamentos.txt`: Armazena registros de pagamentos

## Conceitos de POO Aplicados

O sistema implementará os seguintes conceitos de Programação Orientada a Objetos:

1. **Herança**: Classes específicas de despesa herdam da classe abstrata `Despesa`
2. **Polimorfismo**: Objetos de diferentes tipos de despesa podem ser tratados como `Despesa`
3. **Interfaces**: Contratos definidos para comportamentos comuns (`Pagavel`, `Auditavel`)
4. **Encapsulamento**: Atributos privados com acesso controlado por getters e setters
5. **Abstração**: Classe abstrata `Despesa` define comportamentos comuns
6. **Sobrecarga de construtores**: Múltiplas formas de criar objetos
7. **Métodos e atributos estáticos**: Contadores globais, métodos utilitários
8. **Criptografia**: Método para criptografar senhas antes do armazenamento

## Como Executar (v0.0.1)

Nesta versão inicial, o sistema possui apenas o menu de navegação:

1. Certifique-se de ter o **Java Development Kit (JDK)** instalado (versão 8 ou superior)
2. Clone o repositório:
   ```bash
   git clone https://github.com/Unknownluna/sistema-controle-despesas.git
   ```
3. Navegue até a pasta do projeto:
   ```bash
   cd sistema-controle-despesas
   ```
4. Compile o arquivo Java:
   ```bash
   javac Main.java
   ```
5. Execute o programa:
   ```bash
   java Main
   ```

## Estrutura de Diretórios

```
sistema-controle-despesas/
├── docs/
│   ├── README.md          # Documentação principal
│   └── CHANGELOG.md       # Histórico de versões
├── Main.java              # Classe principal com menu
└── .git/                  # Controle de versão Git
```

## Versionamento

O projeto utiliza versionamento semântico simplificado:

- **v0.0.1**: Estrutura inicial e menu básico
- **v0.0.2**: POC e MVP funcional em memória
- **v0.0.3**: MVP final documentado e com tags Git

Consulte o arquivo [CHANGELOG.md](CHANGELOG.md) para detalhes sobre cada versão.

## Autor

Projeto desenvolvido como parte da disciplina de Programação Orientada a Objetos.

**Repositório:** [https://github.com/Unknownluna/sistema-controle-despesas](https://github.com/Unknownluna/sistema-controle-despesas)

## Licença

Este projeto é de uso acadêmico e educacional.
