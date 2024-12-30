import java.util.Scanner;
public class Task9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int size  = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i < size; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i =0; i < size - 1; i++){
            int largest = i;
            for(int j = (i+1); j < size; j++){
                if(arr[j] > arr[largest]){
                    largest = j;
                }
            }

                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
            }
        
System.out.println();           
System.out.println("Sorter Array: ");
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
