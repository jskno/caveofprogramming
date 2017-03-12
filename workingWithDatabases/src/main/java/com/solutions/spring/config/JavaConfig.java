package com.solutions.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Jose on 3/12/2017.
 */
@ComponentScan(basePackages = "com.solutions.spring")
@Import(DBConfig.class)
public class JavaConfig {
}
