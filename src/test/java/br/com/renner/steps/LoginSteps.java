package br.com.renner.steps;

import br.com.renner.core.Driver;
import br.com.renner.enums.Browser;
import br.com.renner.pages.LoginPage;
import br.com.renner.pages.MyStorePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


import java.io.IOException;
import java.util.Map;


public class LoginSteps {
    MyStorePage myStorePage;
    LoginPage loginPage;

    @Before
    public void iniciaNavegador(Scenario cenario){
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();

    }

    @After
    public void fechaNavegador(Scenario cenario) throws IOException {
        if (cenario.isFailed()){
            Driver.printScreen("erro no cenario");
        }

        Driver.getDriver().quit();

    }

    @Dado("que esteja na pagina principal de My Store")
    public void queEstejaNaPaginaPrincipalDeMyStore() {
        Driver.getDriver().get("https://www.automationexercise.com/");
        myStorePage = new MyStorePage();
    }
    @Quando("acesso a pagina de login")
    public void acessoAPaginaDeLogin() {
        myStorePage.clickSignIn();
        loginPage = new LoginPage();
    }
    @Quando("relizo o login com os dados")
    public void relizoOLoginComOsDados(Map<String, String> map) {
        loginPage.setEmail(map.get("email"))
                .setPassword(map.get("password"))
                .clickSignIn();
    }
    @Entao("exibe o nome do usuario {string}")
    public void exibeONomeDoUsuario(String nome) {
        Assert.assertEquals(nome,loginPage.getLogado());
    }

    @Dado("que esteja logado na pagina My Store com os dados")
    public void queEstejaLogadoNaPaginaMyStoreComOsDados(Map<String, String> map) {
        queEstejaNaPaginaPrincipalDeMyStore();
        acessoAPaginaDeLogin();
        relizoOLoginComOsDados(map);

    }



}
