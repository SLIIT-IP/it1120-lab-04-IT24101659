import java.util.Scanner;
public class IT24101659Lab4Q1
{
 public static void main(String[] args)
 {
  Scanner input= new Scanner(System.in);
 double number; 

  //user input number
   System.out.print("Enter a number: ");
   number = input.nextDouble();

  //conditions
   if(number >0)
    {
    System.out.print("Positive");
    }
   else if(number <0)
    {  
    System.out.print("Negative");
    }
   else
    {
    System.out.print("Zero");
    }
  }
}