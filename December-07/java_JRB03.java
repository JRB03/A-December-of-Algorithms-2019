import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class java_JRB03
{
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);
      Queue<String> queue = new LinkedList<>();

      System.out.print("Enter N: ");
      int n = Integer.parseInt(reader.nextLine());

      System.out.println("Enter '(token no, id)':");
      for(int q = 0; q < n; q++)
      {
         String in = reader.nextLine();
         queue.add(in);
      }

      System.out.print("Enter k: ");
      String k = reader.nextLine();
      for(String t : queue)
      {
         if(t.contains(k))
         {
            System.out.println(t);
         }
      }

      int no = 1;
      while(no <= queue.size())
      {
         for(String t : queue)
         {
            if(t.contains(Integer.toString(no)))
            {
               if(t.contains(k)) {}
               else { System.out.println(t); }
               no++;
            }
         }
      }
   }
}
