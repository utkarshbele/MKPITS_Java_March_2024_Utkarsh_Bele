package demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;

public class MainClass {
	//for xml config
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s=(Student) context.getBean("s1");
		s.displayDetails();
		Student s3=(Student) context.getBean("s2");
		s3.displayDetails();
		
		int a [] = new int[5];
		System.out.println(Arrays.toString(a));
		
		
	}
}
