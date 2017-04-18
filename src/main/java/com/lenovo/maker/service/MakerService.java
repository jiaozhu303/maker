package com.lenovo.maker.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhaodj5 on 2017-04-18.
 */

@Service
public class MakerService {

    public String getName(int id) {
        return "service test name - " + id;
    }
}
