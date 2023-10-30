package com.example.springredisandhibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String education;
    @Column(name = "joining_year")
    private String joiningYear;
    private String city;
    private Integer age;
    private String gender;
    @Column(name = "experience")
    private Integer exp;

    private Employee(Builder builder) {
        setId(builder.id);
        setEducation(builder.education);
        setJoiningYear(builder.joiningYear);
        setCity(builder.city);
        setAge(builder.age);
        setGender(builder.gender);
        setExp(builder.exp);
    }

    public Employee() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(String joiningYear) {
        this.joiningYear = joiningYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public static final class Builder {
        private Long id;
        private String education;
        private String joiningYear;
        private String city;
        private Integer age;
        private String gender;
        private Integer exp;

        public Builder() {
        }

        public Builder withId(Long val) {
            id = val;
            return this;
        }

        public Builder withEducation(String val) {
            education = val;
            return this;
        }

        public Builder withJoiningYear(String val) {
            joiningYear = val;
            return this;
        }

        public Builder withCity(String val) {
            city = val;
            return this;
        }

        public Builder withAge(Integer val) {
            age = val;
            return this;
        }

        public Builder withGender(String val) {
            gender = val;
            return this;
        }

        public Builder withExp(Integer val) {
            exp = val;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
