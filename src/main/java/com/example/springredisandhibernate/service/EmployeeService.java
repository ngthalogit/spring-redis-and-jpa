package com.example.springredisandhibernate.service;

import com.example.springredisandhibernate.entity.Employee;
import com.example.springredisandhibernate.model.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponse> getAll();
}
