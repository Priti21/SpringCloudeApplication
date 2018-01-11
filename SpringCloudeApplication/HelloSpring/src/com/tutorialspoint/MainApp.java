package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      
      String mynae="abc";
      System.out.println("Name after allocating "+mynae);
   String myname1 =new String("abc");
   
   System.out.println("Name after allocating "+myname1);
   System.out.println("Name after allocating2 "+myname1);
   System.out.println("Name after allocating3 "+myname1);
   System.out.println("Added by Priti "+myname1);
   }
}