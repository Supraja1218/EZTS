package vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master vehicle = new Master(2010,999,"red");
		System.out.println(vehicle.toString());
		vehicle.Masterout();
		
		bike b=new bike(2010,99,"blue","sports");
		System.out.println(b.toString());
		b.bikeout();
		
		bus bs=new bus(2011,55,"green",30);
		System.out.println(bs.toString());
		bs.busout();
		
		car c = new car(2015,550,"white","Petrol");
		//System.out.println(c.toString());
		c.carout();

	}

}
