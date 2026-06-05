public class removeSpace {
    public static void main(String[] args){
        String s="swathi is good girl";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          if(ch>='a' && ch<='z'){
            ans.append(ch);
          }
        }
        System.out.println(ans);
    }
}
