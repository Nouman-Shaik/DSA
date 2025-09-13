import java.util.*;
public class lowerBound {
  static void llsort(int[] arr,int n){
    int target=7;
    int low=0;
    int high=n-1;
    int res=10;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]>=target){
        res=mid;
        high=mid-1;

      }
      else{
        low=mid+1;
      }

    }
    System.out.println(res);
  }
  public static void main(String[] args) {

    int[] arr = {1,4,5,7,8,9,10,11,16,20};
    int n=arr.length;
    llsort(arr,n);
 
  }
  
}
