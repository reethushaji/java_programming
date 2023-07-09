class Staticfn
{
    static int a = 20;
    static void display()
    {
        System.out.println("This is a static function");
    }
    public static void main(String[] args) 
    {
        Staticfn obj = new Staticfn();
        Staticfn.display();
        System.out.println(Staticfn.a);
        System.out.println(obj.a);
        Staticfn.a = 20;
        System.out.println(Staticfn.a);
        System.out.println(obj.a);
       
    }
}

