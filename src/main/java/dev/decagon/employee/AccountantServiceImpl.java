package dev.decagon.employee;

public class AccountantServiceImpl implements AccountantService,EmployeeCoreService{
    @Override
    public String paySalary(String eid) {
        if(eid.contains("EID")){
            return "Salary Paid! Enjoy your month-end";
        }
        return "Who are you please?";
    }

    @Override
    public String witholdPay(String eid) {
        if(eid.contains("EID")){
            return "Please visit the manager's office";
        }
        return "We don't know you!";
    }

    @Override
    public String applyForLeave(String eid) {
        if(eid.contains("EID")){
            return "Employee is eligible";
        }
        return "Not eligible";
    }

    @Override
    public String resign(String eid) {
        if(eid.contains("EID")){
            return "Employee is eligible";
        }
        return "Not eligible";
    }
}
