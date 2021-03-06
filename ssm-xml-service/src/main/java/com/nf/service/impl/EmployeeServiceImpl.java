package com.nf.service.impl;

import com.nf.dao.EmployeeDao;
import com.nf.entity.EmployeeEntity;
import com.nf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao dao;

    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return  dao.getAll(pageNum,pageSize);
    }

    @Override
    public void insert(EmployeeEntity employeeEntity) {
        dao.insert(employeeEntity);

    }
}
