package lamdasort;

public class Sorting {
	
	public String firstName;
	public String lastName;
	public String age;
	public String salary;
	
	
	public Sorting(String firstName, String lastName, String age, String salary){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
