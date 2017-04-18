package com.lenovo.maker.DAO.jpa.repo;

import com.lenovo.maker.DAO.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
@Transactional(readOnly = true)
public interface IStudentDao extends JpaRepository<Student, Integer> {

    @Transactional
    @Modifying
    @Query("update Student t set t.sumScore = :score where t.id = :id")
    int updateScoreById(@Param("score") float score, @Param("id") int id);

    @Query("select t from Student t ")
    List<Student> getList();

}
