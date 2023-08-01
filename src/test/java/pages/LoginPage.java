package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;

public class LoginPage extends RunCucumberTest {
    private String URL = "http://automationpratice.com.br/";
    private By ciLogin = By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a");
    private By pEmail = By.id("user");
    private By pSenha = By.id("password");
    private By cLogin = By.id("btnLogin");

    private By msIvalida = By.className("invalid_input");

    private By meInvalido = By.className("invalid_input");

    public void acessandoSite() {
        getDriver(System.getProperty("browser")).get(URL);
    }

    public void clicandoIconeLogin(){
        getDriver().findElement(ciLogin).click();
    }

    public void preenchendoEmail(String email) {
        getDriver().findElement(pEmail).sendKeys(email);
    }

    public void preenchendoSenha(String senha) {

        getDriver().findElement(pSenha).sendKeys(senha);
    }

    public void clicandoEmLogin() {

        getDriver().findElement(cLogin).click();
    }

    public void vejoMinhaConta() {
        String login = getDriver().findElement(By.className("active")).getText();
        Assert.assertEquals("Não acessou a sua conta!", "DASHBOARD", login);
    }

    public void mensagemSenhaErrada() {
        getDriver().findElement(meInvalido).getText();
    }

    public void mensagemEmailErrado() {

        getDriver().findElement(meInvalido).getText();
    }

}
