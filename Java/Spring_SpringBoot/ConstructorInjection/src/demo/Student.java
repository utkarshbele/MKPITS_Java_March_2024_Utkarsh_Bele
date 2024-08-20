package demo;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
 
	private String name;
	private int marks;
	private String city;
	@Autowired
	private Address address;
	private List<String> subjects;
	private Map<String, String> edu;
	private String[] hobby;
	
	public Student() {
	};

	public Student(String name) {
		this.name = name;
	}

	public Student(int marks) {
		this.marks = marks;
	}

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public Student(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public Student(String name, String city, int marks) {
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public Student(String name, int marks, Address address) {
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Map<String, String> getEdu() {
		return edu;
	}

	public void setEdu(Map<String, String> edu) {
		this.edu = edu;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public void displayDetails() {
		System.out.println("Name- " + name);
		System.out.println("City- " + city);
		System.out.println("Marks- " + marks);
		System.out.println("Address- " + address);
		
		System.out.println("Subjects are ");
		Iterator<String> itr=subjects.iterator();
		while(itr.hasNext())
		{
			System.out.println(":"+itr.next());
		}
		
		System.out.println("Edu Details- ");
		Set<Entry<String, String>> set=edu.entrySet();  
	    Iterator<Entry<String, String>> itr1=set.iterator();  
	    while(itr1.hasNext()){  
	        Entry<String,String> entry=itr1.next();  
	        System.out.println(":"+entry.getKey()+" Posted By:"+entry.getValue());  
	    }  
		
	    System.out.println("Hobbies ");
	    for(String str: hobby)
	    {
	    	System.out.println(":"+str);
	    }

	}

	public Student(String name, int marks, String city, Address address, List<String> subjects, Map<String, String> edu,
			String[] hobby) {
		super();
		this.name = name;
		this.marks = marks;
		this.city = city;
		this.address = address;
		this.subjects = subjects;
		this.edu = edu;
		this.hobby = hobby;
	}
	
	
	@Override
	public String toString() {
		return "Hi... From Utkarsh";
	}
}
