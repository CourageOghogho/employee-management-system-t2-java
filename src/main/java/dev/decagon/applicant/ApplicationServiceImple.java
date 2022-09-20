package dev.decagon.applicant;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ApplicationServiceImple implements ApplicationService {
    @Override
    public String applyForJob() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to our application portal");
        String firstName;
        String lastName;
        String email;
        String phoneNumber;
        String dateOfBirth;
        String aid= "APID"+(int)(Math.random()*10000);
        LocalDate applicationDate= LocalDate.now();
        String experience;
        QUALIFICATION highestQualification;
        System.out.println("Kindly provide your information");
        System.out.println("Enter first name");
        firstName=scanner.next();
        System.out.println("Enter last name");
        lastName=scanner.next();
        System.out.println("Enter email");
        email=scanner.next();
        System.out.println("Enter phone number");
        phoneNumber=scanner.next();
        System.out.println("date of birth\t dd/mm/yyyy");
        dateOfBirth=scanner.next();
        System.out.println("Experience");
        experience=scanner.next();
        System.out.println("Enter your highest qualification");
        System.out.println("for PhD enter 1\nfor MSC enter 2\nfor BSC enter 3\nfor HND enter 4\nfor OND enter 5");
        int qualif=0;
       try{qualif=scanner.nextInt();}catch (Exception e){
           System.out.println("bad input");
       }
       highestQualification=QUALIFICATION.OND;
       switch (qualif){
           case 1:
               highestQualification=QUALIFICATION.PhD;
               break;
           case 2:
               highestQualification=QUALIFICATION.MSC;
               break;
           case 3:
               highestQualification=QUALIFICATION.BSC;
               break;
           case 4:
               highestQualification=QUALIFICATION.HND;
               break;
           case 5:
               highestQualification=QUALIFICATION.OND;
               break;
           default:
               System.out.println("You entered invalid data. Application terminated!");
               return "APPLICATION NOT SUCCESSFUL!!!";

       }

        //(LocalDate applicationDate, QUALIFICATION highestQualification, String experience)
        Applicant applicant=new Applicant(applicationDate,highestQualification,experience);
       //logic to persist applicant goes here
        return "Application Successful! \nYour Application ID is: "+aid;

    }
}
