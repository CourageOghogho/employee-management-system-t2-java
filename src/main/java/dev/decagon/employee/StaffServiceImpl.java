package dev.decagon.employee;

public class StaffServiceImpl implements StaffService{
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
