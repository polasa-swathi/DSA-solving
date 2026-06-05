public class zerosToEnd {

    public static void main(String[] args){
        int arr[]={2,0,1,0,4,5,0,0,2};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int x : arr){
            System.out.println(x);
        }
    }
}
