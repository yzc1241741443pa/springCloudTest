package me.controller;

import entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DeptServiceAPI;

import java.util.List;

@RestController
public class DeptConsumerController {

@Autowired
private DeptServiceAPI deptService=null;



@RequestMapping(value = "/cdept/get/{id}")
 public Dept  getDepttById(@PathVariable("id") Integer id){
    return deptService.getDeptById(id);
}

@RequestMapping(value = "/cdept/list")
    public List<Dept> getAllDepts(){
    return deptService.getAllDepts();
}


@RequestMapping(value = "/cdept/add")
    public  boolean addDept(Dept dept){
    return deptService.addDept(dept) ;

}

}
