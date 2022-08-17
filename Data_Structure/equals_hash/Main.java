package equals_hash;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Car> listCar = new ArrayList<>();
		
		listCar.add(new Car("Ford"));
		listCar.add(new Car("Fiat"));
		listCar.add(new Car("Volkswagen"));
		listCar.add(new Car("Ford"));
		
		System.out.println(listCar.contains(new Car("Fiat")));
		System.out.println(new Car("Fiat").hashCode());
		
		Car c1 = new Car("Fiat");
		Car c2 = new Car("Dunno");
		
		System.out.println(c1.equals(c2));
	}

}
