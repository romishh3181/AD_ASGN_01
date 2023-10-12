import java.util.Scanner;
public class assq1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        ans1(a);
    }
    public static void ans1(int [] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
