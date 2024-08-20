package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//used for annotation config
@Component
public class Student {
	@Value("Utkarsh") //used for annotation config
	private String name;
	@Value("Turkey")
	private String city;
	
	public Student() {};
	
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(city);
	}
	
	@Override
    public String toString() 
    {
        return "Hi... From Utkarsh";
    }
}
