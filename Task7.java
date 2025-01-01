
public class Task7 {

    public static void main(String[] args) {
        
        int arr [] = {23,100,23,56,100};

        System.out.println("Input array: ");
        for(int i =0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
        int newArr [] = new int[arr.length];
        int newC = 0;

        for(int i =0; i < arr.length; i++){
            boolean matched  = false;
            for(int j = 0; j<i; j++){
                if(arr[j] == arr[i]){
                    matched=true;
                    break;
                }
            }

            if(!matched){
                newArr[newC] = arr[i];
                newC++;
            }
        }

        System.out.println();
        System.out.println("New array: ");
        for(int i =0; i < newC; i++){
            System.out.print(newArr[i]+" ");
        }
    }
    
}
