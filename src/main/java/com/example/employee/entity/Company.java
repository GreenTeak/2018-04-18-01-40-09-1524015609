package com.example.employee.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String employeesNumber;

    public Company(){}
    public Company(int id,String companyName,String employeeNumber){
        this.id=id;
        this.companyName=companyName;
        this.employeesNumber=employeeNumber;
    }
    public Integer getId(){return this.id;}

    public String getCompanyName() {
        return companyName;
    }
    public String getEmployeesNumber() {
        return employeesNumber;
    }
}
