class Animal
{
	String name;
	void read(String name)
	{
		this.name = name;

	}

	String display()
	{
		return this.name;
	}
}
public class Cat extends Animal
{
	public static void main(String args[])
	{
		Cat c = new Cat();
		c.read("Black cat");
		System.out.println("My pet is a "+c.display());
	}
}
