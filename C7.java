public class C7 {

    public static void main(String[] args) {
        
        int [] arr1 = {2,6,4,2,1,9};
        int [] arr2 = {1,9,7,6,0,0};
        int [] arr3 = {23,45,6,7,11,12,1};


        for(int i =0; i < arr1.length; i++){

            for(int j=0; j<arr2.length; j++){

                if(arr1[i] == arr2[j]){

                    for(int k =0; k<arr3.length;k++){

                        if(arr1[i]==arr3[k]){
                            
                           System.out.print(arr1[i]+" ");
                           break;
                        }
                    }
                }
            }
        }
    }
    
}
