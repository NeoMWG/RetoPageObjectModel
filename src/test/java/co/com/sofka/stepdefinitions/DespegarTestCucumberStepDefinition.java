package co.com.sofka.stepdefinitions;

import co.com.sofka.model.DespegarSearchFligthModel;
import co.com.sofka.page.DespegarSearchFligthPage;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.Routes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class DespegarTestCucumberStepDefinition extends WebUI {

    private static final Logger LOGGER = Logger.getLogger(DespegarTestCucumberStepDefinition.class);
    private DespegarSearchFligthPage despegarSearchFligthPage;
    private DespegarSearchFligthModel despegarSearchFligthModel;
    private DespegarSearchFligthModel fligthSearch;
    private static final String ASSERTION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados: %s";

    @Given("a person is in the flight search section of the despegar.com page")
    public void aPersonIsInTheFlightSearchSectionOfTheDespegarComPage() {

        try {

            generalSetup();
            generateSearch();

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            quiteDriver();
            Assertions.fail(ASSERTION_EXCEPTION_MESSAGE);
        }
    }

    @When("the person fills in the fligth search fields")
    public void thePersonFillsInTheFligthSearchFields() {

        try {
            despegarSearchFligthPage = new DespegarSearchFligthPage(super.driver, 30, fligthSearch);
            despegarSearchFligthPage.fillFligthSearchFields();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            quiteDriver();
            Assertions.fail(ASSERTION_EXCEPTION_MESSAGE);

        }
    }

    @Then("the client should be able to see the flights available for reservation")
    public void theClientShouldBeAbleToSeeTheFlightsAvailableForReservation() {
        try {
            despegarSearchFligthPage.getSearchResults();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            quiteDriver();
            Assertions.fail(ASSERTION_EXCEPTION_MESSAGE);
        } finally {
            quiteDriver();
        }
    }

    private void generateSearch() {

        fligthSearch = new DespegarSearchFligthModel();
        fligthSearch.setOrigin(" Bogotá, Bogotá D.C., Colombia");
        fligthSearch.setDestination(" Medellín, Antioquia, Colombia");
        fligthSearch.setRoutes(Routes.ONEWAYTRIP);
        fligthSearch.setDepartureDay("3");
        fligthSearch.setReturnDay("4");
    }
}


