import java.util.*;

public class righttriangle {
  static void triangle(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
    static void num(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j+" ");
        }
        System.out.println();
    }
}
  public static void main(String[] args) {
    System.out.println("enter the side of right triangle");
    int n=new Scanner(System.in).nextInt();
    triangle(n);
    num(n);

  }
}
