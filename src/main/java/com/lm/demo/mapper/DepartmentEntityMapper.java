package com.lm.demo.mapper;

import com.lm.demo.model.DepartmentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(DepartmentEntity record);

    int insertSelective(DepartmentEntity record);

    DepartmentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DepartmentEntity record);

    int updateByPrimaryKey(DepartmentEntity record);

    List<DepartmentEntity> selectDepartments (DepartmentEntity departmentEntity);

//    @Select({"select * from department"})
    List<DepartmentEntity> selectAllDepartments ();
}