using System;

class DecemberDay2
{
  static String credit_card(long num)
  {
    long card = num;

    int s1 = 0;
    int s2 = 0;

    int pos = 1;
    while(num != 0)
    {
      int rem = (int) (num % 10);

      if(pos % 2 == 0)
      {
        rem *= 2;
        if(rem >= 10) { rem = (rem % 10) + (rem / 10); }
        s2 += rem;
      }
      else
      {
        s1 += rem;
      }

      num /= 10;
      pos++;
    }

    return ((s1 + s2) % 10 == 0) ? (card + " passes the test") : (card + " does not pass the test"));
  }

  public static void Main(string[] args)
  {
    Console.Write("Card Number: ");
    long n = Convert.ToInt64(Console.ReadLine());

    Console.WriteLine(credit_card(n));
  }
}
