import java.util.*;
public class larSubDis{
    public static void main(String[] args){
        int arr[]={1,2,1,2,3};
        int k=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int maxlen=0;
        for(int right=0;right<arr.length;right++){
            map.put(arr[right],map.getOrDefault(arr[right], 0)+1);
        while(map.size()>k){
            map.put(arr[left],map.get(arr[left])-1);
            if(map.get(arr[left])==0){
                map.remove(arr[left]);
            }
        left++;        }
        maxlen=Math.max(maxlen,right-left+1);
    }
    System.out.println(maxlen);
    }
}
