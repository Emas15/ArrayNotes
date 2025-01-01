public class C6 {

    public static void main(String[] args) {
        
        int arr[] = {2,4,6,2,3,2};

        int idx =0;

        for(int i =0; i < arr.length; i++){
            if(arr[i] == 2){
                idx =i;
                break;

            }
        }


        int count = 0;

        for(int i = idx; i<arr.length; i++){

            if(arr[i]==2){
                count++;
            }


        }

        System.out.println("the num "+2+" occurs "+count+" times");


    }
    
}
