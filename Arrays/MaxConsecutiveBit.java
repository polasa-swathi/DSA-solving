import java.util.*;
public class maxConBit {
public static void main(String[] args){
    int arr[]={1,1,1,1,0,0,0};
 int count=1;
 int max=0;
 for(int i=1;i<arr.length;i++){
    if(arr[i]==arr[i-1]){
        count++;
    }
    else{
        count=1;
    }
   max=Math.max(max,count);
 }
 System.out.println(max);
}    
}
