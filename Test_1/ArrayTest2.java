package Test_1;

public class ArrayTest2 {
    public static void twoprint(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println("배열 [" + i + "]["+ j +"] = " +arr[i][j]);
            }
        }
    }

    public static void main(String[] args)
    {
        int print[][] =
                {
                        {4, 2, 1, 2, 3, 4, 5, 6, 7, 8},
                        {1, 2, 4, 3, 5, 2, 6, 7, 8, 9},
                        {3, 2, 4, 5, 2, 3, 4, 5, 3, 1}
                };
        twoprint(print);
    }
}
