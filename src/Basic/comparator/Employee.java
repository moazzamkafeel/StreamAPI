package Basic.comparator;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;

	// Constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	// Natural ordering based on ID (ascending)
	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
	}

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
