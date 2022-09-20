package dev.decagon.person;

import java.util.Date;

public abstract class Person {
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNo;
    private Date DOB;
    private GENDER gender;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
      }
      public abstract String register();
    }
