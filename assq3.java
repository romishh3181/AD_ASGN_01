import java.util.Scanner;

public class assq3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        int k=sc.nextInt();
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        ans3(a,k);
    }
    public static void ans3(int [] array,int k){
        int [] rarr=new int[array.length];
        int[] larr=new int[array.length];
        for(int i=0;i<array.length;i++){
            rarr[(i+k)%array.length]=array[i];
            larr[(i+array.length-k)%array.length]=array[i];
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<rarr.length;i++){
            System.out.println(rarr[i]);
        }
        for(int i=0;i<larr.length;i++){
            System.out.println(larr[i]);
        }
    }
}
