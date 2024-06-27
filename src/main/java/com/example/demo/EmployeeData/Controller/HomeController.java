package com.example.demo.EmployeeData.Controller;

import com.example.demo.EmployeeData.Dto.EmployeeDto;
import com.example.demo.EmployeeData.Service.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/data")
    public ResponseEntity<List<EmployeeDto>> getAllEmployee()throws Exception
    {
            List<EmployeeDto> dto=employeeService.getAllEmployeeData();
        return new  ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping("/postt")
    public  ResponseEntity<String> addEmployee(@RequestBody EmployeeDto employeeDto)throws Exception
    {
        //List<EmployeeDto> eto=employeeService.addEmployeeData(@RequestBody EmployeeDto emp);
        Integer empId = employeeService.addEmployeeData(employeeDto);
        String successMessage = "Employee with ID: " + empId + " added successfully!";
        System.out.println("main branch");
        return new ResponseEntity<>(successMessage, HttpStatus.CREATED);

    }



}
