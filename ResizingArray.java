import java.util.Scanner;
public class ResizingArray {

    public static void main(String[] args) {

        //steps:
        // 1. create a new array of size(old Array er size + 1) // for 1 extra new element or the required size
        

        //2. use a loop to copy all the elements from the old array to the new array

        //3. assign additional element to the last index of new Array. 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i =0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        //take one more element
        System.out.println("Enter the number you wanna add to the array: ");
        int newElement = sc.nextInt();


        //new array with +1 larger size:
        int [] largerArr = new int[n+1];
        for(int i = 0; i < n; i++){
            largerArr[i] = arr[i];
        }

        largerArr[n] = newElement;

        System.out.println("The resized Array is: ");
        for(int i =0; i<largerArr.length; i++){
            System.out.println(largerArr[i]+ " ");
        }


        
    }
    
}
