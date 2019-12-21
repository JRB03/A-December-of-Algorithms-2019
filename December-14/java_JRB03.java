import java.util.Scanner;

public class java_JRB03
{
  static String wordCount(String word)
  {
    int aPoints = 0;
    int bPoints = 0;
    for(int t = 0; t < word.length(); t++)
    {
      String sub = word.substring(t);
      char f = sub.charAt(0);
      if( f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u')
      {
        aPoints += sub.length();
      }
      else
      {
        bPoints += sub.length();
      }
    }
    if(aPoints > bPoints) { return ("Winner is A with " + aPoints + " points"); }
    else if(bPoints > aPoints) { return ("Winner is B with " + bPoints + " points"); }
    else { return "Tie"; }
  }
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter String: ");
    String word = reader.nextLine();

    System.out.println(wordCount(word));
  }
}
