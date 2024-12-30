import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        for(int i =0; i < size; i++){
            if(arr[i] < 0){
                arr[i] =0;
            }
            else if(arr[i] > 0){
                arr[i] = 1;
            }
        }

System.out.println();
        System.out.println("After modifying: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
