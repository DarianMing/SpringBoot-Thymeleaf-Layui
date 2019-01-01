package com.lm.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.demo.model.DepartmentEntity;
import com.lm.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ShowController
 * @Description TODO
 * @Author Admin
 * @DATE 2018/12/29 10:39
 **/
@Controller
public class ShowController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/one")
    public String showOne () {
        return "one";
    }

    @GetMapping("/two")
    public String showTwo () {
        return "two";
    }

    @GetMapping("/form")
    public String showForm () {
        return "form";
    }

    @GetMapping("/page")
    public String showPage () {
        return "page";
    }

    @GetMapping("/data")
    public String showData () {
        return "data";
    }

    @GetMapping("/table")
    public String table () {
        return "table";
    }

    @GetMapping("/formOther")
    public String formOther () {
        return "formOther";
    }

    @GetMapping("/getData")
    @ResponseBody
    public Map getTableData (DepartmentEntity departmentEntity , Integer page, Integer limit) {
        Map<String , Object> map = new HashMap<>();
        PageHelper.startPage(page, limit);
        List<DepartmentEntity> departmentEntityList = departmentService.selectDepartments(departmentEntity);
        PageInfo<DepartmentEntity> pages = new PageInfo<>(departmentEntityList);
        map.put("code"  , 0);
        map.put("msg" , "");
        map.put("data" , departmentEntityList);
        map.put("count" , pages.getTotal());
        return map;
    }
}
