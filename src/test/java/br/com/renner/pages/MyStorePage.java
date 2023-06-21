package br.com.renner.pages;

import br.com.renner.core.Driver;
import br.com.renner.maps.MyStoreMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyStorePage {
    MyStoreMap myStoreMap;

    public MyStorePage() {
        myStoreMap = new MyStoreMap();
        PageFactory.initElements(Driver.getDriver(), myStoreMap);
    }

    public MyStorePage clickSignIn() {
        myStoreMap.linkSignIn.click();
        return this;
    }

    public MyStorePage clickProduto() throws Exception {
        myStoreMap.produto.click();
        return this;
    }

    public MyStorePage setPesquisa(String pesquisa) {
        myStoreMap.inpPesquisa.clear();
        myStoreMap.inpPesquisa.sendKeys(pesquisa + Keys.ENTER);
        myStoreMap.btnPesquisa.click();
        return this;
    }

    public String getQtdProduto() {
        myStoreMap.linkCart.click();
        int qtd = 0;
        for (WebElement qtdProduto:
                myStoreMap.textQtdProdutos) {
            qtd += Integer.parseInt(qtdProduto.getText());
        }
        return ""+qtd;
    }
}
