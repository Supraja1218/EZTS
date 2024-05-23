package hospital;

public class Main {

	public static void main(String[] args) {
		
		Person p =new Person("charan",20,"male");
		System.out.println(p.toString());
		p.personout();
		
		Nurse n = new Nurse("sriha", 26, "Female",2,204);
		n.nurseinfo();
		
		patient pa = new patient("srihan", 26, "male","cold",123);
		pa.patientinfo();
		Doctor d= new Doctor("supraja",27,"Female","Dermatolagist");
		d.doctorinfo();
		
	}

}
