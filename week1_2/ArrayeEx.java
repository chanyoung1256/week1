package week1_2;
import java.util.*;
public class ArrayeEx {
    public static void main(String[] args)
    {
        int selectMenu;
        int arr[] = null;
        do {
            selectMenu = menuSelect();
            switch(selectMenu)
            {
                case 0:
                    return;
                case 1:
                    arr = inputArray();
                    break;
                case 2:
                    searchArray(arr);
                    break;
                case 3:
                    sortArray(arr);
                    break;
                case 4:
                    printArray(arr);
                    break;
            }
        }while(true);
    }
    public static void printArray(int arr[])
    {
        for(int i =0; i < arr.length; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    public static void searchArray(int arr[])
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
        {
            if(arr[i] == a)
            {
                System.out.println("찾은 숫자 " + a + "는 배열 arr[" + i + "]에 있습니다.");
                b = true;
                break;
            }
        }
        if(!b)
        {
            System.out.println("찾은 숫자 " + a + "는 배열에 없습니다.");
        }
    }

    public static void sortArray(int arr[])
    {
        if(arr == null)
        {
            System.out.println("배열이 비어 있습니다.");
            return;
        }

        int n = arr.length;
        for(int i = 0; i < n -1; i++)
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
    public  static int[] inputArray()
    {
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(i + 1 + "번째 배열 입력 : ");
            arr[i] = s.nextInt();
        }
        return arr;
    }
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
}
