import java.util.*;

public class palindrom {
   static boolean Pal(int n){
     long  res=0;
    int temp=n;
    if(n<0){
      return false;
    }
    while (n>0) {
      int rem=n%10;
      res=res*10+rem;
      n=n/10;
      
    }
    if(res==temp){
      return true;
    }
    return false;

  }

  public static void main(String[] args) {
    int n;
    System.out.println("enter a number:");
    Scanner sn = new Scanner(System.in);
    n=sn.nextInt();

     boolean result=Pal(n);
    System.out.println(result);
    
  }
}