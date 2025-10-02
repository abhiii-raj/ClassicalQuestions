public class PalindromeNumber {
    public static boolean checkPalindromeNumber(int num){
        if(num < 0){ //if the number is negative then there is no chance for it to be palindrome.
            return false;
        }
        
        // if a number is palindrome then reverse of the number is also sam;
        
        int x = num;
        int reverse = 0;   

        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        if(x == reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int input1 = 121;
        int input2 = -121;
        System.out.println(checkPalindromeNumber(input1));
        System.out.println(checkPalindromeNumber(input2));
    }
}
