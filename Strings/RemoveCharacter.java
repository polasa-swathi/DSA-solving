public class removeChar {
   public static void main(String[] arsg){
    String s="swath53#2@1 hyg";
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if((ch>'a'&& ch<'z')||(ch>'A'&&ch<'Z')){
            ans.append(ch);
        }
    } 
    System.out.println(ans);
   } 
}
