# Aula 02 - Introdução a Orientação a Objetos

## 📚 O que você vai aprender nesta aula

Você acaba de aprender programação procedural (funções + dados soltos). Agora é hora de aprender **Orientação a Objetos (POO)**, um paradigma que mudará a forma como você pensa em programação!

## 🏦 Desafio Principal: Sistema de Caixa Eletrônico

Nesta aula você criará um **sistema bancário** que gerencia contas e operações financeiras.

### 🎯 Conceitos Principais de POO

1. **Classes e Objetos**
   - O que é uma classe? (molde/template)
   - O que é um objeto? (instância da classe)
   - Atributos (dados) e métodos (ações)

2. **Encapsulamento**
   - Modificadores de acesso (`private`, `public`)
   - Proteger dados sensíveis
   - Garantir integridade dos dados

3. **Getters e Setters**
   - Métodos para acessar dados privados
   - Validação de dados na entrada
   - Controle de acesso

4. **Construtor**
   - Inicializar objetos
   - Parâmetros variáveis
   - Inicializar valores padrão

### 📝 Arquivos da Aula

| Arquivo | Descrição |
|---------|-----------|
| `Conta.java` | Classe que representa uma conta bancária |
| `CaixaEletronico.java` | Main - Simulação do caixa eletrônico |

### 👨‍💼 Estrutura da Conta Bancária

```java
Classe: Conta
├── Atributos (dados)
│   ├── nome (String)
│   ├── saldo (Double)
│   ├── numeroConta (int)
│   └── saques (int)
│
└── Métodos (ações)
    ├── sacar()
    ├── depositar()
    ├── extrato()
    └── verificarSaldo()
```

### 🧪 Executando o Projeto

```bash
# Compilar
javac Conta.java CaixaEletronico.java

# Executar
java CaixaEletronico
```

### 💰 Funcionalidades do Sistema

- ✅ Criar nova conta com saldo inicial
- ✅ Fazer saques (com limite diário)
- ✅ Fazer depósitos
- ✅ Visualizar saldo
- ✅ Visualizar extrato
- ✅ Validar operações

### 💪 Desafios Propostos

- [ ] Adicionar taxa de operação no saque
- [ ] Implementar taxa de juros na conta
- [ ] Adicionar limite ao empréstimo
- [ ] Criar uma classe `Transacao` para registrar operações
- [ ] Adicionar transferência entre contas

### 🔍 Conceitos Importantes

**Encapsulamento:**
```java
// ❌ Errado - acesso direto
conta.saldo = 1000;

// ✅ Certo - usando método seguro
conta.depositar(1000);
```

**Construtor:**
```java
// Cria a conta com dados iniciais
Conta minhaConta = new Conta("João Silva", 500.00);
```

### 🔗 O que vem depois

Depois desta aula, você começará a:
- **Aula 03**: Trabalhar com múltiplas classes relacionadas
- Criar sistemas mais complexos e profissionais

### 📌 Dicas Importantes

✅ Encapsule seus dados! (use `private`)  
✅ Sempre valide os dados nos setters  
✅ Use nomes descritivos para classes e métodos  
✅ Pense em "objetos do mundo real"  
✅ Um objeto por arquivo (boa prática)  

---

**Status:** Marco importante - Transição para POO ✓

Este é um ponto de virada! Se dominar bem os conceitos aqui, o resto do Java ficará muito mais fácil.
