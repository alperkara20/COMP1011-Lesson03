/**
 * @author Alper
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SportsUtilityVehicle tesla = new SportsUtilityVehicle("White", "Ford",	"FX", "2008");
		Truck ford = new Truck(6,3,"White", "Ford",	"FX", "2008");
		
		for(int seconds = 0; seconds < 10; seconds ++) {

			tesla.accelerate();
			ford.accelerate();
		}
		
		System.out.println("Vehicle Speed: " + tesla.getSpeed());
		System.out.println("Truck Speed: " + ford.getSpeed());
	}

}
