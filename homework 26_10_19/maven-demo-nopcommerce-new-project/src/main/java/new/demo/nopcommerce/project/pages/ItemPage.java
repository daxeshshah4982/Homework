package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;


public class ItemPage extends Util {

    By confirmationTextOfItemPage = By.linkText("Processor");
    By hdd = By.xpath("//label[contains(text(),'400 GB [+$100.00]')]");
    By addCartBtn1 = By.id("add-to-cart-button-1");
    By confirmationTextOfAddToCart = By.xpath("//p[@class='content']");

    public String getConfirmationTextFromItemPage(){
        return getTextFromElement(confirmationTextOfItemPage);
    }
    public void clickOnHDDToAddTheItem(){
        clickOnElement(hdd);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addCartBtn1);
    }
    public String getConfirmationTextForAddToCart(){
        return getTextFromElement(confirmationTextOfAddToCart);
    }

}
