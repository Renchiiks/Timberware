package com.timberware.repository;

import com.timberware.domain.Department;
import org.springframework.data.repository.CrudRepository;


public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
