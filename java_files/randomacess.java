import java.util.*;
class randomacess
{
    		public static void main(String args[]){
        	int ch;
        	String s;
        	Scanner sc = new Scanner(System.in);
        	do
{
					System.out.println("1.FileCreation\n2.File Writing\n3.Appending at the end of the file\n4.Reading the file\nEnter your choice:");
            		ch=sc.readInt();
            		switch(ch)
{
             		case 1:
                    RandomAccessFileomAccessFile f1 = new RandomAccessFile("test.txt","r");
                    boolean fc = f1.exists();
          			if(fc)
{
                     System.out.println("File Created!");
                    }
                    else
{
                    System.out.println("File not Created!");
                    }
                    f1.close();
                	break;
					case 2:
                    RandomAccessFile f = new RandomAccessFile("test.txt","w");
                    boolean fc = f.exists();
                    if(fc)
{
					System.out.println("Enter text into the file:...Enter $ to Terminate");
                       while(true)
{
                        String dt = sc.nextLine();
                            					if(dt.equals("$")) break;
                            					else
{
                                					f.write(dt.getBytes());
                                					f.write("\n".getBytes());
                            					}
                        				}
                        				f.close();
                       	 			RandomAccessFile f = new RandomAccessFile("test.txt","r");
                        				int i;
                        				i =fin.read();
                       	 			while(i!=-1)
{
                            					char c = (char)i;
                            					System.out.print(c);
                            					i =fin.read();
                        				}
                    			}
                    			else
{
                        				System.out.println("File Not Created!");
                    			}
                				break;
            			}
        		} 
    		}
}
