package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Dado("^que estou na tela de cadastro de usuário$")
    public void que_estou_na_tela_de_cadastro_de_usuário() {
        cadastroPage.acessandoSite();
        cadastroPage.clicandoIconeCadastro();
    }

    @Dado("^preencho todos os campos obrigatórios$")
    public void preencho_todos_os_campos_obrigatórios() throws InterruptedException {
        cadastroPage.cadastrandoNome();
        cadastroPage.cadastrandoEmail();
        cadastroPage.cadastrandoSenha();
        cadastroPage.scrollDown();
    }

    @Quando("^clico em cadastrar$")
    public void clico_em_cadastrar() {
        cadastroPage.clicandoCadastrar();
    }

    @Então("^vejo a mensagem de cadastro realizado$")
    public void vejo_a_mensagem_de_cadastro_realizado() {
        cadastroPage.vendoCadastroConcluido();
    }


}
