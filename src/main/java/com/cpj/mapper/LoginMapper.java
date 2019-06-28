package com.cpj.mapper;

import com.cpj.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Select;

/**
 * @author PengjuCao
 */
@Mapper
public interface LoginMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    public User loginUser(@Param("username") String username,@Param("password") String password);
}
