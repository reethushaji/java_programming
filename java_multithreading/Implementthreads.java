class Threadimplements implements Runnable 
{
    int n;
    Threadimplements(int n) 
    {
        this.n = n;
    }
    public void run() 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.println(i);
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                System.out.println("Something went Wrong " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Threadimplements s1 = new Threadimplements(5);
        Threadimplements s2 = new Threadimplements(10);
        new Thread(s1).start();
        new Thread(s2).start();
    }
}