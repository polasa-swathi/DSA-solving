import java.util.*;
public class medain {
    public static void main(String[] args){
        int arr[]={5,6,4,2,3,1};
        int n=arr.length;
        Arrays.sort(arr);
        int medain=0;
        if(n%2!=0){
            medain=arr[n/2];
            System.out.println(arr[n/2]);
            return ;
        }
        else{
            medain=arr[n/2];
            System.out.println(arr[n/2-1]  + " " +arr[n/2]);

        }
    }
}
