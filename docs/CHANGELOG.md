# Histórico de Alterações

Todas as mudanças notáveis neste projeto serão documentadas neste arquivo.

## [v0.0.1] - B4T01.1 - 2024-11-16

### Adicionado
- Estrutura inicial do repositório criada no GitHub
- Implementação do menu principal com 7 opções:
  1. Entrar Despesa
  2. Anotar Pagamento
  3. Listar Despesas em Aberto no período
  4. Listar Despesas Pagas no período
  5. Gerenciar Tipos de Despesa
  6. Gerenciar Usuários
  7. Sair
- Cada opção do menu exibe uma mensagem `println` indicando a funcionalidade
- Criação da pasta `/docs` para documentação
- Arquivo `README.md` com estratégia de construção do sistema
- Arquivo `CHANGELOG.md` para histórico de versões
- Classe `Main.java` com estrutura de menu e navegação básica

### Observações
- Nesta versão, o sistema possui apenas a interface de menu
- Nenhuma funcionalidade está implementada, apenas mensagens informativas
- O foco desta entrega é estabelecer a estrutura base do projeto
- Repositório compartilhado com prof.roldjunior@uninga.edu.br

### Próximos Passos (v0.0.2)
- Criar classes de modelo: `Despesa`, `TipoDespesa`, `Usuario`, `Pagamento`
- Implementar classes de serviço para gerenciar operações
- Desenvolver POC (Prova de Conceito) funcional
- Criar MVP com armazenamento em memória

## [v0.0.2] - B4T01.2 - 2024-11-16

### Adicionado
- **Classe Despesa:** Modelo de dados para representar uma despesa
  - Atributos: id, descrição, valor, categoria, status de pagamento
  - Construtores sobrecarregados (com e sem categoria)
  - Métodos getters e setters para encapsulamento
  - Método toString() sobrescrito para exibição formatada
  - Atributo estático contadorId para geração automática de IDs
  - Método estático getTotalDespesas()
  
- **Classe GerenciadorDespesas:** Lógica de negócio e POC (Prova de Conceito)
  - Armazenamento de despesas em memória usando ArrayList
  - Método cadastrarDespesa() para criar novas despesas
  - Método listarDespesas() para exibir todas as despesas
  - Método listarDespesasPendentes() para filtrar despesas não pagas
  - Método listarDespesasPagas() para filtrar despesas pagas
  - Método excluirDespesa() para remover despesas por ID
  - Método registrarPagamento() para marcar despesas como pagas
  - Método relatorioPorCategoria() para análise de gastos
  - Método getTotalGeral() para somatório de todas as despesas

- **Integração Main + GerenciadorDespesas:** MVP funcional
  - Menu principal totalmente integrado com funcionalidades reais
  - Opção 1 (Entrar Despesa) agora cadastra despesas de verdade
  - Opção 2 (Anotar Pagamento) registra pagamentos efetivamente
  - Opção 3 (Listar Despesas em Aberto) exibe despesas pendentes
  - Opção 4 (Listar Despesas Pagas) exibe despesas pagas
  - Opção 5 (Gerenciar Tipos) oferece relatório por categoria
  - Submenus para excluir despesas após listagem

- **Documentação técnica completa:**
  - Arquivo CLASSES.md com documentação detalhada de todas as classes
  - Descrição de atributos, métodos e conceitos de POO aplicados
  - Diagrama de classes simplificado
  - Fluxo de dados do sistema
  - Limitações conhecidas da versão atual

### Conceitos de POO Implementados
- **Encapsulamento:** Atributos privados com acesso via getters/setters
- **Sobrecarga de construtores:** Múltiplas formas de criar objetos Despesa
- **Sobrescrita de métodos:** toString() personalizado
- **Métodos e atributos estáticos:** Contador global de despesas
- **Collections:** Uso de ArrayList para armazenamento dinâmico
- **Separação de responsabilidades:** Model (Despesa) e Service (GerenciadorDespesas)

### Observações
- Esta versão implementa um **MVP (Minimum Viable Product)** funcional
- Todos os dados são armazenados **apenas em memória** (não persistentes)
- Ao encerrar o programa, todos os dados são perdidos
- Funcionalidades de persistência em arquivo serão implementadas em versões futuras
- Gerenciamento completo de usuários ainda não implementado

### Próximos Passos (v0.0.3)
- Refinar e documentar o MVP final
- Adicionar tags Git para versionamento correto
- Preparar repositório para produção
- Documentação final completa
