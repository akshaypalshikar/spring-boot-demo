package com.aks.springbootdemo.repository;

import com.aks.springbootdemo.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String> {
}
