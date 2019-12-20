import java.util.Scanner;

public class java_JRB03
{
  static int run(int bulbs)
  {
    int[] switches = new int[bulbs];
    boolean[] on = new boolean[bulbs];
    for(int i = 0; i < bulbs; i++)
    {
      switches[i] = i + 1;
      on[i] = false;
    }

    for(int x: switches)
    {
      System.out.print("Iteration #" + x + ": ");
      for(int y: switches)
      {
        if(y % x == 0) { on[y-1] = !(on[y-1]); }
        System.out.print(y + "-");
        System.out.print((on[y-1]) ? "on " : "off ");
      }
      System.out.println("\b");
    }

    int noOn = 0;
    for(boolean a: on)
    {
      if(a) { noOn++; }
    }

    return noOn;
  }
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);

    System.out.print("No of switches: ");
    int bulbs = reader.nextInt();

    System.out.println("No of bulbs on at the end: " + run(bulbs));
  }
}
