import java.util.*;
public class secMax{
    public static void main(String[] args){
        int arr[]={2,3,4,1,5,6,9,8};
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            else if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        if(secMax==Integer.MIN_VALUE){
            System.out.println("no secMax");
        }
        else{
            System.out.println(secMax);
        }
    }
}
