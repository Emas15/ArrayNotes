import java.util.Scanner;
public class Task3B {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i < size; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
                }


        int start =0;
        int end = size-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        
        System.out.println("Reversed using the original array: ");
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    


            }
        }