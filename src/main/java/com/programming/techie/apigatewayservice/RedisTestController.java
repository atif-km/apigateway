package com.programming.techie.apigatewayservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/redis-test")
    public String testRedis() {
        redisTemplate.opsForValue().set("test-key", "test-value");
        return redisTemplate.opsForValue().get("test-key");
    }
}

