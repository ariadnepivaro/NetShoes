@tag
Feature:  pagina NetShoes
Scenario:  pagina NetShoes

Given que eu esteja na pagina Net Shoes
And cliclo em entrar opcao login 
And digito o CPF 
And digito a senha
And clico Acessar Conta
And clico em sair
Then verifico se foi feito o logout