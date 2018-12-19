package com.faisco.async.asyncJob.impl;

import com.faisco.async.asyncJob.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;


public class AsyncConfigurerImpl implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(30);
        taskExecutor.setQueueCapacity(2000);
        taskExecutor.initialize();
        return taskExecutor;
    }
}
