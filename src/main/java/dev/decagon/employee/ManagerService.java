package dev.decagon.employee;

public interface ManagerService extends EmployeeCoreService{
    public Attendance takeAttendance(String eid);
}
