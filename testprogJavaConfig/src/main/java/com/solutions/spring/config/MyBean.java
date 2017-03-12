package com.solutions.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AliasFor;

/**
 * Created by Jose on 3/11/2017.
 */
@Bean(initMethod = "init", destroyMethod = "destroy")
public @interface MyBean {

}
