package com.redhouse.dao;

import com.redhouse.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RelSol.Chen on 2016/9/14.
 */
public interface EmployeeMapper {

    Employee findById(Integer id);

    List<Employee> findAll();
}
