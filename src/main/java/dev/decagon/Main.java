package dev.decagon;

import dev.decagon.applicant.ApplicationService;
import dev.decagon.applicant.ApplicationServiceImple;
import dev.decagon.employee.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("\nWelcome to TEAM-2 EMS\n");
        System.out.println("Who are you?\n\nKindly select what suits\n\n");
        System.out.println("For CEO \t1\nFor Manager \t2\nFor Accountant \t3\nFor Other staff \t4");
        System.out.println("\n\n\nPress 10 for Applicants\n\n");
        System.out.println("Press 100 to Quit");

        int option =scanner.nextInt();
        String eid;
        EmployeeLogin login=new EmployeeLogin();
        while(option!=100){
            switch (option){
                case 1:
                    System.out.println("Enter EID");
                    eid =scanner.next();

                    if(login.login(eid)){
                        login.ceoWelcome(eid);
                    }else {
                        System.out.println("Invalid input");
                        option=99;
                    }

                    break;
                case 2:
                    System.out.println("Enter EID");
                    eid =scanner.next();
                    if(login.login(eid)){
                        login.managerWelcome(eid);
                    }else {
                        System.out.println("Invalid input");
                        option=99;
                    }

                    break;
                case 3:
                    System.out.println("Enter EID");
                    eid =scanner.next();
                    if(login.login(eid)){
                        login.accountantWelcome(eid);
                    }else {
                        System.out.println("Invalid input");
                        option=99;
                    }

                    break;
                case 4:
                    System.out.println("Enter EID");
                    eid =scanner.next();
                    if(login.login(eid)){
                        login.staffWelcome(eid);
                    }else {
                        System.out.println("Invalid input");
                        option=99;
                    }
                case 10:
                    break;
            }
        }

            //System.out.println("You entered an invalid input, please try again");





    }
}