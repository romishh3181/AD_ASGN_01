import java.util.Scanner;

public class assq2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        ans2(a);
    }
    public static void ans2(int [] array){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("MAx="+max);
        System.out.println("MIn="+min);
    }
}
