public class C1 {

    public static void main(String[] args) {
        
        int [] arr = {25,14,56,15,36};

        int num = 35;

        int [] newArr = new int [arr.length+1];

        for(int i =0; i < newArr.length; i++){
            if(i<2){
                newArr[i] = arr[i];
            }
            else if(i==2){
                newArr[i] = num;
            }
            else{
                newArr[i] = arr[i-1];
            }
          
        }


        for(int i =0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }


    }
    
}
