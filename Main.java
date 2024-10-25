import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // prob1:
    double prob1 = 12.345;
    System.out.println("Please enter a double: ");
    double duo = sc.nextDouble();
    if (prob1 == duo)
    {
      System.out.println("YES");
    }

    //prob 2:
    int prob2 = 48;
    System.out.println("Please enter an integer: ");
    int num = sc.nextInt();
    if (prob2 == num)
    {
      System.out.println("YES");
    }

    // prob3:
    System.out.println("Please enter 2 integers: ");
    num = sc.nextInt();
    int num2 = sc.nextInt();
    if (num2 == (num * 2))
    {
      System.out.println("YES");
    }
  }
}
