import java.util.Scanner;

public class stack{
    public static int[] BubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++)
            for(int j = 0; j < arr.length-i-1; i++)
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }

    public static int LogSearch(int[] arr, int item){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            int guess = arr[mid];
            if(guess == item)
                return mid;
            else if(guess > item)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {15, 31, 2, 45, 84, 72, 79, 89, 40};
        int[] arr = BubbleSort(array);
        for(int i = 0; i < BubbleSort(array).length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }System.out.print("\n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(LogSearch(arr, num));

    }
}