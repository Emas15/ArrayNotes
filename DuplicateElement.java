import java.util.Scanner;
public class DuplicateElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i =0; i <size; i++){
            System.out.print("Enter elemnet "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }


        for(int i =0; i<size; i++){
            for(int j = (i+1); j < size; j++){
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }


   
        /*for(int i =0; i<size; i++){
            for(int j = (i+1); j < size; j++){
                if(arr[i] == arr[j]){
                   System.out.print(arr[i]+" ");
                   break;
                }
            }
        }*/


        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
