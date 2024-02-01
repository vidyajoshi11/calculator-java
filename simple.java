package calculator;
import java.util.*;
public class demo1 {
    static int a1, a2,b1;

    public static <output1> void main(String[] args)
    {

        System.out.println("calci");
        inputdata();
        int a1, a2,b1;

    }

    private static void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a1");
        a1 = sc.nextInt();
        System.out.println("enter the value of a2");
        a2 = sc.nextInt();
        b1=a1+a2;
        System.out.println("ANS:"+b1);


    }


    }
