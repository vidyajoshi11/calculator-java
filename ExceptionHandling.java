import java.util.*;
import java.util.Scanner;
public class cal3 {
    public static void main(String[] args)
    {
        int a,b;
        char calcu;
        System.out.println("calculator");
        try
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the value of a");
            a=sc.nextInt();
            System.out.println("Enter the value of b");
            b= sc.nextInt();
            System.out.println("Enter the Operator");
            calcu= sc.next().charAt(0);
            if(calcu == '+')
            {
                System.out.println("Add:-"+(a+b));
            }
            else if(calcu == '-')
            {
                System.out.println("SUB:-"+(a-b));
            }
            else if(calcu== '*')
            {
                System.out.println("MUL:-"+(a*b));
            }
            else if(calcu== '/')
            {
                System.out.println("DIV:-"+(a/b));
            }
        }
        catch (Exception e)
        {
            System.out.println("Miss Match Exception");
        }
    }
}
