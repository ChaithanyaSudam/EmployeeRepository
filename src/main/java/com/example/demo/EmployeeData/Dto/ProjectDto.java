package com.example.demo.EmployeeData.Dto;

import com.example.demo.EmployeeData.Entity.Project;

import java.time.LocalDate;

public class ProjectDto {

    private Integer projId;
    private String projName;
    private String projLocation;
    private EmployeeDto manager;
    private LocalDate startDate;

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getProjLocation() {
        return projLocation;
    }

    public void setProjLocation(String projLocation) {
        this.projLocation = projLocation;
    }

    public EmployeeDto getManager() {
        return manager;
    }

    public void setManager(EmployeeDto manager) {
        this.manager = manager;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    //Add a method to convert ProjectDTO to Project (for transfering data from DTO to Entity)
    public Project toProject(){
        Project project = new Project();
        project.setProjId(this.getProjId());
        project.setProjName(this.getProjName());
        project.setProjLocation(this.getProjLocation());
//        project.setManager(this.getManager().toEmployee());
        project.setStartDate(this.getStartDate());
        return project;
    }

    //Override toString() method
    @Override
    public String toString() {
        return "projId=" + projId +
                ", projName='" + projName + '\'' +
                ", projLocation='" + projLocation + '\'' +
                ", manager=" + manager.getEmpName() +
                ", startDate=" + startDate;
    }
}
