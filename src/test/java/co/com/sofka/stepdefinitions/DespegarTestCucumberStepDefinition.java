package co.com.sofka.stepdefinitions;

import co.com.sofka.model.DespegarSearchFligthModel;
import co.com.sofka.page.DespegarSearchFligthPage;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.Routes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DespegarTestCucumberStepDefinition extends WebUI {

        private DespegarSearchFligthPage despegarSearchFligthPagePage;
        private DespegarSearchFligthModel fligthSearch;
        private static final String ASSERTION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados: %s";

        @Given("a person is in the flight search section of the despegar.com page")
        public void aPersonIsInTheFlightSearchSectionOfTheDespegarComPage() {
            try{
                generalSetup();
            } catch (Exception exception){
                quiteDriver();
            }
        }
        @When("the person fills in the fligth search fields")
        public void thePersonFillsInTheFligthSearchFields() {
            try{
                generateSearch();
                despegarSearchFligthPagePage = new DespegarSearchFligthPage(super.driver, 30, fligthSearch);
                despegarSearchFligthPagePage.fillFligthSearchFields();

            } catch (Exception exception){
                quiteDriver();
            }

        }
        @Then("the client should be able to see the flights available for reservation")
        public void theClientShouldBeAbleToSeeTheFlightsAvailableForReservation() {

        }

        private void generateSearch() {

            fligthSearch = new DespegarSearchFligthModel();
            fligthSearch.setOrigin("Bogotá, Bogotá D.C., Colombia");
            fligthSearch.setDestination("Medellín, Antioquia, Colombia");
            fligthSearch.setRoutes(Routes.ONEWAYTRIP);
        }


}
