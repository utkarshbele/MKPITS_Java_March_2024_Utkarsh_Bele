package SttudentModel;

public class Student {
	    private int id;
	    private String name;
	    private double percentage;
	    private String address;
	    private String city;
	    private String country;
	    
	    public Student() {};
	    
	    public Student(int id, String name, double percentage, String address, String city, String country) {
			this.name = name;
			this.percentage = percentage;
			this.address = address;
			this.city = city;
			this.country = country;
			this.id = id;
		}

	    
	    public Student(String name, double percentage, String address, String city, String country) {
			this.name = name;
			this.percentage = percentage;
			this.address = address;
			this.city = city;
			this.country = country;
		}



		// Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPercentage() {
	        return percentage;
	    }

	    public void setPercentage(double percentage) {
	        this.percentage = percentage;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", percentage=" + percentage +
	                ", address='" + address + '\'' +
	                ", city='" + city + '\'' +
	                ", country='" + country + '\'' +
	                '}';
	    }
	}