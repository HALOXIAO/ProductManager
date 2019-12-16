package com.manage.sys.Config;

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Component;

@Configuration
public class RedisConfig   {

    @Bean
    public RedisConnectionFactory redisConnectionFactory(){

    }

}
