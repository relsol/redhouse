package com.redhouse.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.redhouse.dao.EmployeeMapper;
import com.redhouse.entity.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by RelSol.Chen on 2016/9/14.
 */
@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    public List<Employee> findAll(){
        return this.employeeMapper.findAll();
    }

    public Employee findid(Integer id){
        return this.employeeMapper.findById(id);
    }

    public PageInfo<Employee> findPage(Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo, pageSize);
        List<Employee> list = employeeMapper.findAll();
        PageInfo<Employee> page = new PageInfo<>(list);
        return page;
    }
}
