package com.lm.demo.service.impl;

import com.lm.demo.mapper.DepartmentEntityMapper;
import com.lm.demo.model.DepartmentEntity;
import com.lm.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentEntityMapper departmentEntityMapper;

    @Override
    public int insert(DepartmentEntity record) {
        return departmentEntityMapper.insert(record);
    }

    @Override
    public List<DepartmentEntity> selectDepartments(DepartmentEntity departmentEntity) {
        return departmentEntityMapper.selectDepartments(departmentEntity);
    }

    @Override
    public List<DepartmentEntity> selectAllDepartments() {
        return departmentEntityMapper.selectAllDepartments();
    }
}
