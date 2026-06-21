class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '#') {
                st.append(ch);
            }
            else {
                if(st.length() == 0) {
                    continue;
                }else {
                    st.deleteCharAt(st.length() - 1);
                }
            }
        }
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(ch != '#') {
                ss.append(ch);
            }
            else {
                if(ss.length() == 0) {
                    continue;
                }else {
                    ss.deleteCharAt(ss.length() - 1);
                }
            }
        }
        return (st.compareTo(ss) == 0);
    }
}