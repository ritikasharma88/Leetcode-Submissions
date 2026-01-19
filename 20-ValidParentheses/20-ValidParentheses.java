// Last updated: 1/19/2026, 10:36:46 PM
class Solution {
    public boolean isValid(String s) {
    Stack<Character> st1 = new Stack<>();
    for(int i =0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st1.push(')');
        }
        else if(s.charAt(i)=='{'){
            st1.push('}');
        }
        else if(s.charAt(i)=='['){
            st1.push(']');
        }
        else if(!st1.isEmpty()&&(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')){
            if(st1.peek()==s.charAt(i)){
                st1.pop();
            }
            else return false;
        }
        else return false;
    }
    return st1.isEmpty();
    }
}