import java.util.Scanner;
import java.util.Arrays;
import javax.script.*;

public class java_JRB03
{
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);

    System.out.print("Set 1: ");
    String one = reader.nextLine();
    System.out.print("Set 2: ");
    String two = reader.nextLine();
    System.out.print("Function: ");
    String func = reader.nextLine();

    if(func.contains("^"))
    {
      int exp = Integer.parseInt(func.substring(func.indexOf("^")+1));
      func = func.replace("^","").replace(Integer.toString(exp),"");
      for(int x = 1; x <= exp-1; x++)
      {
        func += "*x";
      }
    }

    String[] setOne = one.replace("{","").replace("}","").replace(" ","").split(",");
    String[] setTwo = two.replace("{","").replace("}","").replace(" ","").split(",");

    if(setOne.length != setTwo.length) { System.out.println("It is not one-one"); }
    else
    {
      boolean one_one = true;
      for(int n = 0; n < setOne.length; n++)
      {
        String val = func.replaceAll("x",setOne[n]);

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("JavaScript");
        try
        {
            Object result = se.eval(val);
            if(!(result.toString().equals(setTwo[n]))) { one_one = false; }
        } catch (ScriptException e)
        {
          e.printStackTrace();
        }
      }
    if(one_one) { System.out.println("It is one-one"); }
    else { System.out.println("It is not one-one"); }
    }

  }
}
