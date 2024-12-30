import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int size  = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i < size; i++ ){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }




        System.out.print("Enter another number: ");
        int newElement = sc.nextInt();

        int [] arr2 = new int[size+1];

        for(int i = 0; i < size; i++){
            arr2[i] = arr[i];
        }
        arr2[size] = newElement;


        System.out.println("The elements of the array are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(i+": "+arr[i]);
        }


        System.out.println("After resizing the array: ");
        for(int i =0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
    
}
