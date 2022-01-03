package co.com.sofka.page;

import co.com.sofka.model.DespegarSearchFligthModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DespegarSearchFligthPage extends CommonActionsOnPages {

    private final DespegarSearchFligthModel despegarSearchFligthModelModel;
    private static final Logger LOGGER = Logger.getLogger(DespegarSearchFligthPage.class);


    private final By loginAlertClose = By.xpath("//*[@id=\"incentive-login\"]/i[2]");
    private final By origin = By.xpath("//body/div[@class='home-ui-searchbox-container default-container ']/div[@id='searchbox-sbox-all-boxes']/div[@id='searchbox-sbox-box-flights']/div[@class='sbox5-box-container--1Ro43']/div[@class='sbox5-box-content--2pcCl sbox5-flightType-oneWay--10q9I']/div[@class='sbox5-segments--lzKBc']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private final By originList = By.xpath("//span[@class='item-text']");
    private final By destination = By.xpath("(//input[@placeholder='Ingresa hacia dónde viajas'])[1]");
    private final By destinationList = By.xpath("//span[@class='item-text']");
    private final By routeOneWayTrip = By.xpath("//label[@for='ow-sbox5']");
    private final By routeRoundTrip = By.xpath("//label[@for='rt-sbox5']");
    private final By routeMultidestination = By.xpath("//label[@for='ms-sbox5']");
    private final By dateDepartureBox = By.xpath("//div[@class='sbox5-segments--lzKBc']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]");
    private final By departureDaySelector = By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid-dates sbox5-monthgrid-dates-31']//div[@class='sbox5-monthgrid-datenumber-number'][normalize-space()='3']");
    private final By dateReturnBox = By.xpath("//div[@class='sbox5-segments--lzKBc']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//input[1]");
    private final By returnDaySelector = By.xpath("//div[@class='sbox5-monthgrid-datenumber -end-date']//div[@class='sbox5-monthgrid-datenumber-number'][normalize-space()='4']");
    private final By applyButtonDates = By.xpath("//button[@class='sbox5-3-btn -primary -md']//em[@class='btn-text'][normalize-space()='Aplicar']");
    private final By passangerClassBox = By.xpath("//div[@class='sbox5-segment--2_IQ3']//div[@class='sbox5-distribution-passengers--dbiHH']//input[@type='text']");
    private final By plusSignAdults = By.xpath("//div[@class='stepper__distribution_container']//div[1]//div[2]//div[1]//button[2]//*[name()='svg']");
    private final By minusSignAdults = By.xpath("//div[@class='stepper__distribution_container']//div[1]//div[2]//div[1]//button[1]//*[name()='svg']");
    private final By plusSignYoungs = By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[2]//div[2]//div[1]//button[2]//*[name()='svg']");
    private final By minusSignYoungs = By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[2]//div[2]//div[1]//button[1]//*[name()='svg']");
    private final By classList = By.xpath("//div[@class='sbox5-3-select -lg']//select[@class='select-tag']");
    private final By applyButtonClass = By.xpath("//div[@class='sbox5-3-select -lg']//select[@class='select-tag']");
    private final By searchButton = By.xpath("//em[normalize-space()='Buscar']");


    public DespegarSearchFligthPage(WebDriver driver, int waitTime, DespegarSearchFligthModel despegarSearchFligthModelModel) {
        super(driver,waitTime);
        this.despegarSearchFligthModelModel = despegarSearchFligthModelModel;
    }

    public void fillFligthSearchFields() {

        waitClickable(loginAlertClose);

       switch (despegarSearchFligthModelModel.getRoutes()) {

            case ONEWAYTRIP:
                click(routeOneWayTrip);
                break;
            case ROUNDTRIP:
                click(routeRoundTrip);
                break;
            case MULTIDESTINATION:
                click(routeMultidestination);
                break;
            default:

        }

        firtSearch();

    }

    public void firtSearch(){

        waitClickable(routeOneWayTrip);
        click(routeOneWayTrip);
        waitUntil(origin);
        waitClickable(origin);
        click(origin);
        clearText(origin);
        pressSpaceKey(origin);
        typeInto(origin, despegarSearchFligthModelModel.getOrigin());
        click(originList);
        waitClickable(destination);
        click(destination);
        pressSpaceKey(destination);
        typeInto(destination,despegarSearchFligthModelModel.getDestination());
        click(destinationList);
        waitClickable(dateDepartureBox);
        click(dateDepartureBox);
        click(departureDaySelector);
        waitClickable(dateReturnBox);
        click(dateReturnBox);
        click(departureDaySelector);
        click(applyButtonDates);
        waitClickable(passangerClassBox);
        click(passangerClassBox);
        click(plusSignAdults);
        click(classList);
        pressDownArrow(classList);
        pressEnter(classList);
        click(applyButtonClass);
        click(searchButton);
    }

    public boolean getSearchResults(){
        List<WebElement> elements = getElements(searchResults);
        return elements.isEmpty();


}

