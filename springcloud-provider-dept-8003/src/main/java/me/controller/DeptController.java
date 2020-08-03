package me.controller;

import entity.Dept;
import me.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping  (value = "/dept/add")
    public boolean addDept(Dept dept){
        boolean b = deptService.addDept(dept);
        return b;
    }

    @PostMapping(value = "/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id){
        Dept dept = deptService.getDeptById(id);
        return dept;
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> getAllDepts(){
        List<Dept> list = deptService.getAllDepts();
        return list;
    }

}
