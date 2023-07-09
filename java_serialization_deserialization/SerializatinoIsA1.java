import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
class Car  implements Serializable{
        String name ;
        public Car(String name){
                this.name = name;
        }
}
class Vehicle extends Car{
         int id;
         public Vehicle(String name, int id){
                super(name);
                this.id = id;
         }
}
public class SerializatinoIsA1{
          public static void main(String[] args)throws Exception{
                  Vehicle b1 = new Vehicle("Audi",3425);
                  System.out.println("Car name = " + b1.name);
                  System.out.println("Car id = " + b1.id);
                  FileOutputStream fos = new FileOutputStream("abc.ser");
                  ObjectOutputStream oos = new ObjectOutputStream(fos);
                  oos.writeObject(b1);
                  oos.close();
                  fos.close();
                  System.out.println("The object has been serialized");
                  FileInputStream fis = new FileInputStream("abc.ser");
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Vehicle b2 = (Vehicle)ois.readObject();
                  ois.close();
                  fis.close();
                  System.out.println("The object has been deserialized");
                  System.out.println("Car name = " + b2.name);
                  System.out.println("Car id = " + b2.id);
          }
}