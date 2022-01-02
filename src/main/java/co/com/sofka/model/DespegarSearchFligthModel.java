package co.com.sofka.model;

import co.com.sofka.util.ClassSelector;
import co.com.sofka.util.Routes;

public class DespegarSearchFligthModel {

    private String origin;
    private String destination;
    private String departureDay;
    private String departureMonth;
    private String departureYear;
    private String returnDay;
    private String returnMonth;
    private String returnYear;
    private String passengerAmountAdult;
    private String passengerAmountYounger;
    private Routes routes;
    private ClassSelector classSelect;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getDepartureMonth() {
        return departureMonth;
    }

    public void setDepartureMonth(String departureMonth) {
        this.departureMonth = departureMonth;
    }

    public String getDepartureYear() {
        return departureYear;
    }

    public void setDepartureYear(String departureYear) {
        this.departureYear = departureYear;
    }

    public String getReturnDay() {
        return returnDay;
    }

    public void setReturnDay(String returnDay) {
        this.returnDay = returnDay;
    }

    public String getReturnMonth() {
        return returnMonth;
    }

    public void setReturnMonth(String returnMonth) {
        this.returnMonth = returnMonth;
    }

    public String getReturnYear() {
        return returnYear;
    }

    public void setReturnYear(String returnYear) {
        this.returnYear = returnYear;
    }

    public String getPassengerAmountAdult() {
        return passengerAmountAdult;
    }

    public void setPassengerAmountAdult(String passengerAmountAdult) {
        this.passengerAmountAdult = passengerAmountAdult;
    }

    public String getPassengerAmountYounger() {
        return passengerAmountYounger;
    }

    public void setPassengerAmountYounger(String passengerAmountYounger) {
        this.passengerAmountYounger = passengerAmountYounger;
    }

    public Routes getRoutes() {
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }

    public ClassSelector getClassSelect() {
        return classSelect;
    }

    public void setClassSelect(ClassSelector classSelect) {
        this.classSelect = classSelect;
    }
}