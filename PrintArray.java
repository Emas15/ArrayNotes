import java.util.Scanner;
public class PrintArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you want to store: ");
        int size = sc.nextInt();


        int [] array = new int[size];

        for(int i = 0; i < size; i++ ){
            System.out.print("Enter element "+i+" : ");
            array[i] = sc.nextInt() ;
        }

        //print it:
        for(int i = 0; i < array.length; i++){
            System.out.println(i+" : "+array[i]);
        }
    }
    
}
