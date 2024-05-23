package vehicle;

public class car extends Master {
	private String fuel_type;

	/**
	 * @param model
	 * @param engine
	 * @param color
	 * @param fuel_type
	 */
	public car(int model, int engine, String color, String fuel_type) {
		super(model, engine, color);
		this.fuel_type = fuel_type;
	}
	void carout()
	{
		super.Masterout();
		System.out.println("Fuel_type="+fuel_type);
	}
	
	



}
