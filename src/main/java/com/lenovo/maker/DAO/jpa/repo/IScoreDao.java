package com.lenovo.maker.DAO.jpa.repo;

import com.lenovo.maker.DAO.jpa.entity.Score;
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
public interface IScoreDao extends JpaRepository<Score, Integer> {

    @Transactional
    @Modifying
    @Query("update Score t set t.score = :score where t.id = :id")
    int updateScoreById(@Param("score") float score, @Param("id") int id);

    @Query("select t from Score t ")
    List<Score> getList();

}
