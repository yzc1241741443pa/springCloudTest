package me.dao;

import entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    public  boolean addDept(Dept dept);

    public List<Dept> getAllDepts();

    public Dept getDeptById(Integer id);

}
