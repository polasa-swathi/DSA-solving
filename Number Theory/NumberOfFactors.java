public class noOfFactors {
    public static void main(String[] args){
        int n=15;
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        System.out.println(count);
    }
}
