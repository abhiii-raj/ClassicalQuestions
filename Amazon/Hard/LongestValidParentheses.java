import java.util.*;

public class LongestValidParentheses {
    public static int longestValidateParentheses(String str){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;

        for(int i = 0;i<str.length() ;i++){
            char ch = str.charAt(i);

            if(ch == '('){
                st.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans = Math.max(ans, i - st.peek());
                }else{
                    st.push(i);
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String str = "(()";
        String str1 = ")()())";
        System.out.println(longestValidateParentheses(str));
        System.out.println(longestValidateParentheses(str1));
    }
}
