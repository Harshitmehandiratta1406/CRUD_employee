package com.example.cruddemo.dao;
import com.example.cruddemo.entity.Employee;

import java.util.*;


public interface EmployeeDAO {


        List<Employee> findall();

        Employee findById(int theId);

        Employee save(Employee theEmployee);

        void deleteById(int theId);
}
