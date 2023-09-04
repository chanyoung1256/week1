package week1_1;

import java.util.*;
public class FactorialPrint {
    public static void main(String[] args)
    {
        int value;
        long factValue = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("펙토리얼 n 값을 입력하시오 : ");
        value = sc.nextInt();

        for(int i = 1; i <= value; i++)
        {
            factValue *= i;
        }

        System.out.println(value + "! " + " = " + factValue);
    }
}