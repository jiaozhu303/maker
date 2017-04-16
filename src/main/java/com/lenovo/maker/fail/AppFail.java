package com.lenovo.maker.fail;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * Created by zhaodongjie on 2017/4/16.
 */
public class AppFail implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable throwable) {
        System.out.println("run faiile ... ");
        return null;
    }
}
