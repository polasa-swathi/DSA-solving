import java.util.HashMap;

public class isomorphic {
    public static void main(String[] args){
        String s1="swathi";
        String s2="grpykn";
        HashMap<Character,Character> m1=new HashMap<>();
        HashMap<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
          if(m1.containsKey(ch1)){
            if(m1.get(ch1)!=ch2){
                System.out.println("false");
                return;
            }
            else{
                m1.put(ch1,ch2);
            }
          }
          if(m2.containsKey(ch2)){
            if(m2.get(ch2)!=ch1){
                System.out.println("false");
                return ;
            }
            else{
                m2.put(ch2,ch1);
            }
          }
        }
        System.out.println("equal");
    }
}
