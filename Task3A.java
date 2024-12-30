import java.util.Scanner;
public class Task3A {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i < size; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
                }

        int [] arr2 = new int[size];

        for(int i =0; i <size; i++){
            arr2[i] = arr[size-1-i] ;
        }

        System.out.println("Reversed using a new array: ");
        for(int i =0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}
