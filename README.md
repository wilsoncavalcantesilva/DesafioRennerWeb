# Exercício Renner WEB

1 - WEB
Desenvolva, uma automação de testes para o e-commerce: http://automationpractice.com/.
O projeto deve conter, pelo menos, um cenário de teste para a seguinte História do Usuário:

História do Usuário #1:
Como um cliente cadastrado no automationpractice.com
Eu quero fazer a compra de ao menos três produtos
Para que eu possa estar bem vestida

Os seguintes produtos do e-commerce devem ser utilizados, no tamanho e cor informada:
- Printed Chiffon Dress na cor verde e tamanho "M"
- Faded Short Sleeve T-shirts na cor azul
- Blouse na quantidade 2
- Printed Dress

CENÁRIO BÔNUS :
Desenvolva um novo cenário para a anteriormente citada no qual é realizado o cadastro de um novo usuário.

----------------------------------------------------------------

# Como executar o projeto:
1. Importar na IDE de preferencia o projeto como maven java
2. Abrir o arquivo RunnerTest.java e executar via Junit

----------------------------------------------------------------

# Arquitetura do Projeto
Pacotes:

	Core: Pacote responsavel pela parte do core da automação, como acesso ao driver e ações dos elementos
    ----------------------------------------------------------------
	Enums: Pacote responsavel para guardar qualquer Enum que seja necessário criar
    ----------------------------------------------------------------
	Maps: Pacote responsavel pela parte dos mapeamentos dos campos, onde os objetos dos campos são instanciadas através da anotação do PageFactory
    ----------------------------------------------------------------
	Pages: Pacote responsavel pela parte das ações das paginas, como preenchimento, cliques, retornos de conteudos.
    ----------------------------------------------------------------
	Runner: Pacote responsavel pela parte das classes de execuções utilizando JUnit e RunWith Cucumber.class
    ----------------------------------------------------------------
	Utils: Pacote responsavel para guardar todas as classes que contenham metodos que possam ser usadas por varios métodos ou classes
    ----------------------------------------------------------------
	Steps: Pacote responsavel para guardar as Classes de Steps, as quais são geradas pelo cucumber. Nessas classes são chamadas as ações das paginas através das pages e validações.
    ----------------------------------------------------------------
	features: Diretório responsável para guardar os arquivos .feature, onde estão gravados os arquivos relacionados ao cucumber e as escrita em gherkin
----------------------------------------------------------------

# Libs utilizadas

	PageFactory: Responsavel pelo mapeamento dos elementos e integração dos objetos com o driver
	----------------------------------------------------------------
    Cucumber: Dependencia responsável pela leitura dos arquivos .feature escritos em gherkin e realizacao da conversao em metodos.
	----------------------------------------------------------------
    Webdrivermanager de bonigarcia: Dependencia responsavel por gerenciar os drivers, evitando a necessidade de verificar a versao atual do browser, qual browser vai utilizar e buscar o driver para download.
	----------------------------------------------------------------
    Maven: Responsavel por gerenciar as dependencias utilizadas no projeto.
	----------------------------------------------------------------
    JUnit: Dependencia para realizar a execução dos testes atraves da linguagem Java.