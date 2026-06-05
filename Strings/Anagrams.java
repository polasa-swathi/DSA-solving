import java.util.HashMap;

public class anagrams {
    public static void main(String[] args){
        String s1="ant";
        String s2="ant";
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
           char ch=s1.charAt(i);
           map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(map2, 0)+1);
        }
        if(map1.equals(map2)){
            System.out.println("true");
        }
        else{
            System.out.println("not");
        }
    }
}
