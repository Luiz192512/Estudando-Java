# Aula 03 - POO Avançada com Múltiplas Classes

## 📚 O que você vai aprender nesta aula

Agora que você conhece o básico de POO, está na hora de trabalhar com **múltiplas classes relacionadas**. Nesta aula você criará um sistema onde classes trabalham juntas para resolver um problema real.

## 🛍️ Projeto: Sistema Digital Flavor (E-commerce)

Um sistema simplificado de e-commerce com múltiplos componentes trabalhando juntos.

### 🎯 Conceitos Principais

1. **Associação entre Classes**
   - Composição (uma classe contém outra)
   - Agregação (referência a outras classes)

2. **Relacionamentos**
   - Um-para-Um
   - Um-para-Muitos
   - Muitos-para-Muitos

3. **Reutilização de Código**
   - Passar objetos como parâmetros
   - Retornar objetos de métodos
   - Armazenar referências a objetos

4. **Design de Sistema**
   - Pensar em como as classes se relacionam
   - Definir responsabilidades
   - Estruturar dados

### 📝 Estrutura do Projeto

```
DigitalFlavor (E-commerce)
├── Pessoa.java           (classe base)
├── Cliente.java          (cliente que faz compras)
├── Produto.java          (produto à venda)
├── Pedido.java           (pedido com múltiplos produtos)
├── Pagamento.java        (processamento de pagamento)
└── Login.java            (autenticação)
```

### 🧪 Como Executar

```bash
# Compilar todos os arquivos
javac *.java

# Executar a aplicação
java Main  # Se houver arquivo Main.java
```

### 💪 Desafios Propostos

- [ ] Adicionar carrinho de compras
- [ ] Implementar cupons de desconto
- [ ] Adicionar histórico de pedidos
- [ ] Criar sistema de avaliação de produtos
- [ ] Implementar diferentes formas de pagamento
- [ ] Adicionar controle de estoque

### 🔍 Exemplo de Relacionamento

```java
// Um cliente faz múltiplos pedidos
Cliente cliente = new Cliente("João");
Pedido pedido1 = new Pedido(cliente);
Pedido pedido2 = new Pedido(cliente);

// Um pedido contém múltiplos produtos
Produto p1 = new Produto("Notebook", 3000);
Produto p2 = new Produto("Mouse", 50);
pedido1.adicionarProduto(p1);
pedido1.adicionarProduto(p2);
```

### 📌 Padrão: Composição

```java
// Pedido "contém" uma lista de Produtos
class Pedido {
    private ArrayList<Produto> produtos;
    private Cliente cliente;
    private Pagamento pagamento;
}
```

### 🔗 O que vem depois

A próxima aula introduz **Herança**, que permitirá criar **hierarquias de classes** reutilizando ainda mais código!

### 📌 Dicas Importantes

✅ Pense em relacionamentos do mundo real  
✅ Uma classe = Uma responsabilidade  
✅ Use nomes que descrevam o relacionamento  
✅ Crie um diagrama antes de codificar  
✅ Teste a interação entre classes  

---

**Status:** Ponto importante - Sistemas com múltiplas classes ✓

Agora você está criando sistemas mais próximos da realidade!
