package Test_1;
import java.util.*;
public class ArrayTest4 {
    //  메뉴
    public static int menuSelect()
    {
        Scanner s = new Scanner(System.in);
        int menu;

        System.out.println("************");
        System.out.println("배열처리 프로그램");
        System.out.println("************");
        System.out.println("[1] 배열 입력 ");
        System.out.println("[2] 배열 검색 "); //순차 검색
        System.out.println("[3] 배열 정렬 "); //버블 정렬
        System.out.println("[4] 배열 출력 ");
        System.out.println("[0] 종료 ");
        System.out.print("메뉴선택: ");

        menu = s.nextInt();

        return menu;
    }

    //  입력
    public static int[] inputArr()
    {
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(i + 1 + "번쨰 배열 입력 : ");
            arr[i] = s.nextInt();
        }
        return arr;
    }
    //  검색
    public static void searchArr(int arr[])
    {
        if(arr == null)
        {
            System.out.println("배열이 비어 있습니다.");
            return;
        }

        Scanner s = new Scanner(System.in);
        System.out.print("찾을 숫자를 입력하세요 : ");

        int a = s.nextInt();
        boolean b = false;

        for(int i = 0; i < arr.length; i++)
            if (arr[i] == a)
            {
                System.out.println("찾은 숫자 " + a + "는 배열 arr [" + i + "]에 있습니다.");
                b = true;
                break;
            }
        if(!b)
        {
            System.out.println("찾은 숫자 " + a + "는 배열에 없습니다.");
        }
    }

    //  정렬
    public static void sortArr(int arr[])
    {
        if(arr == null)
        {
            System.out.println("배열이 비어 있습니다.");
            return;
        }

        int n = arr.length;

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("배열을 정렬했습니다.");
    }

    //  츨력
    public static void printArr(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("arr [" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args)
    {
        int menu;
        int arr[] = null;

        do{
             menu = menuSelect();

             switch (menu)
             {
                 case 0:
                     return;
                 case 1:
                     arr = inputArr();
                     break;
                 case 2:
                     searchArr(arr);
                     break;
                 case 3:
                     sortArr(arr);
                     break;
                 case 4:
                     printArr(arr);
                     break;
             }
        }while(true);
    }
}
