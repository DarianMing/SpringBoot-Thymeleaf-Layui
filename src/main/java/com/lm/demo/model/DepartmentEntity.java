package com.lm.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DepartmentEntity {
    private String id;
    private String managerId;//负责人id
    private String parentId;//父部门id
    private String name;//部门名称
    private String level;//部门层级
    private String remark;//描述
}