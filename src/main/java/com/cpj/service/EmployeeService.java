package com.cpj.service;

import com.cpj.entities.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.Collection;

/**
 * @author PengjuCao
 */
public interface EmployeeService {

    public Collection<Employee> getAllemployee();

    //添加员工
    public void addEmp(Employee employee);

    //删除员工
    public boolean delemp(Integer id);

    //通过id，查找出员工信息
    public Employee getEmpId(Integer id);

    //修改员工信息
    public void updateEmployee(Employee employee);
}
