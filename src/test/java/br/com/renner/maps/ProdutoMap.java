package br.com.renner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoMap {
    @FindBy(css = "#quantity")
    public WebElement inpQuantidade;
    @FindBy(css = "#group_1")
    public WebElement slcTamanho;
    @FindBy(name = "Green")
    public WebElement linkCorVerde;
    @FindBy(name = "Blue")
    public WebElement linkCorAzul;
    @FindBy(css = ".cart")
    public WebElement btnCarrinho;
    @FindBy(css = ".btn-success")
    public WebElement btnContinue;



}
