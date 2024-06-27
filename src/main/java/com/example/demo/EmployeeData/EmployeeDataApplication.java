package com.example.demo.EmployeeData;

import com.example.demo.EmployeeData.Dto.EmployeeDto;
import com.example.demo.EmployeeData.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class EmployeeDataApplication
		//implements CommandLineRunner
{
//	@Autowired
//	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDataApplication.class, args);
		//System.out.println("spring start...");
	}
}

//	public void run(String ... args) throws Exception {
//		//System.out.println("no errors");
//	//	addEmployeeDetails();
//		//Derived Query Methods
//		//getAllEmployees();
//		//getEmployeeByName();
//		//getEmployeeByBand();
//		//getEmployeeByJoiningDate();
//
//		//custom Query methods
//		getNameByBand();
//	}
//
//	public void addEmployeeDetails() throws Exception {
//		EmployeeDto employeeDto=new EmployeeDto();
//		employeeDto.setEmpId(4);
//		employeeDto.setEmpName("Arjun");
//		employeeDto.setEmpRole("analyst");
//		employeeDto.setEmpBand("B1");
//		employeeDto.setEmpJoinDate(LocalDate.of(2021,3,2));
//
//		employeeService.addEmployeeData(employeeDto);
//		System.out.println("Data Added Successfully");
//	}
//
//	public void getAllEmployees() throws Exception {
//
//		List<EmployeeDto> al= employeeService.getAllEmployeeData();
//
//		System.out.println(al);
//	}
//	public void getEmployeeByName() throws Exception {
//		List<EmployeeDto> al=employeeService.findByEmpName("chaithanya");
//
//		System.out.println(al);
//	}
//
//	public void getEmployeeByBand()throws Exception
//	{
//		List<EmployeeDto> al=employeeService.findByEmpBand("B2");
//		System.out.println(al);
//	}
//
//	public void getEmployeeByJoiningDate()throws Exception
//	{
//		List<EmployeeDto> dto=employeeService.findByEmpJoinDateLessThan(LocalDate.of(2023, 1, 1));
//		System.out.println(dto);
//	}
//
//	public void getNameByBand()throws Exception
//	{
//		List<EmployeeDto> dto=employeeService.findNameByEmpBand("B2");
//		System.out.println(dto);
//	}
//}





