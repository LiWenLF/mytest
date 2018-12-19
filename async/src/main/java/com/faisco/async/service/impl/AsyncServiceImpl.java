package com.faisco.async.service.impl;

import com.faisco.async.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async
    public void generateReport() {
        System.out.println("报表名称：" + Thread.currentThread().getName());
    }
}
