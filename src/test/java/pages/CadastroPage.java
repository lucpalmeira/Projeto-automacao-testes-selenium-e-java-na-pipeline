package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.RunCucumberTest;


import static support.Utils.*;

public class CadastroPage extends RunCucumberTest {

    private String URL = "http://automationpratice.com.br/";
    private By ciCadastro = By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[2]/a");
    private By cNome = By.id("user");
    private By cEmail = By.id("email");
    private By cSenha = By.id("password");
    private By cCadastrar = By.id("btnRegister");


    public void acessandoSite() {
        getDriver(System.getProperty("browser")).get(URL);
    }

    public void clicandoIconeCadastro() {
        getDriver().findElement(ciCadastro).click();

    }

    public void cadastrandoNome() {
        getDriver().findElement(cNome).sendKeys("Fulano de Tal");
    }

    public void cadastrandoEmail() {
        getDriver().findElement(cEmail).sendKeys(gerarEmailAleatorio());
    }

    public void cadastrandoSenha() {
        getDriver().findElement(cSenha).sendKeys(gerarSenhaAleatoria());


    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 500)");
        Thread.sleep(2000);
    }

    public void clicandoCadastrar() {
        getDriver().findElement(cCadastrar).click();
    }

    public void vendoCadastroConcluido() {
        String login = getDriver().findElement(By.className("active")).getText();
        Assert.assertEquals("Não acessou a sua conta!", "DASHBOARD", login);
    }

}
