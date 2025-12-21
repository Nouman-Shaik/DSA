import java.util.*;
public class square {
  static void pattern1(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
     System.out.println("enter the side of square");
    int n =new Scanner(System.in).nextInt();
    pattern1(n);
  }
  
}
