package hospital;

public class Nurse extends Person {
	private int floor;
	private int room_no;
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param floor
	 * @param room_no
	 */
	public Nurse(String name, int age, String gender, int floor, int room_no) {
		super(name, age, gender);
		this.floor = floor;
		this.room_no = room_no;
	}
	
	void nurseinfo()
	{
		System.out.println("Nurse Information ");	
		super.personout();
	    System.out.println("Floor number"+floor);
	    System.out.println("room number"+room_no);
	
	}
	

}
