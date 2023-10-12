import java.util.Scanner;
import java.util.Arrays;
public class assq6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int[] arr= {-6, 5, 4, 2, 1, -8};
       int[]temp=new int[arr.length];
       int j=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               temp[j]=arr[i];
               j++;
           }
       }
       Arrays.sort(temp);
       int smallest=1;
       for(int i=0;i< temp.length;i++){
           if(temp[i]==smallest){
               smallest++;
           }
       }
        System.out.println("Smallest"+smallest);

    }
}
