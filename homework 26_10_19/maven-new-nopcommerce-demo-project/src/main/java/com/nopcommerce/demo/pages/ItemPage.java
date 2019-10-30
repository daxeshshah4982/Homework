package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ItemPage extends Util {

    @FindBy(xpath = "//label[contains(text(),'400 GB [+$100.00]')]")
    WebElement _hdd;
    @FindBy(linkText = "Processor")
    WebElement _confirmationTextOfItemPage;
    @FindBy(id = "add-to-cart-button-1")
    WebElement _addCartBtn1;
    @FindBy(xpath = "//p[@class='content']")
    WebElement _confirmationTextOfAddToCart;

    public String getConfirmationTextFromItemPage() {
        return getTextFromElement(_confirmationTextOfItemPage);
    }

    public void clickOnHDDToAddTheItem() {
        clickOnElement( _hdd);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(_addCartBtn1);
    }

    public String getConfirmationTextForAddToCart() {
        return getTextFromElement(_confirmationTextOfAddToCart);
    }

}
