import java.io.*;
import java.lang.*;
class genericmethod
{
 public static < E > void printArray(E[] array)
 {
 for(E element:array)
 {
 System.out.println(element);
 }
 }
 public static void main(String args[])
 {
 Integer[] intArray={1,2,3};
 Double[] dbArray={1.1,1.2,1.3,1.4,1.5};
 Character[] cArray={'l','u','f','f','y'};
 String[] sArray={"sss","ccc"};
 printArray(intArray);
 printArray(dbArray);
 printArray(cArray);
 printArray(sArray);
 }
}