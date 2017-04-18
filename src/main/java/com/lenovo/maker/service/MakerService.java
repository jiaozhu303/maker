package com.lenovo.maker.service;

import com.lenovo.maker.DAO.jdbc.JDBC_stand;
import com.lenovo.maker.DTO.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaodj5 on 2017-04-18.
 */

@Service
public class MakerService {

    @Autowired
    private JDBC_stand stand;

    public String getName(int id) {
        return "service test name - " + id;
    }

    public List<Student> list() {
        return stand.getList();
    }
}
