package oops;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine e = new Engine();
		e.model = "bsb";
		e.cc = 500;
		e.fueltype="petrol";
		
		
		Car c = new Car();
		c.brand ="tata";
		c.price=5000000;
		c.color="black";
		c.eng=e;
		
		System.out.println(c.brand+" "+c.price+" "+c.color+" "+c.eng.model+" "+c.eng.cc+" "+c.eng.fueltype);;

	}

}
