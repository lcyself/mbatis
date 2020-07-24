package com.java.mbatis.services;

import com.java.mbatis.entity.SysMenu;
import com.java.mbatis.entity.SysRole;
import com.java.mbatis.entity.SysUser;

import java.util.List;

public interface ISysUserService {

    List<SysUser> findAll();

    SysUser selectUserByName(String username);

    List<SysRole> selectSysRoleByUserId(Long userId);

    List<SysMenu> selectSysMenuByUserId(Long userId);
}
