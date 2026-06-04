import java.util.*;
public class removeDup {
public static void main(String[] args){
    int arr[]={1,2,8,8,5,3,2,5};
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
    }
    System.out.println(set);
}    
}
