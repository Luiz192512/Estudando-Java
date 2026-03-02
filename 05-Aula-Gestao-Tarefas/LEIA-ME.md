# Aula 05 - Gestão de Tarefas (Sub-projeto)

## 📚 O que você vai aprender nesta aula

Um sub-projeto focado em **organização de dados** relacionados e uso de **Enums** para representar estados.

## 📋 Projeto: Sistema de Gerenciamento de Tarefas

Um sistema simples para criar e gerenciar tarefas com suporte a sub-items.

### 🎯 Conceitos Principais

1. **Enums (Enumerações)**
   - Definir um conjunto fixo de valores
   - Uso de `StatusTarefa` (TODO, FAZENDO, CONCLUÍDO)
   - Type-safe comparações

2. **Classes Relacionadas**
   - `Tarefa.java` - Classe principal
   - `Item.java` - Itens dentro de uma tarefa
   - `StatusTarefa.java` - Enum com estados

3. **Relacionamentos**
   - Uma tarefa contém múltiplos items
   - Composição de objetos

### 📝 Estrutura do Projeto

```
GerenciamentoDeTarefas/
├── Tarefa.java        (classe principal)
├── Item.java          (sub-item de uma tarefa)
├── StatusTarefa.java  (enum com estados)
└── Main.java          (aplicação)
```

### 🏗️ Diagrama da Aplicação

```
Tarefa
├── titulo: String
├── descricao: String
├── status: StatusTarefa
└── items: List<Item>
    ├── Item 1
    ├── Item 2
    └── Item 3

StatusTarefa (Enum)
├── TODO
├── FAZENDO
└── CONCLUIDA
```

### 📝 Exemplo de Uso

```java
// Criar uma tarefa
Tarefa tarefa = new Tarefa("Aprender Java", "Concluir o curso");

// Adicionar itens
tarefa.adicionarItem(new Item("Estudar POO"));
tarefa.adicionarItem(new Item("Fazer exercícios"));
tarefa.adicionarItem(new Item("Criar projetos"));

// Mudar o status
tarefa.setStatus(StatusTarefa.FAZENDO);
```

### 🧪 Como Executar

```bash
javac *.java
java Main
```

### 💪 Desafios Propostos

- [ ] Adicionar data de criação e vencimento
- [ ] Implementar prioridade (BAIXA, MÉDIA, ALTA)
- [ ] Adicionar histórico de mudanças de status
- [ ] Criar método `percentualConcluido()`
- [ ] Adicionar notificações de tarefas vencidas
- [ ] Implementar filtros (por status, por data, etc)
- [ ] Salvar tarefas em arquivo

### 🔑 O que é um Enum?

```java
// Sem Enum (propenso a erros)
String status = "CONCLUÍDA"; // Fácil errar
String status2 = "Concluída"; // Diferente, vai dar erro

// Com Enum (type-safe)
StatusTarefa status = StatusTarefa.CONCLUIDA;
StatusTarefa status2 = StatusTarefa.CONCLUIDA;
// São sempre os mesmos valores possíveis!
```

### 🎯 Quando Usar Enums

✅ Estados fixos conhecidos (TODO, FAZENDO, CONCLUÍDO)  
✅ Cores, tamanhos, niveis de prioridade  
✅ Qualquer conjunto finito de opções  
❌ Dados que mudam frequentemente  

### 🔗 Relação com Aulas Anteriores

- **Aula 02**: Classes e objetos
- **Aula 03**: Múltiplas classes relacionadas
- **Aula 04**: Prototipa para Herança

### 📌 Dicas Importantes

✅ Use Enums para estados e categorias fixas  
✅ Sempre use `@Override` em`toString()`  
✅ Enums podem ter construtores e métodos  
✅ Pregunte: "Quantas opções há?"  
✅ Se a resposta é infinita ou variável, não use Enum  

---

**Status:** Organizando dados com estrutura ✓

Um ótimo intermediário entre POO Básica e Coleções!
