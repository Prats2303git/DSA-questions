class Solution {
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens) {
            if(s.equals("+")) {
                st.push(st.pop() + st.pop());
            }
            else if (s.equals("-")) {
                st.push(-st.pop() + st.pop());
            }
            else if(s.equals("*")) {
                st.push( st.pop() * st.pop());
            }
            else if(s.equals("/")) {
                st.push(( (int)(1D/st.pop() * st.pop())));
            }
            else {
                int num = Integer.valueOf(s);
                st.push(num);
            }
        }
        return st.pop();
    }
}
