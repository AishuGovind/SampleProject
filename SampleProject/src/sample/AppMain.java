package sample;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
     //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	 //AppImp obj = (AppImp)context.getBean("app");
	//System.out.println("Laptop Name = [ "+obj+" ]");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
        Laptop obj = context.getBean(Laptop.class);
        obj.systemProp();
	}

}
