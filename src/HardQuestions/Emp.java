package HardQuestions;

public class Emp {
	String gender;
	String name;
	int age;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Emp(String gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}

}
