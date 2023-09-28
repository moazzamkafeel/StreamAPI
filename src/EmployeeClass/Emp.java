package EmployeeClass;

public class Emp {
	private int empId;
	private float salary;
	private String name;
	private int age;
	private String designation;
	String country;
	String state;
	String district;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public Emp(int empId, float salary, String name, int age, String designation, String country, String state,
			String district) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.country = country;
		this.state = state;
		this.district = district;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", salary=" + salary + ", name=" + name + ", age=" + age + ", designation="
				+ designation + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
