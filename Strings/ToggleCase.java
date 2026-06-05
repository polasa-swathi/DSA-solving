public class toggle {
    public static void main(String[] args){
        String s="SwAtHi";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                ans.append(Character.toUpperCase(ch));
            }
            if(ch>='A'&& ch<='Z'){
                ans.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(ans);
    }
}
