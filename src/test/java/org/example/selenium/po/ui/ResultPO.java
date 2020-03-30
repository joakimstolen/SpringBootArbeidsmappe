package org.example.selenium.po.ui;

import org.example.selenium.PageObject;
import org.example.selenium.po.LayoutPO;
import org.openqa.selenium.By;


public class ResultPO extends LayoutPO {

    public ResultPO(PageObject other) {
        super(other);
    }

    @Override
    public boolean isOnPage() {
        return getDriver().getTitle().contains("Match Result");
    }

    public boolean haveWon(){
        return getDriver().findElements(By.id("wonId")).size() > 0;
    }

    public boolean haveLost(){
        return getDriver().findElements(By.id("lostId")).size() > 0;
    }
}
