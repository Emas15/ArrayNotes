import java.util.Scanner;

public class RemoveElement{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size  = sc.nextInt();
        int [] arr = new int[size];


        for(int i = 0; i < size; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");

        }


        System.out.println();


        System.out.println("Enter the number you want to remove: ");
        int elementToRemove = sc.nextInt();



        int count = 0;
        for(int i =0; i < size; i++){
            if(arr[i] == elementToRemove){
                count++;
            }
        }


        int [] newArr = new int[size-count];



        if(count==0){
            System.out.println("Element was not found");
        }

        else{
            

            for(int i =0, j= 0; i < size; i++){

                if(arr[i] !=elementToRemove){
                    newArr[j] = arr[i];
                    j++;
                }
                
            }
        }


        System.out.println("After removing: ");
        
        for(int i =0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");

        }



    }
}