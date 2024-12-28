import java.util.Scanner;
public class BubbleSort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you wanna have: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i< size; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size-1; i++){
            boolean swaped = false;

            for(int j =0; j <size-1; j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;

                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }



    }
}