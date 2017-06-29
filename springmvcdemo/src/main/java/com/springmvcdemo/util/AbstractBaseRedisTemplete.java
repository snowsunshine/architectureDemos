package com.springmvcdemo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created with hpay.
 * User: chenxueqing
 * Date: 2017/6/27
 * Time: 16:43
 */
public abstract class AbstractBaseRedisTemplete<T> implements ApplicationContextAware {
    protected RedisTemplate<String,T> redisTemplate;

    /**
     * @Description RedisTemplate
     * @param redisTemplate
     */
    public void setRedisTemplate(RedisTemplate<String,T> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        @SuppressWarnings("unchecked")
        RedisTemplate<String,T> redisTemplate = applicationContext.getBean(
                "redisTemplate", RedisTemplate.class);
        setRedisTemplate(redisTemplate);
    }
}
