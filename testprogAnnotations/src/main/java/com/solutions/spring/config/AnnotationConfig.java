package com.solutions.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Jose on 3/11/2017.
 */
@Configuration
@ComponentScan("com.solutions.spring")
public class AnnotationConfig {
}
