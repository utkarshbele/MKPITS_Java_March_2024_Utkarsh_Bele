package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnoAppConfig.class, AppConfig.class);

        // For annotation-based configuration
        System.out.println("Annotation-based Configuration:");
        Student s1 = context.getBean(Student.class);
        s1.displayDetails();

        // For Java-based configuration
        System.out.println("\nJava-based Configuration:");
        Student s = (Student) context.getBean("student");
        s.displayDetails();
    }
}
