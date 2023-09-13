package com.lethy.restapi.dao;

import com.lethy.restapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
