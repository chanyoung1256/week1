package week1_2;

public class TwoDimArray2 {
    public static void main(String[] args)
    {
        int twoDim[][] = new int[3][];
        int cnt = 1;

        twoDim[0] = new int[3];
        twoDim[1] = new int[10];
        twoDim[2] = new int[2];

        for(int i = 0; i < twoDim.length; i++)
        {
            for(int j = 0; j < twoDim[i].length; j++)
            {
                twoDim[i][j] = cnt++;
            }
        }

        for(int i = 0; i < twoDim.length; i++)
        {
            for(int j = 0; j < twoDim[i].length; j++)
            {
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
