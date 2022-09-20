package dev.decagon.employee;

import java.util.Scanner;

public class CEOServiceImpl implements CEOService{
    @Override
    public boolean hireEmployee(String aid) {
        if(aid.contains("APID")){
            return true;
        }

        return false;
    }

    @Override
    public boolean fireEmployee(String eid) {
        if(eid.contains("EID")){
            return true;
        }
        return false;
    }

    @Override
    public String increaseSalary(String eid) {

        if(eid.contains("EID")){
            return "Employee is eligible";
        }
        return "Not eligible";
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
