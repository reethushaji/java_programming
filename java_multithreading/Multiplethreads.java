class Multiplethreads  extends Thread 
{
    int n;
    Multiplethreads(int n) 
    {
        this.n = n;
    }
    public void run() 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.println(i*10);
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                System.out.println("Something went Wrong "+e.getMessage());
            }
        }
    }
    public static void main(String[] args) 
    {
        Multiplethreads s1 = new Multiplethreads(4);
        Multiplethreads s2 = new Multiplethreads(10);
        new Thread(s1).start();
        new Thread(s2).start();
    }
}