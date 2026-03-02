# Aula 06 - ArrayList e Gestão de Funcionários

## 📚 O que você vai aprender nesta aula

Nesta aula você aprenderá sobre **Collections** (coleções dinâmicas) e especificamente **ArrayList**, que permite armazenar múltiplos objetos de forma dinâmica. Combinaremos isso com herança e polimorfismo!

## 👥 Projeto: Sistema de Gestão de Funcionários

Um sistema que gerencia diferentes tipos de funcionários (Gerentes e Desenvolvedores) usando ArrayList e aplicando herança/polimorfismo.

### 🎯 Conceitos Principais

1. **ArrayList (Coleção Dinâmica)**
   - Dimensão dinâmica (cresce conforme necessário)
   - Métodos: `add()`, `remove()`, `get()`, `size()`
   - Iteração com enhanced for loop
   - Comparado com arrays (tamanho fixo)

2. **Herança em Coleções**
   - Armazenar subclasses em variáveis da superclasse
   - Polimorfismo em ação

3. **Genéricos (<T>)**
   - `ArrayList<Funcionario>` (type-safe)
   - Evita casting desnecessário

4. **Iteração em Coleções**
   - `for` tradicional
   - Enhanced `for` (for-each)
   - `while` com iterator

### 📝 Estrutura do Projeto

```
Gestão de Funcionários
├── Funcionario.java      (superclasse abstrata)
├── Gerente.java          (subclasse)
├── Desenvolvedor.java    (subclasse)
└── GestaoFuncionario.java (manager com ArrayList)
```

### 🏗️ Hierarquia de Classes

```
          Funcionario (superclasse)
          /           \
         /             \
     Gerente       Desenvolvedor
   (com comissão)  (com horas extras)
```

### 📝 Exemplo de Uso

```java
// Criar o gerenciador
GestaoFuncionario gestao = new GestaoFuncionario();

// Adicionar diferentes tipos de funcionários
gestao.adicionarGerente("Carlos", 5000, 2000);
gestao.adicionarDesenvolvedor("Ana", 4000, 20, 50);

// Visualizar detalhes de todos
gestao.visualizarDetalhes();

// Calcular salários
gestao.calcularSalarios();
```

### 🧪 Como Executar

```bash
javac Funcionario.java Gerente.java Desenvolvedor.java GestaoFuncionario.java
java GestaoFuncionario
```

### 🎯 ArrayList vs Array

```java
// Array (tamanho fixo)
Funcionario[] funcionarios = new Funcionario[10];
funcionarios[0] = new Gerente(...);
// Limite de 10 elementos

// ArrayList (dinâmico)
ArrayList<Funcionario> funcionarios = new ArrayList<>();
funcionarios.add(new Gerente(...));
funcionarios.add(new Desenvolvedor(...));
// Cresce conforme necessário!
```

### 💪 Desafios Propostos

- [ ] Adicionar classe `Estagiario` que estende `Funcionario`
- [ ] Implementar busca de funcionário por nome
- [ ] Criar relatório com salário total para cada tipo
- [ ] Adicionar método para remover funcionário
- [ ] Ordenar funcionários por salário
- [ ] Exportar lista para arquivo CSV
- [ ] Implementar bonificação annual para gerentes

### 📌 Métodos Principais do ArrayList

| Método | Descrição |
|--------|-----------|
| `add(E e)` | Adiciona elemento |
| `remove(int index)` | Remove por índice |
| `remove(Object o)` | Remove objeto |
| `get(int index)` | Retorna elemento |
| `size()` | Número de elementos |
| `contains(Object o)` | Verifica se existe |
| `clear()` | Remove todos |
| `isEmpty()` | Está vazio? |

### 🔑 Polimorfismo em ArrayList

```java
// Armazenar subclasses em ArrayList da superclasse
ArrayList<Funcionario> lista = new ArrayList<>();
lista.add(new Gerente(...));      // OK!
lista.add(new Desenvolvedor(...)); // OK!

// Polimorfismo: cada um tem seu método
for (Funcionario f : lista) {
    f.CalcularSalario(); // Cada subclasse tem sua versão
}
```

### 🔄 Iteração em ArrayList

```java
// Forma 1: Enhanced for (recomendado para leitura)
for (Funcionario f : lista) {
    System.out.println(f.getNome());
}

// Forma 2: For tradicional (quando precisa do índice)
for (int i = 0; i < lista.size(); i++) {
    System.out.println(lista.get(i).getNome());
}

// Forma 3: While com Iterator (quando vai remover)
Iterator<Funcionario> it = lista.iterator();
while (it.hasNext()) {
    Funcionario f = it.next();
    if (f.getSalario() < 2000) {
        it.remove();
    }
}
```

### 🔗 O que vem depois

A próxima aula é um **Projeto Integrador** que combina TUDO que você aprendeu até aqui!

### 📌 Dicas Importantes

✅ ArrayList é MUITO mais flexível que Array  
✅ Sempre use `<Tipo>` para type-safety  
✅ Use enhanced for quando só vai ler  
✅ Use Iterator quando vai modificar durante iteração  
✅ ArrayList é do pacote `java.util`  

---

**Status:** Collections são ESSENCIAIS para qualquer programa real ✓

ArrayList é provavelmente a estrutura mais usada em aplicações Java!
