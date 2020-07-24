package com.java.mbatis.mapper;

import com.java.mbatis.entity.SysUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {

    @Select("select * from SYS_USER")
    List<SysUser> findAll();
}