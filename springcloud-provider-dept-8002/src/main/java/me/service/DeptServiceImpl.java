package me.service;

import entity.Dept;
import me.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;


    @Override
    public boolean addDept(Dept dept) {
        boolean b = deptDao.addDept(dept);
        return b;
    }

    @Override
    public List<Dept> getAllDepts() {

        List<Dept> list = deptDao.getAllDepts();
        return list;
    }

    @Override
    public Dept getDeptById(Integer id) {

        Dept dept = deptDao.getDeptById(id);
        return dept;
    }
}
