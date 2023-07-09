import java.util.Scanner;
class Array2d
{
	public static void main(String[] args)
	{
     Scanner s=new Scanner(System.in);
     System.out.print("Enter no of rows");
     int m=s.nextInt();
     System.out.print("Enter no of columns");
     int n=s.nextInt();
     int ar[][]=new int[m][n]; 
     System.out.println("Enter array elements");
	for(int i=0; i<m; i++)
	for(int j=0; j<n; j++)
	{
		ar[i][j]=s.nextInt();
	}

	System.out.println("Array is:");
	for(int i=0; i<m; i++)
	{
		for(int j=0; j<n; j++)
		{
		System.out.print(ar[i][j]+"\t");
		}
		System.out.println();
	}
	int sumrow, sumcol;
	for(int i=0; i<m; i++)
	{
		sumrow=0;
		for(int j=0; j<n; j++)
		{
		sumrow+=ar[i][j];
		}
	System.out.println("Sum of row "+(i+1)+" is "+sumrow);
	}
	for(int j=0; j<n; j++)
	{
	sumcol=0;
	for(int i=0; i<m; i++)
	{
	sumcol+=ar[i][j];
	}
	System.out.println("Sum of column "+(j+1)+" is "+sumcol);
	}
	}
}

