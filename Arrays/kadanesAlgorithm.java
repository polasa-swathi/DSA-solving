import java.util.*;
public class kadanes {

  public static void main(String[] args){
    int arr[]={1,-3,4,6,8,-10};
    int currsum=arr[0];
    int maxsum=arr[0];
    for(int i=1;i<arr.length;i++){
      currsum=Math.max(arr[i],currsum+arr[i]);
      maxsum=Math.max(maxsum,currsum);
    }
    System.out.println(maxsum);
  }
}
