package demo;

public class BeanStudent {
	private String name;
	private int marks;
	//btw default constructor is necessary either default or make one
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
	
	public String getResult()
	{
		if(marks>50)
			return "Pass";
		else
			return "Fail";
	}
}
