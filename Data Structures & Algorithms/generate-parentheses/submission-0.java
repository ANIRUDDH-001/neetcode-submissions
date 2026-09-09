class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        return helper(n, 0, 0, sb, list);
    }
    public List<String> helper(int n, int open, int close, StringBuilder sb, List<String> list) {
        if (open == n && close == n) {
            String temp = sb.toString();
            list.add(temp);
            return list;
        }
        if (open < n) {
            sb.append("(");
            helper(n, open + 1, close, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            helper(n, open, close + 1, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }
        return list;
    }
}
