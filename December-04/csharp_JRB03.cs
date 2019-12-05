using System;

class DecemberDay4
{
  static int h_index(int n, int[] papers)
  {
    int h = 0;
    bool hValUp = true;
    while(hValUp)
    {
      int hNum = 0;
      foreach(int cit in papers)
      {
        if(cit > h) { hNum++; }
      }
      if(hNum <= h) { hValUp = false; }
      else { h++; }
    }
    return h;
  }

  public static void Main(string[] args)
  {
    Console.Write("Length of array of papers: ");
    int length = (int) Convert.ToInt64(Console.ReadLine());
    int[] papArray = new int[length];

    for(int l = 1; l <= length; l++)
    {
      Console.Write("paper " + l + " citations: ");
      papArray[l-1] = (int) Convert.ToInt64(Console.ReadLine());
    }

    Console.WriteLine("H index: " + h_index(length, papArray));
  }
}
