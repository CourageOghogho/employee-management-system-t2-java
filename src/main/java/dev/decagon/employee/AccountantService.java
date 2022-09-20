package dev.decagon.employee;

public interface AccountantService extends EmployeeCoreService{
    public String paySalary(String eid);
    public String witholdPay(String eid);

}
