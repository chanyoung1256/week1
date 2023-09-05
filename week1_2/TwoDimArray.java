package week1_2;

public class TwoDimArray {
    public static void main(String[] args)
    {
        int twoDimArray[][] = {
                {4, 2, 1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 4, 3, 5, 2, 6, 7, 8, 9},
                {3, 2, 4, 5, 2, 3, 4, 5, 3, 1}
        };
            printTwoDim(twoDimArray);
    }
    public static void printTwoDim(int arr[][])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println("배열 [" + i + "]["+ j +"] = " +arr[i][j]);
            }
        }
    }
}
