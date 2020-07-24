package com.java.mbatis.services.Impl;

import com.java.mbatis.entity.SysMenu;
import com.java.mbatis.entity.SysRole;
import com.java.mbatis.entity.SysUser;
import com.java.mbatis.mapper.SysUserMapper;
import com.java.mbatis.services.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public List<SysUser> findAll() {
        return userMapper.findAll();
    }

    @Override
    public SysUser selectUserByName(String username) {
        return null;
    }

    @Override
    public List<SysRole> selectSysRoleByUserId(Long userId) {
        return null;
    }

    @Override
    public List<SysMenu> selectSysMenuByUserId(Long userId) {
        return null;
    }
}
