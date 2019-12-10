import java.util.Scanner;

public class java_JRB03
{
  static int cookieCount(int money, int cost, int ratio)
  {
    int cookies = money/cost;
    int jars = cookies;
    while(jars >= ratio)
    {
      cookies += jars/ratio;
      jars %= ratio;
    }
    return cookies;
  }
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);

    System.out.print("n: ");
    int n = reader.nextInt();
    System.out.print("p: ");
    int p = reader.nextInt();
    System.out.print("c: ");
    int c = reader.nextInt();

    System.out.println ("Cookie Count: " + cookieCount(n,p,c));
  }
}
