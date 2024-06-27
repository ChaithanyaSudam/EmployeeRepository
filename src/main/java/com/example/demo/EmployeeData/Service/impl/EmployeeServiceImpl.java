package com.example.demo.EmployeeData.Service.impl;

import com.example.demo.EmployeeData.Dto.EmployeeDto;
import com.example.demo.EmployeeData.Entity.Employee;
import com.example.demo.EmployeeData.Repository.EmployeeRepository;
import com.example.demo.EmployeeData.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;




    @Override
    public Integer addEmployeeData(EmployeeDto employeeDto) throws Exception {

        Employee employee=new Employee();
        employee.setEmpId(employeeDto.getEmpId());
        employee.setEmpName(employeeDto.getEmpName());
        employee.setEmpRole(employeeDto.getEmpRole());
        employee.setEmpBand(employeeDto.getEmpBand());
        employee.setEmpJoinDate(employeeDto.getEmpJoinDate());

        employeeRepository.save(employee);
        return employee.getEmpId();
    }

    @Override
    public List<EmployeeDto> getAllEmployeeData() throws Exception {
        List<Employee> employees=employeeRepository.findAll();
        List<EmployeeDto> dto=new ArrayList<>();
        for(Employee employee : employees)
        {
            EmployeeDto employeeDto1=employee.toEmployeeDTO();
            dto.add(employeeDto1);
        }
        return dto;
    }

    @Override
    public List<EmployeeDto> findByEmpName(String name)throws Exception
    {
        List<EmployeeDto> emp=new ArrayList<>();
        EmployeeDto m=new EmployeeDto();
        List<Employee> dto=employeeRepository.findByEmpName(name);
        // emp.add(new EmployeeDto())
        //return dto;
        for(Employee dto1 : dto)
        {
            m.setEmpId(dto1.getEmpId());
            m.setEmpName(dto1.getEmpName());
            m.setEmpRole(dto1.getEmpRole());
            m.setEmpBand(dto1.getEmpBand());
            m.setEmpJoinDate(dto1.getEmpJoinDate());
        }
       emp.add(m);
        return emp;
    }

    public  List<EmployeeDto> findByEmpBand(String band)throws Exception
    {
//        List<Employee> emp=employeeRepository.findByEmpBand(band);
//        List<EmployeeDto> dto=new ArrayList<>();
//
//        EmployeeDto em=new EmployeeDto();
//        for(Employee e: emp)
//        {
//            em.setEmpId(e.getEmpId());
//            em.setEmpName(e.getEmpName());
//            em.setEmpRole(e.getEmpRole());
//            em.setEmpBand(e.getEmpBand());
//            em.setEmpJoinDate(e.getEmpJoinDate());
//        }
//        dto.add(em);
//
//        return dto;

        List<EmployeeDto> emp=new ArrayList<>();
        EmployeeDto m=new EmployeeDto();
        List<Employee> dto=employeeRepository.findByEmpBand(band);
        // emp.add(new EmployeeDto())
        //return dto;
        for(Employee dto1 : dto)
        {
            m.setEmpId(dto1.getEmpId());
            m.setEmpName(dto1.getEmpName());
            m.setEmpRole(dto1.getEmpRole());
            m.setEmpBand(dto1.getEmpBand());
            m.setEmpJoinDate(dto1.getEmpJoinDate());
        }
        emp.add(m);
        return emp;
    }

    public List<EmployeeDto> findByEmpJoinDateLessThan(LocalDate date)throws Exception
    {
        List<Employee> employees = employeeRepository.findByEmpJoinDateLessThan(date);

        if (employees.isEmpty())
            throw new Exception("No Employee Found who joined before: " + date);

        List<EmployeeDto> employeeDTOs = new ArrayList<>();
        for(Employee employee: employees){
            EmployeeDto employeeDTO = employee.toEmployeeDTO();
            employeeDTOs.add(employeeDTO);
        }
        return employeeDTOs;
    }

    public List<EmployeeDto> findNameByEmpBand(String band)throws Exception
    {
        List<EmployeeDto> emp=new ArrayList<>();
        EmployeeDto m=new EmployeeDto();
        List<Employee> dto=employeeRepository.findByEmpBand(band);
        // emp.add(new EmployeeDto())
        //return dto;
        for(Employee dto1 : dto)
        {
            m.setEmpId(dto1.getEmpId());
            m.setEmpName(dto1.getEmpName());
            m.setEmpRole(dto1.getEmpRole());
            m.setEmpBand(dto1.getEmpBand());
            m.setEmpJoinDate(dto1.getEmpJoinDate());
        }
        emp.add(m);
        return emp;
    }
}
