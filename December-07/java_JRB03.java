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
    while(queue.size() > 0)
    {
        if(queue.peek().contains(k))
        {
          queue.remove();
          if(no != 1) { no--; }
        }
        else if(queue.peek().contains(Integer.toString(no)))
        {
          System.out.println(queue.poll());
        }
        no++;
    }
  }
}
