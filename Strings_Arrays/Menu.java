import java.util.*;
public class Menu{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100: ");
        int num;
        

        
        do{
            int marks = sc.nextInt();
            if(marks >=90)
            {
                System.out.println("This is Excellent");
            }
            else if(89>=marks && marks>=60)
            {
                System.out.println("This is Good");

            }
            else if(59>=marks && marks>=0)
            {
                System.out.println("This is well");
            }
            else{
                System.out.println("invalid");
            }

            System.out.println("Enter 1 for continue, 0 for end");
            num = sc.nextInt();


        }while(num == 1);
        
    }
}