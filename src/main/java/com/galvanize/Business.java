package com.galvanize;
import java.util.*;

public class Business implements Addressable {
  private String name;
  private ArrayList<Address> addresses = new ArrayList<Address>();

  // constructor
  public Business(String string) {
    name = string;
  }

  // getter
  public String getName() {
    return name;
  }

  public List<Address> getAddresses() {
    List<Address> list = new ArrayList<Address>();

    for (Address a : addresses) {
      list.add(a);
    }
    return list;
  }

  public void addAddress(Address newAddress) {
    addresses.add(newAddress);
  }
}
