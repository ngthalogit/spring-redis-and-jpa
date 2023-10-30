package com.example.springredisandhibernate.model;


import com.example.springredisandhibernate.entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeResponse {
    private String education;
    private String joiningYear;
    private String city;
    private Integer age;
    private String gender;
    private Integer exp;

    public EmployeeResponse() {
    }

    public EmployeeResponse(Employee employee) {
        this.education = employee.getEducation();
        this.joiningYear = employee.getJoiningYear();
        this.city = employee.getCity();
        this.age = employee.getAge();
        this.gender = employee.getGender();
        this.exp = employee.getExp();
    }

    private EmployeeResponse(Builder builder) {
        setEducation(builder.education);
        setJoiningYear(builder.joiningYear);
        setCity(builder.city);
        setAge(builder.age);
        setGender(builder.gender);
        setExp(builder.exp);
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
        private String education;
        private String joiningYear;
        private String city;
        private Integer age;
        private String gender;
        private Integer exp;

        public Builder() {
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

        public EmployeeResponse build() {
            return new EmployeeResponse(this);
        }
    }
}
