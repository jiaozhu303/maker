package com.lenovo.maker.DTO;

import lombok.*;


/**
 * Created by zhaodj5 on 2017-04-18.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private int id;
    private String name;
    private String sumScore;
    private String avgScore;
    private int age;

}
