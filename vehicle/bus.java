package vehicle;

public class bus extends Master {
	private int seating_capacity;

	/**
	 * @param model
	 * @param engine
	 * @param color
	 */

	public bus(int model, int engine, String color, int seating_capacity) {
		super(model, engine, color);
		this.seating_capacity = seating_capacity;
	}

	@Override
	public String toString() {
		return "bus [seating_capacity=" + seating_capacity + ", toString()=" + super.toString() + "]";
	}
	void busout()
	{
		super.Masterout();
		System.out.println("Seating Capacity="+seating_capacity);
	}
	

}
