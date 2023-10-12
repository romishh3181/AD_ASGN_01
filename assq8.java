import java.util.Scanner;
public class assq8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ans8(n));
    }
    public static int ans8(int n){
        if(n<=1){
            return n;
        }
        else{
           return ans8(n-1)+ans8(n-2);
    }}
}
