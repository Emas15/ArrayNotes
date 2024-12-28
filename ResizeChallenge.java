import java.util.Scanner;
public class ResizeChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size  = sc.nextInt();

        int [] arr1 = new int[size];

        for(int i = 0; i < size ; i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr1[i] = sc.nextInt();
        }


       




        System.out.println("The elements of the array are: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.println(i+ ": "+arr1[i]);
        }

       

        System.err.println();



        
      
        while(true){
            
            System.out.println("Do you want to add a new number?(y/n): ");
            String prompt = sc.next();


            
            if(prompt.equals("y")){
                System.out.print("Enter the new number to add: ");
                int newElement = sc.nextInt();
                
                int[] arr2 = new int[size+1];
               
                
                for(int i = 0; i < size; i++){
                    arr2[i] = arr1[i];
                }
                arr2[size] =newElement;

                System.out.println("After resizing the array: ");
                for(int i =0; i < arr2.length; i++){
                    System.out.print(arr2[i]+ " ");
                }
                System.err.println();

                arr1 = arr2;
                size++;

            }
            else{
                break;
            }
        }

      
    }
    
}
