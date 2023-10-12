import java.util.Scanner;
import java.util.Arrays;
public class assq4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,6,4,5,3};
        Arrays.sort(arr);
       int i=0;
       int j=arr.length-1;
       int temp[]=new int[arr.length];
       int index=0;
       while(i<=j){
           temp[index++]=arr[j--];
           temp[index++]=arr[i++];

       }
        System.out.println(Arrays.toString(temp)+" ");
    }
}
