import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i < size; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        int newNum = sc.nextInt();

        boolean matched = false;

        for(int i =0; i < size; i++){
            
            if(arr[i] == newNum){
                matched = true;
                System.out.println(newNum+" is at index "+i);
                break;
            }
        }
            if(!matched){
                System.out.println("Element not found");
            }
           
        
    }
    
}
