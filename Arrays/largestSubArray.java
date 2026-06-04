import java.util.*;
public class larSubArr {
   public static void main(String[] args){
    int arr[]={4,2,4,5,6};
    HashSet<Integer> set=new HashSet<>();
    int left=0;
    int maxlen=0;
    for(int right=0;right<arr.length;right++){
        while(set.contains(arr[right])){
            set.remove(arr[left]);
            left++;
        }
        set.add(arr[right]);
        maxlen=Math.max(maxlen,right-left+1);
    }
    System.out.println(maxlen);
   } 
}
