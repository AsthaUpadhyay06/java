public class stringcount {
    String input="aaabbccccddddd";
    StringBuilder output= new StringBuilder();
    int count=1;
    for(int i=1;i<input.length();i++){
        if (input.charAt(i)==input.charAt(i-1)) {
            count++;
            
        }
        else{
           output.append(input.charAt(i-1)).append(count);
           count= 1;
        }
    }
}
    


