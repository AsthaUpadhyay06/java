public class stringcountvalue1 {
    public static void main(String[] args) {
        String str="aaaabbbccdddddee";
        String ans=" ";
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;

            }
            else{
              
                ans+=prev;
                  if(count>1){
               
                ans+=count;
                  }
                   count=1;


            }
        }
        ans+=str.charAt(str.length()-1);
         if(count>1){
                ans+=count;
         }
                System.out.println(ans);
    }
}
