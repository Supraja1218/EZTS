package hospital;

public class Doctor extends Person {

	private String speciality;

	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param speciality
	 */
	public Doctor(String name, int age, String gender, String speciality) {
		super(name, age, gender);
		this.speciality = speciality;
	}
	
	void doctorinfo()
	{
		System.out.println("Doctor Information ");	 
		super.personout();
	    System.out.println("Speciality:"+speciality);	
	}
 
	

}
