package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        loginPage.acessandoSite();
        loginPage.clicandoIconeLogin();
    }

    @Quando("preencho login {string} e senha {string}")
    public void preencho_login_e_senha(String email, String senha) {
        loginPage.preenchendoEmail(email);
        loginPage.preenchendoSenha(senha);

    }

    @Quando("clico em Login")
    public void clico_em_login() {
        loginPage.clicandoEmLogin();

    }

    @Então("vejo a mensagem login realizado")
    public void vejo_a_mensagem_login_realizado() {
        loginPage.vejoMinhaConta();

    }

    @Então("eu vejo a mensagem de senha inválida")
    public void eu_vejo_a_mensagem_de_senha_inválida() {
        loginPage.mensagemSenhaErrada();

    }

    @Então("eu vejo a mensagem de e-mail inválido")
    public void eu_vejo_a_mensagem_de_e_mail_inválido() {
        loginPage.mensagemEmailErrado();
    }

}
