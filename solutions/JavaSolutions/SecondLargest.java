import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
     int k = 2;
     int max = arr[0];
     int secMax = 0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
             max = arr[i];
         }
     }

     for(int i=0;i< arr.length;i++){
         if((arr[i]>secMax)&&(arr[i] != max)){
             secMax=arr[i];

         }
     }
        System.out.println(secMax);

    }
}
