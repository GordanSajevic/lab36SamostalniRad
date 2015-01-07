package lab36SamostalniRad;

public class Engine {
	
	private Truck nextTruck;
	
	public void attach(Truck nextTruck)
	{
		this.nextTruck = nextTruck;
	}
	
	public Truck getFirst()
	{
		return nextTruck;
	}

}
