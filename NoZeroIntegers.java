import java.util.*;

public class NoZeroIntegers {

  public static int[] NoZero(int n){
    for(int a=1;a<n;a++){
      int b= n-a;
      if(nozero(a)&&nozero(b)){
        return new int[]{a,b};
      }
    }
    return new int[]{};

  }
  private static boolean nozero(int num){
    while(num>0){
      if(num%10==0){
        return false;
      }
      num/=10;

    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int num ;
    System.out.println("enter the number:");
    num= sn.nextInt();
     
   int[] arr = NoZero(num);

        System.out.println("No-Zero Integers are: " + arr[0] + " + " + arr[1] + " = " + num);
        
        sn.close();
    
  }
}
