package Microsoft.Easy;
import java.util.*;

public class DefangedIP {
    public static String defangedIp(String ip){
        StringBuilder result = new StringBuilder(""); //initialises with an empty string
        for(int i = 0;i<ip.length() ;i++){
            char ch = ip.charAt(i);
            if(ch == '.'){
                result.append('['); 
                result.append(ch);
                result.append(']');
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        String ip = "1.1.1.1";
        String newIp = defangedIp(ip);
        System.out.println(newIp);
    }
}
