package co.com.sofka.page;

import co.com.sofka.model.DespegarSearchFligthModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DespegarSearchFligthPage extends CommonActionsOnPages {

    private final DespegarSearchFligthModel despegarSearchFligthModelModel;

    private final By origin = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div" +
            "/div[1]/div[1]/div/input");
    private final By destination = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]" +
            "/div/div[2]/div/div/input");
    private final By originList = By.xpath("//span[@class='item-text']");

    private final By routeOneWayTrip = By.xpath("//label[@for='ow-sbox5']");
    private final By routeRoudTrip = By.xpath("//label[@for='rt-sbox5']");
    private final By routeMultidestination = By.xpath("//label[@for='ms-sbox5']");


    public DespegarSearchFligthPage(WebDriver driver, int waitTime, DespegarSearchFligthModel despegarSearchFligthModelModel) {
        super(driver, waitTime);
        this.despegarSearchFligthModelModel = despegarSearchFligthModelModel;
    }
    public void fillFligthSearchFields() {

        switch (despegarSearchFligthModelModel.getRoutes()) {

            case ONEWAYTRIP:
                click(routeOneWayTrip);
                break;
            case ROUNDTRIP:
                click(routeRoudTrip);
                break;
            case MULTIDESTINATION:
                click(routeMultidestination);
                break;
            default:

        }

        clearText(origin);
        typeInto(origin, despegarSearchFligthModelModel.getOrigin());
        waitClick(originList);
        click(originList);
        pressEnter(origin);

        click(destination);
        clearText(destination);
        typeInto(destination, despegarSearchFligthModelModel.getDestination());
        pressEnter(destination);
    }
}

