
package casestudy;
import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emplpoyee Details :");
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Designation: ");
		String designation=sc.nextLine();
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		System.out.print("Enter Salary: ");
		double salary=sc.nextDouble();
		Employee E1=new Employee(name,designation,age,salary);
		System.out.println("Employee Detals are:-");
		System.out.println("Employee's Name : "+E1.getName());
		System.out.println("Employee's Designation : "+E1.getDesignation());
		System.out.println("Employee's Age : "+E1.getAge());
		System.out.println("Employee's Salary : "+E1.getSalary());
		sc.close();
	}

}
