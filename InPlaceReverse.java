import java.util.Scanner;
public class InPlaceReverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = size-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            size--;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
