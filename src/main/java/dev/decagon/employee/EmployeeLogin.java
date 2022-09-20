package dev.decagon.employee;

import java.util.Scanner;

public class EmployeeLogin {
    private String eid;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public boolean login(String eid){
        if(eid.contains("EID")) {
            this.eid=eid;
           // employeeWelcome();
            return true;}
        return false;
    }
    public void employeeWelcome(String eid){
        System.out.println("Welcome Back "+eid);

    }
    public void ceoWelcome(String eid){
        if(eid.contains("EID")) {

            System.out.println("Welcome Back " + eid);
            System.out.println("kindly Select your OPERATION");
            System.out.println("To Hire Press 1\nTo Fire Press 2\nTo Resign Press 3\nTo Increase Salary Press 4"+"" +
                    "\nTo Take Leave Press 5");
            Scanner scanner=new Scanner(System.in);
            int option=scanner.nextInt();
            CEOService ceoService=new CEOServiceImpl();

            switch (option){
                case 1:
                    System.out.println("Enter Application ID");
                    if(ceoService.hireEmployee(scanner.next())){
                        System.out.println("Success");
                    }else {
                        System.out.println("Error in approving applicant: Error code A1010");
                    }
                    break;
                case 2:
                    System.out.println("Enter Employee ID");
                    if(ceoService.fireEmployee(scanner.next())){
                        System.out.println("Success");
                    }else {
                        System.out.println("Error in approving applicant: Error code A1010");
                    }
                    break;
                case 3:
                    System.out.println("Enter your ID");
                    System.out.println(ceoService.resign(scanner.next()));
                    break;
                case 4:
                    System.out.println("Enter your ID");
                    System.out.println(ceoService.increaseSalary(scanner.next()));
                    break;
                case 5:
                    System.out.println("Enter your ID");
                    System.out.println(ceoService.applyForLeave(scanner.next()));
                    break;
                default:
                    System.out.println("Invalid input");
            }



        }
    }

    public void managerWelcome(String eid) {
        if(eid.contains("EID")) {

            System.out.println("Welcome Back " + eid);
            System.out.println("kindly Select your OPERATION");
            System.out.println("To Resign Press 1\nTo Take Leave Press 2\nTo take attendance press 3");
            Scanner scanner=new Scanner(System.in);
            int option=scanner.nextInt();
            ManagerService managerService=new ManagerServiceImpl();

            switch (option){
                case 1:
                    System.out.println("Enter your ID");
                    System.out.println(managerService.resign(scanner.next()));
                    break;

                case 2:
                    System.out.println("Enter your ID");
                    System.out.println(managerService.applyForLeave(scanner.next()));
                    break;

                case 3:
                    System.out.println("Enter The EID");
                    Attendance attendance=managerService.takeAttendance(scanner.next());
                    break;

                default:
                    System.out.println("Invalid input");
            }



        }
    }

    public void accountantWelcome(String eid) {
        System.out.println("Welcome Back " + eid);
        System.out.println("kindly Select your OPERATION");
        System.out.println("To Resign Press 1\nTo Take Leave Press 2\nTo take pay salary press 3\nTo withhold salary press 4\n");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        AccountantService accountantService=new AccountantServiceImpl();

        switch (option){
            case 1:
                System.out.println("Enter your ID");
                System.out.println(accountantService.resign(scanner.next()));
                break;

            case 2:
                System.out.println("Enter your ID");
                System.out.println( accountantService.applyForLeave(scanner.next()));
                break;

            case 3:

                System.out.println("Enter your ID");
                System.out.println( accountantService.paySalary(scanner.next()));
                break;
            case 4:
                System.out.println("Enter your ID");
                System.out.println( accountantService.witholdPay(scanner.next()));
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void staffWelcome(String eid) {
        System.out.println("Welcome Back " + eid);
        System.out.println("kindly Select your OPERATION");
        System.out.println("To Resign Press 1\nTo Take Leave Press 2\n");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        StaffService staffService=new StaffServiceImpl();

        switch (option){
            case 1:
                System.out.println("Enter your ID");
                System.out.println(staffService.resign(scanner.next()));
                break;

            case 2:
                System.out.println("Enter your ID");
                System.out.println( staffService.applyForLeave(scanner.next()));
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
