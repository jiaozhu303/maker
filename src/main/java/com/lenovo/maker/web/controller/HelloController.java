package com.lenovo.maker.web.controller;

import com.lenovo.maker.DAO.jpa.entity.Score;
import com.lenovo.maker.DAO.jpa.entity.Student;
import com.lenovo.maker.DAO.jpa.repo.IScoreDao;
import com.lenovo.maker.DAO.jpa.repo.IStudentDao;
import com.lenovo.maker.service.MakerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by zhaodongjie on 2017/4/16.
 */
@RestController
@RequestMapping(value = "/maker")
public class HelloController {

    @Autowired
    private IScoreDao scoreDao;

    @Autowired
    private IStudentDao studentDao;

    private static Logger LOGGER = Logger.getLogger(HelloController.class);

    @Autowired
    private MakerService makerService;

    @RequestMapping(value = "/def", method = RequestMethod.GET)
    public String getHello() {
        return "hello world!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<Student> getUser() {
        return studentDao.getList();
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Score> getScoreList() {
        LOGGER.info("从数据库读取Score集合");

        LOGGER.info("更新的行数：" + scoreDao.updateScoreById(88.8f, 2));
        return scoreDao.getList();
    }
}
