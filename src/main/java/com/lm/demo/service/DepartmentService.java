package com.lm.demo.service;

import com.lm.demo.model.DepartmentEntity;

import java.util.List;

public interface DepartmentService {

    int insert(DepartmentEntity record);

    List<DepartmentEntity> selectDepartments (DepartmentEntity departmentEntity);

    List<DepartmentEntity> selectAllDepartments ();
}
