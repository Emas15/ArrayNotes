import java.util.Scanner;
public class Task8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the length of array 1: ");
        int sizeMain = sc.nextInt();

        int [] arrMain = new int[sizeMain];

        System.out.println("Please enter the elements of the arr1: ");
        for(int i = 0; i < sizeMain; i++){
            arrMain[i] = sc.nextInt();
            
        }


        System.out.print("Please enter the length of array 2: ");
        int sizeSub = sc.nextInt();

        int [] arrSub = new int[sizeSub];

        System.out.println("Please enter the elements of the arr2:" );
        for(int i = 0; i < sizeSub ; i++){
            arrSub[i] = sc.nextInt();
        }


int count = 0;

        for(int i =0; i < sizeSub; i++){

            boolean matched = false;

            for(int j = 0; j < sizeMain; j++){

                if(arrMain[j] == arrSub[i]){
                    matched = true;
                    count++;
                    break;
                }
            }

            if(!matched){
                count = 0;
                break;
            }
         
        }

        
        if(count>0){
            System.out.println("Array 2 is a subset of Array 1. ");
        }
        else{
            System.out.println("Array 2 is not a subset of Array 1. ");
        }
    }
    
}
