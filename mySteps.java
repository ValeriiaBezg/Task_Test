package com.example.demo1;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class mySteps {
    @When("^website is open \"([^\"]*)\"$")
    public void openUrl(String url){
        openUrl(url);
    }

    @And("^pressed the button \"([^\"]*)\"$")
    public void pressedTheButton(String btnName) {
        WebDriverRunner.getWebDriver().findElement(By.name(btnName)).click();
    }
/*
    @And("^in the field \"([^\"]*)\" entered \"([^\"]*)\"$")
    public void inTheFieldEntered(String fieldName, String fieldText) {
        String name;
        if(fieldName.equals("Радищева, Київ")) name = "route_from";
        else name = "route_to";
        WebDriverRunner.getWebDriver().findElement(By.name(name)).sendKeys(fieldText);
    }
*/

    @And("in the field {string} they entered {string}")
    public void inTheFieldTheyEnter(String arg0, String arg1) {
        String nam;
        if(arg0.equals("Радищева, Київ")) nam = "route_from";
        else nam = "route_to";
        WebDriverRunner.getWebDriver().findElement(By.name(nam)).sendKeys(arg1);

    }

    @And("^in the field \"([^\"]*)\" entered \"([^\"]*)\"$")
    public void inTheFieldTheyEntered(String arg0, String arg1) {
        String nam;
        if(arg0.equals("Радищева, Київ")) nam = "route_from";
        else nam = "route_to";
        WebDriverRunner.getWebDriver().findElement(By.name(nam)).sendKeys(arg1);

    }

    @And("selected in the field {string} transport options {string}")
    public void selectedInTheFieldTransportOptions(String arg0, String arg1) {
        String n;
        if(arg0.equals("Bicycle (OSRM)")) n = "routing_engines";
        else n = "route_to";
        WebDriverRunner.getWebDriver().findElement(By.name(n)).sendKeys(arg1);
    }

    @Then("the distance is {string}")
    public void theDistanceIs(String url) {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assertions.assertEquals(currentUrl, url);
    }
}
