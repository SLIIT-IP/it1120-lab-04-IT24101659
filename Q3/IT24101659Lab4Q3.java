import java.util.Scanner;
public class IT24101659Lab4Q3
{
 public static void main(String[] args)
 {
  Scanner input= new Scanner(System.in);
    
  double number; 
  String result;
  
  //user input number
  System.out.print("Enter a number: ");
  number = input.nextDouble();

  result = (number > 0) ? "The Number is: Positive":
           (number < 0) ? "The Number is: Negative":
            "The Number is: Zero";

  System.out.println(result);
 }
}
 

   

  
  