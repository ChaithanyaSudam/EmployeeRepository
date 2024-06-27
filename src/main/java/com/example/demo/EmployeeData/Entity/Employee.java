package com.example.demo.EmployeeData.Entity;

import com.example.demo.EmployeeData.Dto.EmployeeDto;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String empName;
    private String empRole;
    private String empBand;

    @Column(name = "emp_doj")
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

    //Overriding the Equals and Hashcode methods to check equality of two Entity objects
    //based on the Employee Names
    @Override
    public int hashCode() {
        return 31;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (this.getEmpId() == null) {
            if (other.getEmpId() != null)
                return false;
        } else if (!this.getEmpName().equals(other.getEmpName()))
            return false;
        return true;
    }

    //Method to convert Employee to EmployeeDTO (for transfering data from Entity to DTO)
    public EmployeeDto toEmployeeDTO(){
        EmployeeDto employeeDTO = new EmployeeDto();
        employeeDTO.setEmpId(this.getEmpId());
        employeeDTO.setEmpName(this.getEmpName());
        employeeDTO.setEmpRole(this.getEmpRole());
        employeeDTO.setEmpBand(this.getEmpBand());
        employeeDTO.setEmpJoinDate(this.getEmpJoinDate());
        return employeeDTO;
    }

}