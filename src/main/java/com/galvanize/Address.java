package com.galvanize;

public class Address {

    // Declare variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String a, String b, String c, String d) {
      street = a;
      city = b;
      state = c;
      zip = d;
    }

    // Getters
    public String getStreet() {
      return street;
    };

    public String getCity() {
      return city;
    };

    public String getState() {
      return state;
    };

    public String getZip() {
      return zip;
    };

    // Setters
    public void setStreet(String newStreet) {
      street = newStreet;
    };

    public void setCity(String newCity) {
      city = newCity;
    };

    public void setState(String newState) {
      state = newState;
    };

    public void setZip(String newZip) {
      zip = newZip;
    };

    @Override public String toString() {
      StringBuilder result = new StringBuilder();

      result.append(street + ", " + city + ", " + state + " " + zip);
      return result.toString();
    }

};
