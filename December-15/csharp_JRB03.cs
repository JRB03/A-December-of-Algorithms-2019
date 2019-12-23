using System;

class DecemberDay15
{
  static string dish(int a, int t)
  {
    if(a == 1) { return "AB"; }
    if(t%3 == 2 && a > 1) { return "A" + dish(a-1,t/3 +1) + "B"; }
    if(t%3 == 1 && a > 1) { return "AB" + dish(a-1,t/3 +1); }
    if(t%3 == 0 && a > 1) { return dish(a-1,t/3 +1) + "AB"; }
    return "error";
  }
  static string[] build(int grams)
  {
    int numd = 1;
    for(int z = 1; z < grams; z++) { numd = numd*3-1; }

    string[] dishes = new string[numd];
    for(int t = 1; t <= numd; t++) { dishes[t-1] = dish(grams,t); }
    return dishes;
  }
  public static void Main(string[] args)
  {
    Console.Write("Quantity of A(in grams): ");
    int a = Convert.ToInt32(Console.ReadLine());
    Console.Write("Combinations: [");
    foreach(string d in build(a))
    {
      Console.Write(d + ", ");
    }
    Console.WriteLine("\b\b]");
  }
}
