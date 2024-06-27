package com.example.demo.EmployeeData.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projId;
    private String projName;
    private String projLocation;

//    private Employee manager;
    //@Column(name = "proj_start_date")
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

//    public Employee getManager() {
//        return manager;
//    }

//    public void setManager(Employee manager) {
//        this.manager = manager;
//    }

//    public Project(Integer projId, String projName, String projLocation, LocalDate startDate) {
//        this.projId = projId;
//        this.projName = projName;
//        this.projLocation = projLocation;
//        this.startDate = startDate;
//    }
//
//    public Project() {
//    }
//
//    public Project(Integer projId, String projName, String projLocation,LocalDate startDate) {
//        this.projId = projId;
//        this.projName = projName;
//        this.projLocation = projLocation;
////        this.manager = manager;
//        this.startDate = startDate;
//    }

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
        Project other = (Project) obj;
        if (this.getProjId() == null) {
            if (other.getProjId() != null)
                return false;
        } else if (!this.getProjName().equals(other.getProjName()))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projId=" + projId +
                ", projName='" + projName + '\'' +
                ", projLocation='" + projLocation + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
