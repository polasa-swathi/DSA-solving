import java.util.*;
public class sliding {
 public static void main(String[] args){
    int arr[]={1,10,4,-4,6,7,};
    int k=2;
    int sum=0;
    for(int i=0;i<k;i++){
     sum+=arr[i];
    }
    int maxsum=sum;
    for(int i=k;i<arr.length;i++){
        sum+=arr[i]-arr[i-k];
        maxsum=Math.max(maxsum,sum); 
    }
    System.out.println(maxsum);
 }   
}
