# 📚 Estudando Java - Progressão de Aprendizado

Bem-vindo ao meu repositório de estudos de Java! Este espaço documenta minha jornada de aprendizagem, organizada de forma pedagógica para acompanhar a progressão do conhecimento em Java.

---

## 📖 Estrutura do Repositório

O repositório está organizado em **7 aulas principais** seguindo uma progressão lógica de conceitos, do básico ao avançado:

### 🎯 **00-Aula-Conceitos-Basicos-Operadores-Condicionais**
**Tópicos:** Variáveis, Operadores Aritméticos, Operadores Lógicos, Estruturas Condicionais (if/else/switch)

**Arquivos principais:**
- `Exemplo.java` - Primeiros exemplos e sintaxe básica
- `Operadores.java` - Operadores matemáticos e conversão de tipos
- `Condicional.java` - Estruturas if/else
- `Switch.java` - Estrutura switch/case
- `OperadorTernario.java` - Operador ternário

**Objetivo:** Entender os fundamentos da linguagem Java e como trabalhar com variáveis e condicionais.

---

### 🔄 **01-Aula-Estruturas-de-Repeticao-Arrays**
**Tópicos:** Loops (for, while, do-while), Arrays, Iteração sobre coleções

**Arquivos principais:**
- `LacoRepeticao.java` - Diferentes tipos de loops
- Arrays e manipulação de dados em coleções

**Objetivo:** Dominar estruturas de repetição e trabalhar com múltiplos dados usando arrays.

---

### 🏦 **02-Aula-Intro-POO-Caixa-Eletronico**
**Tópicos:** Introdução a Orientação a Objetos, Classes, Objetos, Encapsulamento, Getters/Setters

**Desafio:** Criar um sistema de Caixa Eletrônico

**Arquivos principais:**
- `Conta.java` - Classe que representa uma conta bancária
- `CaixaEletronico.java` - Simulação do caixa eletrônico

**Funcionalidades:**
- Criar contas com saldo inicial
- Realizar saques e depósitos
- Consultar saldo e extrato
- Controlar limite de saques diários

**Objetivo:** Compreender classes, objetos, encapsulamento e primeira aplicação prática de POO.

---

### 🛍️ **03-Aula-POO-DigitalFlavor**
**Tópicos:** Associação entre classes, Relacionamentos, Sistema de e-commerce simplificado

**Projeto:** Sistema básico de e-commerce (Digital Flavor)

**Arquivos principais:**
- `Pessoa.java` - Classe base
- `Cliente.java` - Representa um cliente
- `Produto.java` - Representa um produto
- `Pedido.java` - Representa um pedido
- `Login.java` - Sistema de autenticação

**Objetivo:** Trabalhar com múltiplas classes relacionadas e estruturar um sistema mais complexo.

---

### 🚗 **04-Aula-Heranca-Polimorfismo-Veiculos**
**Tópicos:** Herança, Polimorfismo, Sobrescrita de Métodos, Superclasses e Subclasses

**Desafio:** Sistema de Gestão de Veículos com Herança

**Arquivos principais:**
- `Veiculo.java` - Classe superclasse com atributos comuns
- `Carro.java` - Subclasse especializada
- `Moto.java` - Outra subclasse especializada
- `GestaoVeiculo.java` - Manager para gerenciar veículos

**Funcionalidades:**
- Criar e gerenciar carros e motos
- Implementar comportamentos específicos através de polimorfismo
- Utilizar herança para reutilizar código

**Também inclui:**
- `GerenciamentoDeTarefas/` - Sistema de gerenciamento de tarefas com classes relacionadas

**Objetivo:** Dominar herança e polimorfismo, dois conceitos fundamentais de POO.

---

### 👥 **05-Aula-Gestao-Tarefas** (Sub-projeto)
**Tópicos:** Gestão de dados com classes relacionadas, Enums para status

**Projeto:** Sistema de Gerenciamento de Tarefas

**Arquivos principais:**
- `Tarefa.java` - Representa uma tarefa
- `StatusTarefa.java` - Enum com status das tarefas
- `Item.java` - Items dentro de uma tarefa

**Objetivo:** Praticar organização de dados e relacionamentos entre classes.

---

### 📊 **06-Aula-ArrayList-Gestao-Funcionarios**
**Tópicos:** ArrayList, Coleções, Herança Avançada, Polimorfismo em Coleções

**Desafio:** Sistema de Gestão de Funcionários com ArrayList

**Arquivos principais:**
- `Funcionario.java` - Classe superclasse
- `Gerente.java` - Subclasse para gerentes
- `Desenvolvedor.java` - Subclasse para desenvolvedores
- `GestaoFuncionario.java` - Manager que utiliza ArrayList

**Funcionalidades:**
- Adicionar diferentes tipos de funcionários
- Armazenar em ArrayList
- Calcular salários com bônus específicos
- Exibir detalhes de todos os funcionários

**Objetivo:** Trabalhar com coleções (ArrayList) e aplicar conceitos de herança e polimorfismo em cenários reais.

---

### 🛒 **07-Aula-Sistema-Ecommerce**
**Tópicos:** Projeto Integrado - Aplicação de todos os conceitos aprendidos

**Projeto:** Sistema Completo de E-commerce

**Arquivos principais:**
- `Usuario.java` - Usuário do sistema
- `Produto.java` - Produto do catálogo
- `Carrinho.java` - Carrinho de compras
- `Pedido.java` - Pedido realizado
- `Pagamento.java` - Processamento de pagamento
- `Email.java` - Notificações por email
- `Endereco.java` - Endereço para entrega
- `Frete.java` - Cálculo de frete
- `SugerirProduto.java` - Sistema de recomendações

**Objetivo:** Projeto integrador que aplica todos os conceitos aprendidos nas aulas anteriores.

---

## 📦 **Projetos-Maven**

Projetos completos desenvolvidos usando Maven e Spring Boot:

### `imc-calculator/`
Calculadora de IMC (Índice de Massa Corporal) com interface web

### `cadastro/`
Sistema de cadastro com persistência de dados

### `atas/`
Sistema de gerenciamento de atas/reuniões

---

## 🎓 Progressão de Aprendizado

```
Conceitos Básicos (Aula 00)
        ↓
Estruturas de Repetição (Aula 01)
        ↓
Introdução a POO (Aula 02)
        ↓
POO - Múltiplas Classes (Aula 03)
        ↓
Herança e Polimorfismo (Aula 04 + 05)
        ↓
Coleções - ArrayList (Aula 06)
        ↓
Projeto Integrado (Aula 07)
        ↓
Desenvolvimento com Maven (Projetos-Maven)
```

---

## 🚀 Como Usar Este Repositório

1. **Estudar em sequência**: Comece pela Aula 00 e progresso sequencialmente
2. **Compilar e executar**: Cada projeto pode ser compilado e executado localmente
3. **Explorar o código**: Analise a estrutura de classes e padrões de design
4. **Praticar**: Procure entender e modificar o código

---

## 📝 Resumo por Aula

| Aula | Tema | Conceitos Principais |
|------|------|---------------------|
| 00 | Conceitos Básicos | Variáveis, Operadores, Condicionais |
| 01 | Estruturas de Repetição | Loops, Arrays, Iteração |
| 02 | Intro POO | Classes, Objetos, Encapsulamento |
| 03 | POO Avançada | Associação, Relacionamentos |
| 04 | Herança | Superclasses, Subclasses, Herança |
| 05 | Gestão de Tarefas | Organização de dados, Enums |
| 06 | ArrayList | Coleções, Polimorfismo em Collections |
| 07 | E-commerce | Projeto Integrador |

---

## 📂 Estrutura de Pastas

```
Estudando-Java/
├── 00-Aula-Conceitos-Basicos-Operadores-Condicionais/
├── 01-Aula-Estruturas-de-Repeticao-Arrays/
├── 02-Aula-Intro-POO-Caixa-Eletronico/
├── 03-Aula-POO-DigitalFlavor/
├── 04-Aula-Heranca-Polimorfismo-Veiculos/
├── 05-Aula-Gestao-Tarefas/
├── 06-Aula-ArrayList-Gestao-Funcionarios/
├── 07-Aula-Sistema-Ecommerce/
├── Projetos-Maven/
│   ├── imc-calculator/
│   ├── cadastro/
│   └── atas/
└── README.md (este arquivo)
```

---

## 💡 Notas Importantes

- Cada aula contém um arquivo `aula{X}-original` com a estrutura original do projeto
- Os conceitos em aulas anteriores são pré-requisitos para as posteriores
- Os projetos Maven utilizam frameworks mais avançados e servem como aplicações práticas

---

**Última atualização:** Março 2026

---

Desenvolvido para fins educacionais e acompanhamento de progresso em Java.
