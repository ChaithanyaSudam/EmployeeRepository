package com.example.demo.EmployeeData.Dto;

import java.time.LocalDate;

public class EmployeeDto {
    private Integer empId;
    private String empName;
    private String empRole;
    private String empBand;
    private LocalDate empJoinDate;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpBand() {
        return empBand;
    }

    public void setEmpBand(String empBand) {
        this.empBand = empBand;
    }

    public LocalDate getEmpJoinDate() {
        return empJoinDate;
    }

    public void setEmpJoinDate(LocalDate empJoinDate) {
        this.empJoinDate = empJoinDate;
    }

    //Method to convert EmployeeDTO to Employee (for transfering data from DTO to Entity)
//    public Employee toEmployee(){
//        Employee employee = new Employee();
//        employee.setEmpId(this.getEmpId());
//        employee.setEmpName(this.getEmpName());
//        employee.setEmpRole(this.getEmpRole());
//        employee.setEmpBand(this.getEmpBand());
//        employee.setEmpJoinDate(this.getEmpJoinDate());
//        return employee;
//    }

    //Override the toString method to print the EmployeeDTO object
    @Override
    public String toString() {
        return "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empRole='" + empRole + '\'' +
                ", empBand='" + empBand + '\'' +
                ", empJoinDate=" + empJoinDate;
    }
}
