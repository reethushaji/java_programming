import java.io.*;
import java.io.Serializable;

class Vehicle {
    String brand;
	public Vehicle(String brand){
	this.brand = brand;
	}

}

class Car extends Vehicle implements Serializable {
	String id;
	public Car(String brand,String id)
	{
		
		super(brand);
		this.id =id;
	}
}

public class Serializeisa {
	public static void main(String[] args) throws Exception
	{
		Car obj1 = new Car("Maruthy", "c12342");
		System.out.println("Brand of car = " + obj1.brand);
		System.out.println("Id of the dress is = " + obj1.id);
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		oos.close();
		fos.close();
		System.out.println("Object is serialized");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Car obj2 = (Car)ois.readObject();
		
		ois.close();
		fis.close();
		System.out.println("Object is deserialized");
		
		System.out.println("Brand of car = " + obj2.brand);
		System.out.println("Id of thecar is = " + obj2.id);
	}
}

	 