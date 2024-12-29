import java.util.Scanner;
public class TargetElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i < size; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        boolean matched = false;

        for(int i = 0; i < size; i ++){
            if(arr[i] == target){
                System.out.println("target number found at index: "+i);
                matched = true;
                break;
            }
        }

        if(!matched){
            System.out.println("Targer number was not found");
        }

    }
    
}
