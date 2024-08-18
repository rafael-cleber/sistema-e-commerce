```mermaid
classDiagram
    class Produto {
        +Long id
        +String nome
        +String descricao
        +BigDecimal preco
        +int quantidadeEmEstoque
    }

    class Usuario{
        +Long id
        +String nome
        +String email
        +String senha
        +List~Endereco~ enderecos
        +String telefone
    }

    class Admin {
        +String nomeUsuario
        +String senha
        
    
    }
    Admin  -->  Usuario
    Admin --> Produto
    Produto --> Usuario
    
    
