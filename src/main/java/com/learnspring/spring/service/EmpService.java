package com.learnspring.spring.service;

import com.learnspring.spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpService extends JpaRepository<Employee,Long> {




}
