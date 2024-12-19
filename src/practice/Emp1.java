package practice;

public class Emp1 {

	private String name;
	private Integer age;
	private Integer salary;
	
	
	
	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Emp1(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	

}
