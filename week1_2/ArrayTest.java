package week1_2;
public class ArrayTest {
    public static void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("배열[" + i + "] = "+arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] a = new int[10];

        for(int i = 0; i < 10; i++)
        {
            a[i] = i + 1;
        }

        int b = 0;

        for(int i = 0; i < 10; i++)
        {
            b += a[i];
        }

        print(a);
        System.out.println("베열 합 : " + b);
    }
}
