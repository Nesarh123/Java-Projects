package org.nesar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Programmer programmer = context.getBean("programmer", Programmer.class);
        System.out.println(programmer.getAge());
        programmer.code();
//
//        Computer comp = context.getBean(Computer.class);
//
//        Desktop desk = context.getBean(Desktop.class);
    }
}
