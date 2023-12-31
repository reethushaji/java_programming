public class ProducerConsumerTest {
   public static void main(String[] args) {
      Container c = new Container();
      Producer p1 = new Producer(c, 1);
      Consumer c1 = new Consumer(c, 1);
      p1.start(); 
      c1.start();
   }
}
class Container {
   private int contents;
   private boolean available = false;
   
   public synchronized int get() {
      while (available == false) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      available = false;
      notifyAll();
      return contents;
   }
   public synchronized void put(int value) {
      while (available == true) {
         try {
            wait();
         } catch (InterruptedException e) { } 
      }
      contents = value;
      available = true;
      notifyAll();
   }
}
class Consumer extends Thread {
   private Container con;
   private int number;
   
   public Consumer(Container c, int number) {
      con = c;
      this.number = number;
   }
   public void run() {
      int value = 0;
      for (int i = 1; i < 10; i++) {
         value = con.get();
         System.out.println("Consumer #" + this.number + " got: " + value);
      }
   }
}
class Producer extends Thread {
   private Container con;
   private int number;
   public Producer(Container c, int number) {
      con = c;
      this.number = number;
   } 
   public void run() {
      for (int i = 0; i < 10; i++) {
         con.put(i);
         System.out.println("Producer #" + this.number + " put: " + i);
         try {
            sleep((int)(Math.random() * 100));
         } catch (InterruptedException e) { }
      } 
   }
}
