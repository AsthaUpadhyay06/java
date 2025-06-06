public class RunnableTraditional 
{
   public static void main(String[] args) {
      Runnable r=()->System.out.println("runnable using lambda");
      r.run();
    
   }
}
