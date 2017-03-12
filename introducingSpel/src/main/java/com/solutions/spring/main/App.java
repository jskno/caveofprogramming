package com.solutions.spring.main;

import com.solutions.spring.beans.Robot;
import com.solutions.spring.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Robot robot = context.getBean(Robot.class);
        robot.speak();
        robot.talk();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
