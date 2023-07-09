import java.io.*;
import java.io.Serializable;

class Car {
    String brand;
	public Car(String brand){
	this.brand = brand;
	}
	public Car()
	{
		brand = "Toyota";
	
	}

}

class Engine extends Car implements Serializable {
	String type;
	public Engine(String brand,String type)
	{
		
		super(brand);
		this.type =type;
	}
}

public class Serializehasa1 {
	public static void main(String[] args) throws Exception
	{
		Engine obj1 = new Engine("Maruthy", "petrol");
		System.out.println("Brand of car = " + obj1.brand);
		System.out.println("Type of the engine is = " + obj1.type);
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		oos.close();
		fos.close();
		System.out.println("Object is serialized");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Engine obj2 = (Engine)ois.readObject();
		
		ois.close();
		fis.close();
		System.out.println("Object is deserialized");
		
		System.out.println("Brand of car = " + obj2.brand);
		System.out.println("Type of the engine is = " + obj2.type);
	}
}

	 