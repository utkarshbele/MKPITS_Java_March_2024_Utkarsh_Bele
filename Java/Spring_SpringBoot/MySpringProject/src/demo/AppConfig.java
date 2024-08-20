package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	//add in front (name="s6") another way to call the bean in the get bean method
    public Student student() {
        Student s2 = new Student();
        s2.setName("Utkarsh");
        s2.setCity("Yavatmal");
        return s2;
    }
}
