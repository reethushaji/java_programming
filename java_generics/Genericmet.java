import java.io.*;
import java.lang.String;
class Genericmet
{
    public static <E> void printArray(E[] array)
    {
        for(E element:array)
        {
            System.out.println(element);
        }
    }

    public static void main(String args[])
    {
        Integer[] intArray={679};
        Double[] dbArray={2.22,12.2,91.12,1.4,1.500};
        Character[] cArray={'i','u','p','q','w'};
        String[] sArray={"hey","hai"};
        printArray(intArray);
        printArray(dbArray);
        printArray(cArray);
        printArray(sArray);
    }
}
