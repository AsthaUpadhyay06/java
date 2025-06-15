public class str2 {
    public static void main(String[] args) {
        String str="astha";
        boolean isPlindrone=true;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=str.charAt(str.length()-1)){
            isPlindrone=false;
            break;
        }
       }
            if(isPlindrone){
            System.out.println("palindrone");
            }
            else{
                System.out.println("not");
            }
        }
    }
