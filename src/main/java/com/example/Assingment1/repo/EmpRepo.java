package com.example.Assingment1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Assingment1.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Long>{

}
