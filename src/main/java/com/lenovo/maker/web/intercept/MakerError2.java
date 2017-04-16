package com.lenovo.maker.web.intercept;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;

/**
 * Created by zhaodongjie on 2017/4/16.
 */
public class MakerError2 extends BasicErrorController {
    public MakerError2(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
        super(errorAttributes, errorProperties);
    }
}
