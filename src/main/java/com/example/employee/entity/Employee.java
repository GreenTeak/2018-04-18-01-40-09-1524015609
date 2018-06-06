package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Employee")
public class Employee {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(length = 10)
    private String gender;

    @Column(nullable = false)
    private Integer companyId;

    @Column(nullable = false)
    private Integer salary;

    public Employee(){}
    public Employee(String name,int age,String gender,int salary,int companyId,int id){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.companyId=companyId;
        this.salary=salary;
        this.id=id;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
