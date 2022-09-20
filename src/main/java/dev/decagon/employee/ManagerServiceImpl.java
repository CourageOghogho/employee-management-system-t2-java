package dev.decagon.employee;

import java.time.LocalDate;
import java.util.Calendar;

public class ManagerServiceImpl implements ManagerService{
    @Override
    public Attendance takeAttendance(String eid){

        return new Attendance(eid, Calendar.getInstance().getTime());
    }

    @Override
    public String applyForLeave(String eid) {
        if(eid.contains("EID")){
            return "Successful, We hope to see you soon";
        }
        return "User data invalid!!!";
    }

    @Override
    public String resign(String eid) {
        if(eid.contains("EID")){
            return "Successful, all the best in your future endeavour";
        }
        return "Sorry, who are you!";
    }

    public String register() {


        return "EID";
    }
}
