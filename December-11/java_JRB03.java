import java.util.Scanner;

public class java_JRB03
{
  static boolean emailCheck(String email)
  {
    if(email.endsWith(".com")) { email = email.replace(".com",""); }
    else { return false; }

    if(!email.contains("@")) { return false; }

    String[] parts = email.split("@");
    for(int a = 0; a < parts[0].length(); a++)
    {
      char l = parts[0].charAt(a);
      if( !(isAlph(l) || isNum(l) || isValChar(l)) ) { return false; }
    }

    for(int a = 0; a < parts[1].length(); a++)
    {
      char l = parts[1].charAt(a);
      if( !(isAlph(l)) ) { return false; }
    }

    return true;
  }
  static boolean isAlph(char a)
  {
    if( (a >= 65 && a <= 90) || (a >= 97 && a <= 122) ) { return true; }
    return false;
  }
  static boolean isNum(char n)
  {
    if( n >= 48 && n <= 57 ) { return true; }
    return false;
  }
  static boolean isValChar(char o)
  {
    if( (o == 45) || (o == 46) || ( o == 95) ) { return true; }
    return false;
  }
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);

    System.out.print("Email: ");
    String email = reader.nextLine();

    if(emailCheck(email)) { System.out.println("Your email is valid."); }
    else { System.out.println("Your email is not valid."); }
  }
}
