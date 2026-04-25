class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else if(c==')'){
                if(st.isEmpty()) return false;
                if(st.peek()!='(') return false;
                st.pop();
            }else if(c=='}'){
                if(st.isEmpty()) return false;
                if(st.peek()!='{') return false;
                st.pop();
            }else if(c==']'){
                if(st.isEmpty()) return false;
                if(st.peek()!='[') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
