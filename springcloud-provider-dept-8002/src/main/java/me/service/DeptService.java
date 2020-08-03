package me.service;

import entity.Dept;

import java.util.List;

public interface DeptService {

    public  boolean addDept(Dept dept);

    public List<Dept> getAllDepts();

    public Dept getDeptById(Integer id);

}
