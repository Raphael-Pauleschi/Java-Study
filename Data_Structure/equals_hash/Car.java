package equals_hash;

import java.util.Objects;

public class Car {
	String marca;
	
	
	
	public Car(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca= marca;	
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		//Test if the instancied object equals to the parameter, memory reference 
		if(o == null||getClass() != o.getClass()) return false;
		//If the parameter is null or from other class, will return false
		Car car = (Car) o;
		return Objects.equals(marca, car.marca);
		//Temporary creates a class and see if it's equal in the stabilized condition 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(marca);
		//Code reference in the memory
	}
	
	
}
