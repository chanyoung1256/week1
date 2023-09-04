package week1_1;
import java.util.*;
public class FivonacciPrint {
    public static void main(String[] args)
    {
        int n;
        int first = 0;
        int second = 1;
        int next = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("피보나치 수열의 마지막 항을 입력하시오 : ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            if(i <= 2)
            {
                System.out.print(i - 1);
                sum += (i - 1);
            }
            else
            {
                next = first + second;
                System.out.print(next);
                first = second;
                second = next;
                sum += next;
            }
            if(i < n)
            {
                System.out.print(", ");
            }
        }
        System.out.println("\n수열 합계 : " + sum);
    }
}
