package br.com.renner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyStoreMap {
    @FindBy(linkText = "Signup / Login")
    public WebElement linkSignIn;
    @FindBy(css = "#search_product")
    public WebElement inpPesquisa;
    @FindBy(css = "#submit_search")
    public WebElement btnPesquisa;
    @FindBy(linkText = "View Product")
    public WebElement produto;
    @FindBy(css = ".disabled")
    public List<WebElement> textQtdProdutos;
    @FindBy(linkText = "Cart")
    public WebElement linkCart;


}
