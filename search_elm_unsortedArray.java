import java.util.*;
public class search_elm_unsortedArray {

  static void Search(int[] arr ,int n){
      for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
          System.out.println("found at "+i);
        }
        else{
          System.out.println("not found");
        }

      }
      

  }


  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    // n is create to sotre size of array
    int n ;
    System.out.println("Enter number of element in array");
    n=sn.nextInt();
    int[] array = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++){
      array[i]=sn.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.print(array[i]+" ");
    }
    int target;
    System.out.println("enter target element");
    target=sn.nextInt();

    Search(array,target);
    
  }
  
}
