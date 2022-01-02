Feature: Flight search on despegar.com page

  As a client I need to find a flight to my destination city and then make a reservation.

  Background:

    Given a person is in the flight search section of the despegar.com page

  Scenario: Search for available flights

    When the person fills in the fligth search fields
    Then the client should be able to see the flights available for reservation
