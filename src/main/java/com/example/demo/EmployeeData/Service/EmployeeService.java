package com.example.demo.EmployeeData.Service;

import com.example.demo.EmployeeData.Dto.EmployeeDto;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeService {

    public Integer addEmployeeData(EmployeeDto employeeDto)throws Exception;

    public List<EmployeeDto> getAllEmployeeData()throws Exception;

    public List<EmployeeDto> findByEmpName(String name)throws Exception;

    public List<EmployeeDto> findByEmpBand(String band)throws Exception;

    public List<EmployeeDto> findByEmpJoinDateLessThan(LocalDate localDate)throws Exception;

    public List<EmployeeDto> findNameByEmpBand(String band)throws Exception;
}
