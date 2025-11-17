# Histórico de Alterações

Todas as mudanças notáveis neste projeto serão documentadas neste arquivo.

## [v0.0.1] - B4T01.1

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
