#language:pt
Funcionalidade: Adicionar produtos no carrinho

  Contexto:
    Dado que esteja logado na pagina My Store com os dados
      | email    | wilson@dbc.com |
      | password | Senha123       |


  @adicionaProduto
  Cenario: adiciono produtos

    Dado que esteja na pagina de produtos de My Store
    Quando seleciono o produto alterando as opcoes do produto
      | nome                                      | quantidade |
      | Stylish Dress                             | 3          |
      | Beautiful Peacock Blue Cotton Linen Saree | 2          |
      | Men Tshirt                                | 1          |
    Entao valido que possuo "6" itens no carrinho