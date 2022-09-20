package dev.decagon.employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Attendance {
    private String eid;
    private Date clockInTime;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public Date getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(Date clockInTime) {
        this.clockInTime = clockInTime;
    }





    public Attendance(String eid, Date clockInTime) {
        this.eid = eid;
        this.clockInTime = clockInTime;
    }

    public Attendance() {
    }
}
