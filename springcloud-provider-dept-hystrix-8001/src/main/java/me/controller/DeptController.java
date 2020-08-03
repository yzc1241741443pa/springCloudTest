package me.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGetDeptById")
    public Dept getDeptById(@PathVariable("id") Integer id){
        Dept dept = deptService.getDeptById(id);
        if(dept==null){
            throw new RuntimeException("id>>"+id+"不存在");
        }

        return dept;
    }

public Dept hystrixGetDeptById(@PathVariable("id") Integer id){
        Dept d=new Dept();
        d.setDeptno(id);
        d.setDname("id>>"+id+"不存在");
        d.setDb_source("no");
        return d;

}

    @GetMapping(value = "/dept/list")
    public List<Dept> getAllDepts(){
        List<Dept> list = deptService.getAllDepts();
        return list;
    }

}
