package com.lenovo.maker.DAO.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "SCORE")
public class Score {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name = "STUDENTID") // 这里说一下，我使用指定数据库列的时候，使用小写会不起作用，修改为大写便正常了。不知道为何，如果遇到一样问题的可以尝试下。
    private int stuId;

    @Column(nullable = false, name = "SUBJECTNAME")
    private String subjectName;

    @Column(nullable = false)
    private float score;

    @Column(nullable = false, name = "EXAMTIME")
    private Date examTime;

}
