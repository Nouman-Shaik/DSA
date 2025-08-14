import java.util.*;
class kadane{
  static int maxSumi(int[] array) {
    int max = Integer.MIN_VALUE;
    int checksum =0;
    for(int i=0;i<array.length;i++){
      checksum+=array[i];
      max= Math.max(max, checksum);
      if(checksum<0){
        checksum=0;
      }
    }
    return max;

  }
  public static void main(String[] args) {
    int[] array = {2, 3, -8, 7, -1, 2, 3};
    System.out.println(maxSumi(array));
  }
}