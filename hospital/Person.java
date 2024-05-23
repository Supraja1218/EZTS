package hospital;

public class Person {
	private String name;
	private int age;
	private String gender;
	/**
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	void personout() {
		
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Gender="+gender);
	}
	

}
