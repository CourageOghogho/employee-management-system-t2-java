package dev.decagon.employee;

import dev.decagon.applicant.Applicant;
import dev.decagon.applicant.QUALIFICATION;
import dev.decagon.person.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee extends Person {
    @Override
    public String register() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Employee Registration Platform");
        String firstName;
        String lastName;
        String email;
        String phoneNumber;
        String dateOfBirth;
        String eid= "EID"+(int)(Math.random()*10000)+"DEPT002";
        System.out.println("Kindly provide Employee information");
        System.out.println("Enter first name");
        firstName=scanner.next();
        System.out.println("Enter last name");
        lastName=scanner.next();
        System.out.println("Enter email");
        email=scanner.next();
        System.out.println("Enter phone number");
        phoneNumber=scanner.next();
        System.out.println("date of birth\t ddmmyyyy");
        dateOfBirth=scanner.next();

        System.out.println("Please Select Employee Role");
        System.out.println("for CEO enter 1\nfor Manager enter 2\nfor Accountant enter 3\nfor Others enter 4");
        int tempRole=4;
        try{tempRole=scanner.nextInt();}catch (Exception e){
            System.out.println("bad input");
        }
        ROLE role=ROLE.STAFF;
        switch (tempRole){
            case 1:
                role=ROLE.CEO;
                break;
            case 2:
                role=ROLE.MANAGER;
                break;
            case 3:
                role=ROLE.ACCOUNTANT;
                break;
            case 4:
                role=ROLE.STAFF;
                break;
            default:
                System.out.println("You entered invalid data. Enrollment terminated!");
                return "REGISTRATION NOT SUCCESSFUL!!!";

        }

        //logic to persist applicant goes here

        return "Registration Successful! \nYour Application ID is: "+eid;

    }
}
