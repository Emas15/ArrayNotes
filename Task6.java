import java.util.Scanner;
public class Task6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = sc.nextInt();

        double [] arr = new double[size];

        for(int i =0; i < size; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextDouble();
        }


        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        int indexMax =0;
        int indexMin =0;

        for(int i =0; i < size; i++){

            if(arr[i] > max){
                max = arr[i];
                indexMax =i;
            }
            if(arr[i] < min){
                min = arr[i];
                indexMin = i;
            }

            sum+=arr[i];
        }

        double avg = sum/size;

        System.out.println("Maximum element "+max+ " found at index "+indexMax);
        System.out.println("Minimum element "+min+ " found at index "+indexMin);
        System.out.println("Summation: "+sum);
        System.out.printf("Average: %.2f\n",avg);

    }
}