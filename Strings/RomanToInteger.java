import java.util.*;
public class RomanToInteger {
    public static void main(String[] args){
        String s="VII";
        HashMap<Character,Integer>map=new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('x',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
      int sum=0;
      for(int i=0;i<s.length();i++){
        int curr=map.get(s.charAt(i));
        if(i<s.length()-1 && curr<map.get(s.charAt(i+1))){
            sum-=curr;
        }
        else{
            sum+=curr;
        }
      }  
      System.out.println(sum); 
    }
}
