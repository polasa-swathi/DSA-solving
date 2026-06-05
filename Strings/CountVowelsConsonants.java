public class countVolCon {

   public static void main(String[] args){
    String s="aeiou";
    int count1=0;
    int count2=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            count1++;
        }
        else{
            count2++;
        }
    }
    System.out.println("vowels count"+" "+count1);
    System.out.println("consonants count"+" "+ count2);
   } 
}
