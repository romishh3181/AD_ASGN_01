import java.util.Arrays;
public class BInaryS {
    public static void main(String[] args) {
        int arr[]={2,9,6,3,1};
        Arrays.sort(arr);
        int target=9;
        System.out.println(binarys(arr,target));
    }
    public static int binarys(int [] array,int target){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<array[mid]){
                end=mid-1;
            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
