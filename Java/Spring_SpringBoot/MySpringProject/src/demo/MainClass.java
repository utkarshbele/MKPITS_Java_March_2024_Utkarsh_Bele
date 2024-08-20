package demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainClass {
	//for xml config
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s=(Student) context.getBean("s1");
		s.displayDetails();
	}
}
