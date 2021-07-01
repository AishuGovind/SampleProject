package com.aishu.demo;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context = new ClassPathXmlApplicationContext("springObj.xml");
    Imp1 o = (Imp1)context.getBean("imp1");
    ((ClassPathXmlApplicationContext) context).close();
    o.method();
   	//Phone obj = (Phone)context.getBean("phone");
    //System.out.println("Phone name [ "+obj+"]");
    	//ApplicationContext context = new AnnotationConfigApplicationContext(PhoneConfig.class);
        //Phone obj = context.getBean(Phone.class);
       // obj.model();
    
   
     }
}
