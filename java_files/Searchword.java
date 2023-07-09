import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
class Searchword 
{
    public static void main(String args[]) throws FileNotFoundException 
    {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int count = 0;
        System.out.println("Enter the name of file with extension");
        String nameoffile=in.next();
        System.out.println("Enter the word to be found");
        String word = in.next();
        System.out.println("Contents of the line");
        Scanner in2 = new Scanner(new FileInputStream(nameoffile));
        while(in2.hasNextLine()) 
        {
            String line = in2.nextLine();
            System.out.println(line);
            if(line.indexOf(word)!=-1) 
            {
                flag = true;
                count = count+1;
            }
        }
        if(flag) 
        {
            System.out.println("File contains the specified word");
            System.out.println("Number of occurrences is: "+count);
        } 
        else 
        {
            System.out.println("File does not contain the specified word");
        }
    }
}
