package com.aks.springbootdemo.service;

import com.aks.springbootdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(String id);
    void deleteById(String id);
    Employee update(Employee employee);
}
