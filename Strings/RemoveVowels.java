public class removeVol {
    public static void main(String[] args){
        String s="super";
      StringBuilder ans=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
            ans.append(ch);
        }
      } 
      System.out.println(ans); 
    }
}
