using System;

class DecemberDay3
{
  static int[] thanos_it(int[] array)
  {
    bool sorted = false;
    while(!sorted)
    {
      sorted = true;
      for (int pos = 1; pos < array.Length; pos++)
      {
        if(array[pos-1] > array[pos])
        {
          sorted = false;
        }
      }
      if(sorted) { continue; }

      int halfLength = (array.Length % 2 == 0) ? (array.Length / 2) : (array.Length / 2 + 1);
      int[] tempArray = new int[halfLength];

      int apos = 0;
      for (int x = 0; x < halfLength; x += 1)
      {
        tempArray[x] = array[apos];
        apos += 2;
      }
      array = tempArray;
    }
    return array;
  }

  public static void Main(string[] args)
  {
    Console.Write("Your arrays length: ");
    int length = (int) Convert.ToInt64(Console.ReadLine());
    int[] numArray = new int[length];

    int pos = 0;
    foreach(int p in numArray)
    {
      Console.Write("Digit " + pos + ": " );
      numArray[pos] = (int) Convert.ToInt64(Console.ReadLine());
      pos++;
    }

    Console.Write("Array decimanted: [");
    foreach(int num in thanos_it(numArray)) { Console.Write(num + ", ");}
    Console.WriteLine("\b\b]");
  }
}
