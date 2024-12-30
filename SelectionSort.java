import java.util.Scanner;
public class SelectionSort {

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
            int smallestNumAt = i;
            for(int j = (i+1); j<size; j++){
                if(arr[j] < arr[smallestNumAt]){
                    smallestNumAt = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[smallestNumAt];
                arr[smallestNumAt] = temp;
            }
        

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
