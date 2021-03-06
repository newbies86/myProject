package com.gj.app.mapper;

import com.gj.app.entity.SysMenu;
import com.gj.app.entity.SysMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper {
    long countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int batchInsert(List<SysMenu> list);

    int batchUpdate(List<SysMenu> list);
}