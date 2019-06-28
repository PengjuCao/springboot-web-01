package com.cpj.mapper;

import com.cpj.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author PengjuCao
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department")
    public Collection<Department> getDepartments();

}
