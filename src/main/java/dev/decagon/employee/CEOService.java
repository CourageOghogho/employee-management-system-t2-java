package dev.decagon.employee;

public interface CEOService extends EmployeeCoreService{
    public boolean hireEmployee(String aid);
    public boolean fireEmployee(String eid);
    public String increaseSalary(String eid);

}
