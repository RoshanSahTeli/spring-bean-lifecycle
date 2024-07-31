package com.beanCycle.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beanCycle.appmypac.employee;
import com.beanCycle.appmypac.laptop;
import com.beanCycle.appmypac.pepsi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/beanCycle/appmypac/config.xml");
       context.registerShutdownHook();
//    	 employee emp=(employee) context.getBean("s1");
//    	 System.out.println(emp);
//        System.out.println( "++++++++++++++++++++++++++++++++" );
//        
//        laptop lap=(laptop) context.getBean("p1");
//        System.out.println(lap);
    	
    	pepsi p=(pepsi) context.getBean("pepsi");
    	System.out.println(p);
    	
        
    }
}
