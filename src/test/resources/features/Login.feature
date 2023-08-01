# language: pt

@login
Funcionalidade: Login
  Eu como usuário do sistema
  Quero fazer login
  Para fazer uma compra no site

  @login-sucesso
  Cenário: Login com sucesso
    Dado que estou na tela de login
    Quando preencho login "Fulano.Ciclano@gmail.com" e senha "123456"
    E clico em Login
    Então vejo a mensagem login realizado

  @login-senha-errada
  Cenário: Senha errada
    Dado que estou na tela de login
    Quando preencho login "Fulano.Ciclano@gmail.com" e senha " "
    E clico em Login
    Então eu vejo a mensagem de senha inválida

  @login-email-errado
  Cenário: Email errado
    Dado que estou na tela de login
    Quando preencho login "Fulano.Ciclanogmail.com" e senha "123456"
    E clico em Login
    Então eu vejo a mensagem de e-mail inválido