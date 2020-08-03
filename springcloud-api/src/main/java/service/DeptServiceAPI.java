package service;

import entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@FeignClient
@Component
@Service
public interface DeptServiceAPI {
     @PostMapping(value = "/dept/add")
    public  boolean addDept(Dept dept);
     @GetMapping(value = "/dept/list")
    public List<Dept> getAllDepts();
    @GetMapping(value = "/dept/get/{id}")
    public Dept getDeptById(@PathVariable(value = "id") Integer id);


}
