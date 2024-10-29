import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // prob1:
    System.out.println("Please enter a double: ");
    double num1 = sc.nextDouble();
    if (num1 == 12.345)
    {
      System.out.println("YES");
    }

    //prob 2:
    System.out.println("Please enter an integer: ");
    int num2 = sc.nextInt();
    if (num2 == 48)
    {
      System.out.println("YES");
    }

    // prob3:
    System.out.println("Please enter 2 integers: ");
    int num3 = sc.nextInt(); 
    int num4 = sc.nextInt(); 
    if (num4 == (num3 * 2))
    {
      System.out.println("YES");
    }

    // prob4:
     System.out.println("Please enter an integer: ");
    int num5 = sc.nextInt();
    if (num5%2==0)
    {
      System.out.println("Divisible by 2!");
    }
    if (num5%3==0)
    {
      System.out.println("Divisible by 3!");
    }

    // prob 5
    System.out.println("Please enter an integer: ");
    int num6 = sc.nextInt();
    sc.nextLine();
    if (num6%2==0)
    {
      System.out.println("Even");
    } else 
    {
      System.out.println("Odd");
    }    

    // prob 6:
    System.out.println("Please enter a letter grade: ");
    String letterInput = sc.nextLine();
    if (letterInput.equals("A"))
    {
      System.out.println("90-100");
    } 
    else if (letterInput.equals("B"))
    {
      System.out.println("80-90");
    }
    else if (letterInput.equals("C"))
    {
      System.out.println("70-80");
    } 
    else if (letterInput.equals("D"))
    {
      System.out.println("60-70");
    } 
    else if (letterInput.equals("F"))
    {
      System.out.println("0-60");
    } else
    {
      System.out.println("Invalid letter grade");
    }

    // prob 7:
    int addend1 = (int)(Math.random()*51);
    int addend2 = (int)(Math.random()*52+100);
    System.out.println(addend1 + " + " + addend2 + " = ?");
    int userAnswer = sc.nextInt();
    if (userAnswer == (addend1 + addend2))
    {
      System.out.println("Correct!");
    } else {
      System.out.println("Wrong :(");
    }

    // prob 8:
    System.out.println("What is the temperature?");
    int tempInput = sc.nextInt();
    if ((tempInput > 96) && (tempInput < 100))
    {
      System.out.println("Temperature is OK");
    } else {
      System.out.println("NOT NORMAL");
    }
    //done
  } 
}

