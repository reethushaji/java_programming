// A generic class to store objects of two different types.

class Myclass<T1, T2>//T1 and T2 are two generic type parameters which determine type of data.
{
     T1 obj1; //obj1 variable of type T1
     T2 obj2; //obj3 variable of type T2

   Myclass(T1 one, T2 two)//constructor having two parameters one and two of type T1 and T2.
   {
	 obj1 = one;
	 obj2 = two;
   }
   
   T1 getObject1()//instance method
   {
	 return obj1;  
   }
   T2 getObject2()// instance method
   {
	 return obj2;  
   }
}

public class GenericClass{
public static void main(String[] args) 
{
 Myclass<String, Integer> obj = new Myclass<String, Integer>("Rajagiri", 03);
 System.out.println(obj.getObject1()+ " " +obj.getObject2());
  }
}