package com.lenovo.maker.DAO.jpa.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "sumScore")
    private String sumScore;

    @Column(nullable = false, name = "avgScore")
    private String avgScore;

    @Column(nullable = false, name = "age")
    private int age;

}
