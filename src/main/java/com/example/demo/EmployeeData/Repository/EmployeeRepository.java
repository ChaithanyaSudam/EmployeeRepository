package com.example.demo.EmployeeData.Repository;

import com.example.demo.EmployeeData.Dto.EmployeeDto;
import com.example.demo.EmployeeData.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
        List<Employee> findByEmpName(String name)throws Exception;
        List<Employee> findByEmpBand(String band)throws Exception;
        List<Employee> findByEmpJoinDateLessThan(LocalDate localDate)throws Exception;

        @Query("SELECT e.empName FROM Employee e WHERE e.empBand= : Band")
        List<Employee> findNameByEmpBand(@Param("Band") String empband)throws Exception;
}
