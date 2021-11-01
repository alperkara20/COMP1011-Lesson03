/**
 * @author Alper
 *
 */
public class SportsUtilityVehicle extends Vehicle {

	/**
	 * @param colour
	 * @param make
	 * @param model
	 * @param year
	 */
	public SportsUtilityVehicle(String colour, String make, String model, String year) {
		super(colour, make, model, year);
		this.numDoors = 5;
		
	}

	@Override
	public void accelerate() {
		this.speed += 4;
		
		if(this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}

	@Override
	public void decelerate() {
		this.speed -= 6;
		
		if(this.speed < 0) {
			this.speed = 0;
		}
	}

}
