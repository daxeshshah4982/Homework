package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class ItemPage extends Util {
    private static final Logger log = LogManager.getLogger(ItemPage.class.getName());

    By confirmationTextOfItemPage = By.linkText("Processor");
    By hdd = By.xpath("//label[contains(text(),'400 GB [+$100.00]')]");
    By addCartBtn1 = By.id("add-to-cart-button-1");
    By confirmationTextOfAddToCart = By.xpath("//p[@class='content']");

    public String getConfirmationTextFromItemPage(){
        log.info("verify item page");
        return getTextFromElement(confirmationTextOfItemPage);
    }
    public void clickOnHDDToAddTheItem(){
        log.info("click on hdd of 420gb");
        clickOnElement(hdd);
    }
    public void clickOnAddToCartButton(){
        log.info("click on cart button");
        clickOnElement(addCartBtn1);
    }
    public String getConfirmationTextForAddToCart(){
        log.info("verify add on cart page");
        return getTextFromElement(confirmationTextOfAddToCart);
    }

}
