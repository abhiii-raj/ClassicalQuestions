public class ValidPalindrome {
    public static boolean validPanidrome(String s){
        int si = 0;
        int ei = s.length()-1;

        while(si < ei){
            if(!Character.isLetterOrDigit(s.charAt(si))){
                si++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(ei))){
                ei--;
            }
            else if(Character.toLowerCase(s.charAt(si)) != Character.toLowerCase(s.charAt(ei))){
                return false;
            }
            else{
                si++;
                ei--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = " ";
        String input3 = "race a car";
        System.out.println(validPanidrome(input1));
        System.out.println(validPanidrome(input2));
        System.out.println(validPanidrome(input3));

    }
}
