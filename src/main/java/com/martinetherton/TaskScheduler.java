package com.martinetherton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class TaskScheduler {

    public static void main( String[] args ) {
        new ClassPathXmlApplicationContext("scheduled-tasks.xml");
    }

}
