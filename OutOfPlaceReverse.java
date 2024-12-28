import java.util.Scanner;
public class OutOfPlaceReverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int  []  arr = new int[size];


   //taking input and creating the array     
        for(int i = 0; i<size; i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] =sc.nextInt();
        }


        //creating a new array and copying the first array's elements in reverved order
        int [] reversedArr = new int[size];
        for(int i = 0; i < size; i++){
            reversedArr[i] = arr[size-1-i]; //observe 1
            
        }



//printing the reversed array
        System.out.println("Reversed array: ");
        for(int i = 0; i < reversedArr.length; i++){
            System.out.print(reversedArr[i]+" ");
        }
    }
    
}
