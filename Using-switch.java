import java.util.*;
public class cal
{
    public static void main(String[] args)
    {
        int a,b;
        char calcu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:-");
        a = sc.nextInt();
        System.out.println("Enter the value of b:-");
        b = sc.nextInt();
        System.out.println("Enter the operator");
        calcu = sc.next().charAt(0);

        switch (calcu)
        {
            case '+':
               System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

            default:
                System.out.println("wrong");


        }
    }
}
