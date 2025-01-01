public class C5 {

    public static void main(String[] args) {
        
        int [] arr = {2,35,49,281,242,1};

        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-1;j++){
                
                if(arr[j+1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

            
                }
            }
        }
     
        
      System.out.println(arr[1]);
    }
    
}
