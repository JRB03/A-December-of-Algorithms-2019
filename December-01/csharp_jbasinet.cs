using System;

class DecemberDay1
{
  public int sevenish_numbers(int n)
  {
    int pow = 0;
    bool section = true;
    while(section)
    {
      if(n - Math.Pow(2,pow) == 0) { section = false; }
      else if(n - Math.Pow(2,pow) < 0)
      {
        pow--;
        section = false;
      }
      else { pow++; }
    }

    int dist = n-(int)Math.Pow(2,pow);
    if(dist == 0) { return (int)Math.Pow(7,pow); }
    else { return (int)Math.Pow(7,pow) + sevenish_numbers(dist); }
  }

  /// <summary>
  ///   Run program
  /// </summary>
  [STAThread]
  public static void Main(string[] args)
  {
    Console.Write("input n: ");
    int n = Convert.ToInt32(Console.ReadLine());

    DecemberDay1 trial = new DecemberDay1();

    Console.WriteLine(trial.sevenish_numbers(n));
  }
}
