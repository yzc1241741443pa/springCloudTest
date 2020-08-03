package me.controller;

import entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
public class DeptConsumerController {
@Autowired
private RestTemplate restTemplate;

private static final String PATH="http://springcloud-provider-dept";



@RequestMapping(value = "/cdept/get/{id}")
 public Dept  getDepttById(@PathVariable("id") Integer id){
    return restTemplate.getForObject(PATH+"/dept/get/"+id,Dept.class);
}

@RequestMapping(value = "/cdept/list")
    public List<Dept> getAllDepts(){
    return restTemplate.getForObject(PATH+"/dept/list",List.class);
}


@RequestMapping(value = "/cdept/add")
    public  boolean addDept(Dept dept){
    return restTemplate.postForObject(PATH+"/dept/add",dept,Boolean.class);

}

}
