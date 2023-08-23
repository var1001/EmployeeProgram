package casestudy;

public class Employee {

	private String name,designation;
	private int age;
	private double salary;
	
	Employee(){
	}
	
	Employee(String name,String designation,int age,double salary){
		this.name=name;
		this.designation=designation;
		this.age=age;
		this.salary=salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public void setSalary(Double salary) {
		this.salary=salary;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	
}
