package hospital;

public class patient extends Person {
	private String disease;
	private int bed_no;
	
	public patient(String name, int age, String gender, String disease, int bed_no) {
		super(name, age, gender);
		this.disease = disease;
		this.bed_no = bed_no;
	}
	void patientinfo()
	{
		System.out.println("Patient Information ");	
		super.personout();
	    System.out.println("Disease:"+disease);
	    System.out.println("Bed number:"+bed_no);
	}


	

}
