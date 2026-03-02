# Aula 07 - Projeto Integrador: Sistema de E-commerce

## 📚 O que você vai aprender nesta aula

Esta é a **aula final** e mais desafiadora! Você criará um **projeto integrador** que aplica TODOS os conceitos aprendidos nas aulas anteriores em um sistema completo e realista.

## 🛒 Projeto: Sistema Completo de E-commerce

Um sistema robusto de e-commerce com múltiplas funcionalidades, simulando um site real de compras online.

### 🎯 Todos os Conceitos Anteriores

| Aula | Conceito | Aplicado em |
|------|----------|-----------|
| 00 | Variáveis, Operadores, Condicionais | Validações em toda parte |
| 01 | Loops e Arrays | Iteração sobre pedidos, produtos |
| 02 | Classes e Encapsulamento | Todas as classes |
| 03 | Múltiplas Classes Relacionadas | Core do projeto |
| 04 | Herança e Polimorfismo | Tipos de usuários, pagamentos |
| 05 | Enums | Status de pedido, tipo de pagamento |
| 06 | ArrayList | Listas de produtos, pedidos |

### 📝 Estrutura do Projeto

```
Sistema de E-commerce
├── Usuario.java        (superclasse para usuários)
├── Administrador.java  (subclasse - gerencia tudo)
├── Cliente.java        (subclasse - faz compras)
├── Produto.java        (item no catálogo)
├── Carrinho.java       (carrinho de compras)
├── Pedido.java         (pedido realizado)
├── Pagamento.java      (processamento de pagamento)
├── Email.java          (sistema de notificação)
├── Endereco.java       (endereço de entrega)
├── Frete.java          (cálculo de frete)
├── SugerirProduto.java (recomendações)
└── Main.java           (aplicação principal)
```

### 🏗️ Relacionamentos Principais

```
Sistema E-commerce
│
├─ Usuario (superclasse)
│  ├─ Cliente (compra produtos)
│  │  ├─ Carrinho (contém produtos)
│  │  ├─ Pedido (histórico)
│  │  └─ Endereco
│  │
│  └─ Administrador (gerencia)
│
├─ Produto (catálogo)
│  ├─ Preço
│  ├─ Estoque
│  └─ Descrição
│
├─ Pagamento (múltiplas formas)
│  ├─ Cartão de Crédito
│  ├─ Boleto
│  └─ Pix
│
└─ Notificações
   ├─ Email
   └─ SMS (expandível)
```

### 🧪 Como Executar

```bash
# Compilar todos os arquivos
javac *.java

# Executar a aplicação
java Main
```

### 💪 Funcionalidades Principais

**Cliente:**
- [ ] Cadastrem na plataforma
- [ ] Buscar produtos
- [ ] Adicionar items ao carrinho
- [ ] Calcular frete
- [ ] Finalizar compra
- [ ] Escolher forma de pagamento
- [ ] Acompanhar pedido
- [ ] Receber notificações

**Administrador:**
- [ ] Gerenciar produtos
- [ ] Acompanharar pedidos
- [ ] Processar devoluções/reembolsos
- [ ] Gerar relatórios

**Funcionalidades Extras:**
- [ ] Sugerir produtos (com base no histórico)
- [ ] Cupons de desconto
- [ ] Avaliação de produtos
- [ ] Wishlist

### 🎯 Exemplos de Uso

```java
// Criar clientes e produtos
Cliente cliente = new Cliente("João Silva", "joao@email.com");
Produto notebook = new Produto("Notebook Dell", 3500.00, 5);

// Adicionar ao carrinho
cliente.getCarrinho().adicionarProduto(notebook, 1);

// Calcular frete
Endereco endereco = new Endereco("São Paulo", "SP");
double frete = new Frete().calcular(endereco, 2.0);

// Criar pedido
Pedido pedido = new Pedido(cliente, cliente.getCarrinho(), endereco);
pedido.adicionarFrete(frete);

// Processar pagamento
Pagamento pagamento = new Pagamento();
boolean aprovado = pagamento.processar(pedido.getValorTotal());

// Enviar notificação
Email email = new Email();
email.enviar(cliente.getEmail(), "Pedido realizado com sucesso!");
```

### 🔑 Padrões de Design Aplicados

1. **Strategy Pattern** (Pagamento)
   - Diferentes estratégias de pagamento
   - Polimorfismo em ação

2. **Observer Pattern** (Email)
   - Notificações quando eventos ocorrem

3. **Factory Pattern** (Criação de Usuários)
   - Diferentes tipos de usuários

4. **Singleton Pattern** (Estoque)
   - Uma única instância gerenciando tudo

### 💪 Desafios Avançados

- [ ] Implementar sistema de avaliação (1-5 estrelas)
- [ ] Adicionar cupons/vouchers
- [ ] Criar relatório de vendas
- [ ] Implementar wishlist
- [ ] Adicionar recomendações ML-inspired
- [ ] Suportar múltiplas moedas
- [ ] Criar API REST (com Spring)
- [ ] Persistência em banco de dados (JDBC)
- [ ] Salvar/carregar de arquivo para memória

### 📊 Métricas de Sucesso

Um sistema bem implementado deve:
- ✅ Reutilizar código (herança)
- ✅ Encapsular dados sensíveis
- ✅ Ter relacionamentos claros entre classes
- ✅ Validar todas as entradas
- ✅ Ser extensível (fácil adicionar novas funcionalidades)
- ✅ Ser maintível (código limpo e bem organizado)

### 🔗 Próximos Passos após esta Aula

Parabéns! Você completou a progressão de POO. Os próximos passos seriam:

1. **Spring Boot** - Framework Web mais popular
2. **Banco de Dados** - JDBC, JPA, Hibernate
3. **APIs REST** - Criar serviços web
4. **Testes Unitários** - JUnit, Mockito
5. **Docker** - Containerização
6. **Microserviços** - Arquiteltura avançada

### 📌 Dicas Importantes

✅ Comece com o básico e evolua incrementalmente  
✅ Teste cada funcionalidade enquanto codifica  
✅ Mantenha o código organizado e legível  
✅ Use nomes descritivos  
✅ Documente as classes principais  
✅ Pense "será que outra pessoa consegue entender?"  
✅ Refatore constantemente  
✅ NÃO ignore erros de compilação  

### 📚 Revisão de Conceitos

Antes de começar este projeto, certifique-se que você:

- [ ] Entende classes e objetos
- [ ] Sabe usar encapsulamento (private/public)
- [ ] Domina herança
- [ ] Compreende polimorfismo
- [ ] Está confortável com ArrayList
- [ ] Conhece Enums
- [ ] Sabe iterar em coleções

Se algum desses está em dúvida, **REVISE a aula anterior**!

---

**Status:** Projeto Integrador - Coloque tudo junto! 🎉

Este é o tipo de projeto que você pode colocar em seu portfólio!

---

## 🎓 Conclusão da Progressão

Parabéns por ter chegado aqui! Você aprendeu:

✅ Conceitos fundamentais de Java  
✅ Programação Orientada a Objetos completa  
✅ Como estruturar sistemas com múltiplas classes  
✅ Como reutilizar código eficientemente  
✅ Como criar aplicações realistas  

**Você está pronto para** começar com frameworks reais e projetos profissionais!
