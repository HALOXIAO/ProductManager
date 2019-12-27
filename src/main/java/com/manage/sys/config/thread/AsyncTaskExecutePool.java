package com.manage.sys.config.thread;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;


public class AsyncTaskExecutePool implements AsyncConfigurer {

    private final AsyncTaskProperties config;

    public AsyncTaskExecutePool(AsyncTaskProperties config) {
        this.config = config;
    }

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        //coreSize
        executor.setCorePoolSize(config.getCorePoolSize());
        //maxSize
        executor.setMaxPoolSize(config.getMaxPoolSize());
        //queueCapacity
        executor.setQueueCapacity(config.getQueueCapacity());
        //liveTime
        executor.setKeepAliveSeconds(config.getKeepAliveSeconds());
        //name
        executor.setThreadNamePrefix("halo-async-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
        //TODO Log
    }
}
