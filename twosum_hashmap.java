import java.util.*;
public class twosum_hashmap {
  static int[] solution(int[] num,int target){
    HashMap<Integer, Integer> mapp= new HashMap<>();
    for(int i=0; i<num.length;i++){
      int val=target-num[i];
      if(mapp.containsKey(val)){
        return new int[]{mapp.get(val),i};

      }
      mapp.put(num[i],i);
    }

   return new int[]{-1,-1};
  }

  public static void main(String[] args) {
    int[] num= {3,2,4,9};
    int target=11;
    int res[]=solution(num ,target);

    System.out.println(res[0]+" "+res[1]);

  }
}