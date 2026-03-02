# Aula 04 - Herança e Polimorfismo

## 📚 O que você vai aprender nesta aula

**Herança** é um dos pilares mais importantes de POO! Ela permite que você reutilize código criando **hierarquias de classes**. Nesta aula você aprenderá a criar superclasses e subclasses.

## 🚗 Projeto Principal: Sistema de Gestão de Veículos

Você criará um sistema onde diferentes tipos de veículos herdam de uma classe base comum.

### 🎯 Conceitos Principais

1. **Herança**
   - Superclasse (classe pai)
   - Subclasse (classe filha)
   - Palavra-chave `extends`
   - Reutilização de código

2. **Polimorfismo**
   - Sobrescrita de métodos (`@Override`)
   - Comportamentos específicos por tipo
   - Um mesmo método, múltiplas implementações

3. **Palavra-chave `super`**
   - Chamar construtor da superclasse
   - Chamar métodos da superclasse
   - Estender funcionalidades

4. **Modificador `protected`**
   - Acesso para subclasses
   - Proteção e flexibilidade

### 📝 Estrutura do Projeto

```
Sistema de Veículos
├── Veiculo.java        (superclasse)
├── Carro.java          (subclasse)
├── Moto.java           (subclasse)
└── GestaoVeiculo.java  (gerenciador)

Também inclui:
├── GerenciamentoDeTarefas/
│   ├── Tarefa.java
│   ├── StatusTarefa.java (Enum)
│   └── Item.java
```

### 🏗️ Hierarquia de Classes

```
         Veiculo (superclasse)
         /       \
        /         \
     Carro       Moto
    (subclasse)  (subclasse)
```

### 📝 Exemplo de Herança

```java
// Superclasse
public class Veiculo {
    protected String marca;
    protected String modelo;
    
    public void acelerar() {
        System.out.println("Acelerando...");
    }
}

// Subclasse
public class Carro extends Veiculo {
    private int portas;
    
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando com ao motor V8!");
    }
}
```

### 🧪 Como Executar

```bash
javac Veiculo.java Carro.java Moto.java GestaoVeiculo.java
java GestaoVeiculo
```

### 💪 Desafios Propostos

**Projeto Veículos:**
- [ ] Adicionar classe `Bicicleta` que estende `Veiculo`
- [ ] Implementar método `calcularConsumoCombustivel()`
- [ ] Criar método `obterDocumentacao()` específico por tipo
- [ ] Adicionar validação de velocidade máxima
- [ ] Implementar serialização de veículos

**Projeto Tarefas:**
- [ ] Adicionar prioridade às tarefas
- [ ] Criar subtarefas
- [ ] Implementar notificações quando tarefa vence
- [ ] Adicionar tempo estimado vs real

### 🔑 Benefícios da Herança

```java
// ❌ Sem herança (muita repetição)
class Carro {
    public void acelerar() { ... }
    public void frear() { ... }
}

class Moto {
    public void acelerar() { ... }
    public void frear() { ... }
}

// ✅ Com herança (reutilização)
class Veiculo {
    public void acelerar() { ... }
    public void frear() { ... }
}

class Carro extends Veiculo { }
class Moto extends Veiculo { }
```

### 🔍 Regras Importantes

1. **Java permite apenas herança simples** (não pode estender 2 classes)
2. **Subclasses herdam** tudo da superclasse
3. **`super` chama** a super classe
4. **`@Override`** marca quando você sobrescreve um método
5. **Polimorfismo em tempo de execução** (qual método é chamado?)

### 🔗 O que vem depois

Na próxima aula você aprenderá:
- **ArrayList**: Armazenar múltiplos objetos de diferentes tipos (thanks to polymorphism)
- Coleções e manipulação de dados em escala

### 📌 Dicas Importantes

✅ Pense em "É UM" para herança (Carro É UM Veiculo)  
✅ Use herança para compartilhar código, não dados  
✅ Sempre use `@Override` ao sobrescrever  
✅ Hierarquias muito profundas podem ser confusas  
✅ Enums são ótimos para estados fixos (como StatusTarefa)  

---

**Status:** Um dos conceitos mais importantes de POO ✓

Herança e Polimorfismo são FUNDAMENTAIS para qualquer programador Java!
