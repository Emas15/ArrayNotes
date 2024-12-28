import java.util.Scanner;
public class ArrayTraversal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size  = sc.nextInt();

        int [] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        for(int i =0 ; i <arr.length; i++){
            if(arr[i]<0){
                arr[i]=0;
            }
            System.out.print(arr[i]+ " ");
        }

    
    }
}