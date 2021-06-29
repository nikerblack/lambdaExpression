package lambdaExpression;

public class Person {

	private String fisrtName;
	private String lastName;
	private int age;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String fisrtName, String lastName, int age) {
		super();
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.age = age;
	}


	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [fisrtName=" + fisrtName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
}
