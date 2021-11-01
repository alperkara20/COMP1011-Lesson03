/**
 * @author Alper
 * Class Description: Creating a vehicle class as a superclass for
 * all other vehicle subclasses
 */
public abstract class Vehicle {

	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String colour = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return this.colour;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	//CONSTRUCTOR+++++++++++++++++++++++++++++++++++++++++++++++++
	public Vehicle(int wheels, int doors, String colour, String make, String model, String year) {
		this.numWheels = wheels;
		this.numDoors = doors;
		this.colour = colour;
		this.make = make;
		this.year =year;
	}
	
	public Vehicle(String colour, String make, String model, String year) {
		this.colour = colour;
		this.make = make;
		this.year =year;
	}
	// ABSTRACT METHODS THAT MUST BE OVERRIDDEN ++++++++++++++++++++++++++
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	public void turnLeft() {
		
		System.out.println("Turning Left");
	}
	
	public void turnRight() {
		
		System.out.println("Turning Right");
	}


}
