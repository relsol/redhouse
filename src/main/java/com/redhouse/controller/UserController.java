package com.redhouse.controller;

import com.github.pagehelper.PageInfo;
import com.redhouse.entity.Employee;
import com.redhouse.entity.User;
import com.redhouse.service.EmployeeService;
import com.redhouse.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by RelSol.Chen on 2016/9/8.
 */
@RestController
@RequestMapping("/user")
@Api(value="User模块")
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/getEmployee")
    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    public List<Employee> findAll(){
        return this.employeeService.findAll();
    }

    @RequestMapping("/findPage")
    @ApiOperation(value="findPage测试接口", notes="findPage测试接口详细描述")
    public PageInfo<Employee> findPage(@ApiParam(required = true, name = "name", value = "姓名")
                                           @RequestParam(name = "name") String stuName){
        return this.employeeService.findPage(1, 10);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    public Employee findById(){
        return this.employeeService.findid(753667);
    }

    @RequestMapping("/getUser")
    public String getUser(){
        System.out.print("asdadasssssssssssssss");
        return "张三：Hello Word!!";
    }

    @RequestMapping("/getList")
    public List<User> getList(){
        return this.userService.getUserList();
    }

    @RequestMapping("/getUser1")
    public String getUserThrow(){
        throw new RuntimeException("全局异常测试：getUserThrow");
    }

    @RequestMapping("/getList1")
    public List<User> getListThrow(){
        throw new RuntimeException("全局异常测试：getListThrow");
    }
}
