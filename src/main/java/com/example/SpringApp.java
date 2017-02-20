package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});

    	Person person = (Person)context.getBean("personAnnotation");
    	Person person2 = (Person)context.getBean("personXml");
    	System.out.println("Person da annotation:"+person);
    	System.out.println("Person da xml:"+person2);

    }
}