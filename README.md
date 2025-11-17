# Sistema de Controle de Despesas

![Versão](https://img.shields.io/badge/versão-0.0.3-blue.svg)
![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)
![Status](https://img.shields.io/badge/status-MVP-green.svg)

Sistema de controle de despesas desenvolvido em Java utilizando conceitos de Programação Orientada a Objetos (POO). Este projeto permite ao usuário gerenciar suas despesas e pagamentos de forma organizada.

## 📋 Funcionalidades

- ✅ Cadastro de despesas com descrição, valor e categoria
- ✅ Listagem de despesas (todas, pendentes ou pagas)
- ✅ Registro de pagamentos
- ✅ Exclusão de despesas
- ✅ Relatórios por categoria
- ✅ Cálculo de totais

## 🚀 Como Executar

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/Unknownluna/sistema-controle-despesas.git
cd sistema-controle-despesas
```

2. Compile os arquivos:
```bash
javac Main.java Despesa.java GerenciadorDespesas.java
```

3. Execute o programa:
```bash
java Main
```

## 📚 Documentação

A documentação completa do projeto está disponível na pasta `/docs`:

- **[README.md](docs/README.md)** - Documentação principal com estratégia de construção
- **[CHANGELOG.md](docs/CHANGELOG.md)** - Histórico detalhado de versões
- **[CLASSES.md](docs/CLASSES.md)** - Documentação técnica das classes

## 🏗️ Estrutura do Projeto

```
sistema-controle-despesas/
├── docs/                   # Documentação
│   ├── README.md
│   ├── CHANGELOG.md
│   └── CLASSES.md
├── Main.java              # Classe principal
├── Despesa.java           # Modelo de dados
├── GerenciadorDespesas.java  # Lógica de negócio
├── .gitignore
└── README.md              # Este arquivo
```

## 🎯 Conceitos de POO Aplicados

- **Encapsulamento**: Atributos privados com getters/setters
- **Sobrecarga de construtores**: Múltiplas formas de criar objetos
- **Sobrescrita de métodos**: toString() personalizado
- **Métodos e atributos estáticos**: Contador global de despesas
- **Collections**: ArrayList para armazenamento dinâmico
- **Separação de responsabilidades**: Model e Service

## 📌 Versões

- **v0.0.1** - Estrutura inicial e menu básico
- **v0.0.2** - POC e MVP funcional em memória
- **v0.0.3** - MVP final documentado com tags Git *(versão atual)*

## ⚠️ Limitações Atuais

- Armazenamento apenas em memória (dados não persistem após encerrar o programa)
- Gerenciamento de tipos de despesa parcialmente implementado
- Sistema de usuários e autenticação não implementado

## 👨‍💻 Autor

**Pedro Pourchet**  
RA: 206454-25

Projeto desenvolvido como parte da disciplina de Programação Orientada a Objetos.

**Repositório:** https://github.com/Unknownluna/sistema-controle-despesas

## 📄 Licença

Projeto de uso acadêmico e educacional.
