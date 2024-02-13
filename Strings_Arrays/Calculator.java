import java.util.*;
public class Calculator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num1: ");
      int a = sc.nextInt();
      System.out.println("Enter num2: ");
      int b = sc.nextInt();
      
      
      System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulo\n ");

      int button = sc.nextInt();

      switch(button){
        case 1 :
          int c = a+b;
          System.out.println("Addition is "+c);
        break;
        case 2 :
          int d = a - b;
          System.out.println("Subtraction num1 - num2: "+d);
        break;
        case 3 :
          int e = a*b;
          System.out.println("Mul is : "+e);
        break;
        case 4:
          int f = a/b;
          System.out.println("Div is: "+f);
        break;
        case 5:
          int g = a%b;
          System.out.println("Remainder is: "+g);
        break;

        default:
        System.out.println("Wrong operation");
      }



    }
  }