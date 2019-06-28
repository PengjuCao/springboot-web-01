package com.cpj.service.impl;

import com.cpj.entities.Department;
import com.cpj.mapper.DepartmentMapper;
import com.cpj.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author PengjuCao
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    DepartmentMapper departmentMapper;

    @Override
    public Collection<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }
}
