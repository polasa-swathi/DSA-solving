public class stockBS {
    public static void main(String[] args){
        int arr[]={2,1,5,6,9};
        int minPrice=arr[0];
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            minPrice=Math.min(minPrice,arr[i]);
            int profit=arr[i]-minPrice;
            maxProfit=Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);
    }
}
