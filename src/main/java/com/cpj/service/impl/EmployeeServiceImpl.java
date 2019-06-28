package com.cpj.service.impl;

import com.cpj.entities.Employee;
import com.cpj.mapper.EmployeeMapper;
import com.cpj.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author PengjuCao
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    EmployeeMapper employeeMapper;


    public Collection<Employee> getAllemployee() {
        return employeeMapper.getAllemployee();
    }

    //添加员工
    @Override
    public void addEmp(Employee employee) {
        employeeMapper.addEmp(employee);
    }

    //删除员工
    @Override
    public boolean delemp(Integer id) {
        return employeeMapper.delemp(id);
    }

    //通过id，查找出员工信息
    @Override
    public Employee getEmpId(Integer id) {
        return employeeMapper.getEmpId(id);
    }

    //修改员工信息
    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }
}
