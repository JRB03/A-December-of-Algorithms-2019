import java.util.Scanner;

public class java_JRB03
{
   static double[][] cheating_prob(double[][] seating)
   {
      double[][] probs = new double[seating.length][];
      for(int i = 0; i < seating.length; i++)
      {
        double[] aSeating = seating[i];
        int aProbs = aSeating.length;
        probs[i] = new double[aProbs];
      }

      for (int row = 0; row < seating.length; row++)
      {
         for (int col = 0; col < seating[row].length; col++)
         {
            double x = seating[row][col];

            boolean l = (col == 0);
            boolean r = (col == seating[row].length-1);
            boolean t = (row == 0);
            boolean b = (row == seating.length-1);

            double prob = 0.000;
            if(!b && x == seating[row+1][col]) { prob += 0.2; }
            if(!t && x == seating[row-1][col]) { prob += 0.3; }
            if(!l && x == seating[row][col-1]) { prob += 0.2; }
            if(!r && x == seating[row][col+1]) { prob += 0.2; }

            if(!b && !r && x == seating[row+1][col+1]) { prob += 0.025; }
            else if(!b && !l && x == seating[row+1][col-1]) { prob += 0.025; }
            else if(!t && !r && x == seating[row-1][col+1]) { prob += 0.025; }
            else if(!t && !l && x == seating[row-1][col-1]) { prob += 0.025; }

            probs[row][col] = prob;
         }
      }
      return probs;
   }
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);

      System.out.print("Seating arrangement width: ");
      int w = reader.nextInt();
      System.out.print("Seating arrangement height: ");
      int h = reader.nextInt();

      double[][] seating = new double[h][w];

      for (int row = 0; row < h; row++)
      {
         for (int col = 0; col < w; col++)
         {
            System.out.print(row + ", " + col + " department (int): ");
            seating[row][col] = reader.nextDouble();
         }
      }
      System.out.println("\nSeating Arrangement:");

      for (int row = 0; row < h; row++)
      {
         for (int col = 0; col < w; col++)
         {
            System.out.print((int) seating[row][col] + "\t");
         }
         System.out.println();
      }

      System.out.println("\nCheating Probablilities: ");
      seating = cheating_prob(seating);
      for (int row = 0; row < h; row++)
      {
         for (int col = 0; col < w; col++)
         {
            System.out.print(seating[row][col] + "\t");
         }
         System.out.println();
      }
   }
}
